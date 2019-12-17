# 문제점 해결

## 오라클 설치후 ORA-12170: TNS: 접속 시간 초과가 발생함 > 서버쪽 문제일 가능성... 20191128

# intellij idea failed to create JVM error code -1
from https://stackoverflow.com/questions/45846624/intellij-idea-failed-to-create-jvm-error-code-1
answer : Please check your phpstorm64.exe.vmoptions file located at bin folder and remove option
         
         -XX:+UseG1GC
         
# oracle utf-8
Step 1. sqlplus ( client )에서의 인코딩  환경 변수 설정
$ export NLS_LANG=KOREAN_KOREA.UTF8
Step 2. DB 서버 에서의 인코딩  환경 변수 설정

현재 설정된 인코딩 확인.

SQL> select * from nls_database_parameters where parameter like '%CHARACTERSET%';

PARAMETER                      VALUE

------------------------------ ----------------------------------------

NLS_CHARACTERSET               WE8MSWIN1252

NLS_NCHAR_CHARACTERSET         AL16UTF16


SQL> select VALUE$ from sys.props$ where name='NLS_LANGUAGE';

VALUE$

--------------------------------------------------------------------------------

AMERICAN

DB서버를 UTF-8으로 인코딩 설정 후 재기동 까지 해주면 끝.
SQL> update sys.props$ set value$='UTF8' where name='NLS_CHARACTERSET';

1 row updated.


SQL> update sys.props$ set value$='UTF8' where name='NLS_NCHAR_CHARACTERSET';

1 row updated.

SQL> update sys.props$ set value$='KOREAN_KOREA.UTF8' where name='NLS_LANGUAGE';

1 row updated.



SQL> shutdown immediate;

Database closed.

Database dismounted.

ORACLE instance shut down.


SQL> startup;

ORACLE instance started.



Total System Global Area  208805888 bytes

Fixed Size                  2142896 bytes

Variable Size             150998352 bytes

Database Buffers           50331648 bytes

Redo Buffers                5332992 bytes

Database mounted.

Database opened.

SQL> select ID from  ACC;

ID

--------------------------------------------------------------------------------

락시


from https://rocksea.tistory.com/241



* 환경설정
C:\Users\lee\.IntelliJIdea14\config



이은경과장; 배영철대리; YBN

RBAMRCAP 프로젝트
처음 설정하는 비밀번호 : 00000000
id/pw
205026/205026a!



==-===오류찝찌ㅃ
D:\PROJECT\RBAMR\Tomcat\tomcat8.0.53\bin\catalina.bat run
[2019-12-17 10:28:30,320] Artifact RBAMRCAP:Web exploded: Server is not connected. Deploy is not available.
Using CATALINA_BASE:   "C:\Users\lee\.IntelliJIdea14\system\tomcat\Unnamed_WorkSpace"
Using CATALINA_HOME:   "D:\PROJECT\RBAMR\Tomcat\tomcat8.0.53"
Using CATALINA_TMPDIR: "D:\PROJECT\RBAMR\Tomcat\tomcat8.0.53\temp"
Using JRE_HOME:        "C:\Program Files\Java\jdk1.8.0_211"
Using CLASSPATH:       "D:\PROJECT\RBAMR\Tomcat\tomcat8.0.53\bin\bootstrap.jar;D:\PROJECT\RBAMR\Tomcat\tomcat8.0.53\bin\tomcat-juli.jar"
Handler error
java.lang.reflect.InvocationTargetException
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at org.apache.juli.ClassLoaderLogManager.readConfiguration(ClassLoaderLogManager.java:600)
	at org.apache.juli.ClassLoaderLogManager.readConfiguration(ClassLoaderLogManager.java:537)
	at org.apache.juli.ClassLoaderLogManager.readConfiguration(ClassLoaderLogManager.java:336)
	at java.util.logging.LogManager$3.run(LogManager.java:399)
	at java.util.logging.LogManager$3.run(LogManager.java:396)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.util.logging.LogManager.readPrimordialConfiguration(LogManager.java:396)
	at java.util.logging.LogManager.access$800(LogManager.java:145)
	at java.util.logging.LogManager$2.run(LogManager.java:345)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.util.logging.LogManager.ensureLogManagerInitialized(LogManager.java:338)
	at java.util.logging.LogManager.getLogManager(LogManager.java:378)
	at java.util.logging.Logger.demandLogger(Logger.java:448)
	at java.util.logging.Logger.getLogger(Logger.java:502)
	at com.sun.jmx.remote.util.ClassLogger.<init>(ClassLogger.java:55)
	at sun.management.jmxremote.ConnectorBootstrap.<clinit>(ConnectorBootstrap.java:846)
	at sun.management.Agent.startAgent(Agent.java:262)
	at sun.management.Agent.startAgent(Agent.java:452)
Caused by: java.lang.IllegalArgumentException: Bad level "ERROR"
	at java.util.logging.Level.parse(Level.java:488)
	at org.apache.juli.FileHandler.configure(FileHandler.java:431)
	at org.apache.juli.FileHandler.<init>(FileHandler.java:175)
	at org.apache.juli.AsyncFileHandler.<init>(AsyncFileHandler.java:75)
	at org.apache.juli.AsyncFileHandler.<init>(AsyncFileHandler.java:67)
	... 22 more
