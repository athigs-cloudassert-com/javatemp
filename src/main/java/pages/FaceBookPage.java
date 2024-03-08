package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage extends StartupPage {
	//please write all the locators for facebook page only 

	By loginButton = By.xpath(""); 
	By emailAddsPhoneNumberTextbox = By.xpath(""); 
	By passwordTextbox = By.xpath(""); 
	By profileIconImage = By.xpath(""); 
	By logoutButton = By.xpath(""); 
	By forgettenPasswordLink = By.xpath(""); 
	By createNewAccountLink = By.xpath(""); 
	By emailTextField = By.id(""); 
	By errorMessageWithoutCredential = By.xpath(""); 
	By errorMessageWithoutCredentialForgetPassword = By.xpath(""); 
	By withoutPasswordErrorMessage = By.xpath("");
	
	By createNewAccount = By.xpath(""); 
	By signUpButton = By.xpath(""); 
	By nameFieldErorMessage = By.xpath(""); 
	By firstNameTextField = By.xpath(""); 
	By surNameTextField = By.xpath(""); 
	By mobileNumberAndPassword = By.xpath(""); 
	By newPassword = By.xpath(""); 
	 
	 
	 
	 

	public FaceBookPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this); // Initialize Page Factory
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * about this method validateFacebookTitleOfLoginPage() 
	 * @param : null
	 * @description : it is getting the page title and return the same,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String validateFacebookTitleOfLoginPage() throws Exception {
		return null;
	}

	/**
	 * about this method verifyPresenceOfALlFields() 
	 * @param : null
	 * @description : it is verify all fields is present in current page or not 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean verifyPresenceOfALlFields() throws Exception {
		return null;
	}
	

	/**
	 * about this method validateErrorMessage() 
	 * @param : null
	 * @description : it is getting the error message if login button clicked without passing email and password
	 * @return : errorMessage as string type
	 * @author : Yaksha
	 */
	public String validateErrorMessage() throws Exception {
		return null;
	}

	/**
	 * about this method enterEmailIdOrPhoneNumber() 
	 * @param : Map<String, String> expectedData
	 * @description : it is sending the email or phone no as per json expected data ,
	 * @return : null
	 * @author : Yaksha
	 */
	public void enterEmailIdOrPhoneNumber(Map<String, String> expectedData) throws Exception {
		return;
	}
	
	/**
	 * about this method validateErrorMessageWithoutProvidePassword() 
	 * @param : null
	 * @description : it is getting the error message and validate the error message ,
	 * @return : errorMessage as string type
	 * @author : Yaksha
	 */
	public String validateErrorMessageWithoutProvidePassword(Map<String, String> expectedData) throws Exception {
		return null;
	}
	
	/**
	 * about this method enterPassword() 
	 * @param : null
	 * @description : it is sending the only the password without providing email and click login ,
	 * @return : null
	 * @author : Yaksha
	 */
	public void enterPassword(Map<String, String> expectedData) throws Exception {
		return ;
	}
	
	/**
	 * about this method goBackToLogInPageAndValidateCreateNewAccountButtonIsPresentOrNot() 
	 * @param : null
	 * @description : here checking whether the element is present or not 
	 * @return : true
	 * @author : Yaksha
	 */
	public Boolean goBackToLogInPageAndValidateCreateNewAccountButtonIsPresentOrNot() throws Exception {
		return null;
	}
	
	/**
	 * about this method validateNavigateToTheSignUpPage() 
	 * @param : null
	 * @description : click on the createnew account and validate the page title ,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String validateNavigateToTheSignUpPage() throws Exception {
		return null;
	}


	
	/**
	 * about this method verifyPresenceOfAllFieldsPresentInTheSignUpPage() 
	 * @param : null
	 * @description : verify all fields are present in the signup page ,
	 * @return : boolean
	 * @author : Yaksha
	 */
	public Boolean verifyPresenceOfAllFieldsPresentInTheSignUpPage() throws Exception {
		return null;
}
	
/**
	 * about this method enterDataInFirstNameField() 
	 * @param : Map<String, String>
	 * @description : Enter data in the first name text field ,
	 * @return : String
	 * @author : Yaksha
	 */
	public  String enterDataInFirstNameField( Map<String, String> expectedData) throws Exception {
		return null;
		
	}
	/**
	 * about this method enterDataInSignUpPage() 
	 * @param : Map<String, String>
	 * @description : enter data in the  SignUpPage page,
	 * @return : null
	 * @author : Yaksha
	 *
	 */
		public  void enterDataInSignUpPage( Map<String, String> expectedData) throws Exception {
			return ;
		}
	

}
