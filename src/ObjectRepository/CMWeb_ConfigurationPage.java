package ObjectRepository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMWeb_ConfigurationPage extends BaseClass {
	private static WebElement Element;
    private static Alert alert;
    
	public CMWeb_ConfigurationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//configuration tab
    public static WebElement btnConfig() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	    WebElement frame  = driver.findElement(By.name("header"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"RadTabStrip1\"]/div/ul/li[5]/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    	
    }
    
    // system tab
    public static WebElement btnSystem() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("main"));
	    	driver.switchTo().frame(frame);
    		Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn0\"]/table/tbody/tr/td/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // account tab
    public static WebElement btnAccount() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("main"));
	    	driver.switchTo().frame(frame);
    		Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn1\"]/table/tbody/tr/td/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }

    
    // role button
    public static WebElement btnRoles() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl07_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Site button
    public static WebElement btnSite() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl01_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Users button
    public static WebElement btnUsers() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl02_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //  new button
    public static WebElement btnNew() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_ucCBtn1_lnkBtn\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtRoleName
    public static WebElement txtRoleName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_tbxField2\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtName
    public static WebElement txtName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_tbxName\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtEmail
    public static WebElement txtEmail() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_tbxEmail\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtUsername
    public static WebElement txtUsername() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_tbxUID\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtPassword
    public static WebElement txtPassword() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_tbxPWD\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtSiteName
    public static WebElement txtSiteName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditorSite_tbxName\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Role type dropdown
    public static WebElement drpdwnRoleType() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_cmbRoleType\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // property role level checkbox
    public static WebElement chckboxPropertyLevel() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_rdoProperty\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
        
    // site role type checkbox
    public static WebElement chckboxSiteLevel() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_rdoSite\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // basic role type checkbox
    public static WebElement chckboxBasicLevel() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_rdoBasic\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // user role type checkbox
    public static WebElement chckboxUserRole() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_chkRoles_3\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Check all button
    public static WebElement btnCheckAll() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_rtbRoleRights\"]/div/div/div/ul/li[1]/a/span/span/span/span"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
  
    // save Role button
    public static WebElement btnSaveRole() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_lnkBtnSave\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // save Site button
    public static WebElement btnSaveSite() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditorSite_lnkBtnSave\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // save user button
    public static WebElement btnSaveUser() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_lnkBtnSave\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Ok Alert
    public static Alert alertOkay() throws Exception {
    	alert = null;
    	try {
    		alert = driver.switchTo().alert();
    	} catch (Exception e) {
    		throw(e);
    	}
    	return alert;
    }
    
    // Edit Role button 
    public static WebElement btnEdit() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_lnkBtnEdit\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Edit User button 
    public static WebElement btnEditUser() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_lnkbtnEdit\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtSearch
    public static WebElement txtSearch() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_tbxSearch\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search Button
    public static WebElement btnSearch() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_lnkBtnSearch\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Clear Button
    public static WebElement btnClear() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_lblClear\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // role checkbox
    public static WebElement chckboxRole() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_chkSelect\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // site checkbox
    public static WebElement chckboxSite() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_chkselect\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // delete Button
    public static WebElement btnDelete() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_ucCBtn2_lnkBtn\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // deactivate Button
    public static WebElement btnDeactivate() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_ucCBtnDeactivate_lnkBtn\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
}
