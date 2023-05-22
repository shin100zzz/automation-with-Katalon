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
//import org.apache.commons.lang.RandomStringUtils as Random
import java.sql.Timestamp as Timestamp
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://partners.shopify.com/1414033/stores')

WebUI.setText(findTestObject('Shopify Partners/auth_input_Email_accountemail'), 'nghia.nguyen@apps-cyclone.com')

WebUI.delay(5)

WebUI.click(findTestObject('Shopify Partners/auth_button_Continue with Email'))

WebUI.setEncryptedText(findTestObject('Shopify Partners/auth_input_Password_accountpassword'), 'AhE64sQdssMc8BVwQITPe59KP/N0lY/W')

WebUI.delay(5)

WebUI.click(findTestObject('Shopify Partners/auth_button_Log in_accountandpassword'))

WebUI.click(findTestObject('Shopify Partners/button_Add store'))

WebUI.click(findTestObject('Shopify Partners/Create development store'))

WebUI.click(findTestObject('Shopify Partners/creating_radio_Create a store to test and build'))

Timestamp timestamp = new Timestamp(System.currentTimeMillis())

getCurrentTimeStamp = timestamp.getTime()

//getRandomNumber = Random.randomNumeric(10)
WebUI.setText(findTestObject('Shopify Partners/creating_input_Store Name'), 'fresh install ' + getCurrentTimeStamp)

WebUI.delay(5)

WebUI.click(findTestObject('Shopify Partners/creating_button_Create development store'))

WebUI.delay(20)

WebUI.click(findTestObject('Shopify Partners/setup_button_Skip'))

WebUI.setText(findTestObject('Shopify Partners/setup_input_Address'), 'Test')

WebUI.setText(findTestObject('Shopify Partners/setup_input_Postal code_account'), '700000')

WebUI.setText(findTestObject('Shopify Partners/setup_input_Phone'), '0396757814')

WebUI.click(findTestObject('Shopify Partners/setup_Enter my store'))

WebUI.delay(15)

WebUI.navigateToUrl('https://admin.shopify.com/store/fresh-install-' + getCurrentTimeStamp)

WebUI.delay(5)

WebUI.click(findTestObject('Shopify Logged In/button_Add apps from menu bar'))

WebUI.click(findTestObject('Shopify Logged In/Link to Shopify App Store'))

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.navigateToUrl('https://apps.shopify.com/pricing-by-quantity?search_id=1f263879-277a-43ab-b6bb-63eff5a0a37e&surface_detail=quantity+breaks&surface_inter_position=1&surface_intra_position=10&surface_type=search')

WebUI.click(findTestObject('Shopify Partners/button_Add app from shopify app store'))

WebUI.click(findTestObject('Shopify Logged In/button_Install app from shopify'))

WebUI.delay(5)

WebUI.click(findTestObject('Shopify Logged In/button_Approve from shopify'))

WebUI.delay(5)

// Verify app installed successfully

WebUI.click(findTestObject('Shopify Logged In/a_App Name of QB'))

WebUI.delay(15)

Actual_Url = WebUI.getUrl()

Expected_Url = (('https://fresh-install-' + getCurrentTimeStamp) + '.myshopify.com/admin/apps/pricing-by-quantity/admin/tier/tour-guide')

WebUI.verifyMatch(Actual_Url, Expected_Url, false)

WebUI.click(findTestObject('Shopify Logged In/button_Apps from menu bar'))

WebUI.click(findTestObject('Shopify Logged In/App and sales channel settings from menu bar'))

WebUI.click(findTestObject('Shopify Logged In/span_Uninstall from apps and sales channel settings page for QB'))

WebUI.click(findTestObject('Shopify Logged In/button_Uninstall from apps and sales channel settings page'))

WebUI.delay(5)

WebUI.navigateToUrl('https://apps.shopify.com/pricing-by-quantity?search_id=1f263879-277a-43ab-b6bb-63eff5a0a37e&surface_detail=quantity+breaks&surface_inter_position=1&surface_intra_position=10&surface_type=search')
WebUI.delay(5)
WebUI.refresh()

WebUI.click(findTestObject('Shopify Partners/button_Add app from shopify app store'))

WebUI.click(findTestObject('Shopify Logged In/button_Install app from shopify'))

WebUI.delay(5)

WebUI.click(findTestObject('Shopify Logged In/button_Approve from shopify'))

WebUI.delay(5)

// Verify app re-installed successfully
WebUI.click(findTestObject('Shopify Logged In/a_App Name of QB'))

WebUI.delay(15)

Actual_Url = WebUI.getUrl()

Expected_Url = (('https://fresh-install-' + getCurrentTimeStamp) + '.myshopify.com/admin/apps/pricing-by-quantity/admin/tier/tour-guide')

WebUI.verifyMatch(Actual_Url, Expected_Url, false)

