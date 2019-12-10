
OS : 윈도우7

현재 새로운 JAVA IDE를 공부중에 있습니다.

-------------------------------------------------------------------------------
idea.exe.vmoptions 설정 (실행성능 향상을 위해 변경함)
-------------------------------------------------------------------------------
-vm
Z:/jdk1.6.0_45/jre/bin/server/jvm.dll
-Xms1024m
-Xmx1024m
-XX:MaxPermSize=512m
-XX:ReservedCodeCacheSize=96m
-XX:+UseCodeCacheFlushing
-ea
-server
-XX:+UseConcMarkSweepGC
-Dsun.io.useCanonCaches=false
-Djava.net.preferIPv4Stack=true
-Dfile.encoding=UTF-8
-Dconsole.encoding=UTF-8
-DAwt.useSystemAAFontSettings=lcd
-Dosgi.requiredJavaVersion=1.6


-------------------------------------------------------------------------------
인텔리J의 설정 백업 및 배포
-------------------------------------------------------------------------------
(주의) 배포 하실때 "C:/Users/{OS계정}/.IntelliJIdea12/config/idea12.key" 파일은
삭제하고 배포를 하시기 바랍니다.
C:/Users/{OS계정}/.IntelliJIdea12 폴더만 따로 저장해두면 됩니다.


-------------------------------------------------------------------------------
Setting(Ctrl+Alt+S) 변경내용
-------------------------------------------------------------------------------
File>Settings(Ctrl+Alt+S)>Compiler
Make project automatically (체크) : 이클립스의 자동 컴파일과 같은 기능을 한다.

File>Settings(Ctrl+Alt+S)>File Encodings
IDE Encoding : UTF-8 , Autodetect UTF-encoded files (checked)
Project Encoding : UTF-8
Default encoding for properties files : UTF-8, Transparent native-to-ascii conversion (checked) : 중요

File>Settings(Ctrl+Alt+S)>Plugins>Browse repositories 선택
- EncodingPlugin 설치 필요 : 프로젝트별 인코등 설정을 위해서 (UTF-8 환경설정후 웹서비스 시험시, 한글 출력이 깨질경우)
- IdeaVim : 인텔리J 에디터에서 vim 의 KeySet을 사용하고자 할 경우 설치
- Eclipse Mode : 이클립스처럼 Build Automatically 사용할 경우
- JavaDoc : 자바독 설치
- Code Inspection Plugin : 설치안함 (CheckStyle, PMD, FindBug) ==> 너무 강력해서 소스오류로 보고가 많음

File>Settings(Ctrl+Alt+S)>Editor>Appearance
Show line numbers (체크)

File>Settings(Ctrl+Alt+S)>Copyright>Copyright Profiles> + 추가
처음 자바파일 생성시 상단 해더부분에 생성되는 기능

File>Settings(Ctrl+Alt+S)>Project Encoding : System Default

File>Settings(Ctrl+Alt+S)>Appearance
Theme : Darcula
Override default fonts by (not recommened): (checked)
Name : 굴림
Size : 12

File>Settings(Ctrl+Alt+S)>Keymap
Default copy 를 만들어서 단축키를 변경하면 된다.


-------------------------------------------------------------------------------
Project Structure(Ctrl+Shift+Alt+S)
-------------------------------------------------------------------------------
자바컴파일시 .class 생성위치 지정하기
- intellij의 톰캣서버를 사용하지 않고, 별도의 톰캣으로 디버깅시 이용하면 된다.
File>Project Structure(ctrl+shift+alt+s)>Modules>프로젝트선택>Paths>Use module compile output paht(check)>Output path>
D:\..\프로젝트명\target\프로젝트명\WEB-INF\classes

File>Project Structure(ctrl+shift+alt+s)>Artifacts>
Type : Web Application: Exploded
Output directory : 인텔리J에서 Tomcat 서버 기동을 위해, 클래스 파일들이 Deploy될때 생성될 경로를 지정한다.
D:\..\프로젝트명\target\프로젝트명

Run>Edit Configurations 설정 (단축키 없음)
-------------------------------------------------------------------------------
Run>Edit Configurations ... >Tomcat Server>
Server Tab>
# intellij의 디버깅 내용중 한글이 깨져서 나올 경우 아래의 옵션을 사용한다.
- VM Options : -Dfile.encoding=UTF-8 -Dclient.encoding.override=UTF-8 -Djava.awt.headless=true

Deployment Tab>
# .war 형태로 배포하지 않고, .class, .jsp 등등으로 풀어서 target/ 디렉토리에 생성된다.
프로젝트명:war exploded


[설정참조]
http://beyondj2ee.wordpress.com/2013/06/01/인텔리j-시작하기-part1-getting-start-intellij-기본-설정편/
http://beyondj2ee.wordpress.com/2013/06/15/인텔리j-시작하기-part2-getting-start-intellij-자바-프로젝트편/
http://beyondj2ee.wordpress.com/2013/06/23/인텔리j-시작하기-part3-getting-start-intellij-svn/