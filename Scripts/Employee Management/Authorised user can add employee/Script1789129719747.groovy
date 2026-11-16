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

WebUI.setText(findTestObject('Employee Management/Page_OrangeHRM/input_Username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Employee Management/Page_OrangeHRM/input_Password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Employee Management/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Employee Management/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Employee Management/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Employee Management/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Employee Management/Page_OrangeHRM/button_Add_1'))

WebUI.click(findTestObject('Employee Management/Page_OrangeHRM/input_First Name'))

WebUI.setText(findTestObject('Employee Management/Page_OrangeHRM/input_Middle Name'), 'Segun')

WebUI.setText(findTestObject('Employee Management/Page_OrangeHRM/input_Last Name'), 'Omotosho')

WebUI.rightClick(findTestObject('Employee Management/Page_OrangeHRM/div_div -name-grouped-field'))

WebUI.assertElementVisible(findTestObject('Employee Management/Page_OrangeHRM/div_div -name-grouped-field'), 0)

WebUI.rightClick(findTestObject('Employee Management/Page_OrangeHRM/div_Employee Id'))

WebUI.assertElementVisible(findTestObject('Employee Management/Page_OrangeHRM/div_Employee Id'), 0)

WebUI.rightClick(findTestObject('Employee Management/Page_OrangeHRM/div_Employee Id_1'))

WebUI.assertElementVisible(findTestObject('Employee Management/Page_OrangeHRM/div_Employee Id_1'), 0)

WebUI.click(findTestObject('Employee Management/Page_OrangeHRM/button_Save'))

WebUI.rightClick(findTestObject('Employee Management/Page_OrangeHRM/button_Save'))

WebUI.assertElementVisible(findTestObject('Employee Management/Page_OrangeHRM/button_Save'), 0)

WebUI.rightClick(findTestObject('Employee Management/Page_OrangeHRM/button_Save'))

WebUI.assertElementClickable(findTestObject('Employee Management/Page_OrangeHRM/button_Save'), 0)

WebUI.setText(findTestObject('Employee Management/Page_OrangeHRM/input_oxd-input oxd-input-active oxd-input-error'), '12345')

WebUI.rightClick(findTestObject('Employee Management/Page_OrangeHRM/input_oxd-input oxd-input-focus'))

WebUI.assertElementClickable(findTestObject('Employee Management/Page_OrangeHRM/input_oxd-input oxd-input-focus'), 0)

WebUI.click(findTestObject('Employee Management/Page_OrangeHRM/button_Save'))

WebUI.rightClick(findTestObject('Employee Management/Page_OrangeHRM/span_Required'))

WebUI.assertElementVisible(findTestObject('Employee Management/Page_OrangeHRM/span_Required'), 0)

WebUI.click(findTestObject('Employee Management/Page_OrangeHRM/button_Save'))

