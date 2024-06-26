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

Mobile.startApplication(GlobalVariable.appFile, false)

Mobile.waitForElementPresent(findTestObject('Obj Spy/header/lbl_headerRecent'), 0)

Mobile.verifyElementVisible(findTestObject('Obj Spy/header/lbl_headerRecent'), 0)

Mobile.tap(findTestObject('Obj Spy/footer/btn_profile'), 0)

Mobile.waitForElementPresent(findTestObject('Obj Spy/page_profile/lbl_profile'), 0)

Mobile.verifyElementVisible(findTestObject('Obj Spy/page_profile/lbl_profile'), 0)

Mobile.tap(findTestObject('Obj Spy/page_profile/btn_orderHistory'), 0)

Mobile.verifyElementVisible(findTestObject('Obj Spy/page_orderHistory/lbl_orderId'), 0)

Mobile.verifyElementVisible(findTestObject('Obj Spy/page_orderHistory/lbl_orderDate'), 0)

Mobile.tap(findTestObject('Obj Spy/reusable_obj/btn_clear'), 0)

Mobile.verifyElementVisible(findTestObject('Obj Spy/reusable_obj/lbl_confirmation'), 0)

Mobile.tap(findTestObject('Obj Spy/reusable_obj/btn_confirmYes'), 0)

Mobile.verifyElementVisible(findTestObject('Obj Spy/page_orderHistory/lbl_emptyOrderHistory'), 0)

Mobile.closeApplication()

