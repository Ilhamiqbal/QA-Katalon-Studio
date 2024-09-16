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

WebUI.navigateToUrl(GlobalVariable.url_register)

WebUI.setText(findTestObject('Register/input_Full name_fullname'), 'User*Test')

WebUI.setText(findTestObject('Register/input_Email_username'), 'usetest@example,com')

WebUI.setText(findTestObject('Register/input_Phone Number_phone'), '0821222233O')

WebUI.setText(findTestObject('Register/input_Date of Birth_birthdate'), '31082003')

WebUI.setText(findTestObject('Register/input_Create Password_password'), 'admin#123')

WebUI.setText(findTestObject('Register/input_Confirmation Password_confirmPassword'), 'Admin1234')

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Login/MassageError'), 0)

WebUI.click(findTestObject('Register/button_Create account'))

