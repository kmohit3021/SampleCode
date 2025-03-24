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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.waitForElementPresent(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/h3_We Care About Your Health'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/h3_We Care About Your Health'), 
    'We Care About Your Health')

WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/input_Username_username'), usr)

WebUI.setText(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/input_Password_password'), pwd)

WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/button_Login'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

not_run: WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

not_run: WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/input_Medicaid_programs'))

not_run: WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

not_run: WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/td_26'))

not_run: WebUI.setText(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'Test Demo')

not_run: WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/button_Book Appointment'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
    'Appointment Confirmation')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/p_Please be informed that your appointment _11813a'), 
    'Please be informed that your appointment has been booked as following:')

not_run: WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/a_Go to Homepage'))

not_run: WebUI.closeBrowser()

