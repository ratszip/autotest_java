package CPC_element;

public class ElementLocate {
	/*******************开票客户***********************/
	public static String CUS_NO="//*[@id='cust_no']";//开票客户
	public static String KNITWEAR = "//div[contains(text(),'东莞伟展时装针织有限公司')]/parent::div";//开票-伟展
	//v-card v-sheet theme--light
	//v-snack__content
	/************************************************/
	public static String CUS_ORDER_NUM="//*[@id=\"ref_no\"]";//客户单号
	/*******************开票检验***********************/
	public static String LOGIN="//span[text()='Login']";//登录按钮
	public static String INDEX="//*[@id=\"upwIndex\"]";//主页
	public static String TITLE="//h2[text()='UPW信息管理系统网页面版']";//主页标题
	public static String ICON="//*[@id=\"upwIndex\"]/div/div/nav/div[1]/div[1]/div[1]/div[1]/button";//左菜单图标
	public static String PRO_STORE="//div[contains(text(),'成品仓管理系统 ')]/parent::div";//成品仓管理系统
	public static String SALE_CONTRA="//div[contains(text(),'销售合同')]/parent::div";//销售合同
	public static String SALE_CONTRA_WR="//div[contains(text(),'销售合同录入')]/parent::a/i";//销售合同录入
	/******************************************/
	public static String ORDER_CATE="//label[text()='单号类别']/following-sibling::div[1]/div";//单号类别(内容)
	public static String ORDER_CATE_TAG="//label[text()='单号类别']";//单号类别标签
	public static String ORDER_CATE_DOWN="//div[text()='Commission spinning']";//单号类别下拉某条
	
	public static String CUST_ORDER="//*[@id='custno']";//下单客户
	public static String UPWKH2966 = "//div[contains(text(),'东莞升丽针织有限公司')]";//东莞升丽针织有限公司 
	public static String CUS_ADDR_TAG="//label[contains(text(),'客户地址')]";//客户地址标签
	public static String CUS_ADDR= "//label[contains(text(),'客户地址')]/following-sibling::input[1]";//客户地址内容
	
	public static String SONO="//label[text()='SO No']/following-sibling::input[1]";//SO No内容
	public static String SONO_TAG="//label[text()='SO No']";//SO No标签
	
	/*******************联系人***********************/
	public static String CONTACTS="//label[text()='联系人']/following-sibling::input[1]";//联系人
	public static String CONT_DOWN="//div[contains(text(),'曾广仲')]";//联系人下拉某条
	/**********************************************/
	
	public static String PHONE_NUM_TAG="//label[text()='客户电话']";//电话标签
	public static String PHONE_NUM="//label[text()='客户电话']/following-sibling::input[1]";//电话号码
	public static String FAX_NUM_TAG="//label[text()='客户传真']";//传真标签
	public static String FAX_NUM="//label[text()='客户传真']/following-sibling::input[1]";//传真号码
	
	/*******************品牌***********************/
	public static String BRAND_TAG="//label[text()='品牌']";//品牌标签
	public static String BRAND="//label[text()='品牌']/following-sibling::input[1]";//品牌
	public static String BRAND_ST="//div[text()='Eddie Bauer'][@class='v-list-item__title']";//品牌Eddie Bauer
	public static String BRAND_AP="//span[text()='AP']";//品牌AP
	/*********************************************/
	
	//div[@class='row row--dense'][4]/div[2]/div
	public static String DELIVERY_WAY = "//*[@id=\"input-286\"]/parent::div";//交货方式
	public static String DELIVERY_WAY_mk = "//label[text()='交货方式']";//标签
	
	/*******************下单***********************/
	public static String PL_ORDER = "//*[@id=\"sam_no\"]/parent::div";//下单
	public static String PL_ORDER_TEXT = "//*[@id=\"sam_no\"]/../div";//下单(内容)
	public static String PL_ORDER_DOWN="//div[text()='BONNY HUANG']";//下单下拉BONNY HUANG
	/*********************************************/
	
	
	
	/*******************组别***********************/
	//public static String GROUP_BUSI_TEXT="//div[text()='C']";//组别为C
	public static String GROUP_BUSI_TEXT="//div[@class='row row--dense'][4]/div[2]/div";
	public static String GROUP_BUSI_TEXT_A="//div[@class='row row--dense'][4]/div[2]/div/div/div/div[1]/input";//组别为A
	/*********************************************/
	
	public static String SALESMAN="//*[@id=\"salesman\"]/../div[1]";//销售(内容)
	public static String SALE_CON_DATE_TAG="//label[text()='合同日期']";//合同日期标签
	public static String SALE_CON_DATE="//label[text()='合同日期']/following-sibling::input[1]";//合同日期
	public static String ORDER_DATE_TAG="//label[text()='订单']";//订单日期标签
	public static String ORDER_DATE="//label[text()='订单']/following-sibling::input[1]";//订单日期
	public static String BOAT_DATE_TAG="//label[text()='船期']";//船期标签
	public static String BOAT_DATE= "//label[text()='船期']/following-sibling::input[1]";//船期
	
