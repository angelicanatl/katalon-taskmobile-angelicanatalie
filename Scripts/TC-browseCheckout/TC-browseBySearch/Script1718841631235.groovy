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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(GlobalVariable.appFile, false)

Mobile.verifyElementVisible(findTestObject('Obj Spy/header/lbl_headerRecent'), 0)

Mobile.tap(findTestObject('Obj Spy/header/btn_search'), 0)

Mobile.verifyElementVisible(findTestObject('Obj Spy/header/input_searchProduct'), 0)

Mobile.setText(findTestObject('Obj Spy/header/input_searchProduct'), 'humi', 0)

Mobile.verifyElementVisible(findTestObject('Obj Spy/reusable_obj/img_productBrowsed'), 0)

Mobile.tap(findTestObject('Obj Spy/reusable_obj/img_productBrowsed'), 0)

Mobile.verifyElementVisible(findTestObject('Obj Spy/page_product/lbl_productName_humidifier'), 0)

browsedProduct = Mobile.getText(findTestObject('Obj Spy/page_product/lbl_productName_humidifier'), 0)

Mobile.tap(findTestObject('Obj Spy/page_product/btn_addToChart'), 0)

Mobile.setText(findTestObject('Obj Spy/page_product/input_qtyProduct'), '2', 0)

Mobile.tap(findTestObject('Obj Spy/page_product/btn_addQty'), 0)

Mobile.tap(findTestObject('Obj Spy/page_product/btn_chart'), 0)

Mobile.verifyElementVisible(findTestObject('Obj Spy/page_chart/lbl_productAdded_humidifier'), 0)

addedProduct = Mobile.getText(findTestObject('Obj Spy/page_chart/lbl_productAdded_humidifier'), 0)

if(browsedProduct == addedProduct) {
	KeywordUtil.markPassed('Product added to chart successfully.')
} else {
	KeywordUtil.markFailed('Added product to chart unsuccessful.')
}

Mobile.closeApplication()

