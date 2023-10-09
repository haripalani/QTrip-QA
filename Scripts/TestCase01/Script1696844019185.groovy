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

WebUI.click(findTestObject('Object Repository/Login/Page_QTrip/a_Register'))

WebUI.setText(findTestObject('Object Repository/Login/Page_QTrip/input_Register_email'), 'qwerty12@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_QTrip/input_Email address_password'), 'RigbBhfdqOBDK95asqKeHw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_QTrip/input_Type to create account password_confi_8c001e'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Login/Page_QTrip/button_Register Now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_QTrip/h1_Welcome to QTrip'), 0)

WebUI.setText(findTestObject('Object Repository/Login/Page_QTrip/input_Register_email'), 'qwerty1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_QTrip/input_Email address_password_1'), 'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Login/Page_QTrip/button_Login to QTrip'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login/Page_QTrip/div_Logout'))

WebUI.click(findTestObject('Object Repository/Login/Page_QTrip/div_Logout'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Login/Page_QTrip/a_Login Here'))

