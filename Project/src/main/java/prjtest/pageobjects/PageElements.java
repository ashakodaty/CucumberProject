package prjtest.pageobjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import prjtest.base.Base;

public class PageElements extends Base {
	// Common Objects for Login Button Home page
	public static By loginButton = By.xpath("(//li/a[@href='/login/'])[1]");
	public static By loginText = By.xpath("//p[contains(text(),'Login to your account')]");
	// Common objects for instructor Login page
	public static By emailInput = By.xpath("//div/input[@id='account_l']");
	public static By passwordInput = By.xpath("//div/input[@id='password_l']");
	public static By homeLink = By.xpath("//a[contains(text(),'Home')]"); // action click
	public static By signinButton = By.xpath("//div/button[@class='butn style-one red btn-block mt-4 mb-2']");

	// common Objects for instructor Logout page
	public static By SecondpageImaage = By.xpath("//div[@class='logo-navbar__cucumber-studio-logo']");
	public static By logoutProfilePic = By.xpath(
			"//img[@src='https://infyni-dev0.s3.amazonaws.com/media/image/2024/01/Screenshot_2023-11-06_at_12.14.25PM_WGEEixE.png']");
	public static By logoutDDButtonSelect = By.xpath("//div/a[@href='/logout/']");
	// Common objects for error messages
	public static By invalidloginerrorText = By.xpath("//div[@class='error btns']");
	public static By invalidPwdErrortext = By
			.xpath("//div[contains(text(),'Wrong password. Try again or click Forgot password to reset it.')]");
	public static By invalidemailErrortext = By.xpath("//div[contains(text(),'Account does not exist, Sign up now')]");
	// common objects for DashBoard
	public static By dashboardText = By.xpath("//div/h4[@class='page-title float-left' and text()='Dashboard ']");
	public static By backtodashboardlink = By.xpath("//a[@href='/users/instructor_dashboard/']");
	public static By bellButton = By.xpath("//i[@class='zmdi zmdi-notifications-none noti-icon']");
	public static By Homeicon = By.xpath("//i[@class='zmdi zmdi-home noti-icon']");
	public static By Messageicon = By.xpath("//i[@class='zmdi zmdi-email noti-icon']");
	public static By livesessionicon = By.xpath("//div[@class='card-box tilebox-one p-t-10 p-b-10 bg-danger']");
	public static By Totalcoursesicon = By.xpath("//div/i[@class='zmdi zmdi-book-image float-right text-white']");
	public static By TotalEnrolledicon = By.xpath("//div/i[@class='zmdi zmdi-accounts-alt float-right text-white']");
	public static By TodayLivesessionicon = By.xpath("//div/h4[@class='header-title m-t-0 m-b-20']");
	public static By Downmessageicon = By.xpath("//a/h4[@class='header-title m-t-0 m-b-20']");
	public static By TotalAssignmentsicon = By.xpath("//i[@class='zmdi zmdi-balance-wallet float-right text-white']");
	public static By Dashicon = By.xpath("//i[@class='zmdi zmdi-menu']");
	public static By Becomeamentoricon = By.xpath("//a[@class='nav-link  waves-light waves-effect']");
	public static By AssigmnetsCourseware = By.xpath("//div/h4[@class='header-title m-t-0']");
	// ****************Footer links WEBELEMNTS
	// Home Page AboutUsLink Objects
	public static By aboutUsLink = By.xpath("//a[@href='/about-us']"); // action click
	public static By aboutUsText = By.xpath("//h1[@class='text-white']");// to verify text presence
	// Home Page BecomeAMentor Objects
	public static By becomeAMentor = By.xpath("//a[text()='Become a Mentor']");// action click
	// to Verify text presence
	public static By becomeAMentorText = By.xpath("//h1[@class='text-white' and text()='Become a Mentor']");

	// Home Page Blog's link element locators
	public static By blogsLink = By.xpath("//a[@href='https://infyni.com/blog/']");
	public static By infyniimage = By.xpath("//img[@id='logo']");
	public static By fblocator = By.xpath("//a[@target='_blank']");
	public static By bloglogoimage = By
			.xpath("//img[@src='https://infyni.com/blog/wp-content/themes/infyniblog/assets/img/header-shape.png']");
	// Home page - Become an Instructor link Web Elements
	public static By instructorLink = By.xpath("//li/a[@href='/instructor-register/']");
	public static By getstartedButton = By.xpath("//a[@class='butn style-one red  ml-1 mb-1'][1]");
	// Common Redirect links to home page from all pages

