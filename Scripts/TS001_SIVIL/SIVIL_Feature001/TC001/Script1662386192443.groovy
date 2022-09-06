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

Mobile.startExistingApplication('id.satudikti.app', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Navigation/beranda-nav'), 0)

Mobile.tap(findTestObject('BerandaPage/SIVIL-icon'), 0)

Mobile.verifyElementExist(findTestObject('SIVIL-/tittle-SIVIL-byaccID'), 0)

Mobile.tap(findTestObject('SIVIL-/PergTinggi-toTap'), 0)

Mobile.setText(findTestObject('SIVIL-/PergTinggi-toTxt'), 'universitas indonesia', 0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SIVIL-/PergTinggi-FirstOption-toTap'), 0)

Mobile.tap(findTestObject('SIVIL-/Prodi-toTap'), 0)

Mobile.setText(findTestObject('SIVIL-/Prodi-toTxt'), 'ilmu komputer', 0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SIVIL-/S1 Ilmu Komputer by acc ID'), 0)

Mobile.tap(findTestObject('SIVIL-/Ijazah-toTap'), 0)

Mobile.setText(findTestObject('SIVIL-/Ijazah-toTap'), '0035/S1-Fasilkom/Reg/2/2017', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('SIVIL-/Cari-btn-active'), 0)

