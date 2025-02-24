 //import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
//import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
//import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling as FailureHandling
//import com.kms.katalon.core.testcase.TestCase as TestCase
//import com.kms.katalon.core.testdata.TestData as TestData
//import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
//import com.kms.katalon.core.testobject.TestObject as TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//import internal.GlobalVariable as GlobalVariable
//import org.openqa.selenium.Keys as Keys
//
//WebUI.callTestCase(findTestCase('ValidateLoginFunctionality/VerifyLoginFunctionality'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('LandingPagePOM/agentCard'))
//
//// Step 3: Get the current URL
//String currentUrl = WebUI.getUrl()
//
//// Step 4: Validate that the URL contains the keyword "operation" and forcefully fail if it does not
//boolean isOperationPresent = currentUrl.contains('agent')
//
//WebUI.verifyEqual(isOperationPresent, true, FailureHandling.STOP_ON_FAILURE)
//
//// Optional: Log success for debugging
//WebUI.comment('Test Passed: The URL contains the keyword "operation".')
//
//// Step 5: Close the browser
//WebUI.closeBrowser()
//
//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import com.kms.katalon.core.annotation.Keyword
//import com.kms.katalon.core.checkpoint.Checkpoint
//import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling
//import com.kms.katalon.core.testcase.TestCase
//import com.kms.katalon.core.testdata.TestData
//import com.kms.katalon.core.testobject.TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import internal.GlobalVariable as GlobalVariable
//
//// Navigate to the landing page
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://your-landing-page-url.com') // Replace with your actual landing page URL
//
//// Click the operation card
//TestObject operationCard = new TestObject('Operation Card')
//operationCard.addProperty('xpath', ConditionType.EQUALS, '//button[@class=\'agent_home\']')
//
//WebUI.click(operationCard)
//
//// Wait for the new screen to load
//WebUI.waitForPageLoad(10)
//
//// Verify that the new screen URL contains "operationhome"
//String currentUrl = WebUI.getUrl()
//String expectedUrlSubstring = 'operationhome'
//
//WebUI.verifyMatch(currentUrl, '.*' + expectedUrlSubstring + '.*', false)
//
//// Close the browser
//WebUI.closeBrowser()
//
//
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

// Call the existing login script
WebUI.callTestCase(findTestCase('ValidateLoginFunctionality/VerifyLoginFunctionality'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/LandingPagePOM/Page_magic health-1.5/button_Operations'))

// Wait for the new screen to load
WebUI.waitForPageLoad(10)

WebUI.delay(5)

WebUI.closeBrowser()

