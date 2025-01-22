import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

// Step 1: Validate login functionality
WebUI.callTestCase(findTestCase('ValidateLoginFunctionality/VerifyLoginFunctionality'), [:], FailureHandling.STOP_ON_FAILURE)

// Step 2: Add delay to ensure page stability
WebUI.delay(5)

// Step 3: Click on the "Dashboard Card"
WebUI.click(findTestObject('LandingPagePOM/dashboardCard'))

// Step 4: Switch to the new tab and validate the title
WebDriver driver = DriverFactory.getWebDriver()

// Get all open tabs
ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles())

// Check if a new tab is opened
if (tabs.size() > 1) {
	// Switch to the new tab
	driver.switchTo().window(tabs.get(1))
	
	// Get the title of the new tab
	String newTabTitle = driver.getTitle()
	
	// Validate the title contains "Microsoft Power BI"
	if (newTabTitle.contains('Microsoft Power BI')) { //ABC
		WebUI.comment('Test Passed: The new tab contains "Microsoft Power BI" in the title.')
	} else {
		WebUI.comment('Test Failed: The new tab does not contain "Microsoft Power BI" in the title.')
		WebUI.verifyEqual(false, true, FailureHandling.STOP_ON_FAILURE) // Forcefully fail the test
	}
} else {
	WebUI.comment('Test Failed: No new tab was opened.')
	WebUI.verifyEqual(false, true, FailureHandling.STOP_ON_FAILURE) // Forcefully fail the test
}

// Step 5: Close the browser
WebUI.closeBrowser()
