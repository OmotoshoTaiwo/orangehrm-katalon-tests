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

WebUI.setText(findTestObject('User Management/Verify an administrator can edit an existing user role or status/Page_OrangeHRM/input_Username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('User Management/Verify an administrator can edit an existing user role or status/Page_OrangeHRM/input_Password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('User Management/Verify an administrator can edit an existing user role or status/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('User Management/Verify an administrator can edit an existing user role or status/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('User Management/Verify an administrator can edit an existing user role or status/Page_OrangeHRM/a_PIM'))

WebUI.assertElementVisible(findTestObject('User Management/Verify an administrator can edit an existing user role or status/Page_OrangeHRM/div_Employee Name233674_1 UmarUsername233674_1Us'), 
    0)

WebUI.assertElementClickable(findTestObject('User Management/Verify an administrator can edit an existing user role or status/Page_OrangeHRM/i_oxd-icon bi-pencil-fill'), 
    0)

WebUI.click(findTestObject('User Management/Verify an administrator can edit an existing user role or status/Page_OrangeHRM/i_oxd-icon bi-pencil-fill'))

WebUI.assertElementVisible(findTestObject('User Management/Verify an administrator can edit an existing user role or status/Page_OrangeHRM/div_Personal DetailsEmployee Full NameEmployee I'), 
    0)

