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

WebUI.click(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip/a_Register'))

WebUI.setText(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip/input_Register_email'), 'qwerty22@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip/input_Email address_password'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip/input_Type to create account password_confi_8c001e'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip/button_Register Now'))

WebUI.setText(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip/input_Register_email'), 'qwerty22@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip/input_Email address_password_1'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip/button_Login to QTrip'))

WebUI.setText(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip/input_Welcome to QTrip_autocomplete'), 
    'Paris')

WebUI.click(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip/li_Paris'))

WebUI.click(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip Adventures/img_Party_img-responsive'))

WebUI.setText(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip adventures/input_Name_name'), 'Nika')

WebUI.mouseOver(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip adventures/input_Pick a Date_date'))

WebUI.setText(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip adventures/input__person'), '10')

WebUI.click(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip adventures/button_Reserve'))

WebUI.verifyElementText(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip adventures/div_Greetings Reservation for this adventur_68d46e'), 
    'Greetings! Reservation for this adventure is successful. (Click\n here to view your reservations)')

WebUI.click(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip adventures/a_Reservations'))

WebUI.verifyElementText(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip Adventures/th_35e3e64cc79022ad'), 
    '35e3e64cc79022ad')

WebUI.click(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip Adventures/button_Cancel'))

WebUI.verifyElementText(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip Adventures/div_Oops You have not made any reservations_512246'), 
    'Oops! You have not made any reservations yet! (Click\n here to explore some cities)')

WebUI.click(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip Adventures/div_Logout'))

WebUI.click(findTestObject('Object Repository/Booking N Cancellation Flow/Page_QTrip Adventures/a_Home'))

WebUI.closeBrowser()

