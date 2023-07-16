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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://globalkohler--serviceqa.sandbox.my.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/OR Kohler/Page_Login  Salesforce/input_Username_username'), 'andrew.wishner@katalon.com.servceqa')

WebUI.setEncryptedText(findTestObject('Object Repository/OR Kohler/Page_Login  Salesforce/input_Password_pw'), 'gegYLymlLWgYdHkDOCHg6A==')

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_Login  Salesforce/input_Password_Login'))

WebUI.setText(findTestObject('Object Repository/OR Kohler/Page_Verify Your Identity  Salesforce/input_Verification Code_tc'), 
    '169000')

WebUI.delay(20)

not_run: WebUI.click(findTestObject('Object Repository/OR Kohler/Page_Verify Your Identity  Salesforce/input_Verification Code_save'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_Home  Salesforce/div_App Launcher'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/custom_search'), 
    'Service appointment')

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_Home  Salesforce/b_Service Appointment'))

WebUI.enhancedClick(findTestObject('Object Repository/OR Kohler/Page_Recently Viewed  Service Appointments _7e8fe2/div_New'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment  Salesforce/span_Kohler Mira_slds-radio--faux'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment  Salesforce/span_Next'))

WebUI.setText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/input_Actual Duration (Minutes)_112309a'), 
    '30')

WebUI.setText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/input_Appointment Grade_292309a'), 
    '5')

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/a_Date Picker'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/span_31'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/a_Time Picker'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/li_1100 AM'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/a_--None--'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/a_United States'))

WebUI.setText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/textarea_Street_2762309a'), 
    '156 Michael Ct #4')

WebUI.setText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/input_City_2862255a'), 
    'Anchorage')

WebUI.setText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/input_ZipPostal Code_2972255a'), 
    '99504')

WebUI.setText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/input_Contact Name_5332309a'), 
    'grishma shaha')

WebUI.setText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/input_Contact Phone_6372309a'), 
    '123456789')

WebUI.setText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/input_Contact Email_6572309a'), 
    'grishma.shaha@kohler.com')

WebUI.setText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/input_Crew Leader ID_6732309a'), 
    '12345')

WebUI.setText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/textarea_Description_7042309a'), 
    'Only for testing')

WebUI.verifyElementText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/span_Due Date'), 
    'Due Date')

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/a_Date Picker2'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/span_31'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/span_Earliest Start Permitted'), 
    'Earliest Start Permitted')

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/a_Date Picker3'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/span_18'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/input_Pick an object_18962309a'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/span_New Account'), 
    'New Account')

WebUI.enhancedClick(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/a_None 2'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/a_In Progress'))

WebUI.click(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Kohler/Page_New Service Appointment ASR  Salesforce/li_These required fields must be completed Parent Record'), 
    'These required fields must be completed: Parent Record')

WebUI.closeBrowser()