	/********************类型**********************/
	public static String CATEGORY="//*[@id=\"category\"]/parent::div";//类型
	public static String G_STOCK="//div[text()='取库存']";//类型-取库存
	public static String N_PRODUC="//div[text()='需生产']";//类型-需生产
	/********************************************/
	
	/********************年份**********************/
	public static String YEA_TAG="//label[text()='年份']";//年份标签
	public static String YEAR="//label[text()='年份']/following-sibling::div[1]";//年份
	public static String YEAR_TEXT="//label[text()='年份']/following-sibling::div[1]/div[1]";//年份内容
	public static String YEAR_DOWN="//div[text()=2022]";//年份下拉某项
	/********************************************/

	/********************季度**********************/
	public static String SEASON="//label[text()='季度']/following-sibling::div[1]";//季度
	public static String SEASON_TEXT="//label[text()='季度']/following-sibling::div[1]/div[1]";//季度内容
	public static String SEASON_DOWN="//div[text()='Spring/Summer']";//季度下拉某项
	/******************************************/
	
	/********************误差率**********************/
	public static String RATE_M="//label[text()='误差率']/following-sibling::div[1]";//误差率
	public static String RATE_M_TEXT="//label[text()='误差率']/following-sibling::div[1]/div[1]";//误差率内容
	public static String RATE_M_DOWN="//div[text()='0.05']";//误差率下拉某项
	/******************************************/
	
	public static String DEVNUM="//label[text()='开发编号']/following-sibling::input[1]";//开发编号
	public static String DESHARBOR="//label[text()='目的港']/following-sibling::input[1]";//目的港
	
	
	
	/********************状态-主表**********************/
	public static String STATE_M="//label[text()='状态']/following-sibling::div[1]";//状态-主表
	public static String STATE_M_TEXT="//label[text()='状态']/following-sibling::div[1]/div[1]";//状态-主表内容
	public static String STATE_M_DOWN="//div[text()='在用(U)'][@class='v-list-item__title']";//状态-主表下拉某条
	/******************************************/
	
	/********************贸易方式**********************/
	public static String TRADE_M="//label[text()='贸易方式']/following-sibling::div[1]";//贸易方式
	public static String TRADE_M_TEXT="//label[text()='贸易方式']/following-sibling::div[1]/div[1]";//贸易方式内容
	public static String TRADE_M_DOWN="//div[text()='内销(D)']";//贸易方式下拉某项
	/******************************************/
	
	/********************贸易条款**********************/
	public static String TRADET_M="//*[@id=\"input-242\"]/parent::div";//贸易条款
	public static String TRADET_M_TEXT="//*[@id=\"input-242\"]/../div[1]";//贸易条款内容
	public static String TRADET_M_DOWN="//*[@id=\"list-item-661-1\"]";//贸易条款下拉某项
	public static String TRADET_M_DOWN_TEXT="//*[@id=\"list-item-661-1\"]/div/div";//贸易条款下拉某项内容
	/******************************************/
	
	/********************交货方式**********************/
	public static String DELI_S="//*[@id=\"input-245\"]/parent::div";//交货方式
	public static String DELI_S_TEXT="//*[@id=\"input-245\"]/../div[1]";//交货方式内容
	public static String DELI_S_DOWN="//*[@id=\"list-item-670-1\"]";//交货方式下拉某项
	public static String DELI_S_DOWN_TEXT="//*[@id=\"list-item-670-1\"]/div/div";//交货方式下拉某项内容
	/******************************************/
	
	/********************付款方式**********************/
	public static String PAY_S="//*[@id=\"input-248\"]/parent::div";//付款方式
	public static String PAY_S_TEXT="//*[@id=\"input-248\"]/../div[1]";//付款方式内容
	public static String PAY_S_DOWN="//*[@id=\"list-item-677-3\"]";//付款方式下拉某项
	public static String PAY_S_DOWN_TEXT="//*[@id=\"list-item-677-3\"]/div/div";//付款方式下拉某项内容
	/******************************************/
	
	/********************订单类型**********************/
	public static String ORD_CATE="//*[@id=\"input-256\"]/parent::div";//订单类型
	public static String ORD_CATE_TEXT="//*[@id=\"input-256\"]/../div[1]";//订单类型内容
	public static String ORD_CATE_DOWN="//*[@id=\"list-item-701-4\"]";//订单类型下拉某项
	public static String ORD_CATE_DOWN_TEXT="//*[@id=\"list-item-701-4\"]/div/div";//订单类型下拉某项内容
	/******************************************/
	
