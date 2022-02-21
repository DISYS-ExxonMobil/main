package com.ICC.POM;

public class SignInPage {
      
      
      @FindBy(xpath = "//input[@id='userName']")
      private WebElement usernameTextbox;
      public WebElement getusernameTextbox()  {
            return usernameTextbox;
      }
      
      @FindBy(xpath = "//input[@id='password']")
      private WebElement passwordTextbox;
      public WebElement getpasswordTextbox()  {
            return passwordTextbox;
      }
      
      @FindBy(xpath = "//button[@id='submitButton']")
      private WebElement loginButton;
      public WebElement getloginButton()  {
            return loginButton;
      }

      Public CreatePermit(WebDriver driver) {
            PageFactory.initElements(driver,this);    
      }

}

