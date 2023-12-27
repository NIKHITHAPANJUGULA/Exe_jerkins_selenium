package selenium_jekins_exerice;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	public class Login_Selenium {

	    WebDriver driver;

	    public Login_Selenium(WebDriver rdriver) {

	        System.out.println("constructor called......");

	        driver = rdriver;
	        
	        PageFactory.initElements(rdriver, this);

	    }

	    // identification
	//  By txtEmail = By.id("Email");
	//  By txtpass = By.cssSelector(".password");
	//  By lblEmail = By.cssSelector("[for=Email]");
	//
	//  By chkRem = By.name("RememberMe");
	//  By btnLogin = By.tagName("button");
	//  By btnLogout = By.partialLinkText("Logo");

	    
	    @FindBy(id="Username")
	    WebElement txt_Username;
	   
	    
	    @FindBy(xpath =".password")
	    WebElement txt_Pass;
	    
	     
	    @FindBy(tagName ="button")
	    WebElement btnLogin;
	    
	    
	    @FindBy(linkText ="Logo")
	    WebElement btnLogout;
	    
	    
	   
	    //ruto utility example for PageObject Model
	    
	//  driver.findElement(By.id("Email")).sendKeys("values to send");
	    
	    @FindBy(how = How.ID, using="Username")
	    private WebElement Username;
	    
	    
	    
	    public void enterOnEmail(String emailValue){
	        
	    	Username.clear();
	    	Username.sendKeys(emailValue);
	        
	    }
	   
	    
	    public void enterPassword(String pwd) {
	        txt_Pass.clear();
	        txt_Pass.sendKeys(pwd); // this.driver
	    }

	    
	    public void clickLoginButton() {

	        btnLogin.click();

	    }

	    public void clickLogoutButton() {

	        btnLogout.click();

	    }

		public boolean verifyusername() {
			return true;
			// TODO Auto-generated method stub
			
		}

		public void enterusername(String string) {
			// TODO Auto-generated method stub
			
		}

	}

