package CPC_element;

public class ElementLocate {
	public static String ICON = "//*[@id=\"upwIndex\"]/div/div/nav/div[1]/div[1]/div[1]/div[1]/button";// 左菜单图标
	public static String PRO_STORE = "//div[contains(text(),'成品仓管理系统 ')]/parent::div";// 成品仓管理系统
	public static String SALE_CONTRA = "//div[contains(text(),'销售合同')]/parent::div";// 销售合同
	public static String SALE_CONTRA_WR = "//div[contains(text(),'销售合同录入')]/parent::a/i";// 销售合同录入
	public static String DELIVERY_WAY_mk = "//label[text()='交货方式'][@class='v-label v-label--active theme--light']";// 标签
	public static String GROUP_BUSI_TEXT = "//label[text()='下单']/../../../../../following-sibling::div[1]/div";// 组别

	/**
	 * 选择框进行选择
	 * @param fieldname
	 * @param fielddown
	 * @param i 1=div,2=input
	 * @return
	 */
	public static String[] chooseVeryf(String fieldname, String fielddown) {
		String[] field = new String[4];	
		field[0] = "//label[text()='" + fieldname + "']/following-sibling::div[1] |"+
				"//label[text()='" + fieldname + "']/following-sibling::input[1]";
		field[1] = "//div[text()='" + fielddown + "']";
		field[2] = "//label[text()='" + fieldname + "']/following-sibling::div[1]/div[1]";
		field[3] = fieldname;
		return field;
	}
	
	/**
	 * label/div通过字段返回xpath
	 * @param fieldname 字段名
	 * @return
	 */
	public static String[] fieldLocate(String fieldname) {
		String xpath="//label[text()='" + fieldname + "']/following-sibling::div[1] | " 
				+ "//label[text()='" + fieldname
				+ "']/following-sibling::input[1]";
		String[] strary=new String[] {fieldname,xpath};
		return strary;
	}
	
	/**
	 * 返回包含对应文本的xpath
	 * @param text div | span
	 * @return
	 */
	public static String rtTextlocat(String text) {
		return "//div[text()='" + text + "'] | //span[text()='" + text + "']";
	}

	// 主表按钮:查询新增...
	public static String buttoz(String fieldname) {
		return "//span[text()='" + fieldname + "']/parent::div[1]";
	}

	//主表checkbox的xpath
	public static String[] checkpath(String fieldname) {
		String[] field = new String[4];
		field[1] = "//label[text()='" + fieldname + "']/preceding-sibling::div[1]";
		field[0] = "//label[text()='" + fieldname + "']/preceding-sibling::div[1]/input[1]";
		field[3] = fieldname;
		return field;
	}

	/**
	 * 细表按钮：新增修改...
	 * @param fieldname 按钮名称
	 * @return 按钮的xpath
	 */
	public static String buttonM(String fieldname) {
		String[] buttox = { "新增细表", "修改细表", "删除", "物料清单", "挑批", "旧票抽毛", "抽毛", "清货", "新增色号", "出缸筒子", "旧票出货信息", "3号仓抽毛" };
		for (int i = 0; i < buttox.length; i++) {
			if (buttox[i] == fieldname) {
				return "//*[@id'tab-1']/div[2]/div/div[1]/button[" + (i + 1) + "]";
			}
		}
		return null;
	}

}
