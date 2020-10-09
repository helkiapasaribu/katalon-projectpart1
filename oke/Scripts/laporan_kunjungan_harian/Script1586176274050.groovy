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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/AksesUlangData'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/kunjungan harian'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/telatbayar'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/laporan_detail_nasabah'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/kontak'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/kontak_keluarga'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/konsumen'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/kosumenterlcakdanalamttidakterlacak'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/kategori_risiko'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/potensikreditmacet_kategori_risiko'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/kasus_LaporanKunjungan'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/masalahkeuanganringan_kasus'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/tindakan_konsumen_kontak'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/diskon_tindakan'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/lanjut_laporan_kunjungan'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/osamount_detail'), 0)

Mobile.setText(findTestObject('Laporan_Kunjungan_Harian/android.widget.EditText0 - Nominal Diskon'), '5000000', 0)

Mobile.scrollToText('Alasan Pengajuan Diskon')

def itemtext = Mobile.getText(findTestObject('Laporan_Kunjungan_Harian/android.widget.TextView0 - Alasan Pengajuan Diskon'), 
    GlobalVariable.G_Timeout)

Mobile.verifyEqual(itemText, 'Alasan Pengajuan Diskon')

Mobile.setText(findTestObject('Laporan_Kunjungan_Harian/alasan_pengajuan_diskon'), 'karena uangnya habis', 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/lanjut_tindakan_diskon'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/lanjutkan_konfirmasi'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/kamera_unggah_dokumen'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/klik_take_picture'), 0)

Mobile.setText(findTestObject('Laporan_Kunjungan_Harian/judul_foto'), 'its up to me', 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/kirim_foto'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/kirim_laporan_unggah_dokumen'), 0)

Mobile.tap(findTestObject('Laporan_Kunjungan_Harian/yakin_konfirmasi_unggah_dokumen'), 0)

