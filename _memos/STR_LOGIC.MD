화면로직
### 권한아이디 총 5개
               #### 권한에 따른 결제상신흐름
               AML부서담당자 > AML부서장 > AML준법감시팀 > AML준법감시인 > AML보고책임자
               A1000 > A2000 > A3000 > A4000 > A5000
# 0. 메뉴목록(페이지, 팝업, 탭) ----- 총 페이지수는 17개
## 1. STR현황 (목록 , 5개팝업) - str100_L.jsp(1)
    1. 목록
    주요 로직 - url : /str/str100/str100SelectList.do
    FROM RULE_RESULT T1... 
    WHERE T1.AGN_PROC_STS NOT IN ('30')
     |---------|--------|-------------------|---------|-------|------|---------|--------|--------|----------------------|-------------|--------|-------------|----------|------------|-------|--------|----------|--------|----------|------------|-------------|---------------|----------|-------|---------|---------|------------|------|--------|-----------|-----------|----------|----------|----------|----------|-------|--------|-------------|------------|------------|------------|------------|-----------|--------|----------|-------------------|--------|--------|-------------|---------|-------|--------|------------|-----------------|---------|-------|---------|-------|-------|-------|-------|-------|-------|-------|-------|-------|----|----------|----------|----------|----------|--------|------|
     |기준일자  |ILJA_DT |TRANS_ID           |TRANS_NO |DIV_GR |GR_CD |DIV_GRNM |DIV_CHU |DIV_SUM |CUST_NO               |실명번호       |고객명   |ACC_NO       |SALE_BRCH |취급점       |룰ID    |RUL_GRD |KYC_POINT |RUL_SCR |SCR_POINT |ALERT_POINT |STR_PROC_STS |처리상태        |BOGOZOWEA |고객구분|ABAN_RSN |ABAN_STS |ABAN_STS_NM |MD_CD |MD_NM   |RUL_GRD_NM |RUL_STA_NM |CNT_RULCD |FILE_SNME |FILE_ENME |FILE_ONME |CBR_CD |CBR_CNT |LOAN_NO      |PRC_DEPT_CD |PRC_ATHR_CD |PRC_ATHR_NM |PRC_DEPT_NM |FPERCOR_NM |FPERCOR |RA_GRD_CD |APPR_KEY           |KEY_DRK |APPR_CD |AGN_PROC_STS |REQ_DT   |REQ_ID |REQ_DTM |REQ_ATHR_CD |결재상태 |APPR_ETC |SEQ    |COL0     |COL1   |COL2   |COL3   |COL4   |COL5   |COL6   |COL7   |COL8   |COL9   |SNO |SMIT_ATHR |REJT_ATHR |APPR_LINE |NEXT_ATHR |ROW_CNT |R_NUM |
     |TRANS_DT |ILJA_DT |TRANS_ID           |TRANS_NO |DIV_GR |GR_CD |DIV_GRNM |DIV_CHU |DIV_SUM |CUST_NO               |CUST_NO_VIEW |REAL_NM |ACC_NO       |SALE_BRCH |SALE_BRCHNM |RUL_CD |RUL_GRD |KYC_POINT |RUL_SCR |SCR_POINT |ALERT_POINT |STR_PROC_STS |STR_PROC_STSNM |BOGOZOWEA |RUL_GO |ABAN_RSN |ABAN_STS |ABAN_STS_NM |MD_CD |MD_NM   |RUL_GRD_NM |RUL_STA_NM |CNT_RULCD |FILE_SNME |FILE_ENME |FILE_ONME |CBR_CD |CBR_CNT |LOAN_NO      |PRC_DEPT_CD |PRC_ATHR_CD |PRC_ATHR_NM |PRC_DEPT_NM |FPERCOR_NM |FPERCOR |RA_GRD_CD |APPR_KEY           |KEY_DRK |APPR_CD |AGN_PROC_STS |REQ_DT   |REQ_ID |REQ_DTM |REQ_ATHR_CD |APPR_PROC_STS_NM |APPR_ETC |SEQ    |COL0     |COL1   |COL2   |COL3   |COL4   |COL5   |COL6   |COL7   |COL8   |COL9   |SNO |SMIT_ATHR |REJT_ATHR |APPR_LINE |NEXT_ATHR |ROW_CNT |R_NUM |
     |---------|--------|-------------------|---------|-------|------|---------|--------|--------|----------------------|-------------|--------|-------------|----------|------------|-------|--------|----------|--------|----------|------------|-------------|---------------|----------|-------|---------|---------|------------|------|--------|-----------|-----------|----------|----------|----------|----------|-------|--------|-------------|------------|------------|------------|------------|-----------|--------|----------|-------------------|--------|--------|-------------|---------|-------|--------|------------|-----------------|---------|-------|---------|-------|-------|-------|-------|-------|-------|-------|-------|-------|----|----------|----------|----------|----------|--------|------|
     |20190610 |[null]  |MNU201906101449001 |1        |00     |09    |임의보고     |3       |2       |550807-1234567        |[null]       |개인고객명16 |2222         |100       |준법감시팀       |901    |4       |0         |0       |0         |0           |61           |[null]         |[null]    |개인     |[null]   |0        |REPORT      |901   |01_임의보고 |[null]     |[null]     |[null]    |[null]    |[null]    |[null]    |[null] |0       |2222         |100         |[null]      |[null]      |준법감시팀       |개인         |[null]  |[null]    |MNU201906101449001 |1       |AML1    |01           |20191209 |admin0 |103917  |A1000       |AML부서담당자 상신 완료   |[null]   |1      |[null]   |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |1   |[null]    |A1000     |1         |[null]    |5       |1     |
     |20190429 |[null]  |MNU201904291309001 |1        |00     |09    |임의보고     |3       |2       |530504-1234567        |[null]       |개인고객명15 |11           |100       |준법감시팀       |901    |4       |0         |0       |0         |0           |01           |[null]         |[null]    |개인     |[null]   |2        |[null]      |901   |01_임의보고 |[null]     |[null]     |[null]    |[null]    |[null]    |[null]    |[null] |0       |11           |100         |[null]      |[null]      |준법감시팀       |개인         |[null]  |[null]    |MNU201904291309001 |1       |AML1    |01           |20190610 |[null] |144537  |A1000       |AML부서담당자 상신 완료   |상신합니다... |3      |TRANS_ID |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |1   |[null]    |A1000     |1         |[null]    |5       |2     |
     |20190418 |[null]  |MNU201904181501001 |1        |00     |09    |임의보고     |3       |2       |MNUALT_20190418_00001 |[null]       |홍길동     |110110111111 |100       |준법감시팀       |901    |4       |0         |0       |0         |0           |03           |[null]         |[null]    |개인     |[null]   |1        |ABAN        |901   |01_임의보고 |[null]     |[null]     |[null]    |[null]    |[null]    |[null]    |[null] |0       |110110111111 |100         |[null]      |[null]      |준법감시팀       |개인         |[null]  |[null]    |MNU201904181501001 |1       |AML1    |03           |20190529 |[null] |162207  |A2000       |AML부서장 반려 완료     |반송합니다.   |2      |TRANS_ID |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |2   |[null]    |A1000     |2         |A1000     |5       |3     |
     |20190415 |[null]  |MNU201904151516001 |1        |00     |09    |임의보고     |3       |2       |324012312345          |[null]       |법인고객명11 |31213312     |100       |준법감시팀       |901    |4       |0         |0       |0         |0           |00           |[null]         |[null]    |법인     |[null]   |0        |REPORT      |901   |01_임의보고 |[null]     |[null]     |[null]    |[null]    |[null]    |[null]    |[null] |0       |31213312     |100         |[null]      |[null]      |준법감시팀       |법인         |[null]  |[null]    |MNU201904151516001 |1       |[null]  |[null]       |[null]   |[null] |[null]  |[null]      |[null]           |[null]   |[null] |[null]   |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |1   |[null]    |A1000     |1         |A1000     |5       |4     |
     |20190415 |[null]  |MNU201904150859001 |1        |00     |09    |임의보고     |3       |2       |610309-1234567        |[null]       |개인고객명17 |1331231231   |[null]    |[null]      |901    |4       |0         |0       |0         |0           |00           |[null]         |[null]    |개인     |DDASDAS  |0        |REPORT      |901   |01_임의보고 |[null]     |[null]     |[null]    |[null]    |[null]    |[null]    |[null] |0       |1331231231   |[null]      |[null]      |[null]      |[null]      |개인         |[null]  |[null]    |MNU201904150859001 |1       |[null]  |[null]       |[null]   |[null] |[null]  |[null]      |[null]           |[null]   |[null] |[null]   |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |[null] |1   |[null]    |A1000     |1         |A1000     |5       |5     |
     |---------|--------|-------------------|---------|-------|------|---------|--------|--------|----------------------|-------------|--------|-------------|----------|------------|-------|--------|----------|--------|----------|------------|-------------|---------------|----------|-------|---------|---------|------------|------|--------|-----------|-----------|----------|----------|----------|----------|-------|--------|-------------|------------|------------|------------|------------|-----------|--------|----------|-------------------|--------|--------|-------------|---------|-------|--------|------------|-----------------|---------|-------|---------|-------|-------|-------|-------|-------|-------|-------|-------|-------|----|----------|----------|----------|----------|--------|------|
     1-1 JSP내 함수 LOAD, ACTION 로직
        0.   url : /mng/common/selectCmMnAthrBtn.d
            do : 지점정보 (부서명) 조회
            sql :  FROM CM_MENU A INNER JOIN CM_MNATHR B ON A.MENU_CATE = B.MENU_CATE AND A.MENU_ID = B.MENU_ID AND B.ATHR_CD = ? WHERE A.USE_YN = 'Y' AND A.PAGE_URL = ?
            js : setBtnAthr 에서 tabstrip 못찾는 문제있음.   	
            |MENU_CATE |MENU_ID |OBJ_ID                                              |
            |----------|--------|----------------------------------------------------|
            |STR       |STR100  |btn_search,btn_save,btn_excel,btn_delete,btn_create |
            |----------|--------|----------------------------------------------------|
            <<
        1. initCombo();
            1.
                url : /mng/common/commonBrdNmSelectList.do
                do : 지점정보 (부서명) 조회
                sql :  FROM TVGMCDJUM  WHERE FOUTJUM = '1' (부서지점코드가 1이면서...)
                jsp : id = SALE_BRCHNM(취급점) select
            2. TODO : 변수사용하는곳을 확인
                url : /mng/common/selectCmListData.do
                do : 공통 코드 조회
                sql : FROM TB_COM_COD WHERE COD_GRP_ID IS NOT NULL AND COD_GRP_ID = 'ABAN_STS' AND COD NOT IN ('*')
                jsp : abanStsAr[] 변수
            3. TODO : RUL_STS = '2' 의미확인
                url : /str/strCommon/selectRulList.do
                do : 룰 select box
                sql : FROM RULE_INFO WHERE RUL_STS = '2'
                jsp : id = SEARCH_RUL_CD(룰ID) select
            
            4. TODO : 주석 - 사용되는지 확인
                url : /str/strCommon/selectCmCodegr.do
                do : 룰 업무 구분 select box
                sql : FROM CM_CODEGR WHERE GR_CD NOT IN ('*')
                jsp : id = SEARCH_DIV_GR(룰 거래유형) select -- 주석되어있음. 
            
            5. 
                url : combo_str_proc_sts_code.do (STR_PROC_STS)
                do : 룰 업무 구분 makeCombo
                sql : 공통코드
                jsp : id = SEARCH_STR_PROC_STS(처리상태) select  
            /** 
            		21	작성대기	지점담당자 작성대기 (athr_cd == "1100")
            		22	작성중		지점담당자 작성중(athr_cd == "1100")
            		23	작성완료	지점담당자 작성완료(athr_cd == "1100")
            		24	결재		지점담당자 결재(athr_cd == "1200")
            		25	보고제외	지점담당자 보고제외(athr_cd == "1200")
            		32	결재		부서장 결재(athr_cd == "1300")
            		33	반송		부서장 반송
            		35	보고제외	부서장 보고제외(athr_cd == "1300")
            		36	반송		부서장 보고제외 반송
            		41	작성대기	준법지원팀 작성대기
            		42	작성중		준법지원팀 작성중
            		43	작성완료	준법지원팀 작성완료(athr_cd == "1300")
            		44	결재		준법지원팀 결재(athr_cd == "1400", athr_cd == "1500")
            		45	반송		준법지원팀 반송
            		47	보고제외	준법지원팀 보고제외(athr_cd == "1400", athr_cd == "1500")
            		48	반송		준법지원팀 보고제외 반송
            		53	반송		준법감시인 반송
            		55	반송		준법감시인 보고제외 반송
            		61	보고완료	보고완료
            		98	보고제외	보고제외
            	*/
            	  /** 
            	  */
            	
     	2. initButton();
     	    1. 엑셀다운로드 클릭시
                url : /str/str100/str100excelDownloadList.do
                do :  STR 현황 엑셀 다운로드
                sql : 목록과 동일
     	
     	3. initGrid();
     	    1. 화면에 들어온 권한이 다음권한이 아니거나, 보고완료, 보고제외일경우 체크박스 비활성
                if(appr_athr_cd != data.NEXT_ATHR || data.STR_PROC_STS == "61" || data.STR_PROC_STS == "98"){
                        disabled = "disabled";
                }
                
     	    2. AML부서담당자 이면 체크박스 선택시 체크박스 하나만 선택     	        
                if(appr_athr_cd == "A1000") {
                    tempHtml += '<input type="checkbox" onchange="detailGridCheck();" class="str100_checkbox" '+disabled+' style="width:20px;height:20px;" name="gridChk">';
                } else {
                    tempHtml += '<input type="checkbox" class="str100_checkbox" '+disabled+' style="width:20px;height:20px;" name="gridChk">';
                }
            3. 고객명 클릭시 고객정보 팝업 호출
            4. AML부서장이거나 AML보고책임자이면서 21(작성대기)일때 취급점 select box에서 선택후 저장가능    
            5. STR보고서
                준법책임자는 해당현황의 STR_PROC_STS가(21, 22,33,36,45,48,53,55)
                     지점담당자가 작성대기나 작성중 상태거나
                     부서장반송상태이거나 부서장 보고제외반송상태이거나
                     준법지원팀 방송이거나 준법지원팀 보고제외 반송이거나
                     준법감시임 반송이거나 준법감시인 보고제외 반송일경우 "작성버튼"
                 준법책임자가 아니면서 지점담당자가 작성대기나 작성중일시 "버튼없음"
                 
                 rbamrcap
                 osbLogin.do> dbcLogin.do
                
                
     	5. defaultSettingActionStatus();     	
            // 사이드 메뉴에서 최초 화면 호출 시 권한별 처리상태 기본 설정
            // 2019.07.29 이현종 대리님 요청
            function defaultSettingActionStatus() {
                if(appr_athr_cd == "A1000") {
                    $('#SEARCH_STR_PROC_STS').val("21"); // 준법감시담당자 작성대기
                } else if(appr_athr_cd == "A2000") {
                    $('#SEARCH_STR_PROC_STS').val("24"); // 준법감시담당자 보고 상신
                } else if(appr_athr_cd == "A3000") {
                    $('#SEARCH_STR_PROC_STS').val("41"); // 보고담당자 작성대기
                } else if(appr_athr_cd == "A5000") {
                    $('#SEARCH_STR_PROC_STS').val("44"); // 보고담당자 보고 상신
                }
            }
           
            //selectCmListData.do	
            //selectRulList.do	
            //selectCmCodegr.do	
            //combo_str_proc_sts_code.do	
            //combo_jum.do	
            actionAutrChangeAjax.do	
            str100SelectList.do	
            
    1-2 JSP내 권한 show/hide
        AML부서담당자 이면 
            활성화 : FIU 보고, FIU 보고제외 버튼
            비활성화 : 결재버튼
        아닐때      
            활성화 : 결재버튼
            비활성화 : FIU 보고, FIU 보고제외 버튼
    	if(appr_athr_cd == "A1000") {
    		$('#sanc_report_btn').show();
    		$('#sanc_aban_btn').show();
    		$('#sanc_pop_btn').hide();
    	} else {
    		$('#sanc_report_btn').hide();
    		$('#sanc_aban_btn').hide();
        	$('#sanc_pop_btn').show();
    	}
    	
    	//공통 부서콤보박스 url : /mng/common/combo_jum.do
    	부서에 들어갑니다..
    	options: [{text: "전체", selected: "1", value: ""}, {text: "(000)본사", value: "000"},…]
        0: {text: "전체", selected: "1", value: ""}
        1: {text: "(000)본사", value: "000"}
        2: {text: "(001)본사영업", value: "001"}
        3: {text: "(003)부산지점", value: "003"}
        4: {text: "(100)준법감시팀", value: "100"}
        5: {text: "(20096)경영관리팀", value: "20096"}
        6: {text: "(A01)국제영업본부", value: "A01"}
        7: {text: "(A03)리테일영업본부", value: "A03"}
        8: {text: "(A04)국내영업본부", value: "A04"}
        9: {text: "(AA1)채권선물팀", value: "AA1"}
        10: {text: "(AA2)통화선물파트", value: "AA2"}
        11: {text: "(AA5)외환전략팀", value: "AA5"}
        12: {text: "(AB0)법인영업2팀", value: "AB0"}
        13: {text: "(AC0)통화상품", value: "AC0"}
        14: {text: "(AG4)마케팅팀", value: "AG4"}
        15: {text: "(AH0)국제영업1팀", value: "AH0"}
        16: {text: "(AH1)국제영업2팀", value: "AH1"}
        17: {text: "(AH2)국제영업3팀", value: "AH2"}
        18: {text: "(AI0)상품선물파트", value: "AI0"}
        19: {text: "(AJ0)금융선물팀", value: "AJ0"}
        20: {text: "(AK0)리서치팀", value: "AK0"}
        21: {text: "(B00)경영지원실", value: "B00"}
        22: {text: "(BA0)경영관리팀", value: "BA0"}
        23: {text: "(BA1)인사총무파트", value: "BA1"}
        24: {text: "(BA2)재무기획파트", value: "BA2"}
        25: {text: "(BB0)전산지원팀", value: "BB0"}
        26: {text: "(BD1)Compliance팀", value: "BD1"}
        27: {text: "(BD2)감사팀", value: "BD2"}
        28: {text: "(BD4)감사실", value: "BD4"}
        29: {text: "(C00)마케팅실", value: "C00"}
        30: {text: "(E00)지점", value: "E00"}
        31: {text: "(E99)테스트", value: "E99"}
        32: {text: "(H001)영업관리팀", value: "H001"}
        33: {text: "(H002)경영지원팀", value: "H002"}
        34: {text: "(H003)준법경영실", value: "H003"}
        35: {text: "(H004)IT팀", value: "H004"}
        36: {text: "(S001)결제팀", value: "S001"}
        37: {text: "(S003)전산지원팀", value: "S003"}
        38: {text: "(S004)준법감시팀", value: "S004"}
        39: {text: "(S005)경영지원팀", value: "S005"}
        if(athr_cd != "1100" && athr_cd != "1200"){
            if($('#SEARCH_BRCHCD').html().trim() == ''){
                $('#SEARCH_BRCHCD').makeJumCombo({
                    async : false
                });
            }
        }
    
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
    주요 로직 - url : /str/str200/str200SelectList.do
    FROM RULE_RESULT T1...
    WHERE T1.AGN_PROC_STS = '61' /* 61: 승인완료 */
     |--------------|---------|--------|-------------------|---------|-------|------|---------|--------|--------|---------------|-------------|--------|-------|----------|------------|-------|--------|----------|--------|----------|------------|-------------|---------------|----------|-------|---------|---------|------|--------|-----------|-----------|----------|----------|----------|----------|-------|--------|--------|------------|------------|------------|------------|-----------|--------|-------|----------|-----------|---------|--------|------|
     |TRANS_DT_VIEW |기준일자  |ILJA_DT |TRANS_ID           |TRANS_NO |DIV_GR |GR_CD |DIV_GRNM |DIV_CHU |DIV_SUM |CUST_NO        |실명번호       |고객명   |ACC_NO |취급점     |SALE_BRCHNM |룰ID   |RUL_GRD |KYC_POINT |RUL_SCR |SCR_POINT |ALERT_POINT |AGN_PROC_STS |AGN_PROC_STSNM |BOGOZOWEA |고객구분|ABAN_RSN |ABAN_STS |MD_CD |MD_NM   |RUL_GRD_NM |RUL_STA_NM |CNT_RULCD |FILE_SNME |FILE_ENME |FILE_ONME |CBR_CD |CBR_CNT |LOAN_NO |PRC_DEPT_CD |PRC_ATHR_CD |PRC_ATHR_NM |PRC_DEPT_NM |FPERCOR_NM |FPERCOR |FNOSIL |RA_GRD_CD |보고여부     |KoFiu보고일자   |ROW_CNT |R_NUM |
     |TRANS_DT_VIEW |TRANS_DT |ILJA_DT |TRANS_ID           |TRANS_NO |DIV_GR |GR_CD |DIV_GRNM |DIV_CHU |DIV_SUM |CUST_NO        |CUST_NO_VIEW |REAL_NM |ACC_NO |SALE_BRCH |SALE_BRCHNM |RUL_CD |RUL_GRD |KYC_POINT |RUL_SCR |SCR_POINT |ALERT_POINT |AGN_PROC_STS |AGN_PROC_STSNM |BOGOZOWEA |RUL_GO |ABAN_RSN |ABAN_STS |MD_CD |MD_NM   |RUL_GRD_NM |RUL_STA_NM |CNT_RULCD |FILE_SNME |FILE_ENME |FILE_ONME |CBR_CD |CBR_CNT |LOAN_NO |PRC_DEPT_CD |PRC_ATHR_CD |PRC_ATHR_NM |PRC_DEPT_NM |FPERCOR_NM |FPERCOR |FNOSIL |RA_GRD_CD |FIU_PRV_NM |STR_DT   |ROW_CNT |R_NUM |
     |--------------|---------|--------|-------------------|---------|-------|------|---------|--------|--------|---------------|-------------|--------|-------|----------|------------|-------|--------|----------|--------|----------|------------|-------------|---------------|----------|-------|---------|---------|------|--------|-----------|-----------|----------|----------|----------|----------|-------|--------|--------|------------|------------|------------|------------|-----------|--------|-------|----------|-----------|---------|--------|------|
     |20190610      |20190610 |[null]  |MNU201906101449001 |1        |00     |09    |임의보고     |3       |2       |550807-1234567 |[null]       |개인고객명16 |2222   |100       |준법감시팀       |901    |4       |0         |0       |0         |0           |61           |               |[null]    |개인     |[null]   |0        |901   |01_임의보고 |[null]     |[null]     |[null]    |[null]    |[null]    |[null]    |[null] |0       |2222    |100         |[null]      |[null]      |준법감시팀       |개인         |[null]  |--     |[null]    |보고         |20191203 |1       |1     |
     |--------------|---------|--------|-------------------|---------|-------|------|---------|--------|--------|---------------|-------------|--------|-------|----------|------------|-------|--------|----------|--------|----------|------------|-------------|---------------|----------|-------|---------|---------|------|--------|-----------|-----------|----------|----------|----------|----------|-------|--------|--------|------------|------------|------------|------------|-----------|--------|-------|----------|-----------|---------|--------|------|

    2. 고객정보 - strCommon_custInfo_p.jsp
        고객정보
        고객위험평가결과
        현재 연체 내역
        담보/보증인
        해당룰 상환거래내역
    3. 룰정보 - strCommon_rulInfo_p.jsp
    
