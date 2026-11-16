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

WebUI.switchToWindowTitle('OrangeHRM')

WebUI.setText(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/input_Username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/input_Password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/a_PIM'))

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/button_Add'))

WebUI.assertElementClickable(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/button_Add'), 
    0)

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/button_Add'))

WebUI.assertElementVisible(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/button_Add'), 
    0)

WebUI.click(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/i_oxd-icon bi-plus oxd-button-icon'))

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/h6_Add Employee'))

WebUI.assertElementVisible(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/h6_Add Employee'), 
    0)

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_div'))

WebUI.assertElementVisible(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_div'), 
    0)

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_Employee Full Name'))

WebUI.assertElementVisible(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_Employee Full Name'), 
    0)

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_Employee Full Name_1'))

WebUI.assertElementVisible(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_Employee Full Name_1'), 
    0)

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_Employee Id'))

WebUI.assertElementVisible(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_Employee Id'), 
    0)

WebUI.setText(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/input_oxd-input oxd-input-active'), 
    '12345')

WebUI.setText(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/input_Middle Name'), 
    'Segun')

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/input_Middle Name'))

WebUI.assertElementClickable(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/input_Middle Name'), 
    0)

WebUI.click(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_Add EmployeeAccepts jpg, .png, .gif up to 1M'))

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_Add EmployeeAccepts jpg, .png, .gif up to 1M'))

WebUI.assertElementVisible(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_Add EmployeeAccepts jpg, .png, .gif up to 1M'), 
    0)

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_Employee Full NameEmployee IdCreate Login De'))

WebUI.assertElementVisible(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/div_Employee Full NameEmployee IdCreate Login De'), 
    0)

WebUI.setText(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/input_Last Name'), 
    'Omotosho')

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/input_Last Name'))

WebUI.assertElementVisible(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/input_Last Name'), 
    0)

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/button_Save'))

WebUI.assertElementClickable(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/button_Save'), 
    0)

WebUI.click(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/button_Save'))

WebUI.rightClick(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/span_Required'))

WebUI.assertElementVisible(findTestObject('Employee Management/Missing First name decline in adding staff/Page_OrangeHRM/span_Required'), 
    0)

