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

WebUI.setText(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/input_Username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/input_Password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/a_Leave'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/li_Apply'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/a_My Leave'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/button_oxd-icon-button'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/i_oxd-icon bi-caret-down-fill oxd-select-text-ar'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/div_Leave Type- Select'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/i_oxd-icon bi-caret-down-fill oxd-select-text-ar_1'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/span_US - Vacation'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/button_Search'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/a_Apply'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/p_No Leave Types with Leave Balance'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/h6_Apply Leave'))

WebUI.click(findTestObject('Leave Management/Verify system prevents leave submission when the date fields are left blank/Page_OrangeHRM/p_No Leave Types with Leave Balance'))

