/*
 Here we store element locators for Login Page
 */

package wipro.automationassignment.pages;

import org.openqa.selenium.By;

public interface LoginPage {

	By signIn = By.id("com.ebay.mobile:id/textview_sign_out_status");
	By emailId = By.id("com.ebay.mobile:id/edit_text_username");
	By password = By.xpath("//android.widget.EditText[@text='Password']");
	By signInButton = By.id("com.ebay.mobile:id/button_sign_in");
	By fingerPrintDialog = By.id("com.ebay.mobile:id/fingerprint_container");
	By mayBelaterButton = By.id("android:id/button2");
	By fingerPrintDialog1 = By.id("com.ebay.mobile:id/fingerprint_icon");
	By mayBelaterButton1 = By.id("com.ebay.mobile:id/bt_maybe_later");
	
	
}
