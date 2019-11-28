# TABLE LIST ...
BILL
CM_
    CM_APPR
    CM_APPR_ATHR
    CM_APPR_HST
    CM_APPR_LINE
    CM_APPR_LINE_MST
    CM_APPR_MST
    CM_APPR_USR
    CM_APPRV_DETL
    CM_APPRV_HST
    CM_APPRV_MNG
    CM_ATHR
    CM_BCKGRND
    CM_CNTR
    CM_CODE
    CM_CODEGR
    CM_CODEMD
    CM_LISTDATA
    CM_MENU
    CM_MNATHR
    CM_PRGM
    CM_PRGM_ATHR
    CM_PSI
    CM_PSI2
    CM_PSI2_PER
    CM_USER_DETAIL_LOG
    CM_USER_SEARCH_LOG
    CM_USR
    CM_USR_ATHR
    CM_VALUEDATA
CTR_
DM
EDD
FIU
JOB
KYC_
KYE_
RA_
RBA_
RULE_
SCORE_
SDD_
STR_
SYSTEM_
TB_ : 공통코드관련같음
    TB_COM_COD(주거유형코드,자산규모코드 ...)COD_GRP_NM
    TB_COM_COD_MPNG
    TB_COM_COD_MPNG_HST
TBCD
TBISJWI
TBREPOS
TDCDDMBO
TI_WL_
TMG
TVG
WL_

# STR TABLE LIST ...25
## key : TEMP_DOC_NO

STR_APPR
STR_ATTACHDATA
STR_CODE 코드
    VII.거래자의의심스러운정도
    "STR보고시 첨부파일경로"
    II_2.성별구분
    "STR 작성시 여부명"
    "STR 작성시 송금/수취계좌존재명"
    "STR 작성시 대리인존재여부명"
    "STR 작성시 고가자산여부명"
    "STR 작성시 거래자금원천명"
    "STR 작성시 거래자금원천명"
    II_2.표준사업분류코드명
    III.거래상품명
    국외금융기관코드
    "STR 작성시 외환거래목적 와 외환사유코드1 매핑"
    고객상태코드
    "STR 작성시 외국환종류"
    "STR 작성시 적용대상구분"
    "STR작성시 진행단계"
    II_3.해외거래소
    "STR작성시 통화종류"
    국가코드
    III_1.유가증권종류명
    "VI_1.금융사고 또는 긴급조사가 요청되는 사건 관련"
    "VI_3.계좌정보 관련"
    "STR 작성시 자료진행구분"
    "VI_2.의심스러운 거래자의 태도 및 특징관련"
    "STR 작성시 외환거래목적 와 외환사유코드2 매핑"
    II_3.국내거래소
    "VII. 첨부파일 기준기간 거래기간조회"
    "STR KoFIU보고시 송수신구분"
    "XML작성시 거래자관계명"
    III.거래채널명
    II_3.상장구분명
    II_3.기업규모코드명
    VI_4.거래유형 관련
   
   III_6.보험납입방법
    "STR작성시 계좌주구분"
    III_8.거래목적명
    "STR작성시 추산자산규모명"
    IV_1.계좌계설목적명
   
   VI_2.대리인계약자와의관계
    VI_5.기타특징및유형
    "III_1.유가증권 발행인-최종구분명"
    III_2.외환거래목적명
    "STR  KoFIU 보고시 메시지타입코드"
    II_1.실명번호구분명
    "II_2.개인 직업구분명"
    "XML작성시 거래자역할명"
    III.거래수단명
    III.거래종류명
    "STR작성시 자료생성구분"
    개인법인구분
    "STR작성시 자료구분"
    국내금융기관코드
    "STR KoFIU 보고오류코드"
    III.관련계좌존재여부
STR_COMMON 공통 문서전송시간...
STR_CUST_ROLE 문서번호와 롤과 매핑
STR_CUSTCOMM 문서번호와 기본정보 국가코드, 데이터진행코드
STR_CUSTCOR 문서번호와 유저, 회사기본정보
STR_CUSTPER 문서번호와 개인정보
STR_DOC_HIST 문서번호 hist
STR_HEAD 기관정보
STR_INSURTRAN 보험료 송금관련 정보
STR_KOFIU_BANK
STR_MNU_MASTER ?? 룰코드?
STR_MNU_RLTD_ACC 액션번호? 한글명? 열람일
STR_MNU_TRD 액션번호, 거래???????
STR_REMIT
STR_REMITEX
STR_RULE_CHK
STR_SECURITRAN
STR_STOCK_FOREIGN
STR_STOCKTRAN
STR_SUSDESC 의심상세
STR_SUSTRAN_CONT 의심거래내용
STR_TRAN 의심거래
STR_TRANTYPE 의심거래타입


# RULE TABLE LIST ...11
## key : RUL_GRCD RUL_CD

RULE_COND
RULE_COND_HISTORY
RULE_FACTOR
RULE_HISTORY
RULE_INFO
    임의보고
    "분할 상환"
    "STR보고고객의 대출"
    "제3자 상환자"
    "제3자 담보물로 대출 실행"
    "분할 지급"
    "제3자 담보물로 상환 집행"
    "판매후 할부/리스"
    "다수의 대출 실행"
    "고액 건설기계 할부/리스"
    고위험고객
    "한도대비 고액 산업기계 할부/리스"
    "장기간 연체 상환"
    전자금융거래
    "단기간 고액 계약자 변경"
    "제3자 상환자"
    "제3자 상환자"
    "고액 해외 유출"
    "단기간 고액 계약자 변경"
    "단기간 고액 계약자 변경"
    "고액 해외 유출"
    "STR보고고객의 상환"
    "고액 조기 상환"
    "차명의심군 대출"
    거래패턴변화(상환)
RULE_JOBLOG
RULE_MART
RULE_RESULT
RULE_RESULT_DETAIL
RULE_SCORE_GRD
RULE_WHITE_USER