Handler error
java.lang.reflect.InvocationTargetException
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at org.apache.juli.ClassLoaderLogManager.readConfiguration(ClassLoaderLogManager.java:600)
	at org.apache.juli.ClassLoaderLogManager.readConfiguration(ClassLoaderLogManager.java:537)
	at org.apache.juli.ClassLoaderLogManager.readConfiguration(ClassLoaderLogManager.java:336)
	at java.util.logging.LogManager$3.run(LogManager.java:399)
	at java.util.logging.LogManager$3.run(LogManager.java:396)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.util.logging.LogManager.readPrimordialConfiguration(LogManager.java:396)
	at java.util.logging.LogManager.access$800(LogManager.java:145)
	at java.util.logging.LogManager$2.run(LogManager.java:345)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.util.logging.LogManager.ensureLogManagerInitialized(LogManager.java:338)
	at java.util.logging.LogManager.getLogManager(LogManager.java:378)
	at java.util.logging.Logger.demandLogger(Logger.java:448)
	at java.util.logging.Logger.getLogger(Logger.java:502)
	at com.sun.jmx.remote.util.ClassLogger.<init>(ClassLogger.java:55)
	at sun.management.jmxremote.ConnectorBootstrap.<clinit>(ConnectorBootstrap.java:846)
	at sun.management.Agent.startAgent(Agent.java:262)
	at sun.management.Agent.startAgent(Agent.java:452)
Caused by: java.lang.IllegalArgumentException: Bad level "ERROR"
	at java.util.logging.Level.parse(Level.java:488)
	at org.apache.juli.FileHandler.configure(FileHandler.java:431)
	at org.apache.juli.FileHandler.<init>(FileHandler.java:175)
	at org.apache.juli.AsyncFileHandler.<init>(AsyncFileHandler.java:75)
	at org.apache.juli.AsyncFileHandler.<init>(AsyncFileHandler.java:67)
	... 22 more
Handler error
java.lang.reflect.InvocationTargetException
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at org.apache.juli.ClassLoaderLogManager.readConfiguration(ClassLoaderLogManager.java:600)
	at org.apache.juli.ClassLoaderLogManager.readConfiguration(ClassLoaderLogManager.java:537)
	at org.apache.juli.ClassLoaderLogManager.readConfiguration(ClassLoaderLogManager.java:336)
	at java.util.logging.LogManager$3.run(LogManager.java:399)
	at java.util.logging.LogManager$3.run(LogManager.java:396)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.util.logging.LogManager.readPrimordialConfiguration(LogManager.java:396)
	at java.util.logging.LogManager.access$800(LogManager.java:145)
	at java.util.logging.LogManager$2.run(LogManager.java:345)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.util.logging.LogManager.ensureLogManagerInitialized(LogManager.java:338)
	at java.util.logging.LogManager.getLogManager(LogManager.java:378)
	at java.util.logging.Logger.demandLogger(Logger.java:448)
	at java.util.logging.Logger.getLogger(Logger.java:502)
	at com.sun.jmx.remote.util.ClassLogger.<init>(ClassLogger.java:55)
	at sun.management.jmxremote.ConnectorBootstrap.<clinit>(ConnectorBootstrap.java:846)
	at sun.management.Agent.startAgent(Agent.java:262)
	at sun.management.Agent.startAgent(Agent.java:452)
Caused by: java.lang.IllegalArgumentException: Bad level "ERROR"
	at java.util.logging.Level.parse(Level.java:488)
	at org.apache.juli.FileHandler.configure(FileHandler.java:431)
	at org.apache.juli.FileHandler.<init>(FileHandler.java:175)
	at org.apache.juli.AsyncFileHandler.<init>(AsyncFileHandler.java:75)
	at org.apache.juli.AsyncFileHandler.<init>(AsyncFileHandler.java:67)
	... 22 more
Handler error
java.lang.reflect.InvocationTargetException
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at org.apache.juli.ClassLoaderLogManager.readConfiguration(ClassLoaderLogManager.java:600)
	at org.apache.juli.ClassLoaderLogManager.readConfiguration(ClassLoaderLogManager.java:537)
	at org.apache.juli.ClassLoaderLogManager.readConfiguration(ClassLoaderLogManager.java:336)
	at java.util.logging.LogManager$3.run(LogManager.java:399)
	at java.util.logging.LogManager$3.run(LogManager.java:396)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.util.logging.LogManager.readPrimordialConfiguration(LogManager.java:396)
	at java.util.logging.LogManager.access$800(LogManager.java:145)
	at java.util.logging.LogManager$2.run(LogManager.java:345)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.util.logging.LogManager.ensureLogManagerInitialized(LogManager.java:338)
	at java.util.logging.LogManager.getLogManager(LogManager.java:378)
	at java.util.logging.Logger.demandLogger(Logger.java:448)
	at java.util.logging.Logger.getLogger(Logger.java:502)
	at com.sun.jmx.remote.util.ClassLogger.<init>(ClassLogger.java:55)
	at sun.management.jmxremote.ConnectorBootstrap.<clinit>(ConnectorBootstrap.java:846)
	at sun.management.Agent.startAgent(Agent.java:262)
	at sun.management.Agent.startAgent(Agent.java:452)
Caused by: java.lang.IllegalArgumentException: Bad level "ERROR"
	at java.util.logging.Level.parse(Level.java:488)
	at org.apache.juli.FileHandler.configure(FileHandler.java:431)
	at org.apache.juli.FileHandler.<init>(FileHandler.java:175)
	at org.apache.juli.AsyncFileHandler.<init>(AsyncFileHandler.java:75)
	at org.apache.juli.AsyncFileHandler.<init>(AsyncFileHandler.java:67)
	... 22 more