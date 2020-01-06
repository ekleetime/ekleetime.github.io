
# 0. 메뉴목록(페이지, 팝업, 탭) ----- 총 페이지수는 17개
## 1. STR현황 (목록 , 5개팝업) - str100_L.jsp(1)
    1. 목록
    2. STR 보고서작성팝업(5개탭) - str100_P02.jsp(2)
        1. 보고거래
        2. 보고대상자
        3. 객관적질의
        4. 주관적질의 (관련문서번호항목에 기보고검색버튼존재)
        5. 첨부파일
    2. 고객정보(5개탭) - strCommon_custInfo_p.jsp(3)
        1. 고객정보
        2. 고객위험평가결과
        3. 현재 연체 내역
        4. 담보/보증인
        5. 해당룰 상환거래내역
    3. 룰정보 - strCommon_rulInfo_p.jsp(4)
    4. STR 결제이력 - str100_P01.jsp(5)
    5. 결제,보고제외버튼시 - sancPop 레이어팝업
    6. 기보고조회팝업 - str100_P03.jsp(6)
    
    * 아직 못찾은것 : STR처리상태 팝업 -  strCommon_appr_p.jsp

## 2. STR보고서관리(목록 , 2개팝업) - str200_L.jsp(7)
    1. 목록
    2. 고객정보 - strCommon_custInfo_p.jsp
        고객정보
        고객위험평가결과
        현재 연체 내역
        담보/보증인
        해당룰 상환거래내역
    3. 룰정보 - strCommon_rulInfo_p.jsp
    
## 3. STR임의보고(목록 , 6개팝업) - str300_L.jsp(8)
    1. 목록
    2. STR임의보고조회(등록/수정) str300_P01.jsp(9)
        보고대상자
        관련계좌
        혐의거래내역
        등록사유
    3. 고객정보 (목록의 고객명 클릭시 팝업)  - strCommon_custInfo_p.jsp
        고객정보
        고객위험평가결과
        현재 연체 내역
        담보/보증인
        해당룰 상환거래내역
    4. 룰정보 - strCommon_rulInfo_p.jsp
    5. 고객추가검색 (등록시 보고대상자탭에서 고객추가시 검색팝업) - strCommon_custInfo2_p.jsp(9)
    6. 국가검색 (등록시 보고대상자탭에서 국적추가시 검색팝업) - common_cntr_p.jsp(10)
    7. 상품검색 (등록시 혐의거래내역에서 상품컬럼에서 상품검색) - common_product_p.jsp(11)

## 4. 거래제외관리(목록 , 3개팝업) - str400_L.jsp(12)
    1. 목록
    2. 거래제외 등록/수정 - str400_P01.jsp(13)
    3. 고객정보 (목록의 고객명 클릭시 팝업)  - strCommon_custInfo_p.jsp
            고객정보
            고객위험평가결과
            현재 연체 내역
            담보/보증인
            해당룰 상환거래내역
    4. 룰정보 - strCommon_rulInfo_p.jsp
    5. 결제,보고제외버튼시 - sancPop 레이어팝업

## 5. 배당변경(목록 , 2개팝업) - str500_L.jsp(13)
    1. 목록
    2. 고객정보(5개탭) - strCommon_custInfo_p.jsp
        1. 고객정보
        2. 고객위험평가결과
        3. 현재 연체 내역
        4. 담보/보증인
        5. 해당룰 상환거래내역
    3. 룰정보 - strCommon_rulInfo_p.jsp

 * 특이사항 : AGN_PROC_STS가 30(재배당요청)으로 지정된 목록만 표시 코드그룹은 AGN_PROC_STS2
 
## 6. 룰관리(한화면내 분할, 1개팝업)  - str600_L.jsp(14)
    1. 룰목록
    2. 룰정보
    3. 룰추가 str600_P01.jsp(15)
    3. Factor 내역
    
## 7. STR시뮬레이션(한화면내 분할)  - str700_L.jsp(15)
    1. 룰목록
    2. 룰정보
    3. Factor 내역
    4. 시뮬레이션기간, 결과

## 8. STR Alert현황 - rpt110_L.jsp(16)
    1. 목록
    
## 9. STR 통계(대시보드) amlDashboard.jsp(17)
 
 * 참고 : http://localhost:8080/main/amlDashboard/selectStrProcessInfoTwo.do
 
 