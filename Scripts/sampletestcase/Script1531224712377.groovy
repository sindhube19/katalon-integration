import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.salesforce.com/')

WebUI.setText(findTestObject('Page_Login  Salesforce (1)/input_username'), 'sindhuja.e@mstsolutions.com')

WebUI.setText(findTestObject('Page_Login  Salesforce (1)/input_pw'), 'S!ndhuja1219')

WebUI.click(findTestObject('Page_Login  Salesforce (1)/input_Login'))

WebUI.click(findTestObject('Page_Home Page  Salesforce - Develo (1)/a_Accounts'))

WebUI.click(findTestObject('Page_Accounts Home  Salesforce - De/a_Close'))

WebUI.click(findTestObject('Page_Accounts Home  Salesforce - De/input_new'))

WebUI.click(findTestObject('Page_New Account Select Account Rec/input_save'))

WebUI.setText(findTestObject('Page_Account Edit New Account  Sale/input_acc2'), 'test')

WebUI.click(findTestObject('Page_Account Edit New Account  Sale/a_7102018'))

WebUI.setText(findTestObject('Page_Account Edit New Account  Sale/input_00N7F00000CQwRo'), '435')

WebUI.selectOptionByValue(findTestObject('Page_Account Edit New Account  Sale/select_--None--GoldSilverPlati'), 'Gold', 
    true)

WebUI.click(findTestObject('Page_Account Edit New Account  Sale/input_save'))

WebUI.closeBrowser()

