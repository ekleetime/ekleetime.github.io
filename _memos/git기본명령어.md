출처 : https://gbsb.tistory.com/10

Detection will be disabled for whole project.
Note that most Spring related features will not work if Spring facet configuration is not performed.

Project Structure | Facets | Detection
can be used to exclude specific files/folders only and to re-enable.

Git을 이용하려면 두가지 방법이 있다.

SourceTree라는 Git GUI 툴을 이용한 Git
Git Bash를 이용한 Git
SourceTree를 이용하면 GUI 툴이기에 접근하기에는 편하지만, 리눅스는 지원이 안되고 좀 더 디테일한 명령어를 다룰 수 없다. 따라서 보기엔 불편하지만 Git Bash를 이용하는 것이 낫다고 생각한다. (그리고 얘가 좀 더 간지난다)

지금부터 두번째 방법에 대해서 알아보자.

기본적인 명령어
화면 초기화 : Ctrl + L
한 행의 처음과 끝 : Ctrl + A, Ctrl + E
목록 보기 : ls 또는 dir
파일의 내용 보기 : cat
특정 문자를 검색 : grep
디렉터리로 이동 : cd
디렉터리 생성 : mkdir
파일 삭제 : rm
파일 생성 : touch
git config (최초 1회 실행)
// git commit에 사용될 username
git config --global user.name "your_name"
 
// git commit에 사용될 email
git config --global user.email "your_email@example.com"
 
// 설정한 내용을 확인할 수 있다.
git config --list
 
 
git init
현재 디렉토리를 로컬저장소로 설정한다.

// 로컬저장소로 설정할 프로젝트 위치로 이동한다.
cd C:/dev/workspace/eom2017
 
// 로컬저장소로 설정한다.
// (master) 브랜치로 보이면 성공한 것이다.
git init
 
// 만약 init을 취소하려면 아래의 명령어를 입력한다.
rm -r .git
 
git status
로컬저장소의 현재 상태를 보여준다.


git add
파일을 준비영역(Staging Area)으로 옮긴다. (GitHub와 연동하려면 git remote로 원격 저장소와 연결해야 함)

// a.html 파일만 추가
git add a.html
 
// 워킹 디렉터리 내 모든 파일을 추가
git add .
 
// 명령 프롬프트에서 상호작용하면서 추가 (나갈땐 q를 입력)
git add -i
 
// 진행중인 파일일 경우, Staging Area에서 워킹 디렉터리로 옮겨온다. 
$git rm --cached a.html
$git rm -r --cached .
 
git commit
준비영역(Staging Area)의 파일을 로컬저장소에 저장한다.

// 에디터가 출력되고, 에디터에서 커밋 메시지 입력 후 저장하면 커밋됨
git commit
 
// 간단한 커밋 메시지를 입력후 커밋
git commit -m "커밋 메시지"
 
// Staging Area에 들어간 파일에 대해서만 (워킹 디렉터리는 적용 X)
git commit -a -m "커밋 메시지"
 
git log
로컬저장소의 커밋 이력을 조회한다.

// 커밋 이력 상세조회
git log 
 
// 커밋 이력중 커밋ID, 타이틀 메시지만 조회
git log --oneline
 
// 모든 브랜치 커밋 이력 조회
git log --oneline --decorate --graph --all
 
// 특정 파일의 변경 커밋 조회
git log -- a.html
 
git remote
로컬저장소와 원격저장소를 연결한다.

// Github 원격저장소와 연결한다.
git remote add origin [자신의 Github 원격저장소 주소]
 
// 연결된 원격저장소 확인한다.
git remote -v
 
 

git push
원격저장소에 저장한다.

// 원격저장소에 저장한다.
git push -u origin master
 
// 에러 - ! [rejected] master -> master (fetch first)
// 이미 변경된 파일이 원격저장소에 있을경우 발생
git pull origin master 
 
// 에러 - ! [rejected] master -> master (non-fast-forward)
git push origin +master
 
 
아래부터는 좀 더 심화된 내용이다.

git diff
워킹 디렉터리와 다른 커밋을 비교한다.

1) 현재 브랜치의 마지막 커밋과의 차이점 비교
$git diff

2) 특정 커밋과의 차이점 비교
$git diff [Commit ID]

3) 특정 커밋과 특정 파일의 차이점 비교
$git diff [Commit ID] -- [파일 경로]

git branch
브랜치를 생성, 수정, 삭제 등을 한다.

1) 브랜치 보기
$git branch

2) 브랜치 생성
$git branch [브랜치명]

3) 브랜치 수정
$git branch -m [브랜치명] [바꿀이름]

4) 브랜치 삭제
$git branch -d [브랜치명]

git checkout
워킹 디렉터리의 소스를 특정 커밋 또는 특정 브랜치로 변경한다.

1) 특정 브랜치로 워킹 디렉터리 변경
$git checkout [브랜치명]

2) 특정 커밋으로 워킹 디렉터리 변경
$git checkout [Commit ID]

 

3) 특정 파일을 해당 브랜치 또는 커밋 상태로 변경 (원복)
$git checkout [돌아갈 Commit ID] -- [파일 경로]
*충돌 방지를 위해 브랜치명을 확인하고, 파일 추가 및 수정한 뒤 커밋해야 한다.

4) 브랜치 생성 및 체크아웃을 같이 할 경우
$git checkout -b develop

git merge
다른 두개의 브랜치 소스를 병합한다.

$git checkout master
$git merge develop
*같은 파일의 같은 위치의 내용이 변경된 경우 충돌이 발생한다.


좋아요 8
공유하기글 요소구독하기

