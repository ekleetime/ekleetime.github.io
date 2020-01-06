COMMENT ON TABLE BILL  IS '어음정보 어음 정보 ETL 마트 테이블';
COMMENT ON TABLE CM_APPR  IS '결재테이블 결재정보 관리 테이블';
COMMENT ON TABLE CM_APPR_ATHR  IS 'AML결재권한 결재선별 결재권한 관리 테이블';
COMMENT ON TABLE CM_APPR_HST  IS '결재 이력 테이블 결재정보 이력 관리 테이블';
COMMENT ON TABLE CM_APPR_LINE  IS '결재선관리 상세 결재선 상세정보 관리 테이블';
COMMENT ON TABLE CM_APPR_MST  IS '결재선관리 마스터 결재선 정보 관리 테이블';
COMMENT ON TABLE CM_APPR_USR  IS 'AML 결재 사용자 결재권한별 사용자 매핑 정보관리 테이블';
COMMENT ON TABLE CM_ATHR  IS 'AML권한 AML 승인 권한그룹관리 테이블';
COMMENT ON TABLE CM_BCKGRND  IS '배경정보 AML 시스템 배경 테마 정보관리 테이블';
COMMENT ON TABLE CM_CNTR  IS 'AML공통 국가 정보 국가 코드 정보 관리 테이블';
COMMENT ON TABLE CM_CODE  IS '세분류코드 정보 AML 상세분류 코드 관리 테이블';
COMMENT ON TABLE CM_CODEGR  IS '대분류코드 정보 AML 대분류 코드 관리 테이블';
COMMENT ON TABLE CM_CODEMD  IS '중분류코드 정보 AML 중분류 코드 관리 테이블';
COMMENT ON TABLE CM_MENU  IS 'AML메뉴관리 AML 메뉴 정보 관리 테이블';
COMMENT ON TABLE CM_MNATHR  IS 'AML메뉴권한 AML 메뉴 권한 그룹 정보 관리 테이블';
COMMENT ON TABLE CM_PRGM  IS 'AML프로그램관리 AML 프로그램 정보 관리 테이블';
COMMENT ON TABLE CM_PRGM_ATHR  IS 'AML프로그램 권한 관리 AML 프로그램변 권한 그룹 관리 테이블';
COMMENT ON TABLE CM_PSI2_PER  IS '스코어모델평가개발당시고객목록 개발 임시 테이블';
COMMENT ON TABLE CM_USR  IS 'AML사원정보 AML 사용자 정보 관리 테이블';
COMMENT ON TABLE CM_USR_ATHR  IS 'AML사용자권한 AML 사용자 권한그룹 맵핑관리 테이블';
COMMENT ON TABLE CM_VALUEDATA  IS 'ALERT관리 STR Alert 에 사용되는 평가항목 정보 관리 테이블';
COMMENT ON TABLE CTR_BASE_VL_MNG  IS 'CTR_기준값_관리 CTR 평가항목 정보 관리 테이블';
COMMENT ON TABLE CTR_DETL  IS 'CTR_상세_정보 CTR 상세정보 관리 테이블';
COMMENT ON TABLE CTR_MASTER  IS 'CTR_마스터 CTR 정보 관리 테이블';
COMMENT ON TABLE CTR_SYSTEM_APPR  IS '결재테이블 CTR 업무 결재 이력 테이블';
COMMENT ON TABLE EDD_CRCL  IS 'EDD_재확인도래일 EDD재확인도래관리 테이블';
COMMENT ON TABLE EDD_EXE  IS 'EDD_수행 EDD수행관련 테이블';
COMMENT ON TABLE EDD_EXE_IF  IS 'EDD_수행 EDD수행관련 테이블';
COMMENT ON TABLE EDD_OBJCT  IS 'EDD_거래목적 EDD거래목적관련테이블';
COMMENT ON TABLE EDD_OBJCT_IF  IS 'EDD_거래목적 EDD거래목적관련테이블';
COMMENT ON TABLE FIU_ASSM_CLSFC  IS 'FIU 평가 분류 평가분류 코드 관리 테이블';
COMMENT ON TABLE FIU_ASSM_INDI  IS 'FIU 위험지표 원장 FIU지표정보 관리 테이블';
COMMENT ON TABLE FIU_ASSM_INDI_H  IS 'FIU 위험지표 원장 이력 FIU지표정보 이력 테이블';
COMMENT ON TABLE FIU_ASSM_INDI_MAPNG  IS 'FIU 평가 지표 매핑 FIU지표 결과값 관리 테이블';
COMMENT ON TABLE FIU_ASSM_INDI_MAPNG_H  IS 'FIU 평가 지표 매핑 이력 FIU지표 결과값 이력 테이블';
COMMENT ON TABLE FIU_CNTY  IS 'FIU 국가코드 FIU국가코드 관리 테이블';
COMMENT ON TABLE FIU_SYSTEM_APPR  IS 'KOFIU 결재테이블 FIU지표 결재 관리 테이블';
COMMENT ON TABLE JI_DETAIL  IS '지급내역 지금 내역 ETL 마트 테이블';
COMMENT ON TABLE JOB_LOG_MAS  IS 'AML MART로그관리 AML MART로그 정보 관리 테이블';
COMMENT ON TABLE JOB_LOG_TBL  IS '로그관리 배치 로그 기록 테이블';
COMMENT ON TABLE KYC_CNTY  IS 'KYC_국가위험평가 KYC국가관련테이블';
COMMENT ON TABLE KYC_CUST_CDD  IS 'KYC 고객 CDD 수행 내역 KYC고객CDD수행이력테이블';
COMMENT ON TABLE KYC_CUST_CDD_AGENT  IS 'KYC 고객 CDD 대리인 내역 KYC고객CDD대리인수행이력테이블';
COMMENT ON TABLE KYC_CUST_CDD_AGENT_TEMP  IS 'KYC 고객 CDD 대리인 내역 KYC고객CDD대리인수행이력테이블_최종이력';
COMMENT ON TABLE KYC_CUST_CDD_CEO  IS 'KYC 고객 CDD 대표자 내역 KYC고객CDD대표자수행이력테이블';
COMMENT ON TABLE KYC_CUST_CDD_CEO_TEMP  IS 'KYC 고객 CDD 대표자 내역 KYC고객CDD대표자수행이력테이블_최종이력';
COMMENT ON TABLE KYC_CUST_CDD_GRNTR  IS 'KYC 고객 CDD 보증인 내역 KYC고객CDD보증인수행이력테이블';
COMMENT ON TABLE KYC_CUST_CDD_GRNTR_TEMP  IS 'KYC 고객 CDD 보증인 내역 KYC고객CDD보증인수행이력테이블_최종이력';
COMMENT ON TABLE KYC_CUST_CDD_MOGAGE  IS 'KYC 고객 CDD 담보제공인 내역 KYC고객CDD담보제공인수행이력테이블';
COMMENT ON TABLE KYC_CUST_CDD_MOGAGE_TEMP  IS 'KYC 고객 CDD 담보제공인 내역 KYC고객CDD담보제공인수행이력테이블_최종이력';
COMMENT ON TABLE KYC_CUST_CDD_OWNER  IS 'KYC 고객 CDD 실제소유자 내역 KYC고객CDD실제소유자수행이력테이블';
COMMENT ON TABLE KYC_CUST_CDD_OWNER_TEMP  IS 'KYC 고객 CDD 실제소유자 내역 KYC고객CDD실제소유자수행이력테이블_최종이력';
COMMENT ON TABLE KYC_CUST_CDD_TEMP  IS 'KYC 고객 CDD 수행 내역 KYC고객CDD수행이력테이블_최종이력';
COMMENT ON TABLE KYC_CUST_EDD  IS 'KYC 고객 EDD 수행 내역 KYC고객EDD수행이력테이블';
COMMENT ON TABLE KYC_CUST_EDD_PEP  IS 'KYC 고객 EDD PEP 관계인 내역 KYC고객EDD수행이력테이블_최종이력';
COMMENT ON TABLE KYC_CUST_EDD_PEP_TEMP  IS 'KYC 고객 EDD PEP 관계인 내역 KYC고객EDD PEP 수행이력테이블';
COMMENT ON TABLE KYC_CUST_EDD_TEMP  IS 'KYC 고객 EDD 수행 내역 KYC고객EDD PEP 수행이력테이블_최종이력';
COMMENT ON TABLE KYC_CUST_EDD_VCE  IS 'KYC 고객 EDD 가상통화취급업소 내역 KYC고객EDD 가상통화취급업소수행이력테이블';
COMMENT ON TABLE KYC_CUST_EDD_VCE_TEMP  IS 'KYC 고객 EDD 가상통화취급업소 내역 KYC고객EDD 가상통화취급업소수행이력테이블_최종이력';
COMMENT ON TABLE KYC_CUST_MNG  IS 'KYC 고객 관리 현황 KYC고객 관리 테이블';
COMMENT ON TABLE KYC_CUST_MNG_HST  IS 'KYC 고객 관리 내역 KYC고객 관리 이력테이블';
COMMENT ON TABLE KYC_CUST_RA  IS 'KYC 고객 RA 수행 내역 KYC고객 RA 이력테이블';
COMMENT ON TABLE KYC_CUST_RA_BHV_SCR  IS 'KYC 고객 RA 행동위험평가 스코어 KYC고객 행동위험평가 마스터 테이블';
COMMENT ON TABLE KYC_CUST_RA_DTL  IS 'KYC 고객 RA 상세 내역 KYC고객 RA 상세이력테이블';
COMMENT ON TABLE KYC_CUST_WLF  IS 'KYC 고객 WLF 수행 내역 KYC고객 WLF 수행 이력 테이블';
COMMENT ON TABLE KYC_CUST_WLF_DTL  IS 'KYC 고객 WLF 상세 내역 KYC고객 WLF 상세 이력 테이블';
COMMENT ON TABLE KYC_HSTR_LOGGER  IS 'KYC LOG테이블';
COMMENT ON TABLE KYC_RA_INTERVAL_SCR  IS 'KYC RA 구간항목평가 스코어 KYC RA 구간평가항목 스코어 테이블';
COMMENT ON TABLE KYC_RA_INTERVAL_SCR_HST  IS 'KYC RA 구간항목평가 스코어 내역 KYC RA 구간평가항목 스코어 이력 테이블';
COMMENT ON TABLE KYC_RA_MODEL_GRD  IS 'KYC RA 모델 등급 KYC RA 모델 등급 테이블';
COMMENT ON TABLE KYC_RA_MODEL_GRD_HST  IS 'KYC RA 모델 등급 KYC RA 모델 등급 이력 테이블';
COMMENT ON TABLE KYC_RA_SINGLE_SCR  IS 'KYC RA 단일항목평가 스코어 KYC RA 단일항목평가 스코어 테이블';
COMMENT ON TABLE KYC_RA_SINGLE_SCR_HST  IS 'KYC RA 단일항목평가 스코어 내역 KYC RA 단일항목평가 스코어 이력 테이블';
COMMENT ON TABLE KYC_RA_WEIGHT  IS 'KYC RA 가중치 KYC RA 평가 가중치 테이블';
COMMENT ON TABLE KYC_RA_WEIGHT_HST  IS 'KYC RA 가중치 KYC RA 평가 가중치 이력 테이블';
COMMENT ON TABLE KYC_WL_ALIAS  IS '요주의인물 별칭정보 요주의 인물 별칭 정보 테이블';
COMMENT ON TABLE KYC_WL_BAS  IS '요주의인물 기본 요주의 인물 기본정보 테이블';
COMMENT ON TABLE KYC_WL_BAS_HIS  IS '요주의인물 기본 이력 요주의 인물 기본정보 이력 테이블';
COMMENT ON TABLE KYC_WL_BLACK  IS 'WL 자체요주의인물 자체요주의 인물 관리 테이블';
COMMENT ON TABLE KYC_WL_BRTH  IS '요주의인물 생년월일 요주의 인물 생년월일 테이블';
COMMENT ON TABLE KYC_WL_IDNT  IS '요주의인물 신원정보 요주의 인물 기타 정보 관리 테이블';
COMMENT ON TABLE KYC_WL_MST  IS 'KYC WL 마스터 KYC 요주의 인물 마스터 테이블';
COMMENT ON TABLE KYC_WL_NATIONAL  IS '요주의인물 국가정보 요주의 인물 국가정보 관리 테이블';
COMMENT ON TABLE KYE_EMP_MNG  IS 'KYE 사원 관리 현황 KYE 직원 관리 테이블';
COMMENT ON TABLE KYE_EMP_WLF  IS 'KYE 사원 WLF 수행 내역 KYE 수행 내역 테이블';
COMMENT ON TABLE KYE_EMP_WLF_DTL  IS 'KYE 사원 WLF 상세 내역 KYE 수행 상세 내역 테이블';
COMMENT ON TABLE KYE_MAST  IS 'KYE정보 KYE 정보 테이블';
COMMENT ON TABLE LOAN_DETAIL  IS '해당월 대출내역 대출 내역 ETL 마트 테이블';
COMMENT ON TABLE RA_CUT_OFF  IS 'RA_등급점수(CUT_OFF) RA CUT OFF 테이블';
COMMENT ON TABLE RA_HIGH_WK  IS 'RA_고위험직업군 고위험 직업군 관리테이블';
COMMENT ON TABLE RA_MDEL_DTL_WGHN  IS 'RA모델상세 가중치 RA 모델 가중치 관리 테이블';
COMMENT ON TABLE RA_NNPRFT  IS '등록비영리단체 비영리단체 관리테이블';
COMMENT ON TABLE RA_PROD_SCR  IS 'RA상품점수 RA 상품 점수 관리테이블';
COMMENT ON TABLE RA_SCR  IS 'RA점수 RA 점수 산정 테이블';
COMMENT ON TABLE RA_SDD_CONF  IS 'RA_SDD_설정 RA SDD관리 테이블';
COMMENT ON TABLE RBA_ATHR  IS 'RBA 권한 정보 RBA 권한 정보 관리 테이블';
COMMENT ON TABLE RBA_USR_ATHR  IS 'RBA 사용자 권한 정보 RBA 사용자 권한 정보 관리 테이블';
COMMENT ON TABLE REPAY_DETAIL  IS '해당월 상환내역 상환 내역 ETL 마트 테이블';
COMMENT ON TABLE REPAY_PLAN  IS '상환계획 상환 계획 ETL 마트 테이블';
COMMENT ON TABLE RULE_COND  IS '룰 조건 룰 평가 항목 조건정보 관리 테이블';
COMMENT ON TABLE RULE_COND_HISTORY  IS '룰 조건 이력 룰 평가 항목 조건정보 이력 테이블';
COMMENT ON TABLE RULE_FACTOR  IS '룰_팩터 룰별 팩터 정보 관리 테이블';
COMMENT ON TABLE RULE_HISTORY  IS '마트검증내역 룰 변경 승인 이력 관리 테이블';
COMMENT ON TABLE RULE_INFO  IS '룰 정보 룰 정보 관리 테이블';
COMMENT ON TABLE RULE_MART  IS '룰마트 룰별 시나리오에 의해 검출된 거래정보 관리 테이블';
COMMENT ON TABLE RULE_RESULT  IS '룰결과 룰별 Alert 정보 관리 테이블';
COMMENT ON TABLE RULE_RESULT_DETAIL  IS '룰결과상세 룰별 팩터에 의해 검출된 거래정보 테이블';
COMMENT ON TABLE RULE_WHITE_USER  IS 'STR보고제외관리 STR 보고제외 대상 고객정보 관리 테이블';
COMMENT ON TABLE SCORE_COND  IS '혐의 스코어 조건 스코어 평가에 사용되는 조건정보 관리 테이블';
COMMENT ON TABLE SCORE_MART  IS '스코어마트 스코어 평가에 의해 검출된 거래 정보 테이블';
COMMENT ON TABLE SCORE_RESULT  IS '스코어결과 스코어 조건에 의해 최종 검출된 거래 정보 테이블';
COMMENT ON TABLE STR_APPR  IS 'STR 결재테이블 STR 보고서 결재 이력 관리 테이블';
COMMENT ON TABLE STR_CODE  IS 'STR공통코드 2단계까지만 허용 Key값자동 부여 제외 STR 보고서 관련 공통 코드 정보 관리 테이블';
COMMENT ON TABLE STR_COMMON  IS 'STR공통 STR 보고서 작성에 사용되는 공통정보 관리 테이블';
COMMENT ON TABLE STR_CUSTCOMM  IS '인적공통 STR 보고서 작성에 사용되는 개인/법인 공통 정보 관리 테이블';
COMMENT ON TABLE STR_CUSTCOR  IS '법인인적사항 STR 보고서 작성에 사용되는 법인 정보 관리 테이블';
COMMENT ON TABLE STR_CUSTPER  IS '개인인적사항 STR 보고서 작성에 사용되는 개인 정보 관리 테이블';
COMMENT ON TABLE STR_CUST_ROLE  IS '인적공통거래자역할 STR 보고서의 보고대상자 관계 정보 관리 테이블';
COMMENT ON TABLE STR_DOC_HIST  IS '보고문서관리내역관리 보고서 문서 번호 관리 테이블';
COMMENT ON TABLE STR_HEAD  IS '보고기관정보 보고기관 정보 관리 테이블';
COMMENT ON TABLE STR_INSURTRAN  IS '보험거래 STR 보고서 보험거래 관련 항목 정보 테이블';
COMMENT ON TABLE STR_KOFIU_BANK  IS 'KoFIU은행코드 KOFIU 대상 은행 정보 관리 테이블';
COMMENT ON TABLE STR_MNU_MASTER  IS '수기보고 마스터 테이블 수기보고 정보 관리 테이블';
COMMENT ON TABLE STR_MNU_RLTD_ACC  IS 'STR_수기_관련계좌 수기보고 관련계좌 정보 관리 테이블';
COMMENT ON TABLE STR_MNU_TRD  IS 'STR_수기_거래 수기보고 거래관련 정보 관리 테이블';
COMMENT ON TABLE STR_REMIT  IS '자행영수송금 STR 보고서 자행송금 관련 정보 관리 테이블';
COMMENT ON TABLE STR_REMITEX  IS '타행영수송금 STR 보고서 타행송금 관련 정보 관리 테이블';
COMMENT ON TABLE STR_SECURITRAN  IS '유가증권내역 STR 보고서 유가증권 관련 정보 관리 테이블';
COMMENT ON TABLE STR_STOCKTRAN  IS '증권내역 STR 보고서 증권 관련 정보 관리 테이블';
COMMENT ON TABLE STR_STOCK_FOREIGN  IS '국외거래소등록내역 STR 보고서 거래소 등록내역 관련 정보 관리 테이블';
COMMENT ON TABLE STR_SUSDESC  IS '의심거래서술 STR 보고서 주관적 질의 항목 정보관련 테이블';
COMMENT ON TABLE STR_SUSTRAN_CONT  IS '의심거래서술 STR 보고서 주관적 질의 항목 서술형 정보관련 테이블';
COMMENT ON TABLE STR_TRAN  IS 'STR_해당계좌 STR 보고서 의심거래 관련 정보 관리 테이블';
COMMENT ON TABLE STR_TRANTYPE  IS '의심거래유형 STR 보고서 의심거래 유형 정보 관리 테이블';
COMMENT ON TABLE SYSTEM_APPR  IS '결재테이블 STR 업무 결재이력 테이블';
COMMENT ON TABLE SYSTEM_LOGIN_LOG  IS '접속로그테이블 사용자 로그인 이력 정보 관리 테이블';
COMMENT ON TABLE TACUGIBM  IS '고객원장 고객원장 ETL 마트 테이블';
COMMENT ON TABLE TACUMPER  IS '대표자정보 대표자정보 ETL 마트 테이블';
COMMENT ON TABLE TALNDCHM  IS '여신계좌원장 여신계좌원장 ETL 마트 테이블';
COMMENT ON TABLE TBCDBANK  IS '은행 및 지점 은행 및 지점 ETL 마트 테이블';
COMMENT ON TABLE TBCDGWA  IS '상품코드 상품코드 ETL 마트 테이블';
COMMENT ON TABLE TBCDPSTOLD  IS '우편번호코드_OLD 우편번호코드_OLD ETL 마트 테이블';
COMMENT ON TABLE TBISJWI  IS '직위코드 직위코드 ETL 마트 테이블';
COMMENT ON TABLE TBREPOS  IS '자료실 자료실 ETL 마트 테이블';
COMMENT ON TABLE TBREPOS_FILE  IS '자료실 파일 자료실 파일 ETL 마트 테이블';
COMMENT ON TABLE TB_COM_COD  IS 'COM_코드 공통코드 정보 관리 테이블';
COMMENT ON TABLE TB_COM_COD_MPNG  IS 'COM_코드매핑 공통코드 맵핑정보 관리 테이블';
COMMENT ON TABLE TB_ICT_BOFC_ISPE_BRKD  IS '내부통제_임점점검내역 임점점검내역 관리 테이블';
COMMENT ON TABLE TB_ICT_BOFC_ISPE_MSTR  IS '내부통제_임점점검MASTER 임점점검내역 마트 테이블';
COMMENT ON TABLE TB_ICT_EDU_INFO  IS '내부통제_교육정보 교육정보 관리 테이블';
COMMENT ON TABLE TB_ICT_EDU_TRGT_INFO  IS '내부통제_교육대상정보 교육대상정보 관리 테이블';
COMMENT ON TABLE TB_ICT_PRD_EVAL_BRKD  IS '내부통제_상품평가내역 상품평가내역 관리 테이블';
COMMENT ON TABLE TB_ICT_PRD_EVAL_BSC  IS '내부통제_상품평가기본 상품평가 정보 관리 테이블';
COMMENT ON TABLE TB_PROD_CLS_COD  IS '상품분류코드 상품분류코드 관리 테이블';
COMMENT ON TABLE TB_RBA_BRD_ASSM_RSLT  IS '부점별평가결과 부점별 평가결과 관리 테이블';
COMMENT ON TABLE TB_RBA_BRD_HRSK_OCG_LST  IS '부점별고위험군내역 부점별 고위험군 내역 관리 테이블';
COMMENT ON TABLE TB_RBA_BRD_LAMT_LST  IS '부점별고액거래내역 부점별 고액거래 내역 관리 테이블';
COMMENT ON TABLE TB_RBA_BRD_RSA_DETL  IS '부점위험평가상세 부점별 위험평가 상세내역 관리 테이블';
COMMENT ON TABLE TB_RBA_BRD_RSA_LST  IS '부점위험평가내역 부점별 위험평가내역 관리 테이블';
COMMENT ON TABLE TB_RBA_BRD_RSK_ASSM  IS '부점위험평가 부점별 위험평가 관리 테이블';
COMMENT ON TABLE TB_RBA_BRD_XPR_ASSM  IS '부점노출위험평가 부점별 노출위험평가 관리 테이블';
COMMENT ON TABLE TB_RBA_BRD_XPR_ASSM_DTL  IS '부점노출위험평가상세 부점별 노출위험평가 상세내역 관리 테이블';
COMMENT ON TABLE TB_RBA_BRD_XPR_CLT  IS '부점노출위험수집 부점별 노출위험 수집 관리 테이블';
COMMENT ON TABLE TB_RBA_BRD_XPR_SCOR  IS '부점노출위험점수 부점별 노출위험점수 관리 테이블';
COMMENT ON TABLE TB_RBA_COM_COD  IS 'RBA 공통 코드 RBA 공통 코드 관리 테이블';
COMMENT ON TABLE TB_RBA_CTA_BRD_MPNG_LST  IS '통제활동부점매핑내역 부점별 통제활동 매핑 관리 테이블';
COMMENT ON TABLE TB_RBA_CTA_BSC  IS '통제활동기본 통제활동 정보 관리 테이블';
COMMENT ON TABLE TB_RBA_CTA_IDCT_MPNG_LST  IS '통제활동지표매핑내역 통제활동별 지표매핑 관리 테이블';
COMMENT ON TABLE TB_RBA_CTA_MPNG  IS '통제활동매핑 통제활동 매핑 테이블';
COMMENT ON TABLE TB_RBA_CTA_MTHD_BSC  IS '통제활동방법기본 통제활동방법 관리 테이블';
COMMENT ON TABLE TB_RBA_CTA_MTHD_DETL  IS '통제활동방법내역 통제활동방법 상세 관리 테이블';
COMMENT ON TABLE TB_RBA_CTA_RSLT_DETL  IS '통제활동결과상세 통제활동결과 상세 관리 테이블';
COMMENT ON TABLE TB_RBA_CTA_RSLT_LST  IS '통제활동결과내역 통제활동결과내역 관리 테이블';
COMMENT ON TABLE TB_RBA_CTA_SAMPLING  IS '샘플링 관리 샘플링 관리 테이블';
COMMENT ON TABLE TB_RBA_CTA_WEAK_BSC  IS '통제활동취약기본 통제활동취약점 정보 관리 테이블';
COMMENT ON TABLE TB_RBA_CTL_PRC_BSC  IS '통제프로세스기본 통제프로세스 정보 관리 테이블';
COMMENT ON TABLE TB_RBA_CTL_RSK_BSC  IS '통제위험기본 통제위험 정보 관리 테이블';
COMMENT ON TABLE TB_RBA_DSN_ASSM_IPVM_LST  IS '설계평가개선내역 설계평가개선내역 관리 테이블';
COMMENT ON TABLE TB_RBA_JOB_COD_MPNG  IS '직업코드매핑 직업코드 매핑 관리 테이블';
COMMENT ON TABLE TB_RBA_KRI_ACTN_DETL  IS 'KRI대응내역 KRI대응내역 관리 테이블';
COMMENT ON TABLE TB_RBA_KRI_ACTN_MEA_DETL  IS 'KRI대응조치내역 KRI대응조치내역 관리 테이블';
COMMENT ON TABLE TB_RBA_KRI_INF_BSC  IS 'KRI정보기본 KRI정보 관리 테이블';
COMMENT ON TABLE TB_RBA_KRI_IPVM_LST  IS 'KRI개선내역 KRI개선내역 관리 테이블';
COMMENT ON TABLE TB_RBA_KRI_MONI_DETL  IS 'KRI모니터링내역 KRI모니터링내역 관리 테이블';
COMMENT ON TABLE TB_RBA_MANG_ASSM_IPVM_LST  IS '운영평가개선내역 운영평가개선내역 관리 테이블';
COMMENT ON TABLE TB_RBA_ML_CASE_BSC  IS '자금세탁사례기본 자금세탁사례 정보 관리 테이블';
COMMENT ON TABLE TB_RBA_RSA_MODL_BSC  IS '위험평가모델기본 위험평가모델 정보 관리 테이블';
COMMENT ON TABLE TB_RBA_RSK_ASSM_CAL_BSC  IS '위험평가산출기본 위험평가산출 코드 관리 테이블';
COMMENT ON TABLE TB_RBA_RSK_FACT_BSC  IS '위험팩터기본 위험팩터 정보 관리 테이블';
COMMENT ON TABLE TB_RBA_RSK_FACT_MPNG_LST  IS '위험팩터자금세탁매핑내역 위험팩터별 자금세탁사례 매핑내역 관리 테이블';
COMMENT ON TABLE TB_RBA_RSK_MNG_ACT_BSC  IS '위험관리활동기본 위험관리활동 정보 테이블';
COMMENT ON TABLE TB_RBA_RSK_QUAN_BSC  IS '위험팩터정량평가기준 위험팩터정량평가기준 관리 테이블';
COMMENT ON TABLE TB_RBA_RSK_XPR_ASSM  IS '위험지표노출위험집계 위험지표노출위험집계 관리 테이블';
COMMENT ON TABLE TB_RBA_RSK_XPR_SCOR  IS '위험지표노출위험점수 위험지표노출위험점수 관리 테이블';
COMMENT ON TABLE TB_RBA_SECU_ASSM_RSLT_DETL  IS '보안위험평가결과상세 보안위험평가결과상세 관리 테이블';
COMMENT ON TABLE TB_RBA_SECU_ASSM_RSLT_LST  IS '보안위험평가결과내역 보안위험평가결과내역 관리 테이블';
COMMENT ON TABLE TB_RBA_SMPL_RSLT_LST  IS '샘플링결과내역 샘플링결과내역 관리 테이블';
COMMENT ON TABLE TB_RBA_STD_REGU_DSTB_INDI  IS '표준정규분포지표 표준정규분포지표 관리 테이블';
COMMENT ON TABLE TB_RBA_TMP01  IS 'DMS0270M[보험계좌원장]_배치임시테이블 RBA 계좌 마트 임시 테이블';
COMMENT ON TABLE TB_RBA_TMP02  IS 'DMS0300M[통합거래원장]_배치임시테이블 RBA 거래 마트 임시 테이블';
COMMENT ON TABLE TB_RBA_TMP03  IS 'DMS0100M[고객원장]_배치임시테이블 RBA 고객 마트 임시 테이블';
COMMENT ON TABLE TB_RBA_TMP04  IS 'DMS0300M[통합거래원장]_배치임시테이블_월별지점별거래고객 RBA 통합 마트 임시 테이블';
COMMENT ON TABLE TB_RBA_TMP05  IS 'DMS0100M[고객원장]_배치임시테이블_위험지표별고객(ex.무직자) 집계 RBA 고객 마트 임시 테이블';
COMMENT ON TABLE TB_RBA_XPR_IDCT_BSC  IS '노출위험지표기본 노출위험지표 정보 관리 테이블';
COMMENT ON TABLE TB_RBA_XPR_IDCT_SER_LST  IS '노출위험지표서비스내역 노출위험지표서비스내역 관리 테이블';
COMMENT ON TABLE TB_RUL_INF  IS '룰정보테이블 룰정보 관리 테이블';
COMMENT ON TABLE TB_SMS  IS 'SMS테이블 SMS 발송정보 관리 테이블';
COMMENT ON TABLE TB_SYS_ATTCH_FILE  IS '첨부파일 테이블 첨부파일 정보 관리 테이블';
COMMENT ON TABLE TB_SYS_BD  IS 'SYS_게시판 게시판 정보 관리 테이블';
COMMENT ON TABLE TB_SYS_EXCP_HST  IS 'SYS_예외이력 시스템 예외처리 발생시 등록하는 이력 관리 테이블';
COMMENT ON TABLE TMGMGURDLON  IS '거래원장 거래원장 ETL 마트 테이블';
COMMENT ON TABLE TRUST_DAMBO  IS '담보내역 담보내역 ETL 마트 테이블';
COMMENT ON TABLE TRUST_GRD  IS '신용등급 신용등급 ETL 마트 테이블';
COMMENT ON TABLE TRUST_OVER  IS '현재연체내역 현재연체내역 ETL 마트 테이블';
COMMENT ON TABLE TRUST_WRNT  IS '보증인 보증인 ETL 마트 테이블';
COMMENT ON TABLE TVGMCDJUM  IS '부서 부서 ETL 마트 테이블';
COMMENT ON TABLE TVGMISIK  IS '직원정보 직원정보 ETL 마트 테이블';
COMMENT ON TABLE WL_BLACKLIST  IS '자체_요주의_인물_관리 자체 요주의 인물 관리 테이블';
COMMENT ON TABLE V_WATCH_LIST  IS '요주의인물 뷰 요주의인물 통합 관리 뷰';




