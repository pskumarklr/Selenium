package distributorvUIUX_creation;

import java.io.File;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class distributorCreationCommercialUIUX {

	/**
	 * @param <Workbook>
	 * @param args
	 */
		public static <Workbook> void main(String[] args) 
		{
			// TODO Auto-generated method stub
			
			// Set path of IEDriverServer.exe
			System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			try
			{	
			
			//Reading Values from Excel Sheet for login credentials.
				File file1 = new File("E:\\tetsing tools.xls");
				Workbook wb1 = Workbook.getWorkbook(file1);
				Sheet sheet1 = wb1.getSheet("KL v2");
				System.out.println("Sheet referred in Excel is "+sheet1);
				String login = sheet1.getCell(3,13).getContents();
				System.out.println("Login name "+login);
				String password = sheet1.getCell(4,13).getContents();
				System.out.println("Login password "+password);
				
				String vertical = sheet1.getCell(9,7).getContents();
				System.out.println("Sales vertical selected is " + vertical);
				
			 	System.out.println("Login Page is opened");
		    	driver.get("http://172.24.176.163/DSM_VS_Migration/Login.aspx");	
				driver.manage().window().maximize();
				driver.findElement(By.id("txtUserName")).click();
				driver.findElement(By.id("txtUserName")).sendKeys(login);
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
				
			//Reading Values from Excel Sheet to input values into text box
				Workbook wb = Workbook.getWorkbook(new File("C:\\Library\\Data_Dist_KR_v6.xls"));
				Sheet sheet = wb.getSheet("dist");
				System.out.println("Sheet referred in Excel is "+sheet);
				
			// Selecting the Dist approval workflow	
				WebElement mouseover1 = driver.findElement(By.linkText("Transactions"));
				builder.moveToElement(mouseover1).perform();
				mouseover1=driver.findElement(By.linkText("Distributor Approval Workflow"));
				builder.moveToElement(mouseover1).click().build().perform();
				
			//Run
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdworkflow_ctl02_btnRUN")).click();
				Thread.sleep(1000);

			//OK button	
				int  isOk = driver.findElements(By.id("ctl00_ContentPlaceHolder1_btnok")).size();
				System.out.println("Pick response is "+isOk);
				if(isOk==1)
				{
					driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnok")).click();
				}


			//Next
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnNext")).click();
				
			//Opening Commercial TAB
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_ibtnARDetails")).click();
				Thread.sleep(2000);
			//Clicking on Warehouse Button 
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnWarehouse")).click();
			//Clicking on 1st sub-menu C-COC-WIP
				driver.findElement(By.xpath("//*[@id='imgdiv1095']")).click();
			//clicking on product group PREPAID
				driver.findElement(By.xpath("//*[@id='imageMdiv10951025']")).click();
			//clicking on product category PAPER RCV-TOPUP	
				driver.findElement(By.xpath("//*[@id='imageNdiv10951027']")).click();
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvWarehouse_ctl02_gvPrdGrp_ctl02_gvPrdCat_ctl02_gvCourier_ctl01_chkSelAll")).click();
				driver.findElement(By.xpath("//*[@id='imageNdiv10951027']")).click();
				System.out.println("product category PAPER RCV-TOPUP selected");
				Thread.sleep(1000);
				
			//clicking on product category SIM	
				driver.findElement(By.xpath("//*[@id='imageNdiv10951037']")).click();
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvWarehouse_ctl02_gvPrdGrp_ctl02_gvPrdCat_ctl03_gvCourier_ctl01_chkSelAll")).click();
				driver.findElement(By.xpath("//*[@id='imageNdiv10951037']")).click();
				System.out.println("product category SIM selected");
				Thread.sleep(1000);
				
			//clicking on product category STARTER PACK	
				driver.findElement(By.xpath("//*[@id='imageNdiv10951036']")).click();
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvWarehouse_ctl02_gvPrdGrp_ctl02_gvPrdCat_ctl04_gvCourier_ctl01_chkSelAll")).click();
				driver.findElement(By.xpath("//*[@id='imageNdiv10951036']")).click();
				System.out.println("product category STARTER PACK selected");
				Thread.sleep(1000);
				
			//clicking on product category PAPER RCV-VALUE VOUCHER	
				driver.findElement(By.xpath("//*[@id='imageNdiv10951028']")).click();
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_gvWarehouse_ctl02_gvPrdGrp_ctl02_gvPrdCat_ctl05_gvCourier_ctl01_chkSelAll")).click();
				driver.findElement(By.xpath("//*[@id='imageNdiv10951028']")).click();
				System.out.println("product category PAPER RCV-VALUE VOUCHER selected");
				Thread.sleep(1000);
				
			//Left Scroll
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("document.getElementById('ctl00_ContentPlaceHolder1_Panel1').scrolldown -= 350", "");
				
			//Clicking on OK button
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnOk2")).click();
				Thread.sleep(3000);
				
			//Inserting value into Transit Time(Days)				
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTransitTime")).click();
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTransitTime")).clear();
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTransitTime")).sendKeys("10");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_imgbtnApproval")).click();
				Thread.sleep(1000);
			
			//opening the approval tab
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpAction")).click();
				Thread.sleep(2000);
				new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpAction"))).selectByVisibleText("Approved");
				System.out.println("User has selected the courier mapping");
				Thread.sleep(3000);
				
			//Approval Remarks
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtworkflowRemark")).click();
				String CARemarks = sheet.getCell(40,1).getContents();
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtworkflowRemark")).sendKeys(CARemarks);
				System.out.println("User has provided the REMARKS");
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_drpAction")).click();
			
			//Save & Confirm
				driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSaveConfm")).click();
				System.out.println("User has clicked on the save button");
				Thread.sleep(5000);
				
				// Validation of error message (if any)
				String message = driver.findElement(By.id("ctl00_ContentPlaceHolder1_lblMessage")).getText();
				if(message.contains("Approved Successfully"))
				{
					
					System.out.println("Validation Message Received -> "+message);
					
				//Logout
					driver.findElement(By.id("ctl00_LinkButton1")).click();
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
					driver.findElement(By.id("ctl00_LinkButton1")).click();
					System.out.println("User is logged out from the application due to error validation");
					//driver.close();
					//driver.quit();
					//Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
					//Thread.sleep(2000);
					
				}	
			
			}
			catch (Exception e)
			{
				System.out.println("Exception is"+e);
			}
		}
	}