## 3. STR임의보고(목록 , 6개팝업) - str300_L.jsp(8)
    1. 목록
    주요 로직 - url : /str/str300/str300SelectList.do
    FROM STR_MNU_MASTER A 
    |----------------------|-------------------|-------|----------------------|-------------|---------|---------|-------|-----------|-------|----------------|---------|-------|---------|--------|----------|---------|-----------|---------|---------|--------|------|
    |ALERT대기번호          |ALERT그룹번호        |룰코드  |CUST_NO               |실명번호      |등록일자   |EXE_DT   |등록자  |RGS_BR_COD |등록부서명 |등록사유     |실행일자  |등록자이름 |작성구분 |고객명   |FPERCORNM |FDKUKJUK |FDKUKJUKNM |FNOPSTGU |FADHANGU |ROW_CNT |R_NUM |
    |ALT_STAB_NO           |ALT_GRP_NO         |RUL_CD |CUST_NO               |CUST_NO_VIEW |REG_DT   |EXE_DT   |REG_ID |RGS_BR_COD |RGS_BR |MNU_RPT_RSN     |EXEC_DT  |USR_NM |DRUP_DST |REAL_NM |FPERCORNM |FDKUKJUK |FDKUKJUKNM |FNOPSTGU |FADHANGU |ROW_CNT |R_NUM |
    |----------------------|-------------------|-------|----------------------|-------------|---------|---------|-------|-----------|-------|----------------|---------|-------|---------|--------|----------|---------|-----------|---------|---------|--------|------|
    |MNUALT_20190610_00001 |MNU201906101449001 |901    |550807-1234567        |[null]       |20190610 |20190610 |admin0 |20096      |경영관리팀  |ㅇㅇ              |20190610 |관리자    |보고       |개인고객명16 |개인        |KR       |대한민국       |12345    |자택 주소16  |6       |1     |
    |MNUALT_20190429_00001 |MNU201904291309001 |901    |530504-1234567        |[null]       |20190429 |20190429 |admin0 |20096      |경영관리팀  |sdf             |20190429 |관리자    |보고       |개인고객명15 |개인        |KR       |대한민국       |12345    |자택 주소15  |6       |2     |
    |MNUALT_20190418_00001 |MNU201904181501001 |901    |MNUALT_20190418_00001 |[null]       |20190418 |20190418 |admin0 |20096      |경영관리팀  |테스트             |20190418 |관리자    |보고       |홍길동     |개인        |[null]   |[null]     |[null]   |[null]   |6       |3     |
    |MNUALT_20190415_00003 |MNU201904151516001 |901    |324012312345          |[null]       |20190415 |20190415 |admin0 |20096      |경영관리팀  |ㅇㅁㅇㅁㄴ           |20190415 |관리자    |보고       |법인고객명11 |법인        |KR       |대한민국       |12345    |본점 주소11  |6       |4     |
    |MNUALT_20190415_00002 |MNU201904151452001 |901    |660317-1234567        |[null]       |20190415 |20190415 |admin0 |20096      |경영관리팀  |321213312312312 |20190415 |관리자    |보고       |개인고객명21 |개인        |KR       |대한민국       |12345    |자택 주소21  |6       |5     |
    |MNUALT_20190415_00001 |MNU201904150859001 |901    |610309-1234567        |[null]       |20190415 |20190415 |admin0 |20096      |경영관리팀  |test123         |20190415 |관리자    |보고       |개인고객명17 |개인        |KR       |대한민국       |12345    |자택 주소17  |6       |6     |
    |----------------------|-------------------|-------|----------------------|-------------|---------|---------|-------|-----------|-------|----------------|---------|-------|---------|--------|----------|---------|-----------|---------|---------|--------|------|

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
    주요 로직 - url : /str/str400/str400SelectList.do
     FROM RULE_WHITE_USER A 
     |--------|-------------|---------|-------|-------|-------|---------|------------|-----------|-------|-------|-------|-------|---------|--------|--------|-------------|-------|-------|--------|------------|-----------------|---------|----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|----|----------|----------|----------|----------|--------|------|
     |CUST_NO |CUST_NO_VIEW |고객명    |룰ID   |관리시작일 |관리종료일 |PROC_STS |결재상태 |담당자 |사용여부 |거래제외사유 |REJECT |처리자 |APPR_KEY |KEY_DRK |APPR_CD |AGN_PROC_STS |REQ_DT |REQ_ID |REQ_DTM |REQ_ATHR_CD |APPR_PROC_STS_NM |APPR_ETC |SEQ |COL0 |COL1 |COL2 |COL3 |COL4 |COL5 |COL6 |COL7 |COL8 |COL9 |SNO |SMIT_ATHR |REJT_ATHR |APPR_LINE |NEXT_ATHR |ROW_CNT |R_NUM |
     |실명번호 |CUST_NO_VIEW |FNMHANGL |RUL_CD |STR_DT |END_DT |PROC_STS |PROC_STS_NM |AGN_USR_ID |USE_YN |REASON |REJECT |UPD_ID |APPR_KEY |KEY_DRK |APPR_CD |AGN_PROC_STS |REQ_DT |REQ_ID |REQ_DTM |REQ_ATHR_CD |APPR_PROC_STS_NM |APPR_ETC |SEQ |COL0 |COL1 |COL2 |COL3 |COL4 |COL5 |COL6 |COL7 |COL8 |COL9 |SNO |SMIT_ATHR |REJT_ATHR |APPR_LINE |NEXT_ATHR |ROW_CNT |R_NUM |
     |--------|-------------|---------|-------|-------|-------|---------|------------|-----------|-------|-------|-------|-------|---------|--------|--------|-------------|-------|-------|--------|------------|-----------------|---------|----|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|----|----------|----------|----------|----------|--------|------|
      1-1 JSP내 함수 LOAD, ACTION 로직
           0. initGrid, #btn_search 클릭시
               url : /str/str400/str400SelectList.do
               do : STR거래제외관리 리스트조회
               sql :  FROM RULE_WHITE_USER A 
                            INNER JOIN CM_USR CU ON A.REG_ID = CU.USR_ID AND CU.DEPT_CD = #{SESSION_DEPT_CD}//SESSION_ATHR_CD이 1100이거나 1200일때
                             LEFT JOIN TACUGIBM B ON A.CUST_NO = B.FNOSIL
               jsp : firstGrid
           
             
    2. 거래제외 등록/수정 - str400_P01.jsp(13)
            0. #btn_add_pop 클릭시 등록 
               url : /str/strCommon/selectRulList.do
               do : 거래제외 등록/수정 팝업페이지               
               jsp : str400_P01
           1. initPopCombo (ready1)
               url : /str/strCommon/selectRulList.do
               do : 룰 select box
               sql : SELECT RUL_CD ,RUL_NM FROM RULE_INFO WHERE RUL_STS = '2' ORDER BY TO_NUMBER(RUL_CD) ASC
               jsp : ready
           2. #btn_cust_search 클릭시 (실명번호클릭시)
               url : /str/strCommon/strCommon_custInfo2_p.do
               do : 고객정보
               jsp : strCommon_custInfo2_p
    3. 고객정보 (목록의 고객명 클릭시 팝업)  - strCommon_custInfo_p.jsp
            0. init 
               url : /str/strCommon/strCommonSelectCustInfo.do
               do : STR 고객정보 조회
               sql : 
                    1. strCommonSelectCustInfo(paramMap);//STR 고객정보 조회
                      FROM TACUGIBM LEFT JOIN KYC_CUST_MNG TB ON TA.FNOSIL = TB.CUST_NO AND TB.WLF_TRGT_CLCD = '01' LEFT JOIN KYC_CNTY N ON TA.FCDKUKCF = N.CNTY_CD_2CHR
                    1. strCommonSelectCustRaInfo(paramMap);//STR 고객위험평가 조회
                      FROM KYC_CUST_MNG , FROM RULE_RESULT , FROM CTR_MASTER 
                    1. strCommonSelectCustRaEddList(map2);//KYC 위험평가 결과 조회 - 고객별
                      FROM   KYC_CUST_RA, KYC_CUST_MNG, KYC_CUST_CDD
                    1. strCommonSelectCustAccList(paramMap);//STR 고객계좌정보 조회
                        FROM TALNDCHM
                    1. selectTrustOver(paramMap);//고객 연체정보 조회
                    1. selectTrustDambo(paramMap);//고객 담보정보 조회
                    1. selectTrustWrnt(paramMap);//고객 보증정보 조회
                    1. selectRepay(paramMap);//고객 상한정보 조회              
               jsp : str400_P01
           1. initPopCombo (ready1)
               url : /str/strCommon/selectRulList.do
               do : 룰 select box
               sql : SELECT RUL_CD ,RUL_NM FROM RULE_INFO WHERE RUL_STS = '2' ORDER BY TO_NUMBER(RUL_CD) ASC
               jsp : ready
            고객정보
            고객위험평가결과 
            현재 연체 내역
            담보/보증인
            해당룰 상환거래내역
    4. 룰정보 - strCommon_rulInfo_p.jsp
    5. 결제,보고제외버튼시 - sancPop 레이어팝업

