package CPC_element;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpc.Util.PublicData;
import com.cpc.Util.ReportExtent;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.NetworkMode;

@TestMethodOrder(OrderAnnotation.class)
public class PublicTests {
	WebDriver d = PublicData.d;
	WebDriverWait wait = new WebDriverWait(d, 5);
	WebElement vele;
	WebElement veledown;
	WebElement veletext;
	String compare;
	static ExtentReports extent = new ExtentReports("reports/extent.html", true, NetworkMode.OFFLINE);
	@RegisterExtension
	static ReportExtent report = new ReportExtent(extent);

	/**
	 * 通过字段名和要选择/录入的内容进行操作并断言
	 * 
	 * @param choostore 返回的xpath数组
	 * @throws InterruptedException
	 */
	public void selecpare(String[] choostore) throws InterruptedException {
		vele = d.findElement(By.xpath(choostore[0]));
		vele.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(choostore[1])));
		Thread.sleep(50);
		veledown = d.findElement(By.xpath(choostore[1]));
		compare = d.findElement(By.xpath(choostore[1])).getText();
		try {// 如果页面有相同的内容，则直接TAB键
			veledown.click();
		} catch (ElementClickInterceptedException e) {
			new Actions(d).sendKeys(Keys.TAB).perform();
		}
		Thread.sleep(100);
		if (vele.getTagName().equals("div")) {// div与input的路径有不同，分别处理
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(choostore[2])));
			textoratrEq(choostore[2], compare);
		} else {
			Thread.sleep(100);
			textoratrEq(choostore[0], compare);
		}
	}

	/**
	 * 保存原数据
	 * 
	 * @param elements 传入的页面元素
	 * @return Map<String,String> 返回元素及对应的文本内容
	 */
	public Map<String, String> before_verify(String... elements) {
		Map<String, String> map = new HashMap<>();
		for (String vfstring : elements) {
			WebElement wele = d.findElement(By.xpath(vfstring));
			if (!"input".equals(wele.getTagName())) {
				map.put(vfstring, wele.getText());
			} else {
				map.put(vfstring, wele.getAttribute("value"));
			}
		}
		return map;
	}

	/**
	 * 校验修改后的内容
	 * 
	 * @param map
	 */
	public void verify(Map<String, String> afmap) {
		String textafter;
		WebElement ele;
		for (String path : afmap.keySet()) {
			String textbefore = afmap.get(path);
			ele = d.findElement(By.xpath(path));
			if (!"input".equals(ele.getTagName())) {
				textafter = ele.getText();
			} else {
				textafter = ele.getAttribute("value");
			}
//			System.out.println("before:"+textbefore);
//			System.out.println("after:"+textafter);
			assertTrue(!textbefore.equals(textafter), "是否修改");
		}
	}

	/**
	 * 删除文本内容
	 * 
	 * @param ele
	 * @param atr
	 */
	public void delet(String xpath, int atr) {
		vele = d.findElement(By.xpath(xpath));
		int textlen = 0;
		switch (atr) {
		case 1:
			textlen = vele.getText().length();
			break;
		case 2:
			textlen = vele.getAttribute("value").length();
			break;
		}
		for (int i = textlen; i > 0; i--) {
			vele.sendKeys(Keys.BACK_SPACE);
		}
		vele.sendKeys(Keys.TAB);
		textoratrEq(xpath, "");
	}

	/**
	 * 输入文本内容TAB录入
	 * 
	 * @param ele
	 * @param atr
	 * @throws InterruptedException
	 */
	public void wrtin(String xpath, String text) throws InterruptedException {
		vele = d.findElement(By.xpath(xpath));
		Thread.sleep(100);
		vele.sendKeys(text);
		Thread.sleep(100);
		vele.sendKeys(Keys.TAB);
		textoratrEq(xpath,text);
	}

	/**
	 * 输入后，下拉列表显示对应内容，点击对应选项录入
	 * 
	 * @param xpath
	 * @param downpath
	 * @param text
	 * @param atr
	 * @throws InterruptedException
	 */
	public void wrtin(String xpath, String downpath, String text) throws InterruptedException {
		vele = d.findElement(By.xpath(xpath));
		vele.sendKeys(text);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(downpath)));
		veledown = d.findElement(By.xpath(downpath));
		compare = veledown.getText();
		veledown.click();
		// vele.sendKeys(Keys.TAB);
		Thread.sleep(300);
		vele = d.findElement(By.xpath(xpath));
		textoratrEq(xpath, compare);
	}

	public void assertBoolean(String xpath, String text, int atr) {
		vele = d.findElement(By.xpath(xpath));

		switch (atr) {
		case 1:
			assertTrue(vele.getText().contains(text));
			errorListener();
			break;
		case 2:
			// System.out.println(vele.getAttribute("value"));
			assertTrue(vele.getAttribute("value").contains(text));
			errorListener();
			break;
		}
	}

	/**
	 * 判断用getText还是getAtrribute,断言Equal
	 * 
	 * @param ele
	 * @param atr
	 * @param compare
	 */
	public void textoratrEq(String xpath, String compare) {
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(downpath)));
		vele = d.findElement(By.xpath(xpath));
		if (!xpath.contains("input")) {
			assertEquals(vele.getText(), compare);
			errorListener();
		}else {
			assertEquals(vele.getAttribute("value"), compare);
			errorListener();
		}

	}

	/**
	 * 判断用getText还是getAtrribute,断言assertNotEqual
	 * 
	 * @param ele
	 * @param atr
	 * @param compare
	 */
	public void textoratrNEq(String xpath, String compare) {
		vele = d.findElement(By.xpath(xpath));
		if (!xpath.contains("input")) {
			assertNotEquals(vele.getText(), compare);
			errorListener();
		} else {
			// System.out.println(vele.getAttribute("value"));
			assertNotEquals(vele.getAttribute("value"), compare);
			errorListener();
		}
	}

	public void checkboxSelec(String[] field) {
		vele = d.findElement(By.xpath(field[0]));
		veletext = d.findElement(By.xpath(field[1]));
		if (!vele.isSelected()) {
			veletext.click();
			assertTrue(vele.isSelected());
			errorListener();
		}
	}

	/**
	 * 是否有错误提示
	 */
	public void errorListener() {
		Boolean b;
		if (d.getPageSource().contains("错误") || d.getPageSource().contains("异常")) {
			b = false;
		} else {
			b = true;
		}
		assertTrue(b, "是否出现错误提示");
	}
}
