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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/input_Username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/input_Password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/button_Login'))

WebUI.rightClick(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/a_Admin'))

WebUI.assertElementVisible(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/a_Admin'), 
    0)

WebUI.rightClick(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/a_Admin'))

WebUI.assertElementClickable(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/a_Admin'), 
    0)

WebUI.click(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/div_Select'))

WebUI.click(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/div_ESS'))

WebUI.setText(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/input_Type for hints'), 
    't')

WebUI.click(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/span_ModifiedName 425 5TlV'))

WebUI.click(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/div_Select_1'))

WebUI.click(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/div_Enabled'))

WebUI.setText(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/input_oxd-input oxd-input-active'), 
    'Apotieri')

WebUI.setEncryptedText(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/input_oxd-input oxd-input-active_1'), 
    'R62QHe85gWDYM18Y6oNarQ==')

WebUI.setEncryptedText(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/input_oxd-input oxd-input-active_2'), 
    'R62QHe85gWDYM18Y6oNarQ==')

WebUI.click(findTestObject('User Management/Verify system prevents creating a duplicate username/Page_OrangeHRM/button_Save'))