## 5. 배당변경(목록 , 2개팝업) - str500_L.jsp(13)
    1. 목록
    주요 로직 - url : /str/str500/str500SelectList.do
      FROM RULE_RESULT A
     WHERE AGN_PROC_STS = '30' ,재배당요청 (30으로 변경하는건 어디서?)
     |-------------------|---------|---------|-------|--------|--------|---------------|-------------|--------|-----------|----------|--------|-------|--------|----------|--------|----------|------------|--------|--------|--------|--------|--------|--------|---------|---------|---------|---------|---------|---------|---------|-----------|-------------|--------|--------|-----------|---------|-------|---------|-------|--------|----------|-------|--------|-------|-----------|------------|------------|--------|------|
     |TRANS_ID           |TRANS_NO |기준일자  |DIV_GR |DIV_CHU |DIV_SUM |실명번호        |CUST_NO_VIEW |고객명   |ACC_NO     |SALE_BRCH |ILJA_DT |룰ID   |RUL_GRD |KYC_POINT |RUL_SCR |SCR_POINT |ALERT_POINT |FACTOR1 |FACTOR2 |FACTOR3 |FACTOR4 |FACTOR5 |FACTOR6 |PFACTOR1 |PFACTOR2 |PFACTOR3 |PFACTOR4 |PFACTOR5 |PFACTOR6 |배당변경요청일자   |AGN_USR_ID |AGN_PROC_STS |APPR_ID |ADDR_DT |FIU_PRV_GB |ABAN_RSN |STR_DT |ABAN_STS |RUL_GO |ABAN_CD |TRANS_CNT |CBR_CD |CBR_CNT |SAYU   |LOAN_NO    |부서 |PRC_ATHR_CD |ROW_CNT |R_NUM |
     |TRANS_ID           |TRANS_NO |TRANS_DT |DIV_GR |DIV_CHU |DIV_SUM |CUST_NO        |CUST_NO_VIEW |REAL_NM |ACC_NO     |SALE_BRCH |ILJA_DT |RUL_CD |RUL_GRD |KYC_POINT |RUL_SCR |SCR_POINT |ALERT_POINT |FACTOR1 |FACTOR2 |FACTOR3 |FACTOR4 |FACTOR5 |FACTOR6 |PFACTOR1 |PFACTOR2 |PFACTOR3 |PFACTOR4 |PFACTOR5 |PFACTOR6 |AGN_DT   |AGN_USR_ID |AGN_PROC_STS |APPR_ID |ADDR_DT |FIU_PRV_GB |ABAN_RSN |STR_DT |ABAN_STS |RUL_GO |ABAN_CD |TRANS_CNT |CBR_CD |CBR_CNT |SAYU   |LOAN_NO    |PRC_DEPT_CD |PRC_ATHR_CD |ROW_CNT |R_NUM |
     |-------------------|---------|---------|-------|--------|--------|---------------|-------------|--------|-----------|----------|--------|-------|--------|----------|--------|----------|------------|--------|--------|--------|--------|--------|--------|---------|---------|---------|---------|---------|---------|---------|-----------|-------------|--------|--------|-----------|---------|-------|---------|-------|--------|----------|-------|--------|-------|-----------|------------|------------|--------|------|
     |MNU201904151452001 |1        |20190415 |00     |3       |2       |660317-1234567 |[null]       |개인고객명21 |1321132312 |003       |[null]  |901    |4       |[null]    |[null]  |[null]    |[null]      |[null]  |[null]  |[null]  |[null]  |[null]  |[null]  |[null]   |[null]   |[null]   |[null]   |[null]   |[null]   |20191211 |[null]     |30           |[null]  |[null]  |0          |DDASDAS  |[null] |0        |1      |[null]  |1         |[null] |0       |[null] |1321132312 |003         |[null]      |1       |1     |
     |-------------------|---------|---------|-------|--------|--------|---------------|-------------|--------|-----------|----------|--------|-------|--------|----------|--------|----------|------------|--------|--------|--------|--------|--------|--------|---------|---------|---------|---------|---------|---------|---------|-----------|-------------|--------|--------|-----------|---------|-------|---------|-------|--------|----------|-------|--------|-------|-----------|------------|------------|--------|------|

    2. 고객정보(5개탭) - strCommon_custInfo_p.jsp
        1. 고객정보
        2. 고객위험평가결과
        3. 현재 연체 내역
        4. 담보/보증인
        5. 해당룰 상환거래내역
    3. 룰정보 - strCommon_rulInfo_p.jsp

 * 특이사항 : AGN_PROC_STS가 30(재배당요청)으로 지정된 목록만 표시 코드그룹은 AGN_PROC_STS2
 
