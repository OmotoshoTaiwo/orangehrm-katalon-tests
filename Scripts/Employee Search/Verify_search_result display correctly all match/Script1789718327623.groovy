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

WebUI.setText(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/input_Username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/input_Password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/input_Password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/a_Employee List'))

WebUI.setText(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/input_oxd-input oxd-input-active'), 
    '03')

WebUI.sendKeys(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/input_oxd-input oxd-input-active'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/input_oxd-input oxd-input-active'), 
    '')

WebUI.setText(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/input_Type for hints'), 
    'char')

WebUI.sendKeys(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/input_Type for hints'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/input_Type for hints'), 
    'char')

WebUI.setText(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/input_Type for hints'), 
    'char')

WebUI.sendKeys(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/input_Type for hints'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/input_Type for hints'), 
    'cha')

WebUI.rightClick(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/div_Charles CarterCharlotte Smith'))

WebUI.click(findTestObject('Employee Search/Verify search results display correctly for a partial name match/Page_OrangeHRM/div_Employee InformationEmployee NameEmployee Id'))