테이블 총 220개



테이블없음

COMMENT ON TABLE JI_DETAIL  IS '지급내역 지금 내역 ETL 마트 테이블'; --테이블없음
COMMENT ON TABLE KYC_CUST_RA_BHV_SCR  IS 'KYC 고객 RA 행동위험평가 스코어 KYC고객 행동위험평가 마스터 테이블'; --테이블없음
COMMENT ON TABLE KYC_WL_ALIAS  IS '요주의인물 별칭정보 요주의 인물 별칭 정보 테이블'; --테이블없음
COMMENT ON TABLE KYC_WL_BRTH  IS '요주의인물 생년월일 요주의 인물 생년월일 테이블'; --테이블없음
COMMENT ON TABLE KYC_WL_NATIONAL  IS '요주의인물 국가정보 요주의 인물 국가정보 관리 테이블'; --테이블없음
COMMENT ON TABLE KYE_EMP_MNG  IS 'KYE 사원 관리 현황 KYE 직원 관리 테이블'; --테이블없음
COMMENT ON TABLE LOAN_DETAIL  IS '해당월 대출내역 대출 내역 ETL 마트 테이블'; --테이블없음
COMMENT ON TABLE REPAY_DETAIL  IS '해당월 상환내역 상환 내역 ETL 마트 테이블'; --테이블없음
COMMENT ON TABLE REPAY_PLAN  IS '상환계획 상환 계획 ETL 마트 테이블'; --테이블없음
COMMENT ON TABLE TACUGIBM  IS '고객원장 고객원장 ETL 마트 테이블'; --테이블없음
COMMENT ON TABLE TACUMPER  IS '대표자정보 대표자정보 ETL 마트 테이블'; --테이블없음
COMMENT ON TABLE TALNDCHM  IS '여신계좌원장 여신계좌원장 ETL 마트 테이블'; --테이블없음
COMMENT ON TABLE TB_RBA_CTA_MPNG  IS '통제활동매핑 통제활동 매핑 테이블'; --테이블없음
COMMENT ON TABLE TB_RBA_CTA_SAMPLING  IS '샘플링 관리 샘플링 관리 테이블'; --테이블없음
COMMENT ON TABLE TB_SMS  IS 'SMS테이블 SMS 발송정보 관리 테이블'; --테이블없음
COMMENT ON TABLE TRUST_DAMBO  IS '담보내역 담보내역 ETL 마트 테이블'; --테이블없음
COMMENT ON TABLE TRUST_GRD  IS '신용등급 신용등급 ETL 마트 테이블'; --테이블없음
COMMENT ON TABLE TRUST_OVER  IS '현재연체내역 현재연체내역 ETL 마트 테이블'; --테이블없음
COMMENT ON TABLE TRUST_WRNT  IS '보증인 보증인 ETL 마트 테이블'; --테이블없음
COMMENT ON TABLE V_WATCH_LIST  IS '요주의인물 뷰 요주의인물 통합 관리 뷰'; --테이블없음