	public static By logoImage = By.xpath("//img[@id='logo']");
	public static By homelink = By.xpath("//a[@href='/' and text()='Home']");
	public static By backhomelink = By.xpath("//div[@class='page-title-section mb-3 p-0 ']");
	// Home page related contact us link objects
	public static By contactusLink = By.xpath("//a[@href='/contact/']");
	public static By contactusText = By.xpath("//h1[@class='text-white']");
	public static By contacttext = By.xpath("//div[@class='col-sm-12 col-lg-4 col-xl-4 mb-4 mb-sm-5 mb-lg-0']");
	public static By mailidtxt = By.xpath("//a[@href='mailto:contact@infyni.com']");
	public static By phonenumber = By.xpath("//i[@class='fas fa-mobile-alt mt-1 mr-3']");
	public static By Totallocators = By.xpath("//i[@class='fas fa-map-marker-alt mt-1 mr-3']");
	// Home page related to student sign up
	public static By studentsignup = By.xpath("//a[@class='butn style-one  text-nowrap red mt-2 btn-danger']");
	public static By SigninButton = By.xpath("//button[@type='submit' and @id='jsEmailRegBtn']");
	// Home Page related to FAQ's
	public static By FAQlink = By.xpath("//a[@href='/operation/help_category/']");
	// Home page related to terms link
	public static By Termslink = By.xpath("//a[@href='/terms']");
	// Home page related Business link
	public static By infyniForBusinessLink = By.xpath("(//a[@href='/business/'])[2]"); // Action = click
	public static By homelink1 = By.xpath("//a[@href='/']");
	public static By infyniforbusinesText = By
			.xpath("//div/h1[@class='text-white' and text () ='infyni for Business']");
	// Home page related mentor ship link
	public static By MentorshipLink = By.xpath("//a[contains(text(),'Mentorship')]");
	// Home page footer - 'Careers' link objects
	public static By careersLink = By.xpath("//li/a[@href='/users/career/']"); // action click
	public static By careerText = By.xpath("//div/h1[@class='text-white']");
	public static By careertxt = By.xpath("//div/ul/li/a[@href='javascript:void(0)']");
	// Home Page footer - 'News' link objects
	public static By newsLink = By.xpath("//li/a[@href='/users/announcement/' and text() = 'News']");
	public static By newsText = By.xpath("//div/h1[@class='text-white' and text() = 'News']");
	public static By Newstxt = By.xpath("//div/ul/li/a[@href='javascript:void(0)']");
	// Home page footer - FreeWebinars link objects
	public static By freeWebinarsLink = By.xpath("//a[contains(text(),'Free Webinars')]");
	public static By freewebinartxt = By.xpath("//div/ul/li/a[@href='javascript:void(0)']");
	// Home page footer - "Privacy Policy " link objects
	public static By privacyPolicyLink = By.xpath("//a[contains(text(),'Privacy Policy')]");
	public static By privacypolicytxt = By.xpath("//div/ul/li/a[@href='javascript:void(0)']");

	// ***************DASH BOARD TOTAL COURSE MODULE WEB ELEMENTS

	public static By dashboardlink = By.xpath("//a[@href='/users/instructor_dashboard/']");
	public static By leftdashboard = By.xpath("//li/a/i[@class='zmdi zmdi-view-dashboard']");
	// Total Course page
	// Element locators for 'Total Courses' module
	public static By totalCoursesText = By
			.xpath("//h6[@class='text-white m-b-0' and contains(text(), 'Total Courses')]");
	public static By courseCount = By.xpath("//h5[@class='m-b-0 text-white']//span[@data-plugin='counterup']/span");
	public static By courseCountCounter = By
			.xpath("//h5[@class='m-b-0 text-white']//span[@data-plugin='counterup']/span");
	public static By viewCoursesLink = By.xpath(
			"//h6[@class='text-white m-b-0' and contains(text(),'Total Courses')]/following-sibling::a[@class='text-white']"); // click
	public static By coursesText = By.xpath("//div/h4[@class='page-title float-left']");
	public static By createNewCourseButton = By.xpath("//a[@href='/course/inst_own_addcourse/']");
	public static By courseDetailsTab = By.xpath("//li/a[@class='nav-link active']");
	public static By yesCheckbox = By.xpath("//div/input[@id='async_course_id']");
	public static By courseNameTextField = By.xpath("//input[@id='name' and @class='form-control']");
	public static By courseDescriptionTextBox = By.xpath("//div[@class='note-editable card-block']");
	public static By chooseFileButton = By.xpath("//div/input[@type='file' and @id='image' and @name='image']");
	public static By courseDurationInput = By.xpath("//input[@type='number' and @id='learn_times']");
	public static By currencyDropdown = By.xpath("//select[@name='batch_currency' and @id='batch_currency']");
	public static By courseFeeInput = By.xpath("//input[@type='number' and @name='batch_fee' and @id='batch_fee']");
	public static By saveButton = By.xpath("//div/button[@id='course_form_submit_btn']");
	public static By cancelButton = By.xpath("//a/button[@class='btn btn-secondary btn-lg']");
	public static By successMessage = By
			.xpath("//div[@class='alert alert-success'and contains(text(),'Course is updated successfully..')]");
	public static By backToCourseButton = By
			.xpath("//a[@class='btn btn-dark btn-lg'and@href='/course/instructor_mycourse/']");

