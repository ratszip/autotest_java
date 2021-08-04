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
	 * input可输入可下拉
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
	
	/**
	 * 主表的checkbox的xpath
	 */
	public static String[] checkpath(String fieldname) {
		String[] field = new String[2];
		field[1]="//label[text()='"+fieldname+"']/preceding-sibling::div[1]";
		field[0]="//label[text()='"+fieldname+"']/preceding-sibling::div[1]/input[1]";
		return field;
	}
	/**
	 * 细表按钮：新增修改...
	 * @param fieldname 按钮名称
	 * @return 按钮的xpath
	 */
	public static String buttonM(String fieldname) {
		String[] buttox= {"新增细表","修改细表","删除","物料清单","挑批","旧票抽毛","抽毛","清货",
				"新增色号","出缸筒子","旧票出货信息","3号仓抽毛"};
		for (int i = 0; i < buttox.length; i++) {
			if(buttox[i]==fieldname){
				return "//*[@id'tab-1']/div[2]/div/div[1]/button["+(i+1)+"]";
			}
		}
		return "wrong button";
	}
	
	
	/*************************************************细表***********************************************/
	
}
