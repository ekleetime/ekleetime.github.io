
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
 
 
 
 참고
 [resultsettable] |----------|--------|---------|------------------------|-----------|-----|----------------|----------|
 [resultsettable] |MENU_CATE |MENU_ID |MENU_NM  |PAGE_URL                |UP_MENU_ID |LEVL |UPPER_MENU_CATE |LOWER_CNT |
 [resultsettable] |----------|--------|---------|------------------------|-----------|-----|----------------|----------|
 [resultsettable] |STR       |STR100  |STR현황    |/str/str100/str100_L.do |STR000     |2    |AML             |0         |
 [resultsettable] |STR       |STR000  |STR      |[null]                  |AML000     |1    |AML             |7         |
 [resultsettable] |STR       |STR200  |STR보고서관리 |/str/str200/str200_L.do |STR000     |2    |AML             |0         |
 [resultsettable] |STR       |STR300  |STR임의보고  |/str/str300/str300_L.do |STR000     |2    |AML             |0         |
 [resultsettable] |STR       |STR400  |거래제외관리   |/str/str400/str400_L.do |STR000     |2    |AML             |0         |
 [resultsettable] |STR       |STR500  |배당변경     |/str/str500/str500_L.do |STR000     |2    |AML             |0         |
 [resultsettable] |STR       |STR600  |룰관리      |/str/str600/str600_L.do |STR000     |2    |AML             |0         |
 [resultsettable] |STR       |STR601  |STR시뮬레이션 |/str/str700/str700_L.do |STR000     |2    |AML             |0         |
 [resultsettable] |----------|--------|---------|------------------------|-----------|-----|----------------|----------|
 
 
 [resultsettable] |-----------|---------|-----------------------------------------------------------------|-----------------------|------------------------------|------------------|-------|-------|-------|-------|-------|---------------|----------|-----------|---------------|--------------------|-------|-------|--------|------|
 [resultsettable] |USR_ID     |USR_NM   |USR_PWD                                                          |ATHR_CD                |ATHR_NM                       |HPNUM             |POS_CD |POS_NM |BRCHCD |BRCHNM |BAT_YN |LOGIN_DT       |LOGIN_CNT |LOGIN_FAIL |PWD_DT         |UPD_DT              |UPD_ID |STATUS |ROW_CNT |R_NUM |
 [resultsettable] |-----------|---------|-----------------------------------------------------------------|-----------------------|------------------------------|------------------|-------|-------|-------|-------|-------|---------------|----------|-----------|---------------|--------------------|-------|-------|--------|------|
 [resultsettable] |rba_ma     |RBA업무책임자 |ee73b18cf5bfe495702c0d07e8231faf31a48bd82600f5353aad3e2038cd7b00 |0002                   |RBA준법감시팀 메뉴                   |010-1234-5678     |1      |1      |20096  |경영관리팀  |Y      |20191209130309 |51        |0          |20201212111111 |2018-06-26 16:49:56 |admin0 |00     |12      |1     |
 [resultsettable] |datamation |개발업체     |ee73b18cf5bfe495702c0d07e8231faf31a48bd82600f5353aad3e2038cd7b00 |0001, 0002, 1000       |RBA부서담당자 메뉴, RBA준법감시팀 메뉴, 메뉴A |02-400-6477       |1      |1      |20096  |경영관리팀  |Y      |20191205133238 |7         |0          |20201212111111 |2018-06-26 16:49:56 |admin0 |00     |12      |2     |
 [resultsettable] |aml_op     |AML업무실무자 |ee73b18cf5bfe495702c0d07e8231faf31a48bd82600f5353aad3e2038cd7b00 |0001                   |RBA부서담당자 메뉴                   |010-1234-5678     |1      |1      |20096  |경영관리팀  |Y      |20180626164956 |0         |0          |20201212111111 |2018-06-26 16:49:56 |admin0 |00     |12      |3     |
 [resultsettable] |aml_ma     |AML업무책임자 |ee73b18cf5bfe495702c0d07e8231faf31a48bd82600f5353aad3e2038cd7b00 |0002                   |RBA준법감시팀 메뉴                   |010-1234-5678     |1      |1      |20096  |경영관리팀  |Y      |20191205133345 |5         |0          |20201212111111 |2018-06-26 16:49:56 |admin0 |00     |12      |4     |
 [resultsettable] |adminh0    |현대영업관리팀  |ee73b18cf5bfe495702c0d07e8231faf31a48bd82600f5353aad3e2038cd7b00 |1000                   |메뉴A                           |    010-1234-5678 |H001ㅁ  |H001ㅁ  |20096  |경영관리팀  |[null] |20191204153714 |4086      |0          |20201212111111 |2019-02-12 09:41:24 |admin0 |00     |12      |5     |
 [resultsettable] |admin2     |부서2      |ee73b18cf5bfe495702c0d07e8231faf31a48bd82600f5353aad3e2038cd7b00 |1000                   |메뉴A                           |    010-1234-5678 |3      |3      |20096  |경영관리팀  |Y      |20190416163729 |2821      |0          |20201212111111 |2018-11-05 17:49:07 |admin0 |00     |12      |6     |
 [resultsettable] |admin1     |부서1      |ee73b18cf5bfe495702c0d07e8231faf31a48bd82600f5353aad3e2038cd7b00 |1000                   |메뉴A                           |    010-1234-5678 |2      |2      |20096  |경영관리팀  |Y      |20191205133616 |3101      |0          |20201212111111 |2018-11-15 17:37:28 |admin1 |00     |12      |7     |
 [resultsettable] |admin0     |관리자      |ee73b18cf5bfe495702c0d07e8231faf31a48bd82600f5353aad3e2038cd7b00 |9999                   |관리자메뉴                         |    010-1234-5678 |H001ㅁ  |H001ㅁ  |20096  |경영관리팀  |Y      |20191212101617 |11542     |0          |20201212111111 |2019-04-24 17:34:40 |admin0 |00     |12      |8     |
 [resultsettable] |100006     |조세열      |ee73b18cf5bfe495702c0d07e8231faf31a48bd82600f5353aad3e2038cd7b00 |1000                   |메뉴A                           |01011112222       |[null] |[null] |20096  |경영관리팀  |Y      |[null]         |0         |0          |20201212111111 |2019-02-15 10:22:17 |rba_ma |20     |12      |9     |
 [resultsettable] |100005     |김홍진      |ee73b18cf5bfe495702c0d07e8231faf31a48bd82600f5353aad3e2038cd7b00 |3000, 5000             |메뉴C, 메뉴E                      |01011112222       |[null] |[null] |20096  |경영관리팀  |Y      |[null]         |0         |0          |20201212111111 |2019-03-27 18:01:37 |admin0 |20     |12      |10    |
 [resultsettable] |100004     |강민숙      |ee73b18cf5bfe495702c0d07e8231faf31a48bd82600f5353aad3e2038cd7b00 |1000, 2000, 3000, 9999 |관리자메뉴, 메뉴A, 메뉴B, 메뉴C          |01011112222       |[null] |[null] |20096  |경영관리팀  |Y      |[null]         |0         |0          |20201212111111 |2019-03-26 18:13:38 |admin0 |20     |12      |11    |
 [resultsettable] |100001     |최형진      |ee73b18cf5bfe495702c0d07e8231faf31a48bd82600f5353aad3e2038cd7b00 |1000                   |메뉴A                           |01011112222       |[null] |[null] |20096  |경영관리팀  |Y      |[null]         |0         |0          |20201212111111 |2019-04-24 14:54:56 |admin0 |20     |12      |12    |
 [resultsettable] |-----------|---------|-----------------------------------------------------------------|-----------------------|------------------------------|------------------|-------|-------|-------|-------|-------|---------------|----------|-----------|---------------|--------------------|-------|-------|--------|------|
 
 [resultsettable] |----------|--------|------------------|-------------------------------|-----------|-----|----------------|----------|
 [resultsettable] |MENU_CATE |MENU_ID |MENU_NM           |PAGE_URL                       |UP_MENU_ID |LEVL |UPPER_MENU_CATE |LOWER_CNT |
 [resultsettable] |----------|--------|------------------|-------------------------------|-----------|-----|----------------|----------|
 [resultsettable] |KYC       |KYC000  |KYC               |[null]                         |AML000     |1    |AML             |6         |
 [resultsettable] |KYC       |KYC100  |KYC현황             |[null]                         |KYC000     |2    |AML             |6         |
 [resultsettable] |KYC       |KYC101  |KYC현황             |/kyc/kyc100/kyc110_L.do        |KYC100     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC102  |월별KYC현황           |/kyc/kyc100/kyc120_L.do        |KYC100     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC103  |고객별WL현황           |/kyc/kyc100/kyc130_L.do        |KYC100     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC104  |고객별RA현황           |/kyc/kyc100/kyc140_L.do        |KYC100     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC105  |EDD현황             |/kyc/kyc100/kyc150_L.do        |KYC100     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC106  |재수행도래고객조회         |/kyc/kyc100/kyc160_L.do        |KYC100     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC200  |고객위험평가관리          |[null]                         |KYC000     |2    |AML             |6         |
 [resultsettable] |KYC       |KYC202  |RA평가항목            |/kyc/kyc200/kyc220_L.do        |KYC200     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC204  |국가위험평가            |/kyc/kyc200/kyc240_L.do        |KYC200     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC205  |상품위험평가            |/kyc/kyc200/kyc250_L.do        |KYC200     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC208  |행동위험평가            |/kyc/kyc200/kyc280_L.do        |KYC200     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC206  |등록비영리단체           |/kyc/kyc200/kyc260_L.do        |KYC200     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC207  |RA_CUT_OFF        |/kyc/kyc200/kyc270_L.do        |KYC200     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC300  |요주의리스트관리          |[null]                         |KYC000     |2    |AML             |8         |
 [resultsettable] |KYC       |KYC301  |UN조회              |/kyc/kyc300/kyc310_L.do        |KYC300     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC302  |KoFIU조회           |/kyc/kyc300/kyc320_L.do        |KYC300     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC303  |PEP조회             |/kyc/kyc300/kyc330_L.do        |KYC300     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC304  |OFAC조회            |/kyc/kyc300/kyc340_L.do        |KYC300     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC305  |FATF조회            |/kyc/kyc300/kyc350_L.do        |KYC300     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC306  |WhiteList관리       |/kyc/kyc300/kyc360_L.do        |KYC300     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC307  |자체요주의인물관리         |/kyc/kyc300/kyc370_L.do        |KYC300     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC309  |WL업로드             |/kyc/kyc300/kyc390_L.do        |KYC300     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC400  |KYE관리             |[null]                         |KYC000     |2    |AML             |1         |
 [resultsettable] |KYC       |KYC401  |KYE관리             |/kyc/kyc400/kyc410_L.do        |KYC400     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC500  |RA가중치관리           |[null]                         |KYC000     |2    |AML             |5         |
 [resultsettable] |KYC       |KYC501  |평가항목별등급           |/kyc/kyc500/kyc510_L.do        |KYC500     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC502  |평가모델별가중치          |/kyc/kyc500/kyc520_L.do        |KYC500     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC504  |평가모델가중치(NEW)      |/kyc/kyc500/kyc540_L.do        |KYC500     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC505  |RA임계치(NEW)        |/kyc/kyc500/kyc550_L.do        |KYC500     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC506  |RA시뮬레이션(NEW)      |/kyc/kyc500/kyc560_L.do        |KYC500     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC800  |NEW고객위험평가관리       |*                              |KYC000     |2    |AML             |9         |
 [resultsettable] |KYC       |KYC801  |신원위험평가            |/kyc/kyc800/kyc810_L.do        |KYC800     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC802  |국가위험평가            |/kyc/kyc800/kyc820_L.do        |KYC800     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC803  |상품위험평가            |/kyc/kyc800/kyc830_L.do        |KYC800     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC804  |직업위험평가            |/kyc/kyc800/kyc840_L.do        |KYC800     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC805  |업종위험평가            |/kyc/kyc800/kyc850_L.do        |KYC800     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC806  |채널위험평가            |/kyc/kyc800/kyc860_L.do        |KYC800     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC807  |구간위험평가            |/kyc/kyc800/kyc870_L.do        |KYC800     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC808  |고위험항목평가           |/kyc/kyc800/kyc880_L.do        |KYC800     |3    |AML             |0         |
 [resultsettable] |KYC       |KYC809  |가상통화취급업소          |/kyc/kyc800/kyc890_L.do        |KYC800     |3    |AML             |0         |
 [resultsettable] |RBA       |RBA000  |RBA               |[null]                         |AML000     |1    |RBA             |7         |
 [resultsettable] |RBA       |RBA100  |기준정보및계획관리         |[null]                         |RBA000     |2    |RBA             |4         |
 [resultsettable] |RBA       |RBA103  |부점정보관리            |/rba/rba100/rba130_L.do        |RBA100     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA104  |상품정보관리            |/rba/rba100/rba140_L.do        |RBA100     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA101  |위험평가일정및진행관리       |/rba/rba100/rba110_L.do        |RBA100     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA102  |통제활동조직매핑정보관리      |/rba/rba100/rba120_L.do        |RBA100     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA200  |자금세탁위험식별          |[null]                         |RBA000     |2    |RBA             |2         |
 [resultsettable] |RBA       |RBA201  |RiskFactor관리      |/rba/rba200/rba210_L.do        |RBA200     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA202  |자금세탁사례조회          |/rba/rba200/rba220_L.do        |RBA200     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA300  |ML/TF분석위험및평가      |[null]                         |RBA000     |2    |RBA             |2         |
 [resultsettable] |RBA       |RBA301  |ML/TF위험지표조회       |/rba/rba300/rba310_L.do        |RBA300     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA302  |ML/TF위험산출결과       |/rba/rba300/rba320_L.do        |RBA300     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA400  |내부통제효과성평가         |[null]                         |RBA000     |2    |RBA             |6         |
 [resultsettable] |RBA       |RBA401  |통제활동위험식별관리        |/rba/rba400/rba410_L.do        |RBA400     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA402  |통제활동정보조회          |/rba/rba400/rba420_L.do        |RBA400     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA403  |통제활동설계평가결과조회      |/rba/rba400/rba430_L.do        |RBA400     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA404  |통제활동수행관리          |/rba/rba400/rba440_L.do        |RBA400     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA405  |통제활동운영평가결과조회      |/rba/rba400/rba450_L.do        |RBA400     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA406  |통제활동운영평가결과부점별집계현황 |/rba/rba400/rba460_L.do        |RBA400     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA500  |개선조치관리            |[null]                         |RBA000     |2    |RBA             |3         |
 [resultsettable] |RBA       |RBA501  |내부통제평가개선조치관리      |/rba/rba500/rba510_L.do        |RBA500     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA502  |평가취약점개선조치관리       |/rba/rba500/rba520_L.do        |RBA500     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA503  |개선진행현황조회          |/rba/rba500/rba530_L.do        |RBA500     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA600  |KRI관리             |[null]                         |RBA000     |2    |RBA             |5         |
 [resultsettable] |RBA       |RBA601  |KRI선정관리           |/rba/rba600/rba610_L.do        |RBA600     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA602  |KRI지표별모니터링        |/rba/rba600/rba620_L.do        |RBA600     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA603  |전사KRI모니터링결과조회     |/rba/rba600/rba630_L.do        |RBA600     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA604  |KRI후속조치등록현황       |/rba/rba600/rba640_L.do        |RBA600     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA605  |KRI후속조치진행관리       |/rba/rba600/rba650_L.do        |RBA600     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA700  |위험평가결과관리          |[null]                         |RBA000     |2    |RBA             |2         |
 [resultsettable] |RBA       |RBA701  |부점별위험평가결과조회       |/rba/rba700/rba710_L.do        |RBA700     |3    |RBA             |0         |
 [resultsettable] |RBA       |RBA703  |부점별순위조회           |/rba/rba700/rba730_L.do        |RBA700     |3    |RBA             |0         |
 [resultsettable] |STR       |STR000  |STR               |[null]                         |AML000     |1    |AML             |7         |
 [resultsettable] |STR       |STR100  |STR현황             |/str/str100/str100_L.do        |STR000     |2    |AML             |0         |
 [resultsettable] |STR       |STR200  |STR보고서관리          |/str/str200/str200_L.do        |STR000     |2    |AML             |0         |
 [resultsettable] |STR       |STR300  |STR임의보고           |/str/str300/str300_L.do        |STR000     |2    |AML             |0         |
 [resultsettable] |STR       |STR400  |거래제외관리            |/str/str400/str400_L.do        |STR000     |2    |AML             |0         |
 [resultsettable] |STR       |STR500  |배당변경              |/str/str500/str500_L.do        |STR000     |2    |AML             |0         |
 [resultsettable] |STR       |STR600  |룰관리               |/str/str600/str600_L.do        |STR000     |2    |AML             |0         |
 [resultsettable] |STR       |STR601  |STR시뮬레이션          |/str/str700/str700_L.do        |STR000     |2    |AML             |0         |
 [resultsettable] |FIU       |FIU000  |KoFIU             |[null]                         |AML000     |1    |RBA             |4         |
 [resultsettable] |FIU       |FIU100  |지표관리              |/fiu/fiu100/fiu100_L.do        |FIU000     |2    |RBA             |0         |
 [resultsettable] |FIU       |FIU200  |지표입력              |/fiu/fiu200/fiu200_L.do        |FIU000     |2    |RBA             |0         |
 [resultsettable] |FIU       |FIU300  |보고실적관리            |/fiu/fiu300/fiu300_L.do        |FIU000     |2    |RBA             |0         |
 [resultsettable] |FIU       |FIU500  |KoFIU위험국가관리       |/fiu/fiu500/fiu500_L.do        |FIU000     |2    |RBA             |0         |
 [resultsettable] |RPT       |RPT000  |REPORTING         |[null]                         |AML000     |1    |AML             |3         |
 [resultsettable] |RPT       |RPT100  |STR 보고 현황         |[null]                         |RPT000     |2    |AML             |1         |
 [resultsettable] |RPT       |RPT101  |STR Alert 현황      |/rpt/rpt100/rpt110/rpt110_L.do |RPT100     |3    |AML             |0         |
 [resultsettable] |RPT       |RPT300  |KoFIU보고           |[null]                         |RPT000     |2    |AML             |2         |
 [resultsettable] |RPT       |RPT301  |KYC 수행현황          |/rpt/rpt300/rpt310/rpt310_L.do |RPT300     |3    |AML             |0         |
 [resultsettable] |RPT       |RPT302  |요주의리스트 업데이트 현황    |/rpt/rpt300/rpt320/rpt320_L.do |RPT300     |3    |AML             |0         |
 [resultsettable] |RPT       |RPT400  |금감원 업무 보고         |[null]                         |RPT000     |2    |AML             |5         |
 [resultsettable] |RPT       |RPT401  |STR 룰별 Alert 발생   |/rpt/rpt400/rpt410/rpt410_L.do |RPT400     |3    |AML             |0         |
 [resultsettable] |RPT       |RPT402  |STR 보고 현황         |/rpt/rpt400/rpt420/rpt420_L.do |RPT400     |3    |AML             |0         |
 [resultsettable] |RPT       |RPT403  |위험도별 고객수          |/rpt/rpt400/rpt430/rpt430_L.do |RPT400     |3    |AML             |0         |
 [resultsettable] |RPT       |RPT404  |FATF 비협조국가 고객 현황  |/rpt/rpt400/rpt440/rpt440_L.do |RPT400     |3    |AML             |0         |
 [resultsettable] |RPT       |RPT405  |고객속성별 고객수         |/rpt/rpt400/rpt450/rpt450_L.do |RPT400     |3    |AML             |0         |
 [resultsettable] |SYS       |SYS000  |SYSTEM 관리         |[null]                         |AML000     |1    |AML             |9         |
 [resultsettable] |SYS       |SYS500  |메뉴그룹관리            |/sys/sys500/sys500_L.do        |SYS000     |2    |AML             |0         |
 [resultsettable] |SYS       |SYS700  |결재그룹관리            |/sys/sys700/sys700_L.do        |SYS000     |2    |AML             |0         |
 [resultsettable] |SYS       |SYS100  |사용자관리             |/sys/sys100/sys100_L.do        |SYS000     |2    |AML             |0         |
 [resultsettable] |SYS       |SYS400  |코드관리              |/sys/sys400/sys400_L.do        |SYS000     |2    |AML             |0         |
 [resultsettable] |SYS       |SYS200  |프로그램관리            |[null]                         |SYS000     |2    |AML             |4         |
 [resultsettable] |SYS       |SYS210  |메뉴관리              |/sys/sys200/sys210_L.do        |SYS200     |3    |AML             |0         |
 [resultsettable] |SYS       |SYS220  |메뉴권한관리            |/sys/sys200/sys220_L.do        |SYS200     |3    |AML             |0         |
 [resultsettable] |SYS       |SYS230  |프로그램관리            |/sys/sys200/sys230_L.do        |SYS200     |3    |AML             |0         |
 [resultsettable] |SYS       |SYS240  |프로그램권한관리          |/sys/sys200/sys240_L.do        |SYS200     |3    |AML             |0         |
 [resultsettable] |SYS       |SYS600  |로그조회              |/sys/sys600/sys600_L.do        |SYS000     |2    |AML             |0         |
 [resultsettable] |SYS       |SYS300  |결재관리              |/sys/sys300/sys300_L.do        |SYS000     |2    |AML             |0         |
 [resultsettable] |SYS       |SYS800  |환경설정              |[null]                         |SYS000     |2    |AML             |1         |
 [resultsettable] |SYS       |SYS802  |보고기관설정            |/sys/sys800/sys820/sys820_L.do |SYS800     |3    |AML             |0         |
 [resultsettable] |SYS       |SYS900  |게시판관리             |/sys/sys900/sys900_list.do     |SYS000     |2    |AML             |3         |
 [resultsettable] |SYS       |SYS901  |공지사항              |/sys/sys900/sys910/sys910_L.do |SYS900     |3    |AML             |0         |
 [resultsettable] |SYS       |SYS902  |FAQ               |/sys/sys900/sys920/sys920_L.do |SYS900     |3    |AML             |0         |
 [resultsettable] |SYS       |SYS904  |자료실               |/sys/sys900/sys940/sys940_L.do |SYS900     |3    |AML             |0         |
 [resultsettable] |----------|--------|------------------|-------------------------------|-----------|-----|----------------|----------|
 [resultsettable] |-------------|-------------|
 [resultsettable] |APPR_ATHR_CD |APPR_ATHR_NM |
 [resultsettable] |-------------|-------------|
 [resultsettable] |A1000        |AML부서담당자     |
 [resultsettable] |A2000        |AML부서장       |
 [resultsettable] |A3000        |AML준법감시팀     |
 [resultsettable] |A4000        |AML준법감시인     |
 [resultsettable] |A5000        |AML보고책임자     |
 [resultsettable] |R1000        |부서담당자        |
 [resultsettable] |R2000        |부서장          |
 [resultsettable] |R3000        |준법감시팀        |
 [resultsettable] |R4000        |준법감시인        |
 [resultsettable] |R5000        |보고책임자        |
 [resultsettable] |-------------|-------------|
 
 
 [resultsettable] |MENU_CATE |MENU_ID |OBJ_ID                                              |
 [resultsettable] |----------|--------|----------------------------------------------------|
 [resultsettable] |STR       |STR100  |btn_search,btn_save,btn_excel,btn_delete,btn_create |
 [resultsettable] |----------|--------|----------------------------------------------------|
 [resultsettable] |-----|-------|------------|
 [resultsettable] |RNUM |BRD_NO |BRD_NM      |
 [resultsettable] |-----|-------|------------|
 [resultsettable] |1    |000    |본사          |
 [resultsettable] |2    |001    |본사영업        |
 [resultsettable] |3    |003    |부산지점        |
 [resultsettable] |4    |100    |준법감시팀       |
 [resultsettable] |5    |20096  |경영관리팀       |
 [resultsettable] |6    |A01    |국제영업본부      |
 [resultsettable] |7    |A03    |리테일영업본부     |
 [resultsettable] |8    |A04    |국내영업본부      |
 [resultsettable] |9    |AA1    |채권선물팀       |
 [resultsettable] |10   |AA2    |통화선물파트      |
 [resultsettable] |11   |AA5    |외환전략팀       |
 [resultsettable] |12   |AB0    |법인영업2팀      |
 [resultsettable] |13   |AC0    |통화상품        |
 [resultsettable] |14   |AG4    |마케팅팀        |
 [resultsettable] |15   |AH0    |국제영업1팀      |
 [resultsettable] |16   |AH1    |국제영업2팀      |
 [resultsettable] |17   |AH2    |국제영업3팀      |
 [resultsettable] |18   |AI0    |상품선물파트      |
 [resultsettable] |19   |AJ0    |금융선물팀       |
 [resultsettable] |20   |AK0    |리서치팀        |
 [resultsettable] |21   |B00    |경영지원실       |
 [resultsettable] |22   |BA0    |경영관리팀       |
 [resultsettable] |23   |BA1    |인사총무파트      |
 [resultsettable] |24   |BA2    |재무기획파트      |
 [resultsettable] |25   |BB0    |전산지원팀       |
 [resultsettable] |26   |BD1    |Compliance팀 |
 [resultsettable] |27   |BD2    |감사팀         |
 [resultsettable] |28   |BD4    |감사실         |
 [resultsettable] |29   |C00    |마케팅실        |
 [resultsettable] |30   |E00    |지점          |
 [resultsettable] |31   |E99    |테스트         |
 [resultsettable] |32   |H001   |영업관리팀       |
 [resultsettable] |33   |H002   |경영지원팀       |
 [resultsettable] |34   |H003   |준법경영실       |
 [resultsettable] |35   |H004   |IT팀         |
 [resultsettable] |36   |S001   |결제팀         |
 [resultsettable] |37   |S003   |전산지원팀       |
 [resultsettable] |38   |S004   |준법감시팀       |
 [resultsettable] |39   |S005   |경영지원팀       |
 [resultsettable] |-----|-------|------------|
 [resultsettable] |----------|--------|--------|----------|----------|----------|----------|----------|------|
 [resultsettable] |LISTGR_CD |LIST_CD |LIST_NM |LIST_ETC1 |LIST_ETC2 |LIST_ETC3 |LIST_ETC4 |LIST_ETC5 |ISUSE |
 [resultsettable] |----------|--------|--------|----------|----------|----------|----------|----------|------|
 [resultsettable] |ABAN_STS  |1       |보고      |[null]    |[null]    |[null]    |[null]    |[null]    |Y     |
 [resultsettable] |ABAN_STS  |2       |제외      |[null]    |[null]    |[null]    |[null]    |[null]    |Y     |
 [resultsettable] |----------|--------|--------|----------|----------|----------|----------|----------|------|
 [resultsettable] |-------|-------------------|
 [resultsettable] |RUL_CD |RUL_NM             |
 [resultsettable] |-------|-------------------|
 [resultsettable] |101    |장기간 연체 상환          |
 [resultsettable] |102    |다수의 대출 실행          |
 [resultsettable] |103    |제3자 상환자            |
 [resultsettable] |104    |제3자 상환자            |
 [resultsettable] |105    |제3자 상환자            |
 [resultsettable] |106    |분할 상환              |
 [resultsettable] |107    |분할 지급              |
 [resultsettable] |108    |고위험고객              |
 [resultsettable] |109    |STR보고고객의 대출        |
 [resultsettable] |110    |STR보고고객의 상환        |
 [resultsettable] |111    |고액 조기 상환           |
 [resultsettable] |112    |전자금융거래             |
 [resultsettable] |113    |차명의심군 대출           |
 [resultsettable] |114    |거래패턴변화(상환)         |
 [resultsettable] |201    |한도대비 고액 산업기계 할부/리스 |
 [resultsettable] |202    |고액 건설기계 할부/리스      |
 [resultsettable] |203    |단기간 고액 계약자 변경      |
 [resultsettable] |301    |판매후 할부/리스          |
 [resultsettable] |302    |단기간 고액 계약자 변경      |
 [resultsettable] |401    |단기간 고액 계약자 변경      |
 [resultsettable] |402    |제3자 담보물로 대출 실행     |
 [resultsettable] |403    |제3자 담보물로 상환 집행     |
 [resultsettable] |501    |고액 해외 유출           |
 [resultsettable] |502    |고액 해외 유출           |
 [resultsettable] |901    |임의보고               |
 [resultsettable] |-------|-------------------|
 [resultsettable] |------|------|
 [resultsettable] |GR_CD |GR_NM |
 [resultsettable] |------|------|
 [resultsettable] |01    |고객    |
 [resultsettable] |02    |계좌    |
 [resultsettable] |03    |거래    |
 [resultsettable] |04    |채널    |
 [resultsettable] |05    |KYE   |
 [resultsettable] |09    |임의보고  |
 [resultsettable] |------|------|
 [resultsettable] |------|-----|
 [resultsettable] |value |text |
 [resultsettable] |------|-----|
 [resultsettable] |------|-----|
 [resultsettable] |------|-----------------|
 [resultsettable] |value |text             |
 [resultsettable] |------|-----------------|
 [resultsettable] |000   |(000)본사          |
 [resultsettable] |001   |(001)본사영업        |
 [resultsettable] |003   |(003)부산지점        |
 [resultsettable] |100   |(100)준법감시팀       |
 [resultsettable] |20096 |(20096)경영관리팀     |
 [resultsettable] |A01   |(A01)국제영업본부      |
 [resultsettable] |A03   |(A03)리테일영업본부     |
 [resultsettable] |A04   |(A04)국내영업본부      |
 [resultsettable] |AA1   |(AA1)채권선물팀       |
 [resultsettable] |AA2   |(AA2)통화선물파트      |
 [resultsettable] |AA5   |(AA5)외환전략팀       |
 [resultsettable] |AB0   |(AB0)법인영업2팀      |
 [resultsettable] |AC0   |(AC0)통화상품        |
 [resultsettable] |AG4   |(AG4)마케팅팀        |
 [resultsettable] |AH0   |(AH0)국제영업1팀      |
 [resultsettable] |AH1   |(AH1)국제영업2팀      |
 [resultsettable] |AH2   |(AH2)국제영업3팀      |
 [resultsettable] |AI0   |(AI0)상품선물파트      |
 [resultsettable] |AJ0   |(AJ0)금융선물팀       |
 [resultsettable] |AK0   |(AK0)리서치팀        |
 [resultsettable] |B00   |(B00)경영지원실       |
 [resultsettable] |BA0   |(BA0)경영관리팀       |
 [resultsettable] |BA1   |(BA1)인사총무파트      |
 [resultsettable] |BA2   |(BA2)재무기획파트      |
 [resultsettable] |BB0   |(BB0)전산지원팀       |
 [resultsettable] |BD1   |(BD1)Compliance팀 |
 [resultsettable] |BD2   |(BD2)감사팀         |
 [resultsettable] |BD4   |(BD4)감사실         |
 [resultsettable] |C00   |(C00)마케팅실        |
 [resultsettable] |E00   |(E00)지점          |
 [resultsettable] |E99   |(E99)테스트         |
 [resultsettable] |H001  |(H001)영업관리팀      |
 [resultsettable] |H002  |(H002)경영지원팀      |
 [resultsettable] |H003  |(H003)준법경영실      |
 [resultsettable] |H004  |(H004)IT팀        |
 [resultsettable] |S001  |(S001)결제팀        |
 [resultsettable] |S003  |(S003)전산지원팀      |
 [resultsettable] |S004  |(S004)준법감시팀      |
 [resultsettable] |S005  |(S005)경영지원팀      |
 [resultsettable] |------|-----------------|
 [resultsettable] |-------------|-------------|
 [resultsettable] |APPR_ATHR_CD |APPR_ATHR_NM |
 [resultsettable] |-------------|-------------|
 [resultsettable] |A1000        |AML부서담당자     |
 [resultsettable] |-------------|-------------|
 [resultsettable] |--------------|---------|--------|-------------------|---------|-------|------|---------|--------|--------|----------------------|--------|-------------|----------|------------|-------|--------|----------|--------|----------|------------|-------------|---------------|----------|-------|---------|---------|------------|------|--------|-----------|-----------|----------|----------|----------|----------|-------|--------|-------------|------------|------------|------------|------------|-----------|----------|-------------------|--------|--------|-------------|---------|-------|--------|------------|-----------------|---------|-------|---------|-------|-------|-------|-------|-------|-------|-------|-------|-------|----|----------|----------|----------|----------|--------|------|
 [resultsettable] |TRANS_DT_VIEW |TRANS_DT |ILJA_DT |TRANS_ID           |TRANS_NO |DIV_GR |GR_CD |DIV_GRNM |DIV_CHU |DIV_SUM |CUST_NO               |REAL_NM |ACC_NO       |SALE_BRCH |SALE_BRCHNM |RUL_CD |RUL_GRD |KYC_POINT |RUL_SCR |SCR_POINT |ALERT_POINT |STR_PROC_STS |STR_PROC_STSNM |BOGOZOWEA |RUL_GO |ABAN_RSN |ABAN_STS |ABAN_STS_NM |MD_CD |MD_NM   |RUL_GRD_NM |RUL_STA_NM |CNT_RULCD |FILE_SNME |FILE_ENME |FILE_ONME |CBR_CD |CBR_CNT |LOAN_NO      |PRC_DEPT_CD |PRC_ATHR_CD |PRC_ATHR_NM |PRC_DEPT_NM |FPERCOR_NM |RA_GRD_CD |APPR_KEY           |KEY_DRK |APPR_CD |AGN_PROC_STS |REQ_DT   |REQ_ID |REQ_DTM |REQ_ATHR_CD |APPR_PROC_STS_NM |APPR_ETC |SEQ    |COL0     |COL1   |COL2   |COL3   |COL4   |COL5   |COL6   |COL7   |COL8   |COL9   |SNO |SMIT_ATHR |REJT_ATHR |APPR_LINE |NEXT_ATHR |ROW_CNT |R_NUM |
 [resultsettable] |--------------|---------|--------|-------------------|---------|-------|------|---------|--------|--------|----------------------|--------|-------------|----------|------------|-------|--------|----------|--------|----------|------------|-------------|---------------|----------|-------|---------|---------|------------|------|--------|-----------|-----------|----------|----------|----------|----------|-------|--------|-------------|------------|------------|------------|------------|-----------|----------|-------------------|--------|--------|-------------|---------|-------|--------|------------|-----------------|---------|-------|---------|-------|-------|-------|-------|-------|-------|-------|-------|-------|----|----------|----------|----------|----------|--------|------|
 [resultsettable] |20190610      |20190610 |[null]  |MNU201906101449001 |1        |00     |09    |임의보고     |3       |2       |550807-1234567        |개인고객명16 |2222         |100       |준법감시팀       |901    |4       |0         |0       |0         |0           |61           |[null]         |[null]    |개인     |[null]   |0        |REPORT      |901   |01_임의보고 |[null]     |[null]     |[null]    |[null]    |[null]    |[null]    |[null] |0       |2222         |100         |[null]      |[null]      |준법감시팀       |개인         |[null]    |MNU201906101449001 |1       |AML1    |01           |20191209 |admin0 |103917  |A1000       |AML부서담당자 상신 완료   |[null]   |1      |[null]   |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |1   |[null]    |A1000     |1         |[null]    |5       |1     |
 [resultsettable] |20190429      |20190429 |[null]  |MNU201904291309001 |1        |00     |09    |임의보고     |3       |2       |530504-1234567        |개인고객명15 |11           |100       |준법감시팀       |901    |4       |0         |0       |0         |0           |01           |[null]         |[null]    |개인     |[null]   |2        |[null]      |901   |01_임의보고 |[null]     |[null]     |[null]    |[null]    |[null]    |[null]    |[null] |0       |11           |100         |[null]      |[null]      |준법감시팀       |개인         |[null]    |MNU201904291309001 |1       |AML1    |01           |20190610 |[null] |144537  |A1000       |AML부서담당자 상신 완료   |상신합니다... |3      |TRANS_ID |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |1   |[null]    |A1000     |1         |[null]    |5       |2     |
 [resultsettable] |20190418      |20190418 |[null]  |MNU201904181501001 |1        |00     |09    |임의보고     |3       |2       |MNUALT_20190418_00001 |홍길동     |110110111111 |100       |준법감시팀       |901    |4       |0         |0       |0         |0           |03           |[null]         |[null]    |개인     |[null]   |1        |ABAN        |901   |01_임의보고 |[null]     |[null]     |[null]    |[null]    |[null]    |[null]    |[null] |0       |110110111111 |100         |[null]      |[null]      |준법감시팀       |개인         |[null]    |MNU201904181501001 |1       |AML1    |03           |20190529 |[null] |162207  |A2000       |AML부서장 반려 완료     |반송합니다.   |2      |TRANS_ID |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |2   |[null]    |A1000     |2         |A1000     |5       |3     |
 [resultsettable] |20190415      |20190415 |[null]  |MNU201904151516001 |1        |00     |09    |임의보고     |3       |2       |324012312345          |법인고객명11 |31213312     |100       |준법감시팀       |901    |4       |0         |0       |0         |0           |00           |[null]         |[null]    |법인     |[null]   |0        |REPORT      |901   |01_임의보고 |[null]     |[null]     |[null]    |[null]    |[null]    |[null]    |[null] |0       |31213312     |100         |[null]      |[null]      |준법감시팀       |법인         |[null]    |MNU201904151516001 |1       |[null]  |[null]       |[null]   |[null] |[null]  |[null]      |[null]           |[null]   |[null] |[null]   |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |1   |[null]    |A1000     |1         |A1000     |5       |4     |
 [resultsettable] |20190415      |20190415 |[null]  |MNU201904150859001 |1        |00     |09    |임의보고     |3       |2       |610309-1234567        |개인고객명17 |1331231231   |[null]    |[null]      |901    |4       |0         |0       |0         |0           |00           |[null]         |[null]    |개인     |DDASDAS  |0        |REPORT      |901   |01_임의보고 |[null]     |[null]     |[null]    |[null]    |[null]    |[null]    |[null] |0       |1331231231   |[null]      |[null]      |[null]      |[null]      |개인         |[null]    |MNU201904150859001 |1       |[null]  |[null]       |[null]   |[null] |[null]  |[null]      |[null]           |[null]   |[null] |[null]   |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |1   |[null]    |A1000     |1         |A1000     |5       |5     |
 [resultsettable] |--------------|---------|--------|-------------------|---------|-------|------|---------|--------|--------|----------------------|--------|-------------|----------|------------|-------|--------|----------|--------|----------|------------|-------------|---------------|----------|-------|---------|---------|------------|------|--------|-----------|-----------|----------|----------|----------|----------|-------|--------|-------------|------------|------------|------------|------------|-----------|----------|-------------------|--------|--------|-------------|---------|-------|--------|------------|-----------------|---------|-------|---------|-------|-------|-------|-------|-------|-------|-------|-------|-------|----|----------|----------|----------|----------|--------|------|
INSERT 할 테이블을 지정 후 SELECT 결과를 INSERT 합니다.

INSERT INTO SCOTT.EMP_BAK ( EMPNO, ENAME, JOB, SAL )
 SELECT EMPNO, ENAME, JOB, SUM(SAL)
   FROM SCOTT.EMP
 GROUP BY EMPNO, ENAME, JOB
;