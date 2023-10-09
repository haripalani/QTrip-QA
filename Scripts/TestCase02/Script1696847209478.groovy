import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qtripdynamic-qa-frontend.vercel.app/')

WebUI.setText(findTestObject('Object Repository/Search n filters/Page_QTrip/input_Welcome to QTrip_autocomplete'), 'MExico')

WebUI.verifyElementText(findTestObject('Object Repository/Search n filters/Page_QTrip/h5_No City found'), 'No City found')

WebUI.click(findTestObject('Object Repository/Search n filters/Page_QTrip/div_Welcome to QTrip                  Explo_1710b3'))

WebUI.setText(findTestObject('Object Repository/Search n filters/Page_QTrip/input_Welcome to QTrip_autocomplete'), 'Goa')

WebUI.click(findTestObject('Object Repository/Search n filters/Page_QTrip/li_Goa'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Search n filters/Page_QTrip Adventures/select_Filter by Duration (Hours)          _e9e5b7'), 
    '2-6', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Search n filters/Page_QTrip Adventures/div_Party                                  _4761cc'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Search n filters/Page_QTrip Adventures/select_Add Category                Cycling _f2db08'), 
    'Cycling', true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Search n filters/Page_QTrip Adventures/div_Cycling                                _ac5f13'), 
    0)

WebUI.click(findTestObject('Object Repository/Search n filters/Page_QTrip Adventures/div_Clear'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Search n filters/Page_QTrip Adventures/div_Explore all adventures                 _eb8233'), 
    0)

WebUI.closeBrowser()

