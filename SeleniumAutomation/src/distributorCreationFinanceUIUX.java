package distributorvUIUX_creation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;

public class distributorCreationFinanceUIUX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set path of IEDriverServer.exe
				System.setProperty("webdriver.ie.driver", "C:\\Library\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
				    
		// Initialize InternetExplorerDriver Instance using new capability.
				DesiredCapabilities returnCapabilities = DesiredCapabilities.internetExplorer();
				returnCapabilities.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
				
				WebDriver driver= new InternetExplorerDriver(returnCapabilities);
				Screen s = new Screen();
				
				try
				{
				
				//Reading Values from Excel Sheet for login credentials.
					File file1 = new File("C:\\Vijay\\SIT Folder\\DSM\\MH_User.xls");
					Workbook wb1 = Workbook.getWorkbook(file1);
					Sheet sheet1 = wb1.getSheet("MH v2");
					System.out.println("Sheet referred in Excel is "+sheet1);
					String login = sheet1.getCell(3,11).getContents();
					System.out.println("Login name "+login);
					String password = sheet1.getCell(4,11).getContents();
					System.out.println("Login password "+password);
					
					String vertical = sheet1.getCell(9,7).getContents();
					System.out.println("Sales vertical selected is " + vertical);
					
							
					System.out.println("Login Page is opened");
			    	driver.get("http://172.24.176.163/UIUX/Login.aspx");	
					driver.manage().window().maximize();
					driver.findElement(By.id("txtUsername")).click();
					driver.findElement(By.id("txtUsername")).sendKeys(login);
					driver.findElement(By.id("txtPassword")).sendKeys(password);
					driver.findElement(By.id("btnSubmit")).click();
					System.out.println("Login credentials is passed");
					Thread.sleep(3000);
					
		// code to handle the new window for LOB selection
					for(String winHandle : driver.getWindowHandles())
					{
						System.out.println("inside for loop of window handle");
						driver.switchTo().window(winHandle);
					}
					System.out.println("Current URL "+ driver.getCurrentUrl());
					//Thread.sleep(5000);	
					
				//Selecting the LOB from drop-down box
					Actions builder=new Actions(driver);
					WebElement dropdown=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_ddlLOB']"));
					Select mp_selection=new Select(dropdown);
					mp_selection.selectByVisibleText(vertical);
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_Button2")).click();
					Thread.sleep(2000);
					
				//Reading Values from Excel Sheet to input dist label values into text box
					Workbook wb = Workbook.getWorkbook(new File("C:\\Library\\Data_Dist_MH_v6.xls"));
					 Sheet sheet = wb.getSheet("dist");
					System.out.println("Sheet referred in Excel is "+sheet);
					
				// Selecting the Dist approval workflow	
					WebElement mouseover1 = driver.findElement(By.linkText("Transactions"));
					builder.moveToElement(mouseover1).perform();
					mouseover1=driver.findElement(By.xpath("//*[@id='menu']/li[4]/div/ul/li[1]/a"));
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", mouseover1);
					System.out.println("approval workflow is seleted");
					Thread.sleep(2000);

				//Run
					//driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdworkflow_ctl02_btnRUN")).click();
					s.click("C:\\Vijay\\SIT Folder\\Eclipse Workspace\\DSM UIUX\\src\\Finance_dist_run.png");
					System.out.println("Run Button is clicked");
					Thread.sleep(2000);
					
		//OK button	
					int isOk = driver.findElements(By.id("ctl00_ContentPlaceHolder1_btnok")).size();
					System.out.println("Pick response is "+isOk);
					if(isOk==1)
					{
						driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnok")).click();
					}
	
				//Next
					//driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnNext")).click();
					s.click("C:\\Vijay\\SIT Folder\\Eclipse Workspace\\DSM UIUX\\src\\next.png");

				//Closing the Sales Tab
					s.click("C:\\Vijay\\SIT Folder\\Eclipse Workspace\\DSM UIUX\\src\\salesplusimg.png");
					Thread.sleep(2000);
					
				//Opening Finance Section
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_ibtnBusiness")).click();
					Thread.sleep(2000);

				//Security Deposit Amount
					String DSDeopsit = sheet.getCell(41,1).getContents();
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSecDepAmt")).clear();
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSecDepAmt")).sendKeys(DSDeopsit);
					Thread.sleep(1000);
					
				//Deposit Instrument Date
					String DIdate =sheet.getCell(42,1).getContents();
					((JavascriptExecutor)driver).executeScript("arguments[0].value=arguments[1]", driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtInstrumentDate")), DIdate);
					Thread.sleep(1000);
					
				//Deposit Bank Name    
					String DInstrdate =sheet.getCell(43,1).getContents();			    
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbankname")).sendKeys(DInstrdate);
					Thread.sleep(1000);

				//Company shop-DD    
					String CmpShop =sheet.getCell(44,1).getContents();	
					WebElement dropdown1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlCompShop"));
					new Select(dropdown1).selectByVisibleText(CmpShop);
					Thread.sleep(1000);

				//Deposit Instrument Number
					String DInstrnum =sheet.getCell(45,1).getContents();
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDepositeinst")).sendKeys(DInstrnum);
					Thread.sleep(1000);
				
				//Deposit Instument Type--DD
					String DInstrtype =sheet.getCell(46,1).getContents();
					dropdown1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpInstrumentType"));
					new Select(dropdown1).selectByVisibleText(DInstrtype);
					Thread.sleep(1000);
				
				//Deposit Branch Name
					String DIbrname =sheet.getCell(47,1).getContents();
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbranchname")).sendKeys(DIbrname);
					Thread.sleep(1000);

				//Open AR Details
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnAddress")).click();
					new Select(driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_Panel8']//*[@id='ctl00_ContentPlaceHolder1_Div11']//*[@id='ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlLob']"))).selectByVisibleText("PREPAID");
					Thread.sleep(1000);
					new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlSup"))).selectByVisibleText("ICL");
					Thread.sleep(1000);
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_txtAddr1")).sendKeys("Address1");
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_txtAddr2")).sendKeys("Address2");
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_txtAddr3")).sendKeys("Address3");
					Thread.sleep(1000);
					dropdown1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlCountry"));
					new Select(dropdown1).selectByVisibleText(sheet.getCell(30,1).getContents());
					Thread.sleep(2000);
				
				// State Details
					dropdown1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlState"));
					new Select(dropdown1).selectByVisibleText(sheet.getCell(31,1).getContents());
					Thread.sleep(7000);
				
				// District
					dropdown1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlDist"));
					new Select(dropdown1).selectByIndex(6);
					//new Select(dropdown1).selectByVisibleText(sheet.getCell(32,1).getContents());
					Thread.sleep(3000);

				//Tehsil
					dropdown1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlTehsil"));
					new Select(dropdown1).selectByVisibleText(sheet.getCell(33,1).getContents());
					Thread.sleep(3000);

				//Location type
					dropdown1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlLocType"));
					new Select(dropdown1).selectByVisibleText(sheet.getCell(34,1).getContents());
					Thread.sleep(5000);

				//Location
					dropdown1=driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlLocation"));
					new Select(dropdown1).selectByVisibleText(sheet.getCell(35,1).getContents());
					//new Select(dropdown1).selectByIndex(2);
					Thread.sleep(5000);

				//Pincode
					String pincode=sheet.getCell(48,1).getContents();
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_txtPincode")).sendKeys(pincode);
					Thread.sleep(1000);

				//Mobile no.
					String mobile=sheet.getCell(29,1).getContents();
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_txtMobile")).sendKeys(mobile);
					Thread.sleep(1000);

				//Payment Terms
					new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlPaymtTerms"))).selectByVisibleText("Immediate");
					Thread.sleep(1000);
					
				// Left Scroll
	//				WebElement scroll = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel8']"));
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("document.getElementById('ctl00_ContentPlaceHolder1_Panel8').scrollLeft -= 250", "");
					
				//Adding Bill To details	    
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ImgAdd")).click();
					Thread.sleep(2000);
					
				//Copying Ship to from bill to	    
					new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlCopyFrom"))).selectByVisibleText("1");
					Thread.sleep(7000);
					
				//Selecting ship To	    
					new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlBillToShipTo"))).selectByVisibleText("Ship To");
					Thread.sleep(2000);
				
				//Default Order Type
					String dot=sheet.getCell(49,1).getContents();
					new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlDefaultOrderType"))).selectByVisibleText(dot);
					Thread.sleep(1000);
					
				//Default Pricelist	
					String dpl=sheet.getCell(50,1).getContents();
					new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlDefaultPriceList"))).selectByVisibleText(dpl);
					Thread.sleep(1000);
					
				//Warehouse	  
					String dwh=sheet.getCell(51,1).getContents();
					new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ddlWarLoc"))).selectByVisibleText(dwh);
					Thread.sleep(1000);
					
				// Left Scroll
					//WebElement scroll = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel8']"));
					JavascriptExecutor js1 = (JavascriptExecutor)driver;
					js1.executeScript("document.getElementById('ctl00_ContentPlaceHolder1_Panel8').scrollLeft -= 250", "");
				
					
				//Adding Shiping To details
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvAddress_ctl03_ImgAdd")).click();
					Thread.sleep(2000);
					
				//Vertical Scroll
					js.executeScript("document.getElementById('ctl00_ContentPlaceHolder1_Panel8').scrolldown -= 250", "");
				
					
				//Saving & Closing AR Details
					Thread.sleep(3000);
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnOk")).click();

				//Opening AP Details(Hardcoded)
					Thread.sleep(2000);
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSupplier")).click();
					Thread.sleep(2000);
					new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel4']//*[@id='ctl00_ContentPlaceHolder1_Div11']//*[@id='ctl00_ContentPlaceHolder1_gvSupDet_ctl03_ddlLob']"))).selectByVisibleText("PREPAID");
					new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel4']//*[@id='ctl00_ContentPlaceHolder1_Div11']//*[@id='ctl00_ContentPlaceHolder1_gvSupDet_ctl03_ddlSup']"))).selectByVisibleText("ICL");
					Thread.sleep(2000);
					new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel4']//*[@id='ctl00_ContentPlaceHolder1_Div11']//*[@id='ctl00_ContentPlaceHolder1_gvSupDet_ctl03_ddlPaytMhd']"))).selectByVisibleText("NEFT");
					new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel4']//*[@id='ctl00_ContentPlaceHolder1_Div11']//*[@id='ctl00_ContentPlaceHolder1_gvSupDet_ctl03_ddlPayMode']"))).selectByVisibleText("CHEQUE");
					new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel4']//*[@id='ctl00_ContentPlaceHolder1_Div11']//*[@id=ctl00_ContentPlaceHolder1_gvSupDet_ctl03_ddlPayCurrency']"))).selectByVisibleText("INR");
					Thread.sleep(2000);
					new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel4']//*[@id='ctl00_ContentPlaceHolder1_Div11']//*[@id='ctl00_ContentPlaceHolder1_gvSupDet_ctl03_ddlLbtAcc']"))).selectByIndex(1);  
					Thread.sleep(2000);
					new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel4']//*[@id='ctl00_ContentPlaceHolder1_Div11']//*[@id='ctl00_ContentPlaceHolder1_gvSupDet_ctl03_ddlPrePayAcc']"))).selectByIndex(1);
					Thread.sleep(3000);
					new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel4']//*[@id='ctl00_ContentPlaceHolder1_Div11']//*[@id='ctl00_ContentPlaceHolder1_gvSupDet_ctl03_ddlTDSVenType']"))).selectByVisibleText("Company-IND");
					Thread.sleep(3000);
					new Select(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel4']//*[@id='ctl00_ContentPlaceHolder1_Div11']//*[@id='ctl00_ContentPlaceHolder1_gvSupDet_ctl03_ddlDefTDS']"))).selectByVisibleText("SEC. 194(A)");
					
					System.out.println("scroll 1");
		//			WebElement scroll1 = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel8']"));
					JavascriptExecutor js2 = (JavascriptExecutor)driver;
					js2.executeScript("document.getElementById('ctl00_ContentPlaceHolder1_Panel8').scrollLeft -= 250", "");
					
					System.out.println("scroll 2");
					//js.executeScript("document.getElementById('ctl00_ContentPlaceHolder1_Panel8').scrollleft -= 450", "");
					
					
				//Saving & Closing AP Details	
					Thread.sleep(1000);
					WebElement AR = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Panel4']//*[@id='ctl00_ContentPlaceHolder1_Div11']//*[@id='ctl00_ContentPlaceHolder1_gvSupDet_ctl03_ImgAdd']"));
					AR.click();
					
					//driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvSupDet_ctl03_ImgAdd")).click();
					System.out.println("+ icon image clicked");
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnOk")).click();
					
				//Approval Section 
					driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
					WebElement Aprimg = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_imgbtnApproval']"));
					Aprimg.click();
					//driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgbtnApproval")).click();
					Thread.sleep(3000);
					dropdown1=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_drpAction']"));
					new Select(dropdown1).selectByIndex(1);
					System.out.println("DropDown Value is selected");

				//Approval Remarks
					String FARemarks = sheet.getCell(40,1).getContents();
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtworkflowRemark")).sendKeys(FARemarks);
					System.out.println("Remarks are provided");
					
				//Save & Confirm
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSaveConfm")).click();
					System.out.println("User has clicked on the save button");
					Thread.sleep(5000);
			
				// Validation of error message (if any)
					String message = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lblMessage")).getText();
					if(message.contains("Approved Successfully"))
					{
						
					//Logout
						driver.findElement(By.id("ctl00_LinkButton1")).click();
						System.out.println("User has sucessfully logged out from the application");
						
					// closing the IE explorer
						//driver.close();
						//driver.quit();
						//Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
						Thread.sleep(2000);
						
					//calling commercial main method
						//distributorCreationCommercialv6.main(args);
					}
					else
					{
						System.out.println("Validation Message Received -> "+message);
						driver.findElement(By.id("ctl00_LinkButton1")).click();
						System.out.println("DSM application is logged out due to error validation message");
						//driver.close();
						//driver.quit();
						//Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
						//Thread.sleep(2000);
						
					}	
				
				}
				catch (Exception e)
				{
					System.out.println("exception is" +e);
				}
	}
}