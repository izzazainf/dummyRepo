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

Mobile.tap(findTestObject('BerandaPage/ijazahLN-icon'), 0)

Mobile.verifyElementExist(findTestObject('IjazahLNPage/Tittle-IjazahLNPage'), 0)

Mobile.tap(findTestObject('IjazahLNPage/Menu-VerifikasiSK'), 0)

Mobile.tap(findTestObject('IjazahLNPage/VerifikasiSK/negaraPT-toTap'), 0)

Mobile.setText(findTestObject('IjazahLNPage/VerifikasiSK/negaraPT-toTxt'), 'Japan', 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('IjazahLNPage/VerifikasiSK/negaraPT-firstChoose-toTap'), 0)

Mobile.tap(findTestObject('IjazahLNPage/VerifikasiSK/PT-toTap'), 0)

Mobile.setText(findTestObject('IjazahLNPage/VerifikasiSK/PT-toTxt'), 'Tohoku University', 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('IjazahLNPage/VerifikasiSK/PT-firstChoose-toTap'), 0)

Mobile.tap(findTestObject('IjazahLNPage/VerifikasiSK/noSK-toTap'), 0)

Mobile.setText(findTestObject('IjazahLNPage/VerifikasiSK/noSK-toTap'), '3629/Belmawa/Kep/IJLN/2021', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('IjazahLNPage/VerifikasiSK/Search-Haruse'), 0)