## 6. 룰관리(한화면내 분할, 1개팝업)  - str600_L.jsp(14)

~~selectCmMnAthrBtn.do	
{"LIST":[]}
lnb_menu_data.do	
{"list":[{"PAGE_URL":null,"MENU_CATE":"KYC","UP_MENU_ID":"KYC000","UPPER_MENU_CATE":"AML","MENU_NM":"KYC현황","sub_menu_list":[{"PAGE_URL":"/kyc/kyc100/kyc110_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC100","UPPER_MENU_CATE":"AML","MENU_NM":"KYC현황","MENU_ID":"KYC101","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc100/kyc120_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC100","UPPER_MENU_CATE":"AML","MENU_NM":"월별KYC현황","MENU_ID":"KYC102","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc100/kyc130_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC100","UPPER_MENU_CATE":"AML","MENU_NM":"고객별WL현황","MENU_ID":"KYC103","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc100/kyc140_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC100","UPPER_MENU_CATE":"AML","MENU_NM":"고객별RA현황","MENU_ID":"KYC104","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc100/kyc150_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC100","UPPER_MENU_CATE":"AML","MENU_NM":"EDD현황","MENU_ID":"KYC105","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc100/kyc160_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC100","UPPER_MENU_CATE":"AML","MENU_NM":"재수행도래고객조회","MENU_ID":"KYC106","LOWER_CNT":0,"LEVL":3}],"MENU_ID":"KYC100","LOWER_CNT":6,"LEVL":2},{"PAGE_URL":null,"MENU_CATE":"KYC","UP_MENU_ID":"KYC000","UPPER_MENU_CATE":"AML","MENU_NM":"고객위험평가관리","sub_menu_list":[{"PAGE_URL":"/kyc/kyc200/kyc220_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC200","UPPER_MENU_CATE":"AML","MENU_NM":"RA평가항목","MENU_ID":"KYC202","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc200/kyc240_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC200","UPPER_MENU_CATE":"AML","MENU_NM":"국가위험평가","MENU_ID":"KYC204","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc200/kyc250_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC200","UPPER_MENU_CATE":"AML","MENU_NM":"상품위험평가","MENU_ID":"KYC205","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc200/kyc280_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC200","UPPER_MENU_CATE":"AML","MENU_NM":"행동위험평가","MENU_ID":"KYC208","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc200/kyc260_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC200","UPPER_MENU_CATE":"AML","MENU_NM":"등록비영리단체","MENU_ID":"KYC206","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc200/kyc270_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC200","UPPER_MENU_CATE":"AML","MENU_NM":"RA_CUT_OFF","MENU_ID":"KYC207","LOWER_CNT":0,"LEVL":3}],"MENU_ID":"KYC200","LOWER_CNT":6,"LEVL":2},{"PAGE_URL":null,"MENU_CATE":"KYC","UP_MENU_ID":"KYC000","UPPER_MENU_CATE":"AML","MENU_NM":"요주의리스트관리","sub_menu_list":[{"PAGE_URL":"/kyc/kyc300/kyc310_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC300","UPPER_MENU_CATE":"AML","MENU_NM":"UN조회","MENU_ID":"KYC301","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc300/kyc320_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC300","UPPER_MENU_CATE":"AML","MENU_NM":"KoFIU조회","MENU_ID":"KYC302","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc300/kyc330_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC300","UPPER_MENU_CATE":"AML","MENU_NM":"PEP조회","MENU_ID":"KYC303","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc300/kyc340_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC300","UPPER_MENU_CATE":"AML","MENU_NM":"OFAC조회","MENU_ID":"KYC304","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc300/kyc350_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC300","UPPER_MENU_CATE":"AML","MENU_NM":"FATF조회","MENU_ID":"KYC305","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc300/kyc360_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC300","UPPER_MENU_CATE":"AML","MENU_NM":"WhiteList관리","MENU_ID":"KYC306","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc300/kyc370_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC300","UPPER_MENU_CATE":"AML","MENU_NM":"자체요주의인물관리","MENU_ID":"KYC307","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc300/kyc390_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC300","UPPER_MENU_CATE":"AML","MENU_NM":"WL업로드","MENU_ID":"KYC309","LOWER_CNT":0,"LEVL":3}],"MENU_ID":"KYC300","LOWER_CNT":8,"LEVL":2},{"PAGE_URL":null,"MENU_CATE":"KYC","UP_MENU_ID":"KYC000","UPPER_MENU_CATE":"AML","MENU_NM":"KYE관리","sub_menu_list":[{"PAGE_URL":"/kyc/kyc400/kyc410_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC400","UPPER_MENU_CATE":"AML","MENU_NM":"KYE관리","MENU_ID":"KYC401","LOWER_CNT":0,"LEVL":3}],"MENU_ID":"KYC400","LOWER_CNT":1,"LEVL":2},{"PAGE_URL":null,"MENU_CATE":"KYC","UP_MENU_ID":"KYC000","UPPER_MENU_CATE":"AML","MENU_NM":"RA가중치관리","sub_menu_list":[{"PAGE_URL":"/kyc/kyc500/kyc510_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC500","UPPER_MENU_CATE":"AML","MENU_NM":"평가항목별등급","MENU_ID":"KYC501","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc500/kyc520_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC500","UPPER_MENU_CATE":"AML","MENU_NM":"평가모델별가중치","MENU_ID":"KYC502","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc500/kyc540_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC500","UPPER_MENU_CATE":"AML","MENU_NM":"평가모델가중치(NEW)","MENU_ID":"KYC504","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc500/kyc550_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC500","UPPER_MENU_CATE":"AML","MENU_NM":"RA임계치(NEW)","MENU_ID":"KYC505","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc500/kyc560_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC500","UPPER_MENU_CATE":"AML","MENU_NM":"RA시뮬레이션(NEW)","MENU_ID":"KYC506","LOWER_CNT":0,"LEVL":3}],"MENU_ID":"KYC500","LOWER_CNT":5,"LEVL":2},{"PAGE_URL":"*","MENU_CATE":"KYC","UP_MENU_ID":"KYC000","UPPER_MENU_CATE":"AML","MENU_NM":"NEW고객위험평가관리","sub_menu_list":[{"PAGE_URL":"/kyc/kyc800/kyc810_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC800","UPPER_MENU_CATE":"AML","MENU_NM":"신원위험평가","MENU_ID":"KYC801","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc800/kyc820_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC800","UPPER_MENU_CATE":"AML","MENU_NM":"국가위험평가","MENU_ID":"KYC802","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc800/kyc830_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC800","UPPER_MENU_CATE":"AML","MENU_NM":"상품위험평가","MENU_ID":"KYC803","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc800/kyc840_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC800","UPPER_MENU_CATE":"AML","MENU_NM":"직업위험평가","MENU_ID":"KYC804","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc800/kyc850_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC800","UPPER_MENU_CATE":"AML","MENU_NM":"업종위험평가","MENU_ID":"KYC805","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc800/kyc860_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC800","UPPER_MENU_CATE":"AML","MENU_NM":"채널위험평가","MENU_ID":"KYC806","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc800/kyc870_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC800","UPPER_MENU_CATE":"AML","MENU_NM":"구간위험평가","MENU_ID":"KYC807","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc800/kyc880_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC800","UPPER_MENU_CATE":"AML","MENU_NM":"고위험항목평가","MENU_ID":"KYC808","LOWER_CNT":0,"LEVL":3},{"PAGE_URL":"/kyc/kyc800/kyc890_L.do","MENU_CATE":"KYC","UP_MENU_ID":"KYC800","UPPER_MENU_CATE":"AML","MENU_NM":"가상통화취급업소","MENU_ID":"KYC809","LOWER_CNT":0,"LEVL":3}],"MENU_ID":"KYC800","LOWER_CNT":9,"LEVL":2}]}
selectTbSysBd01OpnY.do	
{"LIST":[],"TOTAL":0}
selectCmMnAthrBtn.do
{"LIST":[]}	
selectStrProcessInfo.do	
{"LIST":[{"SEARCH_FROMDT":"20190101","GRP_CD":"STR","COD_NM":"STR FIU 미보고","CNT":0,"COD":"61","SEARCH_TODT":"20191231"},{"GRP_CD":"KYC","COD_NM":"EDD 미수행/결재","CNT":0,"COD":"EDD"},{"GRP_CD":"KYC","COD_NM":"WLF 결재","CNT":0,"COD":"WLF"},{"GRP_CD":"KYC","COD_NM":"KYE 결재","CNT":0,"COD":"KYE"},{"GRP_CD":"KYC","COD_NM":"RA상품위험평가","CNT":0,"COD":"PRD"},{"GRP_CD":"KYC","COD_NM":"RA직업위험평가","CNT":0,"COD":"JOB"},{"GRP_CD":"KYC","COD_NM":"RA업종위험평가","CNT":0,"COD":"ITM"}]}
selectNoticeInfoList.do
{"LIST":[]}	
selectStrProcessInfoTwo.do	
{"LIST":[{"RPTJUN":0,"STREVT":0,"DT":"2019-12","MIACT":0,"RPTEXP":0},{"RPTJUN":0,"STREVT":0,"DT":"2019-11","MIACT":0,"RPTEXP":0},{"RPTJUN":0,"STREVT":0,"DT":"2019-10","MIACT":0,"RPTEXP":0},{"RPTJUN":0,"STREVT":0,"DT":"2019-09","MIACT":0,"RPTEXP":0}]}
selectAmlProcessInfo.do
{"LIST":[{"LAST_FRIDAY":"2019-12-27 ~ 2019-12-29","RE_CNT":0,"NEW_CNT":0,"TOTAL_CNT":0,"TYPE":"CDD"},{"LAST_FRIDAY":"2019-12-27 ~ 2019-12-29","RE_CNT":0,"NEW_CNT":0,"TOTAL_CNT":0,"TYPE":"EDD"},{"LAST_FRIDAY":"2019-12-27 ~ 2019-12-29","RE_CNT":0,"NEW_CNT":0,"TOTAL_CNT":0,"TYPE":"KYE"},{"LAST_FRIDAY":"2019-12-27 ~ 2019-12-29","RE_CNT":0,"NEW_CNT":0,"TOTAL_CNT":0,"TYPE":"STR"}]}	
lnb_menu_data.do
{"list":[{"PAGE_URL":"/str/str100/str100_L.do","MENU_CATE":"STR","UP_MENU_ID":"STR000","UPPER_MENU_CATE":"AML","MENU_NM":"STR현황","MENU_ID":"STR100","LOWER_CNT":0,"LEVL":2},{"PAGE_URL":"/str/str200/str200_L.do","MENU_CATE":"STR","UP_MENU_ID":"STR000","UPPER_MENU_CATE":"AML","MENU_NM":"STR보고서관리","MENU_ID":"STR200","LOWER_CNT":0,"LEVL":2},{"PAGE_URL":"/str/str300/str300_L.do","MENU_CATE":"STR","UP_MENU_ID":"STR000","UPPER_MENU_CATE":"AML","MENU_NM":"STR임의보고","MENU_ID":"STR300","LOWER_CNT":0,"LEVL":2},{"PAGE_URL":"/str/str400/str400_L.do","MENU_CATE":"STR","UP_MENU_ID":"STR000","UPPER_MENU_CATE":"AML","MENU_NM":"거래제외관리","MENU_ID":"STR400","LOWER_CNT":0,"LEVL":2},{"PAGE_URL":"/str/str500/str500_L.do","MENU_CATE":"STR","UP_MENU_ID":"STR000","UPPER_MENU_CATE":"AML","MENU_NM":"배당변경","MENU_ID":"STR500","LOWER_CNT":0,"LEVL":2},{"PAGE_URL":"/str/str600/str600_L.do","MENU_CATE":"STR","UP_MENU_ID":"STR000","UPPER_MENU_CATE":"AML","MENU_NM":"룰관리","MENU_ID":"STR600","LOWER_CNT":0,"LEVL":2},{"PAGE_URL":"/str/str700/str700_L.do","MENU_CATE":"STR","UP_MENU_ID":"STR000","UPPER_MENU_CATE":"AML","MENU_NM":"STR시뮬레이션","MENU_ID":"STR601","LOWER_CNT":0,"LEVL":2}]}~~	
1. selectCmMnAthrBtn.do
{"LIST":[{"MENU_CATE":"STR","OBJ_ID":"btn_search,btn_save,btn_excel,btn_delete,btn_create","MENU_ID":"STR600"}]}	
2. str600SearchList.do	
{"LIST":[{"GR_NM":"고객","MD_NM":"01_고령자","MD_CD":"101","RUL_CD":"101","RUL_GO":"1","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"02_비영리법인(단체)","MD_CD":"102","RUL_CD":"102","RUL_GO":"2","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"03_법인/대표자간의 거래","MD_CD":"103","RUL_CD":"103","RUL_GO":"1","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"04_종합자산관리 대상자","MD_CD":"104","RUL_CD":"104","RUL_GO":"1","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"05_종합자산관리 대상자","MD_CD":"105","RUL_CD":"105","RUL_GO":"1","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"06_고위험군 거래","MD_CD":"106","RUL_CD":"106","RUL_GO":"0","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"07_자금력의심자","MD_CD":"107","RUL_CD":"107","RUL_GO":"1","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"08_외국인 거래","MD_CD":"108","RUL_CD":"108","RUL_GO":"1","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"09_고위험군 거래","MD_CD":"109","RUL_CD":"109","RUL_GO":"0","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"10_가상통화취급업소","MD_CD":"110","RUL_CD":"110","RUL_GO":"0","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"11_가상통화취급업소","MD_CD":"111","RUL_CD":"111","RUL_GO":"0","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"12_개인/법인간의 거래","MD_CD":"112","RUL_CD":"112","RUL_GO":"1","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"13_STR보고자","MD_CD":"113","RUL_CD":"113","RUL_GO":"0","GR_CD":"01"},{"GR_NM":"고객","MD_NM":"14_요주의 계좌","MD_CD":"114","RUL_CD":"114","RUL_GO":"2","GR_CD":"01"},{"GR_NM":"계좌","MD_NM":"01_폐쇄계좌","MD_CD":"201","RUL_CD":"201","RUL_GO":"0","GR_CD":"02"},{"GR_NM":"계좌","MD_NM":"02_통합해지(휴면계좌)","MD_CD":"202","RUL_CD":"202","RUL_GO":"0","GR_CD":"02"},{"GR_NM":"계좌","MD_NM":"03_개좌 개설/해지 거래","MD_CD":"203","RUL_CD":"203","RUL_GO":"0","GR_CD":"02"},{"GR_NM":"거래","MD_NM":"01_분할입금","MD_CD":"301","RUL_CD":"301","RUL_GO":"0","GR_CD":"03"},{"GR_NM":"거래","MD_NM":"02_분할입금","MD_CD":"302","RUL_CD":"302","RUL_GO":"0","GR_CD":"03"},{"GR_NM":"채널","MD_NM":"01_비대면거래","MD_CD":"401","RUL_CD":"401","RUL_GO":"0","GR_CD":"04"},{"GR_NM":"KYE","MD_NM":"01_관리자","MD_CD":"501","RUL_CD":"501","RUL_GO":"0","GR_CD":"05"},{"GR_NM":"KYE","MD_NM":"02_관리자","MD_CD":"502","RUL_CD":"502","RUL_GO":"0","GR_CD":"05"},{"GR_NM":"임의보고","MD_NM":"01_임의보고","MD_CD":"901","RUL_CD":"901","RUL_GO":"0","GR_CD":"09"}]}
3. selectCmCodegrList.do	
{"LIST":[{"GR_NM":"고객","GR_CD":"01"},{"GR_NM":"계좌","GR_CD":"02"},{"GR_NM":"거래","GR_CD":"03"},{"GR_NM":"채널","GR_CD":"04"},{"GR_NM":"KYE","GR_CD":"05"},{"GR_NM":"임의보고","GR_CD":"09"}]}


    1. 룰목록 onLOAD(dataPop)
    주요 로직 - url : /str/str600/str600SelectList.do
    FROM RULE_INFO A INNER JOIN CM_CODEMD B ON A.GR_CD = B.GR_CD
    		  AND A.MD_CD = B.MD_CD
    		WHERE A.RUL_GB = 'R'
    		  AND A.RUL_STS = '2'
    		  
      1-1 JSP내 함수 LOAD, ACTION 로직
      
              0. getCode
                  url : /str/str600/selectCmCodegrList.do
                  do : 룰목록코드
                  sql :  SELECT GR_CD ,GR_NM FROM CM_CODEGR WHERE ISUSE = 'Y'
                  jsp : #GR_CD 업무구분                
                
              1. 버튼 ACTION
                  1. 룰상세셀렉트 클릭시 dataPop() // RULE List 영역
                      url : /str/str600/str600SearchList.do
                      do : 룰관리 상세 조회
                      sql : FROM RULE_INFO A INNER JOIN CM_CODEMD B ON A.GR_CD = B.GR_CD AND A.MD_CD = B.MD_CD WHERE A.RUL_GB = 'R' AND A.RUL_STS = #{RUL_STS} ORDER BY B.GR_CD, B.MD_CD, TO_NUMBER(A.RUL_CD)
                      jsp : select box(승인2, 대기1, 삭제3)
                  2. 룰코드 클릭시 detailPop() // RULE INFO 영역
                      url : /str/str600/str600_detail_data.do
                      do : 룰관리 상세 조회
                      sql :  FROM RULE_INFO A INNER JOIN CM_CODEMD B ON A.GR_CD = B.GR_CD AND A.MD_CD = B.MD_CD INNER JOIN CM_CODEGR C ON A.GR_CD = C.GR_CD WHERE A.RUL_CD = #{RUL_CD}
                      jsp : 룰코드 클릭시 
                  3. 저장버튼 클릭시 updateRule() // RULE INFO 영역
                      url : /str/str600/updateRule.do
                      do : 를 등록 수정
                      sql :
                            1. updateRuleInfo :    UPDATE RULE_INFO SET WHERE RUL_CD = #{RUL_CD} //룰정보 업데이트
                      		2. mergeIntoRuleCond : MERGE INTO RULE_COND USING DUAL ON ( RUL_GRCD = 'rule' AND RUL_CD   = #{RUL_CD} AND RUL_GO   = #{RUL_GO} ) //룰조건 머지
                      		3. insertRuleCondHistory : INSERT INTO RULE_COND_HISTORY //룰조건이력 등록                   		
                      		* RUL_STS : 1 > RULE_DESC : 생성대기, RUL_STS : 2 > RULE_DESC : 승인, RUL_STS : 3 > RULE_DESC : 삭제                      		
                      		4. insertRuleHistory : INSERT INTO RULE_HISTORY //룰이력 등록
                      jsp : 룰정보영역 저장버튼 클릭시 
                  4. 업무구분 셀렉트 클릭시 getCode2() // RULE INFO 영역
                      url : /str/str600/selectCmCodemdList.do
                      do : Rule 중분류코드 목록
                      sql : SELECT MD_CD , MD_NM FROM CM_CODEMD WHERE ISUSE = 'Y' AND GR_CD = #{GR_CD}
                      jsp : 룰코드 클릭시 
                  5. 개인법인 라디오 클릭시 factorPop()
                      url : /str/str600/str600_factor_data.do
                      do : 룰 팩터 상세조회
                      sql : FROM RULE_COND TA WHERE TA.RUL_GRCD = 'rule'--분류코드
                             AND TA.RUL_CD = #{RUL_CD} --룰코드
                             AND TA.RUL_GO = #{RUL_GO} --개인/법인구분
                      jsp : 개인법인 라디오클릭시
                  6. 룰등급 셀렉트 클릭시 // RULE INFO 영역
                      url : /str/strCommon/selectRulList.do
                      do : 룰등급클릭시 룰점수 세팅 select box
                      * RUL_GRD: 1 > RUL_SCR : 80 RUL_GRD: 2 > RUL_SCR : 70 RUL_GRD: 3 > RUL_SCR : 60 RUL_GRD: 4 > RUL_SCR : 50
                      jsp : id = RUL_GRD(룰등급) select
                  
             
                          	
    2. 룰정보
      FROM RULE_INFO A INNER JOIN CM_CODEMD B
    		  						   ON A.GR_CD = B.GR_CD
    		  						  AND A.MD_CD = B.MD_CD
    			   			   INNER JOIN CM_CODEGR C
    			   			   		   ON A.GR_CD = C.GR_CD
        WHERE A.RUL_CD = ?
        |-------|-------|------|------|-------|--------|-----------------------------------------------------|----------|----------|-------|-------|-------|-------|------|--------|--------|--------|------------|--------|--------------|----------|
        |룰 ID  |MD_NM  |업무구분 |GR_NM |RUL_GO |RUL_GRD |룰명세                                           |룰 추론기반  |룰 참조사례 |RULCHU |룰추출주기 |TY_CD  |RUL_GB |거래유형 |룰사용여부 |CHG_RSN |RUL_SQL |RUL_PREVIEW |룰SCORE |PREMISE_CRIME |룰명칭    |
        |RUL_CD |MD_NM  |GR_CD |GR_NM |RUL_GO |RUL_GRD |RUL_DEF                                              |RUL_NOTE  |RUL_REFER |RULCHU |RULSUM |TY_CD  |RUL_GB |MD_CD |RUL_STS |CHG_RSN |RUL_SQL |RUL_PREVIEW |RUL_SCR |PREMISE_CRIME |RUL_NM    |
        |-------|-------|------|------|-------|--------|-----------------------------------------------------|----------|----------|-------|-------|-------|-------|------|--------|--------|--------|------------|--------|--------------|----------|
        |101    |01_고령자 |01    |고객    |1      |2       |3개월 이상 연체된 고객이 해당월에 현금 또는 가상계좌를 통해 1000만원 이상을 입금한 경우 |장기간 연체 상환 |장기간 연체 상환 |01     |[null] |[null] |R      |101   |2       |[null]  |[null]  |[null]      |[null]  |[null]        |고객/01_고령자 |
        |-------|-------|------|------|-------|--------|-----------------------------------------------------|----------|----------|-------|-------|-------|-------|------|--------|--------|--------|------------|--------|--------------|----------|
        12:18:42.675 [http-8180-5] DEB
    3. 룰추가 str600_P01.jsp(15)
    3. Factor 내역
      FROM RULE_COND TA
      		 WHERE TA.RUL_GRCD = 'rule'
    		   AND TA.RUL_CD = ?
    		   AND TA.RUL_GO = ?
       |---------|-------|-------|--------|--------|--------|--------|--------|--------|-------|-------|-------|--------|-----------|-----------|-----------|-----------|-----------|-----------|-------|------|------|-------|-------|-------|-------|----------|--------|
       |RUL_GRCD |RUL_CD |개인/법인 |FACTOR1 |FACTOR2 |FACTOR3 |FACTOR4 |FACTOR5 |FACTOR6 |FDATE  |SDATE  |ETC    |RUL_SQL |FACTOR1명 |FACTOR2명  |FACTOR3명  |FACTOR4명  |FACTOR5명  |FACTOR6명 |SNO    |팩터1기준치 |팩터2기준치 |팩터3기준치  |팩터4기준치  |팩터5기준치  |팩터6기준치  |DETAIL_GB |PROCSQL |
       |RUL_GRCD |RUL_CD |RUL_GO |FACTOR1 |FACTOR2 |FACTOR3 |FACTOR4 |FACTOR5 |FACTOR6 |FDATE  |SDATE  |ETC    |RUL_SQL |FACTOR1_NM |FACTOR2_NM |FACTOR3_NM |FACTOR4_NM |FACTOR5_NM |FACTOR6_NM |SNO    |FCON1 |FCON2 |FCON3  |FCON4  |FCON5  |FCON6  |DETAIL_GB |PROCSQL |
       |---------|-------|-------|--------|--------|--------|--------|--------|--------|-------|-------|-------|--------|-----------|-----------|-----------|-----------|-----------|-----------|-------|------|------|-------|-------|-------|-------|----------|--------|
       |rule     |101    |1      |79      |1000    |[null]  |[null]  |[null]  |[null]  |[null] |[null] |[null] |[null]  |나이(만)      |1주일_출금금액   |[null]     |[null]     |[null]     |[null]     |[null] |>=    |>=    |[null] |[null] |[null] |[null] |[null]    |[null]  |
       |---------|-------|-------|--------|--------|--------|--------|--------|--------|-------|-------|-------|--------|-----------|-----------|-----------|-----------|-----------|-----------|-------|------|------|-------|-------|-------|-------|----------|--------|

~~## 7. STR시뮬레이션(한화면내 분할)  - str700_L.jsp(15)
    1. 룰목록
    주요 로직 - url : /str/str500/str500SelectList.do
    2. 룰정보
    3. Factor 내역
    4. 시뮬레이션기간, 결과~~

## 8. STR Alert현황 - rpt110_L.jsp(16)
    1. 목록
    주요 로직 - url : /str/str500/str500SelectList.do
    
## 9. STR 통계(대시보드) amlDashboard.jsp(17)
 
 * 참고 : http://localhost:8080/main/amlDashboard/selectStrProcessInfoTwo.do
 
 =======================
 =======================
 공통콥보모듈
 $.fn.makeCombo = function(options){
                 		var defaults = {
                 				name : $(this).attr("id"),
                 				url : "code", // combo_ 뒤에 붙은 url 값 명시
                 				rscCod : null, // RiskFactor일 경우 필수
                 				assmYr : null,	// RiskFactor일 경우 필수
                 				rskHednCod : null, // RiskFactor일 경우 필수
                 				aftId : null, //RBA400 list 업무영역 id
                 				prcId : null, // 통제 서브프로세스 리스트 조회의 조건 값, 필수
                 				code : null, // TB_COM_CODE 테이블에서 조회할 GROUP CODE 값, 필수
                 				rmks_1 : null, // 기타 코드1
                 				rmks_2 : null, // 기타 코드2
                 				rmks_3 : null, // 기타 코드3
                 				rmks_4 : null, // 기타 코드4
                 				rmks_5 : null, // 기타 코드5
                 				selectInit : true, //"Y"일 경우 selected 값을 option으로 생성
                 				selectName : "전체", //selectInit이 "Y"인 경우 text default "선택하세요"
                 				selectedCode : null,
                 				inCode : null, //포함시킬 코드값 array
                 				exCode : null, //제외시킬 코드값 array
                 				callBack : null, //콤보박스가 추가되고 난 뒤 실행할 함수
                 				async : true //동기, 비동기 여부 default 비동기
                 		}
                 

	/*******************************************************************************
	 * FUNCTION 기능설명 :  공통 부서콤보박스 생성
	 *******************************************************************************/
	$.fn.makeJumCombo = function(options){
		var defaults = {
				name : $(this).attr("id"),
				url : "/mng/common/combo_jum.do", // combo_ 뒤에 붙은 url 값 명시
				code : null, // TB_COM_CODE 테이블에서 조회할 GROUP CODE 값, 필수
				rscCod : null, // RiskFactor일 경우 필수
				assmYr : null,	// RiskFactor일 경우 필수
				rskHednCod : null, // RiskFactor일 경우 필수
				aftId : null, //RBA400 list 업무영역 id
				prcId : null, // 통제 서브프로세스 리스트 조회의 조건 값, 필수
				rmks_1 : null, // RBA200,RBA300 노출위험 구분, 필수
				selectInit : "Y", //"Y"일 경우 selected 값을 option으로 생성
				selectName : "전체", //selectInit이 "Y"인 경우 text default "선택하세요"
				selectCode : "",//selectInit이 "Y"인 경우 value default 빈 값[space]
				inCode : null, //포함시킬 코드값 array
				exCode : null, //제외시킬 코드값 array
				callBack : null, //콤보박스가 추가되고 난 뒤 실행할 함수
				cod		: null,	// 특정 코드값만  요청시 사용
				async : true //동기, 비동기 여부 default 비동기
		}

		var options = $.extend({}, defaults, options);

		var name = options.name;
		
		// array type 으로 데이터 생성
        var _includeUrl = "";
        if(options.inCode != null){
            for(var i = 0 ; i < options.inCode.length ; i++){
                _includeUrl = _includeUrl + options.inCode[i];
                if(options.inCode[i+1] != null){
                    _includeUrl = _includeUrl + ",";
                }
            }
        }

        // array type 으로 데이터 생성
        var _excludeUrl = "";
        if(options.exCode != null){
            for(var i = 0 ; i < options.exCode.length ; i++){
                _excludeUrl = _excludeUrl + options.exCode[i];
                if(options.exCode[i+1] != null){
                    _excludeUrl = _excludeUrl+",";
                }
            }
        }

		$.ajax({
			type:"POST",
			url:options.url,
			async:options.async,
			cache:false,
			data:{
				code : options.code,
				rscCod : options.rscCod,
				aftId : options.aftId,
				prcId : options.prcId,
				rmks_1 : options.rmks_1,
				assmYr : options.assmYr,
				rskHednCod : options.rskHednCod,
				condition : options.condition,
				selectInit : options.selectInit,
				selectName : options.selectName,
				selectCode : options.selectCode,
				includeCodeArray : _includeUrl,
				excludeCodeArray : _excludeUrl,
				cod : options.cod
			},
			dataType:"JSON",
			success:function(data){
				var data = data.options;
				var temp_html = "";
				
				if(data){
					for(var i in data){
						if(data[i].selected == "1"){
							temp_html += "<option value='"+data[i].value+"' selected='selected'>"+data[i].text+"</option>";
						}else{
							temp_html += "<option value='"+data[i].value+"'>"+data[i].text+"</option>";
						}
					}
					$("#"+name).append(temp_html);
				}
			},
			error:function(){
				alert("error");
			}
		});
	}                 