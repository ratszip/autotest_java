package CPC_element;

public class ElementLocate {
	/*******************开票客户***********************/
	public static String CUS_NO="//*[@id=\"cust_no\"]";//开票客户
	public static String KNITWEAR = "//*[@id=\"list-item-353-1\"]/div/div[1]";//开票-伟新有限公司
	/******************************************/
	public static String CUS_ORDER_NUM="//*[@id=\"ref_no\"]";//客户单号
	/*******************开票检验***********************/
	public static String LOGIN="//*[@id=\"Login\"]/div/main/div/div/div/div/div/div[2]/button";//登录按钮
	public static String INDEX="//*[@id=\"upwIndex\"]";//主页
	public static String TITLE="//*[@id=\"upwIndex\"]/div/main/div/div/div/h2";//主页标题
	public static String ICON="//*[@id=\"upwIndex\"]/div/nav/div[1]/div[1]/div[1]/button";//左菜单图标
	public static String PRO_STORE="//*[@id=\"upwIndex\"]/div/nav/div[1]/div[2]/div[4]";//成品仓管理系统
	public static String SALE_CONTRA="//*[@id=\"upwIndex\"]/div/nav/div[1]/div[2]/div[4]/div/div/div[2]/div[5]";//销售合同
	public static String SALE_CONTRA_WR="//*[@id=\"upwIndex\"]/div/nav/div[1]/div[2]/div[4]/div/div/div[2]/div[5]/div/div[2]/div[2]";//销售合同录入
	/******************************************/
	

	public static String ORDER_CATE="//*[@id=\"input-192\"]/../div[1]";//单号类别(内容)
	public static String ORDER_CATE_DOWN="//*[@id=\"list-item-377-3\"]/div";//单号类别下拉某条
	public static String CUS_ADDR= "//*[@id=\"input-199\"]";//客户地址
	public static String SONO="//*[@id=\"input-200\"]";//SO.NO
	
	/*******************联系人***********************/
	public static String CONTACTS="//*[@id=\"input-202\"]";//联系人
	public static String CONT_DOWN="//*[@id=\"list-item-396\"]/div";//联系人下拉某条
	/**********************************************/
	
	public static String PHONE_NUM="//*[@id=\"input-203\"]";//电话
	public static String FAX_NUM="//*[@id=\"input-204\"]";//传真
	
	/*******************品牌***********************/
	public static String BRAND="//*[@id=\"input-205\"]";//品牌栏
	public static String BRAND_NOT="//*[@id=\"list-205\"]/div/div/div";//品牌栏内容选项no data available
	/*********************************************/
	
	
	public static String DELIVERY_WAY = "//*[@id=\"input-286\"]/parent::div";//交货方式
	public static String DELIVERY_WAY_mk = "//*[@id=\"input-286\"]/parent::div/../label[1]";//标签
	
	/*******************下单***********************/
	public static String PL_ORDER = "//*[@id=\"sam_no\"]/parent::div";//下单
	public static String PL_ORDER_TEXT = "//*[@id=\"sam_no\"]/../div";//下单(内容)
	public static String PL_ORDER_DOWN="//*[@id=\"list-item-538-0\"]";//下单下拉某条
	public static String PL_ORDER_DOWN_TEXT="//*[@id=\"list-item-538-0\"]/div/div";//下单下拉某条内容
	/*********************************************/
	
	/*******************组别***********************/
	public static String GROUP_BUSI_TEXT="//*[@id=\"input-212\"]/../div[1]";//组别(内容)
	/*********************************************/
	
	public static String SALESMAN="//*[@id=\"salesman\"]/../div[1]";//销售(内容)
	public static String SALE_CON_DATE="//*[@id=\"input-221\"]";//合同日期
	public static String ORDER_DATE="//*[@id=\"input-222\"]";//订单日期
	public static String ORDER_DATE_id="input-222";//订单日期id
	public static String BOAT_DATE="//*[@id=\"input-223\"]";//船期
	public static String BOAT_DATE_id="input-223";//船期id
	/********************类型**********************/
	public static String CATEGORY="//*[@id=\"category\"]/parent::div";//类型
	public static String G_STOCK="//*[@id=\"list-item-600-0\"]";//类型-取库存
	public static String N_PRODUC="//*[@id=\"list-item-600-1\"]";//类型-需生产
	/********************************************/
	
	/********************年份**********************/
	public static String YEAR="//*[@id=\"input-224\"]/parent::div";//年份
	public static String YEAR_TEXT="//*[@id=\"input-224\"]/../div[1]";//年份内容		
	public static String YEAR_DOWN="//*[@id=\"list-item-606-1\"]";//年份下拉某项
	public static String YEAR_DOWN_TEXT="//*[@id=\"list-item-606-1\"]/div/div";//年份下拉某项内容	
	/********************************************/

	/********************季度**********************/
	public static String SEASON="//*[@id=\"input-227\"]/parent::div";//季度
	public static String SEASON_TEXT="//*[@id=\"input-227\"]/../div[1]";//季度内容
	public static String SEASON_DOWN="//*[@id=\"list-item-630-0\"]";//季度下拉某项
	public static String SEASON_DOWN_TEXT="//*[@id=\"list-item-630-0\"]/div/div";//季度下拉某项内容
	/******************************************/
}
