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

WebUI.setText(findTestObject('Employee Search/verify a submitted leave request appears correctly in the Leave list/Page_OrangeHRM/input_Username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Employee Search/verify a submitted leave request appears correctly in the Leave list/Page_OrangeHRM/input_Password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Employee Search/verify a submitted leave request appears correctly in the Leave list/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Employee Search/verify a submitted leave request appears correctly in the Leave list/Page_OrangeHRM/a_Leave'))

WebUI.click(findTestObject('Employee Search/verify a submitted leave request appears correctly in the Leave list/Page_OrangeHRM/a_My Leave'))

WebUI.click(findTestObject('Employee Search/verify a submitted leave request appears correctly in the Leave list/Page_OrangeHRM/button_oxd-icon-button'))

WebUI.click(findTestObject('Employee Search/verify a submitted leave request appears correctly in the Leave list/Page_OrangeHRM/a_Leave List'))

WebUI.assertElementVisible(findTestObject('Employee Search/verify a submitted leave request appears correctly in the Leave list/Page_OrangeHRM/div_2026-18-09ig igCAN - Personal18.001.00Pendin'), 
    0)

WebUI.closeBrowser()

