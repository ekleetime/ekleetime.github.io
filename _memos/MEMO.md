# ������ �ذ�

## ����Ŭ ��ġ�� ORA-12170: TNS: ���� �ð� �ʰ��� �߻��� > ������ ������ ���ɼ�... 20191128

# intellij idea failed to create JVM error code -1
from https://stackoverflow.com/questions/45846624/intellij-idea-failed-to-create-jvm-error-code-1
answer : Please check your phpstorm64.exe.vmoptions file located at bin folder and remove option
         
         -XX:+UseG1GC
         
# oracle utf-8
Step 1. sqlplus ( client )������ ���ڵ�  ȯ�� ���� ����
$ export NLS_LANG=KOREAN_KOREA.UTF8
Step 2. DB ���� ������ ���ڵ�  ȯ�� ���� ����

���� ������ ���ڵ� Ȯ��.

SQL> select * from nls_database_parameters where parameter like '%CHARACTERSET%';

PARAMETER                      VALUE

------------------------------ ----------------------------------------

NLS_CHARACTERSET               WE8MSWIN1252

NLS_NCHAR_CHARACTERSET         AL16UTF16


SQL> select VALUE$ from sys.props$ where name='NLS_LANGUAGE';

VALUE$

--------------------------------------------------------------------------------

AMERICAN

DB������ UTF-8���� ���ڵ� ���� �� ��⵿ ���� ���ָ� ��.
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

����


from https://rocksea.tistory.com/241