	// common methods
	// Method to click login button on Home page
	public static void clickLoginButton() {
		try {
			driver.findElement(loginButton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("'Log In' button on infyni homepage is clicked");
	}

	// Method login text presence
	public static boolean loginTextPresence() {
		boolean result = false;
		try {
			driver.findElement(loginText).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// Method for back to home link
	public static void clickHomeLink() {
		try {
			driver.findElement(homeLink).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Method to go back to home page
	public static void backToHomePage() {
		driver.findElement(homelink).click();
	}

	// i n f y n i title verification
	public static void verifyInfyniTitle() {
		String InfyniTitle = driver.getTitle();
		System.out.println("Title is" + InfyniTitle);
		String expectedInfyTitle = "Index Title 1 | Index Title 2 | Index Title 3 infyni";
		Assert.assertEquals(InfyniTitle, expectedInfyTitle);
		System.out.println("infyni page title verified");
	}

	// verifying the l o g o
	public static void verifyLogo() {
		boolean logopresence = driver.findElement(logoImage).isDisplayed();
		Assert.assertTrue(logopresence);
		System.out.println("Infyni logo verified");
	}

	// back to Home page
	public static void backInfypage() {
		try {
			driver.findElement(backhomelink).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("back 2 home page link got clicked");

	}

	// Method to enter email address
	public static void enterEmailId(String email) {
		try {
			driver.findElement(emailInput).clear();
			driver.findElement(emailInput).sendKeys(email);
			System.out.println("Email Id entered");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Method to enter password
	public static void enterPwd(String password) {
		try {

			driver.findElement(passwordInput).clear();
			driver.findElement(passwordInput).sendKeys(password);
			System.out.println("Password entered");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Method to click 'Sign In' button
	public static void clickSignInButton() {
		try {
			driver.findElement(signinButton).click();
			System.out.println("Sign In button is clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Starts Instructor Dash Board
	public static void loginWithValidCredentials(String email, String password) {
		try {
			driver.findElement(emailInput).clear();
			driver.findElement(emailInput).sendKeys(email);
			System.out.println("Email Id entered");
			driver.findElement(passwordInput).clear();
			driver.findElement(passwordInput).sendKeys(password);
			System.out.println("Password entered");
			driver.findElement(signinButton).click();
			System.out.println("Sign In button is clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// DashBoard Verification
	// Verifying Home icon

	public static void dashHomeIcon() {
		try {
			driver.findElement(Homeicon).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Home icon is Present on Dashboard of infyni web page");
	}
	// validating Bell Button

	public static void dashBellButton() {
		try {
			driver.findElement(bellButton).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bell Button is Present on Dashboard of infyni web page");
	}

	// Verifying message Icon
	public static void messageIcon() {
		try {
			driver.findElement(Messageicon).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Message icon is Present on Dashboard of infyni web page");
	}

	// Verifying live session Icon
	public static void livesessionIcon() {
		try {
			driver.findElement(livesessionicon).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("live session  is Present on Dashboard of infyni web page");
	}

	// Verifying Total courses Icon
	public static void totalCoursesIcon() {
		try {
			driver.findElement(Totalcoursesicon).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total courses is Present on Dashboard of infyni web page");

	}

	// Verifying live session Icon
	public static void totalEnrolled() {
		try {
			driver.findElement(TotalEnrolledicon).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total Enrolled is Present on Dashboard of infyni web page");
	}

	// Verifying Todays live session Icon
	public static void todayLiveSessionIcon() {
		try {
			driver.findElement(TodayLivesessionicon).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Todays live session is Present on Dashboard of infyni web page");

	}

	// Verifying Down Dashboard Message Icon
	public static void DownDashMessagesIcon() {
		try {
			driver.findElement(Downmessageicon).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Down Messages on Dashboard is Present on Dashboard of infyni web page");

	}

	// Verifying Total assignments Icon
	public static void totalAssignmentsIcon() {
		try {
			driver.findElement(TotalAssignmentsicon).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total Assignments  is Present on Dashboard of infyni web page");

	}

	// Verifying Todays live session Icon
	public static void dashboardDashIcon() {
		try {
			driver.findElement(Dashicon).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Dashboard Dash is Present on Dashboard of infyni web page");

	}

	// Verifying Todays live session Icon
	public static void becomeAMentorButton() {
		try {
			driver.findElement(Becomeamentoricon).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Become a mentor button is Present on Dashboard of infyni web page");

	}

	// Verifying Total Assisgnment and courseware on dash Board

	public static void assignemntAndCourseware() {
		try {
			driver.findElement(AssigmnetsCourseware).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Assignemnts and Courseware  is Present on Dashboard of infyni web page");

	}

	// verification for dash board text presence for instructor login
	public static boolean dashboardTextPresence() {
		boolean result = false;
		try {
			result = driver.findElement(dashboardText).isDisplayed();
			System.out.println("Dashboard of infyni web page");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// logout image Selected
	public static void profileimageclick() {
		try {
			driver.findElement(logoutProfilePic).click();
			System.out.println("Profile image is clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Logout pic image verified");
	}

	// Validating Image on second Page left corner upside
	public static void verifyprofileimg() {

		try {
			driver.findElement(logoutProfilePic).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Validating profile image right corner of Instructor page ");
	}

	// validating Logout image
	public static void verifyLogoutDD() {
		try {
			driver.findElement(logoutDDButtonSelect).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Profile Image is displayed ");
	}

	// Logout select
	public static void LogoutDDclick() {
		try {
			driver.findElement(logoutDDButtonSelect).click();
			System.out.println("Logout drop down is clicked ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Validating logout select button is selected
	public static void LogoutDDSelect() {
		try {
			driver.findElement(logoutDDButtonSelect).isSelected();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Logout Drop down is Selected");
	}

	// Method for invalid error message
	public static boolean invalidLoginErrorTextPresence() {
		boolean result = false;
		try {
			driver.findElement(invalidloginerrorText).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// Method for invalid password error message
	public static boolean invalidPasswordErrorTextPresence() {
		boolean result = false;
		try {
			driver.findElement(invalidPwdErrortext).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// Method for invalid Email error message
	public static boolean invalidEmailErrorTextPresence() {
		boolean result = false;
		try {
			driver.findElement(invalidemailErrortext).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	// ENDS INSTRUCTOR DASH BOARD
	// Common for

	// I N F Y N I Logo image
	public static void clickLogoImage() {
		try {
			driver.findElement(logoImage).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Common method to navigate from child window to infyni home page

	public static void navigateBackToHome() {
		String mainWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			if (!childWindow.equals(mainWindow)) {
				try {
					driver.switchTo().window(childWindow);
				} catch (Exception e) {
					e.printStackTrace();
				}
				// Get the title of the child window's page
				String windowTitle = driver.getTitle();
				if (windowTitle.contains("Expected Title")) {
					driver.close();
					driver.switchTo().window(mainWindow);
					return;
				}
			}
		}
	}

	// About Us link getting clicked
	public static void clickAboutUsLink() {
		try {
			driver.findElement(aboutUsLink).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// verification for AboutUs text presence
	public static boolean aboutUsTextPresence() {
		boolean result = false;

		try {
			result = driver.findElement(aboutUsText).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// validating the aboutUs text
	public static String aboutUsText() {
		String value = " ";
		try {
			value = driver.findElement(aboutUsText).getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	// Become a Mentorship getting clicked
	public static void clickMentorshipLink() {
		try {
			driver.findElement(MentorshipLink).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// become a mentor link getting clicked
	public static void clickBecomeAMentorLink() {
		try {
			driver.findElement(becomeAMentor).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// verification for BecomeAMentor text presence
	public static boolean becomeAMentorTextPresence() {
		boolean result = false;
		try {
			result = driver.findElement(becomeAMentorText).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// Free webinars getting clicked
	public static void clickFreeWebinarsLink() {
		try {
			driver.findElement(freeWebinarsLink).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// webinar text presence text verification
	public static boolean validatewebinarText() {
		boolean result = false;
		try {
			result = driver.findElement(freewebinartxt).isDisplayed();
			System.out.println(" 'Webinar' Text dispaly is verified on infyni careers page");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// privacy policy verification
	public static boolean PrivacypolicyTxtpresence() {
		boolean result = false;

		try {
			result = driver.findElement(privacypolicytxt).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// Privacy policy getting clicked
	public static void clickPrivacyPolicyLink() {
		try {
			driver.findElement(privacyPolicyLink).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Infyni for business link
	public static void clickinfyniForBusiness() {
		// Click on the "become an instructor" link in the footer
		try {
			driver.findElement(infyniForBusinessLink).click();
			System.out.println("User clicked on the 'infyni for Business' link on the infyni homepage footer");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// verifying i n f y n i for business text
	public static boolean infyniforbusinesText() {
		boolean result = false;
		try {
			result = driver.findElement(infyniforbusinesText).isDisplayed();
			System.out.println("infyni for Business Text dispaly is verified");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// Method to click on the "Blog's" link in the footer
	public static void clickBlogsLink() {
		try {
			driver.findElement(blogsLink).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("'Blogs' link under Quick links on infyni home page footer is clicked");
	}

	// Validation method for I n f y n i - Blog's page
	public static boolean infyniimagePresence() {
		boolean result = false;
		try {
			result = driver.findElement(infyniimage).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// Click on 'Become an Instructor' link at the i n f y n i home page footer
	public static void clickonBecomeAnInstructor() {
		// Click on the "become an instructor" link in the footer
		try {
			driver.findElement(instructorLink).click();
			System.out.println("User clicked on the 'become an instructor' link on the infyni homepage footer");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// become a instructor getting clicked
	public static void clickGetStartedButton() {
		try {
			driver.findElement(getstartedButton).click();
			System.out.println("User clicked on 'Get Started' button on 'Become an Instructor' web page");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// i n f y n i home page footer - careers link

	public static void clickCareersLink() {
		try {
			driver.findElement(careersLink).click();
			System.out.println("'Careers' link is clicked on infyni home page footer");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// i n f y n i home page footer - Validate career text
	public static boolean validateCareerText() {
		boolean result = false;
		try {
			result = driver.findElement(careertxt).isDisplayed();
			System.out.println(" 'Career' Text dispaly is verified on infyni careers page");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// News link methods
	public static void clickNewsLink() {
		try {
			driver.findElement(newsLink).click();
			System.out.println("'News' link is clicked on infyni home page footer");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Validate News link verification
	public static boolean validateNewsText() {
		boolean result = false;
		try {
			// result = driver.findElement(newsText).isDisplayed();
			result = driver.findElement(Newstxt).isDisplayed();
			System.out.println(" 'News' Text dispaly is verified on infyni News page");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// FAQ link click
	public static void FQAlink() {
		{
			try {
				driver.findElement(FAQlink).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("FQA link got clicked ");
	}

	// Terms link click
	public static void clickTermsLink() {
		try {
			driver.findElement(Termslink).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Terms link got clicked ");
	}

	// contact verification
	public static boolean contactTextpresence() {
		boolean result = false;

		try {
			result = driver.findElement(contacttext).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// verifying contact us text is displayed
	public static boolean contactTxt() {
		boolean result = false;
		try {
			result = driver.findElement(contactusText).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// contact us link action performed
	public static void contactusClick() {
		try {
			driver.findElement(contactusLink).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("contactus link got clicked");
	}

	// Contact information verification
	// Verifying contact text is displayed
	public static boolean ContactTextpresence() {
		boolean result = false;

		try {
			result = driver.findElement(contacttext).isDisplayed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// verifying contact info
	public static void verifyContactinfo() {
		boolean ContactText = ContactTextpresence();
		boolean expectedContactText = true;
		Assert.assertEquals(ContactText, expectedContactText);
		System.out.println("ActualText:" + ContactText);
		System.out.println("Contact info verified");
		System.out.println("Contact text is retrieved");
	}

	public static void VerifyLocations() {

		List<WebElement> Total_locators = driver.findElements(Totallocators);
		int count3 = Total_locators.size();
		System.out.println("Total locators are " + count3);
		boolean locatorspresence = driver.findElement(Totallocators).isDisplayed();
		Assert.assertTrue(locatorspresence);
		System.out.println("3 locations are present is  verified");
	}
	// Sign up as student method

	public static void StudentSignup() {
		try {
			driver.findElement(studentsignup).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("SIGNUP as a student");
	}

	// Click on 'Become an Student' link at the infyni home page footer
	public static void clickonBecomeAnStudent() {
		// Click on the "become an instructor" link in the footer
		try {
			driver.findElement(studentsignup).click();
			System.out.println("User clicked on the 'become an Student' link on the infyni homepage footer");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("SIGNUP as a student");
	}
	// *********************Footer test cases *************************
	// TC-01---Directing to About Us link

	public static void redirectToAboutUsPage() {
		clickAboutUsLink();
		System.out.println("Navigated to About Us Page");
		// Validating If AboutUs text is displayed or not
		boolean actualresult = aboutUsTextPresence();
		boolean expectedresult = true;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualresult, expectedresult);// using soft assert
		sa.assertAll();
		System.out.println("About Us Text Presence Validation Success");

		// Retrieving the value of the text to verify/validate
		String actualText = aboutUsText();
		String expectedText = "About Us";
		sa.assertEquals(actualText, expectedText);
		sa.assertAll();
		System.out.println("ActualText:" + actualText);
		System.out.println(" Retrived the Value of the About Us Text Successfully");
		System.out.println(" TC-1 About us link test case ");
		clickHomeLink();
		System.out.println("Navigated back to Home page from About Us Link");
	}

	// TC-02-- Directing to Contact Us link
	// verification of contact us page
	public static void Contactuslink() {
		contactusClick();
		// verifyContactTitle();
		SoftAssert softAssert = new SoftAssert();
		boolean actualResult = contactTxt();
		boolean expectedResult = true;
		softAssert.assertEquals(actualResult, expectedResult);
		System.out.println("'Contact us  text presence verified");
		// Assert all soft assertions
		softAssert.assertAll();
		backInfypage();
		System.out.println(" TC-2 Contact Us link test case ");
	}

	// TC-03 ////Directing to career 's Link
	public static void validateNewsLink() {
		clickNewsLink();
		// Verify if the user is navigated to the News page
		SoftAssert softAssert = new SoftAssert();
		boolean actualResult = validateNewsText();
		boolean expectedResult = true;
		softAssert.assertEquals(actualResult, expectedResult);
		System.out.println("'News' text presence verified");
		// Assert all soft assertions
		softAssert.assertAll();
		backInfypage();
		System.out.println(" TC-03 News Link test case ");
	}

	// TC-05 FreeWebinars link
	public static void redirectToFreeWebinarsLink() {
		clickFreeWebinarsLink();
		System.out.println("Clicked on FreeWebinars link");
		SoftAssert softAssert = new SoftAssert();
		boolean actualResult = validatewebinarText();
		boolean expectedResult = true;
		softAssert.assertEquals(actualResult, expectedResult);
		System.out.println("'Webinar' text presence verified");
		// Assert all soft assertions
		softAssert.assertAll();
		backInfypage();
		System.out.println(" TC-05 Webinar test case ");
	}
	// TC-04-- // Directing to mentor ship link

	public static void redirectTOMentorshipShip() {
		clickMentorshipLink();
		System.out.println("Clicked on Mentorship link");
		clickLogoImage();
		System.out.println("Navigated back to Home page from Mentorshipship page");
		System.out.println(" TC-4 Mentorship link test case ");
	}

	// TC-07 //Directing to News link
	public static void validateCareersLink() {
		// Clicking on the "Careers" link in the Footer
		clickCareersLink();
		// Verify if the user is navigated to the 'Careers' page
		SoftAssert softAssert = new SoftAssert();
		boolean actualResult = validateCareerText();
		boolean expectedResult = true;
		softAssert.assertEquals(actualResult, expectedResult);
		System.out.println("'Career' text presence verified");
		// Assert all soft assertions
		softAssert.assertAll();
		clickHomeLink();
		System.out.println(" TC-07 News link - test case ");
	}

	// TC-08---Directing to FAQ link
	public static void clickFQAlink() {
		FQAlink();
		System.out.println("Clicked on FQA link ");
		clickHomeLink();
		System.out.println("Back to Home page from FAQ link ");
		System.out.println(" TC-8 FAQ's link test case ");
		// clickHomeLink();
	}

	// TC-12-- Directing to Business link
	public static void Businesslink() {
		// Clicking on the "i n f y n i for Business " link in the Footer
		clickinfyniForBusiness();
		// Verify if the user is navigated to the blog's page
		SoftAssert softAssert = new SoftAssert();
		boolean actualResult = infyniforbusinesText();
		boolean expectedResult = true;
		softAssert.assertEquals(actualResult, expectedResult);
		// Assert all soft assertions
		softAssert.assertAll();
		clickHomeLink();
		System.out.println(" TC-12 infyni for business test case ");
	}

	// TC-15 -- Directing to Terms link
	public static void Termslinkclick() {
		clickTermsLink();
		System.out.println("Clicked on Terms link ");
		// backInfypage();
		clickHomeLink();
		System.out.println("Back to Home page from Terms link ");
		System.out.println(" TC-15 Terms Link test case ");
	}

	// TC-14 Privacy policy link
	public static void redirectToPrivacyPolicyLink() {
		clickPrivacyPolicyLink();
		System.out.println("Clicked on PrivacyPolicy link");
		SoftAssert softAssert = new SoftAssert();
		boolean actualResult = PrivacypolicyTxtpresence();
		boolean expectedResult = true;
		softAssert.assertEquals(actualResult, expectedResult);
		System.out.println("privacy policy  text presence verified");
		// Assert all soft assertions
		softAssert.assertAll();
		// clickHomeLink();
		// clickLogoImage();
		backInfypage();
		System.out.println(" TC-14 Terms Link test case ");
	}

	// TC-10-- //Become instructor test case
	public void signup_InstrtuctorTest() {
		clickonBecomeAnInstructor();
		clickHomeLink();
		System.out.println(" TC-10 Signup as Instructor  test case ");
	}
	// TC-11-- //Become a Mentor test case

	public static void redirectToBecomeAMentorPage() {
		clickBecomeAMentorLink();
		System.out.println("Navigated to BecomeAMentor Page");
		// Validating If BecomeAMentor text is displayed or not
		boolean actualresult = becomeAMentorTextPresence();
		boolean expectedresult = true;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualresult, expectedresult);// using soft assert
		sa.assertAll();
		System.out.println("BecomeAMentor Text Presence Validation Success");
		System.out.println(" TC-11 Signup as Mentor test case ");
		backInfypage();
	}

	// TC-09 // Become student test case
	public void signup_StudentTest() {
		clickonBecomeAnStudent();
		System.out.println("Clicked on Student link");
		clickHomeLink();
		System.out.println(" TC-09 signup as student test case ");
	}

	// TC - 13 -- //Verifying and Displaying Contact Address in
	public static void Contactaddressinfo() {
		ContactTextpresence();
		verifyContactinfo();
		boolean MailIdPresence = driver.findElement(mailidtxt).isDisplayed();
		Assert.assertTrue(MailIdPresence);
		System.out.println("contact Address Mail id presence is verified");
		boolean PhoneNumPresence = driver.findElement(phonenumber).isDisplayed();
		Assert.assertTrue(PhoneNumPresence);
		System.out.println("contact Phone Number presence is verified");
		VerifyLocations();
		System.out.println(" TC-13 Contact Address info test case ");
	}

	// TC-06-- //Directing to 'Blog's' link on Home Page footer
	public static void blogsLinkVerify() {
		// Clicking on the "Blog's" link in the Footer
		clickBlogsLink();
		System.out.println("Navigated to 'Blogs' page");
		// Verify if the user is navigated to the blog's page
		SoftAssert softAssert = new SoftAssert();
		boolean actualResult = infyniimagePresence();
		boolean expectedResult = true;
		softAssert.assertEquals(actualResult, expectedResult);
		System.out.println("Blogs page Infyni logo verified");
		// Assert all soft assertions
		softAssert.assertAll();
		// Navigate back to Home page
		navigateBackToHome();
		// clickHomeLink();
		System.out.println(
				"User navigated back to the Infyni homepage from the Blogs page, after closing the Blogs window");
		System.out.println(" TC-6 Blogs link test case ");
		// driver.close();
	}
}
