package distributorvUIUX_creation;

import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
//import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

//import com.sun.glass.ui.Robot;
//import com.sun.xml.internal.bind.v2.runtime.Location;

public class DistributorCreationSalesUIUX {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		
	// Set path of IEDriverServer.exe
			System.setProperty("webdriver.ie.driver", "C:\\Library\\IEDriverServer_Win32_3.5.0\\IEDriverServer.exe");
		
    // Initialize InternetExplorerDriver Instance using new capability.
		DesiredCapabilities returnCapabilities = DesiredCapabilities.internetExplorer();
/*		returnCapabilities.setCapability("nativeEvents", false);
		returnCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
		returnCapabilities.setCapability("ignoreProtectedModeSettings", true);
		returnCapabilities.setCapability("disable-popup-blocking", true);
		returnCapabilities.setCapability("enablePersistentHover", true);
		returnCapabilities.setCapability("ignoreZoomSetting", true);   	*/   
		returnCapabilities.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		
		
		
		WebDriver driver= new InternetExplorerDriver(returnCapabilities);
		WebElement dropdown;
		Actions builder=new Actions(driver);
		Screen s = new Screen();
		try
		{	
		//Reading Values from Excel Sheet for login credentials.
			File file1 = new File("C:\\Vijay\\SIT Folder\\DSM\\MH_User.xls");
			Workbook wb1 = Workbook.getWorkbook(file1);
			Sheet sheet1 = wb1.getSheet("MH v2");
			System.out.println("Sheet referred in Excel is "+sheet1);
			String login = sheet1.getCell(3,6).getContents();
			System.out.println("Login name "+login);
			String password = sheet1.getCell(4,6).getContents();
			System.out.println("Login password "+password);
			String vertical = sheet1.getCell(9,7).getContents();
			System.out.println("Sales vertical selected is " + vertical);
						
		 	System.out.println("Login Page is opened");
	    	driver.get("http://172.24.176.163/UIUX/Login.aspx");
	    	Thread.sleep(1000);
			driver.manage().window().maximize();
			driver.findElement(By.id("txtUsername")).click();
			driver.findElement(By.id("txtUsername")).sendKeys(login);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			//driver.findElement(By.id("btnSubmit")).click();
			
			s.click("C:\\Vijay\\SIT Folder\\Eclipse Workspace\\DSM UIUX\\src\\submit.png");
			System.out.println("Login credentials is passed"); 
						
			Thread.sleep(3000);
			
		// code to handle the new window for LOB selection
			for(String winHandle : driver.getWindowHandles())
			{
				System.out.println("inside for loop of window handle");
				driver.switchTo().window(winHandle);
			}
			System.out.println("Current URL "+ driver.getCurrentUrl());	
			
			if(driver.getCurrentUrl().contains("http://172.24.176.163/UIUX/LOBSelection.aspx"))
			{
					
	//Selecting the LOB from drop-down box
			
			dropdown=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ddlLOB']"));
			Select mp_selection=new Select(dropdown);
			mp_selection.selectByVisibleText(vertical);
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button2")).click();  
			Thread.sleep(2000);
			}
						
	//Page navigation to Distribution page creation
			
		// Selecting the Dist Channel Master Tab	
			WebElement mouseover1 = driver.findElement(By.linkText("Masters"));
			builder.moveToElement(mouseover1).perform();
			System.out.println("Master is clicked");
			//Thread.sleep(2000);
			
			WebElement mouseover2 = driver.findElement(By.xpath("//*[@id='menu']/li[3]/div/ul/li[5]/a"));
			//builder.moveToElement(mouseover2).perform();
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", mouseover2);
			System.out.println("Distribution Channel is clicked");
			//Thread.sleep(2000);
			
			WebElement mouseover3 = driver.findElement(By.xpath("//*[@id='menu']/li[3]/div/ul/li[5]/div/ul/li[1]/a"));
			//mouseover3.click();
			//builder.moveToElement(mouseover3).perform();
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", mouseover3);
			System.out.println("Distribution Channel Master is clicked");
			Thread.sleep(5000);
			

			
/*		//Selecting the Dist Channel Master Tab
			s.click("C:\\Vijay\\SIT Folder\\Eclipse Workspace\\DSM UIUX\\src\\Master.png");
			Thread.sleep(1000);
			s.click("C:\\Vijay\\SIT Folder\\Eclipse Workspace\\DSM UIUX\\src\\Distribution.png");
			Thread.sleep(3000);
			//builder.moveByOffset(+350, 300).build().perform();
			new Actions(driver).moveByOffset(350, 308).build().perform();
						s.click("C:\\Vijay\\SIT Folder\\Eclipse Workspace\\DSM UIUX\\src\\Dist_Chanl_Mast.png");
			Thread.sleep(5000);
*/			
			
		//clicking on Create New Button
			
			s.click("C:\\Vijay\\SIT Folder\\Eclipse Workspace\\DSM UIUX\\src\\create.png");
			//driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_btnLoad']")).click();		
			System.out.println("Create New Button is clicked");
			Thread.sleep(5000);
			System.out.println(driver.getCurrentUrl());
			
		//selecting Dist Channel Type based on vertical selection
			if(vertical.equalsIgnoreCase("MOD-PRE"))
			{
				dropdown=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_gvLob_ctl03_ddlDistChnType']"));
				System.out.println(dropdown);
				new Select(dropdown).selectByVisibleText("Distributor-ATC");
				Thread.sleep(1000);
				System.out.println("Dist Chnnel Type");
			}
			else if(vertical.equalsIgnoreCase("Prepaid"))
			{
				dropdown=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_gvLob_ctl03_ddlDistChnType']"));
				System.out.println(dropdown);
				new Select(dropdown).selectByVisibleText("Distributor-Prepaid");
				Thread.sleep(1000);
				System.out.println("Dist Chnnel Type");	
			}
	/*		else if (vertical.equalsIgnoreCase("MOD-POST"))
			{
				dropdown=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_gvLob_ctl03_ddlDistChnType']"));
				System.out.println(dropdown);
				new Select(dropdown).selectByVisibleText("Distributor-Prepaid");
				Thread.sleep(1000);
				System.out.println("Dist Chnnel Type");				
			}
			else if (vertical.equalsIgnoreCase("POST-CRS"))
			{
				dropdown=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_gvLob_ctl03_ddlDistChnType']"));
				System.out.println(dropdown);
				new Select(dropdown).selectByVisibleText("Distributor-Prepaid");
				Thread.sleep(1000);
				System.out.println("Dist Chnnel Type");				
			}
			else if (vertical.equalsIgnoreCase("POST-NEB"))
			{
				dropdown=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_gvLob_ctl03_ddlDistChnType']"));
				System.out.println(dropdown);
				new Select(dropdown).selectByVisibleText("Distributor-Prepaid");
				Thread.sleep(1000);
				System.out.println("Dist Chnnel Type");				
			}
			else if (vertical.equalsIgnoreCase("POST-RET"))
			{
				dropdown=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_gvLob_ctl03_ddlDistChnType']"));
				System.out.println(dropdown);
				new Select(dropdown).selectByVisibleText("Distributor-Prepaid");
				Thread.sleep(1000);
				System.out.println("Dist Chnnel Type");				
			}
			else if (vertical.equalsIgnoreCase("POST-EBU"))
			{
				dropdown=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_gvLob_ctl03_ddlDistChnType']"));
				System.out.println(dropdown);
				new Select(dropdown).selectByVisibleText("Distributor-Prepaid");
				Thread.sleep(1000);
				System.out.println("Dist Chnnel Type");				
			}
			*/			

		//selecting Reporting To
			dropdown=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_gvLob_ctl03_ddlRepTo']"));
			//new Select(dropdown).selectByValue("1");
			new Select(dropdown).selectByVisibleText("VijayMHTSM");
			Thread.sleep(1000);
			System.out.println("Reporting To");

		// selecting Reporting To name
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvLob_ctl03_ddlRepToName"));
			new Select(dropdown).selectByVisibleText("Vijay MHTSM");
			Thread.sleep(1000);
			System.out.println("Reporting To name");			
			
		// selecting Customer Profile
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvLob_ctl03_ddlCustomerProfile"));
			new Select(dropdown).selectByValue("1");
			Thread.sleep(2000);
			System.out.println("Customer Profile");
			
		//clicking on the + image
			//dropdown=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_gvLob_ctl03_ImgLobAdd']"));
			//dropdown.click();
			s.click("C:\\Vijay\\SIT Folder\\Eclipse Workspace\\DSM UIUX\\src\\dist_img.png");
			System.out.println("clicking on the + image");
			Thread.sleep(3000);
			
		//Clicking on Next Button after hierarchy is set
			//dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnNext"));
			//dropdown.click();
			s.click("C:\\Vijay\\SIT Folder\\Eclipse Workspace\\DSM UIUX\\src\\next.png");
			System.out.println("Next Button is clicked in hierarchy setup");
			Thread.sleep(2000);
			
		//Reading Values from Excel Sheet to input values into text box
			Workbook wb = Workbook.getWorkbook(new File("C:\\Library\\Data_Dist_MH_v6.xls"));
			Sheet sheet = wb.getSheet("dist");
			System.out.println("Sheet referred in Excel is "+sheet);
			Thread.sleep(2000);
			
		//Category Name is populated
			String DCategory = sheet.getCell(0,1).getContents();
			System.out.println(DCategory);
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCatg"));
			new Select(dropdown).selectByVisibleText(DCategory);
			System.out.println("Category Name is populated");
			Thread.sleep(2000);

		//Dist.name
			String DName = sheet.getCell(1,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDistChnName")).sendKeys(DName);
			System.out.println("Dist.name");
			driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_txtShrtName']")).click();
			Thread.sleep(3000);

		//Short name
			String DSName = sheet.getCell(2,1).getContents();
			driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_txtShrtName']")).clear();
			driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_txtShrtName']")).sendKeys(DSName);
			//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtShrtName")).sendKeys(DSName);
			System.out.println("Short name"+DSName);
			Thread.sleep(2000);


		//User profile	
			String DUprofile = sheet.getCell(3,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlProfile"));
			new Select(dropdown).selectByVisibleText(DUprofile);
			Thread.sleep(3000);

		//Password			
			String Dpswd = sheet.getCell(4,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPassword")).sendKeys(Dpswd);
			System.out.println(Dpswd);
			Thread.sleep(2000);
			
		//Conf. paswd
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtConfPass")).sendKeys(Dpswd);
			Thread.sleep(2000);

		
		//Longitude
			String Dlontude = sheet.getCell(6,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLongitude")).sendKeys(Dlontude);
			System.out.println(Dlontude);
			Thread.sleep(2000);

		//Latitude
			String Dlattude = sheet.getCell(7,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLatitude")).sendKeys(Dlattude);
			Thread.sleep(2000);

		//EMail			
			String Demail = sheet.getCell(8,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmailId")).sendKeys(Demail);
			Thread.sleep(1000); 
			
			
	// -----> Opening the Ownership Tab <-----
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ibtnOwnerShipDetails")).click();
			Thread.sleep(2000);
			System.out.println("Ownership Tab is opened");
			
			
		//Scroll down
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");

			//Contact Person-Title -- By default "Mr." is selected so for time being this selection is commented.
			
			/*java.lang.String DTitle = sheet.getCell(9,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlContPers"));
			new Select(dropdown).selectByVisibleText(DTitle);
			System.out.println(DTitle); */
			
		//DOB
			java.lang.String Ddob = sheet.getCell(10,1).getContents();
			((JavascriptExecutor)driver).executeScript("arguments[0].value=arguments[1]", driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_DOB")), Ddob);
			System.out.println("DOB "+ Ddob);
			
		//Ownership Type
			java.lang.String DOType = sheet.getCell(11,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlOwnType"));
			new Select(dropdown).selectByVisibleText(DOType);
			System.out.println("Ownership Type "+DOType);
			
		//OwnerName
			java.lang.String DOName = sheet.getCell(12,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtOwnName")).sendKeys(DOName);
			System.out.println("Owner name "+DOName);
			
			
		//FirstName
			java.lang.String DFName = sheet.getCell(13,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirst")).sendKeys(DFName);
			System.out.println("First Name "+DFName);
			
		//Middle Name
			java.lang.String DMName = sheet.getCell(14,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMiddle")).sendKeys(DMName);
			System.out.println("Middle Name "+DMName);
			
		//Last Name
			java.lang.String DLName = sheet.getCell(15,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLast")).sendKeys(DLName);	
			System.out.println("Last Name "+DLName);
			
		//Grp. Dist	
			java.lang.String DGrpDist = sheet.getCell(16,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGrpDist"));
			new Select(dropdown).selectByVisibleText(DGrpDist);
			System.out.println("Group Dist "+DGrpDist);
			Thread.sleep(2000);
	
	//----->Opening the Other details Tab<---------
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ibtnOtherDetails")).click();	
			Thread.sleep(3000);
		//Urban/Rural
			java.lang.String DUrbRrl = sheet.getCell(17,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlUrbnRurl"));
			new Select(dropdown).selectByVisibleText(DUrbRrl);
			
		//	Vtopup  Order Limit
			java.lang.String DVLimit = sheet.getCell(18,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtVTopOrdLmt")).sendKeys(DVLimit);
		
		//Cov. population
			java.lang.String DCpop = sheet.getCell(19,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCvrgPop")).sendKeys(DCpop);
			
		// No. of Orders/Week
			java.lang.String DNow = sheet.getCell(20,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtNoOrders")).sendKeys(DNow);
			
		//	VAT
			java.lang.String Dvat = sheet.getCell(21,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlVat"));
			new Select(dropdown).selectByVisibleText(Dvat);
			
		//	LBT No.
			java.lang.String Dlbt = sheet.getCell(22,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLBTNo")).sendKeys(Dlbt);
			
		// TIN 
			java.lang.String Dtin = sheet.getCell(23,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTin")).sendKeys(Dtin);
			
		//	Serv .Tax
			java.lang.String DSTax = sheet.getCell(24,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSerTax")).sendKeys(DSTax);
			
		//	PAN
			java.lang.String Dpan = sheet.getCell(25,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPanNo")).sendKeys(Dpan);
		
		// GSTIN
			String GST = sheet.getCell(52,1).getContents();
			driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_txtgstnno']")).sendKeys(GST);
			
		// TAN
			java.lang.String Dtan = sheet.getCell(26,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTanNo")).sendKeys(Dtan);
			
			
	// ----> Opening MSISDN Section Tab <----

			driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnMsisdn")).click();
			System.out.println("Processing the entry of MSISDN's");
			Thread.sleep(2000);

		//Sales Vertical
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvDets_ctl02_Lob"));
			new Select(dropdown).selectByVisibleText("PREPAID");

		//Primary MSISDN
			String DMsisdn = sheet.getCell(27,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvDets_ctl02_MsisdnNo")).sendKeys(DMsisdn);
			System.out.println("Primary MSISDN entered is "+DMsisdn);

		//SMS Pin
			String DPin = sheet.getCell(28,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvDets_ctl02_1")).sendKeys(DPin);
			//driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvDets_ctl02_5")).sendKeys(DPin);
			

		//FTA msisdn 	
			String Dfta = sheet.getCell(29,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvDets_ctl02_FTAMSISDN")).sendKeys(Dfta);
			
		//Left Scroll
//			WebElement scroll = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel1']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.getElementById('ctl00_ContentPlaceHolder1_Panel1').scrollLeft -= 350", "");
			

		//Click on OK
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnOk2")).click();
			Thread.sleep(2000);
			
		//Code to handle any alert message in MSISDN Tab
			boolean displayed = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lblMsg")).isDisplayed();
			if(displayed == true)
			{
				String MSISDNtab = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lblMsg")).getText();
				int  msisdn = driver.findElements(By.id("ctl00_ContentPlaceHolder1_lblMsg")).size();
				System.out.println("Validation Message Received in MSISDN tab -> "+MSISDNtab);
			
				if (msisdn == 1)
				{
				// this will click on CANCEL button of MSISDN Tab
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_Cancel")).click();
					Thread.sleep(1000);
				//this will click on CANCEL button of DIST Creation Page
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnCanFooter")).click();
					Thread.sleep(1000);
				//Logging out of DSM application
					WebElement LogoutButton = driver.findElement(By.id("ctl00_LinkButton1"));
					LogoutButton.click();
					System.out.println("DSM application is logged out");
					driver.close();
				}
			}
			else
			{
			
	// ---->Geography Section Details <-----
			
			Thread.sleep(2000);
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnGeoDtls"));
			(dropdown).click();
			Thread.sleep(2000);


		//Select Country 
			String Dcntry = sheet.getCell(30,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddl_Level1"));
			new Select(dropdown).selectByVisibleText(Dcntry);
			System.out.println("Country is Selected");
			Thread.sleep(2000);

		//Select state
			String Dstate = sheet.getCell(31,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddl_Level2"));
			new Select(dropdown).selectByVisibleText(Dstate);
			Thread.sleep(2000);

		//Select District
			String Ddistrict = sheet.getCell(32,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddl_Level3"));
			new Select(dropdown).selectByVisibleText(Ddistrict);
			Thread.sleep(2000);

		//Select Tehsil
			String Dtehsil = sheet.getCell(33,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddl_Level4"));
			new Select(dropdown).selectByVisibleText(Dtehsil);
			Thread.sleep(2000);

		//Select Location type
			String DLtype = sheet.getCell(34,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddl_Type5"));
			new Select(dropdown).selectByVisibleText(DLtype);
			Thread.sleep(5000);

		//Select Location
			//String DLocation = sheet.getCell(35,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddl_Level5"));
			new Select(dropdown).selectByIndex(1);
			//new Select(dropdown).selectByValue(DLocation);
			System.out.println("Location Selected");
			Thread.sleep(5000);

		//Select Area
			//String DArea = sheet.getCell(36,1).getContents();
			dropdown=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddl_Level6"));
			new Select(dropdown).selectByIndex(1);
			//new Select(dropdown).selectByValue(DArea);
			Thread.sleep(2000);

		//Scroll down
			s.click("C:\\Vijay\\SIT Folder\\Eclipse Workspace\\DSM UIUX\\src\\geo_scroll_down.png");
			jse.executeScript("window.scrollBy(0,1500)", "");


		//Click Ok
			//driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_btnOk2']")).click();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnOk2")).click();
			Thread.sleep(2000);
			
		//Initiator Remarks
			String DIRemarks = sheet.getCell(37,1).getContents();
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInitiatorRemark")).sendKeys(DIRemarks);

		//Save & Confirm
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSaveConfm")).click();
			Thread.sleep(8000);
			
		// Validation of error message (if any)
			
			String message = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lblMessage")).getText();
			if(message.contains("Successfully"))
			{
				//Logout
				WebElement logout= driver.findElement(By.xpath(".//*[@id='header']/table/tbody/tr/td/table/tbody/tr/td/div[2]/div[2]/a"));
				builder.moveToElement(logout).perform();
				Thread.sleep(1000);
				
				WebElement logout1 = driver.findElement(By.xpath("//*[@id='header']/table/tbody/tr/td/table/tbody/tr/td/div[2]/div[2]/div/table/tbody/tr[7]/td[2]/a"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", logout1);
				
				System.out.println("User has sucessfully logged out from the application");
				
			// closing the IE explorer
				//driver.close();
				//driver.quit();
				//Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
				//Thread.sleep(2000);
			}
			else
			{
				System.out.println("Validation Message Received -> "+message);
				
				WebElement logout= driver.findElement(By.xpath(".//*[@id='header']/table/tbody/tr/td/table/tbody/tr/td/div[2]/div[2]/a"));
				builder.moveToElement(logout).perform();
				Thread.sleep(1000);
				
				WebElement logout1 = driver.findElement(By.xpath("//*[@id='header']/table/tbody/tr/td/table/tbody/tr/td/div[2]/div[2]/div/table/tbody/tr[7]/td[2]/a"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", logout1);
				
				System.out.println("DSM application is logged out due to error validation message");
				//driver.close();
				//driver.quit();
				//Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
				//Thread.sleep(2000);
			}
 
			}
		} 
		
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Exception 1"+e);
		}
		
		
		
	}


}
