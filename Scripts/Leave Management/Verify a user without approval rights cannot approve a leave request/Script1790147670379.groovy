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

WebUI.setText(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/input_Username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/input_Password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/button_Login'))

WebUI.setText(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/input_Username'), 
    'abcdef')

WebUI.setEncryptedText(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/input_Password'), 
    'R62QHe85gWDYM18Y6oNarQ==')

WebUI.click(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/a_Leave'))

WebUI.click(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/div_My Leave List'))

WebUI.click(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/button_oxd-icon-button'))

WebUI.click(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/button_Search'))

WebUI.click(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/input_yyyy-dd-mm'))

WebUI.click(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/i_oxd-icon bi-caret-down-fill oxd-select-text-ar'))

WebUI.click(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/div_To Date'))

WebUI.click(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/i_oxd-icon bi-x -clear'))

WebUI.click(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/i_oxd-icon bi-caret-down-fill oxd-select-text-ar'))

WebUI.assertElementVisible(findTestObject('Leave Management/Unauthorised user cannot approve_reject leave/Page_OrangeHRM/div_Show Leave with StatusSelectCancelled Pendin'), 
    0)

