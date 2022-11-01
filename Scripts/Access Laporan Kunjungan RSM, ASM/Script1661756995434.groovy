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

WebUI.setText(findTestObject('Object Repository/Page_DBO - login/input_NIK atau Email_NIK (4)'), 'tiara@dbo.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_DBO - login/input_Password_password (4)'), 'duA9yIjR69zosPnYa1F9BQ==')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_DBO - login/button_Login (4)'))

WebUI.click(findTestObject('Object Repository/Page_DBO - Dashboard/a_Signin (4)'))

WebUI.click(findTestObject('Page_MS - Laporan Kunjungan ASM RSM/Page_Monitoring System/span_Kunjungan RSM, ASM'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MS - Laporan Kunjungan ASM RSM/select_Pilih Tahun                         _25cfb8'), 
    '2022', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MS - Laporan Kunjungan ASM RSM/select_Pilih Bulan                         _05b806'), 
    '07', true)

WebUI.click(findTestObject('Object Repository/Page_MS - Laporan Kunjungan ASM RSM/button_Submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_MS - Laporan Kunjungan ASM RSM/td_1577'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_MS - Laporan Kunjungan ASM RSM/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_MS - Laporan Kunjungan ASM RSM/a_Tiara Sukma Ardanti'))

WebUI.click(findTestObject('Object Repository/Page_MS - Laporan Kunjungan ASM RSM/a_Logout'))

WebUI.delay(5)

WebUI.closeBrowser()