	/********************出货类型**********************/
	public static String SIP="//*[@id=\"input-259\"]/parent::div";//出货类型
	public static String SIP_TEXT="//*[@id=\"input-259\"]/../div[1]";//出货类型内容
	public static String SIP_DOWN="//*[@id=\"list-item-711-1\"]";//出货类型下拉某项
	public static String SIP_DOWN_TEXT="//*[@id=\"list-item-711-1\"]/div/div";//出货类型下拉某项内容
	/******************************************/
	
	/********************认证**********************/
	public static String AUTH="//*[@id=\"input-262\"]/parent::div";//认证
	public static String AUTH_TEXT="//*[@id=\"input-262\"]/../div[1]";//认证内容
	public static String AUTH_DOWN="//*[@id=\"list-item-719-1\"]";//认证下拉某项
	public static String AUTH_DOWN_TEXT="//*[@id=\"list-item-719-1\"]/div/div";//认证下拉某项内容
	/******************************************/
	
	/********************免收款用途**********************/
	public static String FREE_FOR="//*[@id=\"input-265\"]/parent::div";//免收款用途
	public static String FREE_FOR_TEXT="//*[@id=\"input-265\"]/../div[1]";//免收款用途内容
	public static String FREE_FOR_DOWN="//*[@id=\"list-item-727-1\"]";//免收款用途下拉某项
	public static String FREE_FOR_DOWN_TEXT="//*[@id=\"list-item-727-1\"]/div/div";//免收款用途下拉某项内容
	/******************************************/
	
	public static String FREE_MARK="//*[@id='input-268']";//免收款备注
	public static String DELIV_MARK="//*[@id='input-284']";//送货单标注
	public static String MAIN_MARK="//*[@id='input-294']";//备注
	public static String UPRICE_MARK="//*[@id='input-295']";//单价备注
	
	public static String NETRUL_PAK="//*[@id='input-274']";//中性包装
	public static String NETRUL_PAK_en="//*[@id='input-274']/following-sibling::div[1]";
	public static String VARY_NEDL="//*[@id='input-276']";//过验针机
	public static String VARY_NEDL_en="//*[@id='input-276']/following-sibling::div[1]";
	public static String FREIGHT_CONTAIN="//*[@id='input-278']";//含运费
	public static String FREIGHT_CONTAIN_en="//*[@id='input-278']/following-sibling::div[1]";
	public static String CARGO_GROSS="//*[@id='input-280']";//货毛
	public static String CARGO_GROSS_en="//*[@id='input-280']/following-sibling::div[1]";
	public static String FREE_CHEK="//*[@id='input-282']";//免收款
	public static String FREE_CHEK_en="//*[@id='input-282']/following-sibling::div[1]";
	public static String DOUBLING_M="//*[@id='input-285']";//等通知并线
	public static String DOUBLING_M_en="//*[@id='input-285']/following-sibling::div[1]";
	public static String WAIT_PRODUCT="//*[@id='input-288']";//等通知生产
	public static String WAIT_PRODUCT_en="//*[@id='input-288']/following-sibling::div[1]";
	public static String CUS_SPI="//*[@id='input-290']";//客人色排纺
	public static String CUS_SPI_en="//*[@id='input-290']/following-sibling::div[1]";
	public static String NOCOUNT="//*[@id='input-292']";//不统计
	public static String NOCOUNT_en="//*[@id='input-292']/following-sibling::div[1]";
	
	public static String ADD_X="//*[@id='tab-1']/div[2]/div/div[1]/button[1]";//新增细表
	public static String MODIFY_X="//*[@id'tab-1']/div[2]/div/div[1]/button[2]";//修改
	public static String DELETE="//*[@id'tab-1']/div[2]/div/div[1]/button[3]";//删除
	public static String BOM="//*[@id'tab-1']/div[2]/div/div[1]/button[4]";//物料清单
	public static String TAKE_BATCH="//*[@id'tab-1']/div[2]/div/div[1]/button[5]";//挑批
	public static String OLD_WOOL="//*[@id'tab-1']/div[2]/div/div[1]/button[6]";//旧票抽毛
	public static String TAKE_WOOL="//*[@id'tab-1']/div[2]/div/div[1]/button[7]";//抽毛
	public static String CLEAR_STOCK="//*[@id'tab-1']/div[2]/div/div[1]/button[8]";//清货
	public static String ADD_COLOR="//*[@id'tab-1']/div[2]/div/div[1]/button[9]";//新增色号
	public static String CANISTER="//*[@id'tab-1']/div[2]/div/div[1]/button[10]";//出缸筒子
	public static String OLD_SIP="//*[@id'tab-1']/div[2]/div/div[1]/button[11]";//旧票出货信息
	public static String WAREHOUSE_3="//*[@id'tab-1']/div[2]/div/div[1]/button[12]";//3号仓抽毛
	
	/*************************************************细表***********************************************/
	
}
