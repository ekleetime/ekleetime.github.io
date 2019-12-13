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