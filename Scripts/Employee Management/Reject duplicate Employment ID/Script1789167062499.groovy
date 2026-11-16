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

WebUI.setText(findTestObject('Duplicate ID decline login/Page_OrangeHRM/input_Username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Duplicate ID decline login/Page_OrangeHRM/input_Password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Duplicate ID decline login/Page_OrangeHRM/button_Login'))

WebUI.assertElementVisible(findTestObject('Duplicate ID decline login/Page_OrangeHRM/div_Time at WorkPunched OutPunched Out_ Mar 29th'), 
    0)

WebUI.assertElementVisible(findTestObject('Duplicate ID decline login/Page_OrangeHRM/a_PIM'), 0)

WebUI.assertElementClickable(findTestObject('Duplicate ID decline login/Page_OrangeHRM/a_PIM'), 0)

WebUI.click(findTestObject('Duplicate ID decline login/Page_OrangeHRM/a_PIM'))

WebUI.assertElementVisible(findTestObject('Duplicate ID decline login/Page_OrangeHRM/div_(107) Records Found'), 0)

WebUI.assertElementClickable(findTestObject('Duplicate ID decline login/Page_OrangeHRM/button_Add'), 0)

WebUI.click(findTestObject('Duplicate ID decline login/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Duplicate ID decline login/Page_OrangeHRM/input_oxd-input oxd-input-active'), '247478')

WebUI.setText(findTestObject('Duplicate ID decline login/Page_OrangeHRM/input_First Name'), 'Teueuw')

WebUI.setText(findTestObject('Duplicate ID decline login/Page_OrangeHRM/input_Middle Name'), 'wieiek')

WebUI.assertElementVisible(findTestObject('Duplicate ID decline login/Page_OrangeHRM/div_Add EmployeeAccepts jpg, .png, .gif up to 1M'), 
    0)

WebUI.setText(findTestObject('Duplicate ID decline login/Page_OrangeHRM/input_Last Name'), 'segun')

WebUI.click(findTestObject('Duplicate ID decline login/Page_OrangeHRM/div_Add EmployeeAccepts jpg, .png, .gif up to 1M'))

WebUI.click(findTestObject('Duplicate ID decline login/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Duplicate ID decline login/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Duplicate ID decline login/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Duplicate ID decline login/Page_OrangeHRM/input_First Name'), 'djdj')

WebUI.setText(findTestObject('Duplicate ID decline login/Page_OrangeHRM/input_Middle Name'), 'skdkd')

WebUI.setText(findTestObject('Duplicate ID decline login/Page_OrangeHRM/input_Last Name'), 'slsl')

WebUI.setText(findTestObject('Duplicate ID decline login/Page_OrangeHRM/input_oxd-input oxd-input-active'), '0295')

WebUI.click(findTestObject('Duplicate ID decline login/Page_OrangeHRM/button_Save'))

WebUI.assertElementVisible(findTestObject('Duplicate ID decline login/Page_OrangeHRM/span_Employee Id already exists'), 
    0)

WebUI.assertElementVisible(findTestObject('Duplicate ID decline login/Page_OrangeHRM/button_Save'), 0)

