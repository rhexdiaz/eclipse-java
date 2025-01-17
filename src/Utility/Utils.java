package Utility;


//import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
		public static WebDriver driver = null;
	public static WebDriver OpenBrowser(int iTestCaseRow) throws Exception{
		String sURL;
		String sBrowserName;
		
		//sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);
		//if(sBrowserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
			//Log.info("New driver instantiated");
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    //Log.info("Implicit wait applied on the driver for 10 seconds");
		    //sURL = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_URL);
		    driver.get(Constant.URL);
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		    //Log.info("Web application launched successfully");
		/*}
		
		else if
			(sBrowserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver","C:\\msedgedriver.exe");
			driver = new EdgeDriver();
			//Log.info("New driver instantiated");
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    //Log.info("Implicit wait applied on the driver for 10 seconds");
		    String sURL1 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_URL);
		    driver.get(sURL1);
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		    //Log.info("Web application launched successfully");
			}*/
		
		return driver;
	}
	
	
	
	public static String getTestCaseName(String sTestCase)throws Exception{
		String value = sTestCase;
		try{
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");	
			value = value.substring(posi + 1);
			return value;
				}catch (Exception e){
			//Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());
			throw (e);
					}
			}
	
	 public static void mouseHoverAction(WebElement mainElement, String subElement){
		
		 Actions action = new Actions(driver);
         action.moveToElement(mainElement).perform();
         if(subElement.equals("lblProfile")){
        	 action.moveToElement(driver.findElement(By.linkText("lblProfile")));
        	 //Log.info("Accessories link is found under Product Category");
         }
         /*if(subElement.equals("iMacs")){
        	 action.moveToElement(driver.findElement(By.linkText("iMacs")));
        	 Log.info("iMacs link is found under Product Category");
         }
         if(subElement.equals("iPads")){
        	 action.moveToElement(driver.findElement(By.linkText("iPads")));
        	 Log.info("iPads link is found under Product Category");
         }
         if(subElement.equals("iPhones")){
        	 action.moveToElement(driver.findElement(By.linkText("iPhones")));
        	 Log.info("iPhones link is found under Product Category");
         }*/
         action.click();
         action.perform();
         //Log.info("Click action is performed on the selected Product Type");
	 }
	 public static void waitForElement(WebElement element, String string){
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	 	}
		
	/* public static void takeScreenshot(WebDriver driver, String sTestCaseName) throws Exception{
			try{
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot + sTestCaseName +".jpg"));	
			} catch (Exception e){
				Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
				throw new Exception();
			}
		}*/
	 
	 
	}
