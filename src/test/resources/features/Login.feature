@login_alani
Feature: Login_test
  Background:
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris yap veya uye ol butonun gorunurlugunu dogrular

    @Tc01
    Scenario: login_alani_butonlar_gorunur_olmali
      And kullanici giris yap veya uye ol butonun uzerine gelir
      And kullanici giris yap linke tiklar
      And kullanici uye giris sayfasinin acildigini dogrular

      @TC02
    Scenario: login_alani_butonlar_tiklanir_ve_doldurulabilir_olmali
      #And kullanici giris yap veya uye ol butonun uzerine gelir
      #And kullanici giris yap linke tiklar
