package CPC_element;

public class ElementLocate {
	
	/**
	 * label平级下的div用于点击，div/div显示文本
	 * @param fieldname 字段名
	 * @param fielddown 下拉选项
	 * @return
	 */
	public static String[] chooseVeryf(String fieldname,String fielddown) {
		String[] field=new String[3];
		field[0]="//label[text()='"+fieldname+"']/following-sibling::div[1]";
		field[1]="//div[text()='"+fielddown+"']";
		field[2]="//label[text()='"+fieldname+"']/following-sibling::div[1]/div[1]";
		return field;
	}
	
	/***
	 * input可输入下拉
	 * @param fieldname
	 * @param fielddown
	 * @return
	 */
	public static String[] chsipt(String fieldname,String fielddown) {
		String[] field=new String[2];
		field[0]="//label[text()='"+fieldname+"']/following-sibling::input[1]";
		field[1]="//div[text()='"+fielddown+"']";
		return field;
	}
	
	/**
	 * label/div通过字段返回xpath
	 * @param fieldname 字段名
	 * @return
	 */
	public static String fieldLocate(String fieldname) {
		return "//label[text()='"+fieldname+"']/following-sibling::div[1]";
	}
	
	public static String fieldLocateipt(String fieldname) {
		return "//label[text()='"+fieldname+"']/following-sibling::input[1]";
	}


	/************************************************/
	
	/*******************开票检验***********************/
	public static String LOGIN="//span[text()='Login']";//登录按钮
	public static String INDEX="//*[@id=\"upwIndex\"]";//主页
	public static String TITLE="//h2[text()='UPW信息管理系统网页面版']";//主页标题
	public static String ICON="//*[@id=\"upwIndex\"]/div/div/nav/div[1]/div[1]/div[1]/div[1]/button";//左菜单图标
	public static String PRO_STORE="//div[contains(text(),'成品仓管理系统 ')]/parent::div";//成品仓管理系统
	public static String SALE_CONTRA="//div[contains(text(),'销售合同')]/parent::div";//销售合同
	public static String SALE_CONTRA_WR="//div[contains(text(),'销售合同录入')]/parent::a/i";//销售合同录入
	/******************************************/
	
	public static String CUST_ORDER="//*[@id='custno']";//下单客户
	public static String UPWKH2966 = "//div[contains(text(),'东莞升丽针织有限公司')]";//东莞升丽针织有限公司 
	
	/*******************品牌***********************/
	public static String BRAND="//label[text()='品牌']/following-sibling::input[1]";//品牌
	public static String BRAND_ST="//div[text()='Eddie Bauer'][@class='v-list-item__title']";//品牌Eddie Bauer
	public static String BRAND_AP="//span[text()='AP']";//品牌AP
	/*********************************************/
	
	public static String DELIVERY_WAY_mk = "//label[text()='交货方式'][@class='v-label v-label--active theme--light']";//标签
	
	/*******************组别***********************/
	public static String GROUP_BUSI_TEXT="//div[@class='row row--dense'][4]/div[2]/div";
	public static String GROUP_BUSI_TEXT_A="//div[@class='row row--dense'][4]/div[2]/div/div/div/div[1]/input";//组别为A
	/*********************************************/
	



	

	public static String DEVNUM="//label[text()='开发编号']/following-sibling::input[1]";//开发编号
	public static String DESHARBOR="//label[text()='目的港']/following-sibling::input[1]";//目的港
	
	/******************************************/
	public static String GSG_SERVICE="//label[text()='GSG']/following-sibling::div[1]";//GSG
	public static String GSG_SERVICE_TEXT="//label[text()='GSG']/following-sibling::div[1]/div[1]";//GSG
	public static String GSG_SERVICE_DOWN="//div[text()='6个月']";//GSG6个月
	public static String FREE_MARK="//label[text()='免收款备注']/following-sibling::input[1]";//免收款备注
	public static String DELIV_MARK="//label[text()='送货单标注']/following-sibling::input[1]";//送货单标注
	public static String MAIN_MARK="//label[text()='备注']/following-sibling::input[1]";//备注
	public static String UPRICE_MARK="//label[text()='单价备注']/following-sibling::input[1]";//单价备注
	
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
