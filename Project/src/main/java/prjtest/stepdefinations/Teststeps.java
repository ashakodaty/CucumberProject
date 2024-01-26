package prjtest.stepdefinations;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import prjtest.pageobjects.PageElements;

@SuppressWarnings("unused")
public class Teststeps extends PageElements{
	@Given("User is in login page")
	public void user_is_in_login_page() throws IOException {
		LaunchAppReadPropertyfile();
	}
	@When("User enters email id {string}")
	public void user_enters_email_id(String email) {
		enterEmailId(email);
	}
	@When("User enters password {string}")
	public void user_enters_password(String password) {
		enterPwd(password);
	}
	@When("User clicks on SignIn Button")
	public void user_clicks_on_sign_in_button() {
		clickSignInButton();
	}
	@When("User should see Instructor dashboard")
	public void user_should_see_instructor_dashboard() {
		dashboardTextPresence();
	}
	@When("User clicks on Profile picture")
	public void user_clicks_on_profile_picture() {
		profileimageclick();
	}
	@When("User clicks on Logout menu")
	public void user_clicks_on_logout_menu() {
		LogoutDDSelect();
	}
	@Then("User should be able to logout")
	public void user_should_be_able_to_logout() {
		LogoutDDclick();
	}
	@Then("User should see Error message")
	public void user_should_see_error_message() {
		invalidLoginErrorTextPresence();
	}
	@Then("User should see Error password message")
	public void user_should_see_error_password_message() {
		invalidPasswordErrorTextPresence();
	}
	@Then("User should see Error email message")
	public void user_should_see_error_email_message() {
		invalidEmailErrorTextPresence();
	}
	@When("User enters valid credentials")
	public void the_user_enters_valid_credentials() {
		loginWithValidCredentials("instructor44@mailinator.com","start123");
	}
	@Then("User verifies the dash board")
	public void user_verifies_the_dash_board() {
		implicitWait(20);
		dashboardDashIcon();
		becomeAMentorButton();
		dashHomeIcon();
		dashBellButton();
		messageIcon();
		livesessionIcon();
		totalCoursesIcon();
		totalAssignmentsIcon();
		todayLiveSessionIcon();
		DownDashMessagesIcon();
		assignemntAndCourseware();
	}
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		launchApp();
		
	}
	@Given("User is on the website homepage")
	public void user_is_on_the_website_homepage() {
		//clickHomeLink();
		verifyInfyniTitle();
		verifyLogo();
	}	
	@When("User clicks on the footer links and verifies the Footer links text presence")
	public void user_clicks_on_the_footer_links() {
		redirectToAboutUsPage();
		Contactuslink();
		validateNewsLink();
		redirectToFreeWebinarsLink();
		redirectTOMentorshipShip();
		validateCareersLink();
		clickFQAlink();
		Businesslink();
		Termslinkclick() ;
		redirectToPrivacyPolicyLink();
		signup_InstrtuctorTest();
		redirectToBecomeAMentorPage();
		signup_StudentTest();
		Contactaddressinfo();
		blogsLinkVerify() ;
	}
	

	@After
	public void user_closes_the_driver() {
		closeApp();
	}
}
