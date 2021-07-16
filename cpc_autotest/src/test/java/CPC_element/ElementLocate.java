package CPC_element;

public class ElementLocate {
	/*******************开票客户***********************/
	public static String CUS_NO="//*[@id=\"cust_no\"]";//开票客户
	public static String KNITWEAR = "//*[@id=\"list-item-353-1\"]/div/div[1]";//开票-伟新有限公司
	/******************************************/
	
	/*******************开票检验***********************/
	public static String LOGIN="//*[@id=\"Login\"]/div/main/div/div/div/div/div/div[2]/button";//登录按钮
	public static String INDEX="//*[@id=\"upwIndex\"]";//主页
	public static String TITLE="//*[@id=\"upwIndex\"]/div/main/div/div/div/h2";//主页标题
	public static String ICON="//*[@id=\"upwIndex\"]/div/nav/div[1]/div[1]/div[1]/button";//左菜单图标
	public static String PRO_STORE="//*[@id=\"upwIndex\"]/div/nav/div[1]/div[2]/div[4]";//成品仓管理系统
	public static String SALE_CONTRA="//*[@id=\"upwIndex\"]/div/nav/div[1]/div[2]/div[4]/div/div/div[2]/div[5]";//销售合同
	public static String SALE_CONTRA_WR="//*[@id=\"upwIndex\"]/div/nav/div[1]/div[2]/div[4]/div/div/div[2]/div[5]/div/div[2]/div[2]";//销售合同录入
	/******************************************/
	
	public static String SALE_CON_DATE="//*[@id=\"input-221\"]";//合同日期
	
	/*******************品牌***********************/
	public static String BRAND="//*[@id=\"input-246\"]";//品牌栏
	public static String BRAND_NOT="//*[@id=\"list-246\"]/div/div/div";//品牌栏内容选项no data available
	/*********************************************/
	
	
	public static String DELIVERY_WAY = "//*[@id=\"input-286\"]/parent::div";//交货方式
	public static String DELIVERY_WAY_mk = "//*[@id=\"input-286\"]/parent::div/../label[1]";//标签
	
	/*******************下单***********************/
	public static String PL_ORDER = "//*[@id=\"sam_no\"]/parent::div";//下单
	public static String PL_ORDER_TEXT = "//*[@id=\"sam_no\"]/../div";//下单(内容)
	public static String PL_ORDER_DOWN="//*[@id=\"list-item-579-0\"]";//下单下拉某条
	public static String PL_ORDER_DOWN_TEXT="//*[@id=\"list-item-579-0\"]/div/div";//下单下拉某条内容
	/*********************************************/
	
	public static String PHONE_NUM="//*[@id=\"input-244\"]";//电话
	public static String FAX_NUM="//*[@id=\"input-245\"]";//传真
	
	/*******************组别***********************/
	public static String GROUP_BUSI_TEXT="//*[@id=\"input-253\"]/../div[1]";//组别(内容)
	/*********************************************/
	
	public static String SALESMAN="//*[@id=\"salesman\"]/../div[1]";//销售(内容)
	
	public static String ORDER_DATE="//*[@id=\"input-263\"]";//订单日期
	
	public static String BOAT_DATE="//*[@id=\"input-264\"]";//船期
	
	public static String CUS_ADDR= "//*[@id=\"input-240\"]";//客户地址
	
	/*******************联系人***********************/
	public static String CONTACTS="//*[@id=\"input-243\"]";//联系人
	public static String CONT_DOWN="//*[@id=\"list-item-445\"]/div";//联系人下拉某条
	/**********************************************/
	
	public static String ORDER_CATE="//*[@id=\"input-233\"]/../div[1]";//单号类别(内容)
	
	public static String ORDER_CATE_DOWN="//*[@id=\"list-item-418-3\"]/div";//单号类别下拉某条
	
	public static String CUS_ORDER_NUM="//*[@id=\"ref_no\"]";//客户单号
	
	public static String SONO="//*[@id=\"input-241\"]";//SO.NO
	
	public static String CATEGORY="//*[@id=\"category\"]/parent::div";//类型
	
	public static String G_STOCK="//*[@id=\"list-item-641-0\"]";//类型-取库存
	
	public static String N_PRODUC="//*[@id=\"list-item-641-1\"]";//类型-需生产
	
	/********************年份**********************/
	public static String YEAR="//*[@id=\"input-265\"]/parent::div";//年份
	public static String YEAR_TEXT="//*[@id=\"input-265\"]/../div[1]";//年份内容		
	public static String YEAR_DOWN="//*[@id=\"list-item-647-1\"]";//年份下拉某项
	public static String YEAR_DOWN_TEXT="//*[@id=\"list-item-647-1\"]/div/div";//年份下拉某项内容	
	/******************************************/

	/********************季度**********************/
	public static String SEASON="//*[@id=\"input-268\"]/parent::div";//季度
	public static String SEASON_TEXT="//*[@id=\"input-268\"]/../div[1]";//季度内容
	public static String SEASON_DOWN="//*[@id=\"list-item-671-0\"]";//季度下拉某项
	public static String SEASON_DOWN_TEXT="//*[@id=\"list-item-671-0\"]/div/div";//季度下拉某项内容
	/******************************************/
}
