import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/input_Username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/input_Password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/a_Leave'))

WebUI.click(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/a_Assign Leave'))

WebUI.setText(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/input_Type for hints'), 
    's')

WebUI.click(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/div_saa aa'))

WebUI.click(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/div_Select'))

WebUI.click(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/div_CAN - Vacation'))

WebUI.click(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/input_yyyy-dd-mm'))

WebUI.click(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/div_21'))

WebUI.click(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/input_yyyy-dd-mm_1'))

WebUI.click(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/div_7'))

WebUI.assertElementVisible(findTestObject('Leave Management/Verify system prevents a leave application where the end date precedes the start date/Page_OrangeHRM/div_To DateTo date should be after from date'), 
    0)

