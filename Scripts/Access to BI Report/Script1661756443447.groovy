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

WebUI.navigateToUrl('https://app.dbo.id/login')

WebUI.setText(findTestObject('Object Repository/Page_DBO - login/input_NIK atau Email_NIK (3)'), 'tiara@dbo.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_DBO - login/input_Password_password (3)'), 'duA9yIjR69zosPnYa1F9BQ==')
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_DBO - login/button_Login (3)'))

WebUI.click(findTestObject('Object Repository/Page_DBO - Dashboard/a_Signin (3)'))

WebUI.click(findTestObject('Object Repository/Page_Monitoring System/span_BI Reports (1)'))

WebUI.click(findTestObject('Object Repository/Page_MS - Laporan BI Report/a_All Apps'))

WebUI.click(findTestObject('Object Repository/Page_MS - Laporan BI Report/a_Transaction'))

WebUI.click(findTestObject('Object Repository/Page_MS - Laporan BI Report/a_Penjualan'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_MS - Tableau Report Penjualan/a_Tiara Sukma Ardanti'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_MS - Tableau Report Penjualan/a_Logout'))

WebUI.closeBrowser()

