package cz.czechitas.java2webapps.ukol5.entity;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class RegistraceForm {
    @NotBlank (message = "Prosím, zadejte křestní jméno.")
    private String jmeno;
    @NotBlank (message = "Prosím, zadejte příjmení.")
    private String prijmeni;
    @NotNull (message = "Prosím, zadejte datum narození.")
    private LocalDate datumNarozeni;
    @NotNull (message = "Prosím, zaškrtněte pohlaví.")
    private Pohlavi pohlavi;
    @NotNull (message = "Prosím, vyberte datum pobytu.")
    private Turnus turnus;
    @Email (message = "Prosím, vyberte e-mail ve správném formátu.")
    private String emailRodicu;
    @Min(value = 111111111, message = "Zadejte celé telefonní číslo.")
    @Max(value = 999999999, message = "Zadejte celé telefonní číslo bez předčíslí.")
    private Integer telefonRodicu;


    public RegistraceForm() {
    }
    public RegistraceForm(String jmeno, String prijmeni, LocalDate datumNarozeni, Pohlavi pohlavi, Turnus turnus, String emailRodicu, Integer telefonRodicu) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
        this.pohlavi = pohlavi;
        this.turnus = turnus;
        this.emailRodicu = emailRodicu;
        this.telefonRodicu = telefonRodicu;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public Pohlavi getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(Pohlavi pohlavi) {
        this.pohlavi = pohlavi;
    }

    public Turnus getTurnus() {
        return turnus;
    }

    public String getTurnusDate() {
        return turnus.getTitle();
    }

    public void setTurnus(Turnus turnus) {
        this.turnus = turnus;
    }

    public String getEmailRodicu() {
        return emailRodicu;
    }

    public void setEmailRodicu(String emailRodicu) {
        this.emailRodicu = emailRodicu;
    }

    public Integer getTelefonRodicu() {
        return telefonRodicu;
    }

    public void setTelefonRodicu(Integer telefonRodicu) {
        this.telefonRodicu = telefonRodicu;
    }

    public int getVek(){
        Period period = datumNarozeni.until(LocalDate.now());
        return period.getYears();
    }

    public String getFormatovaneDatum() {
        return getDatumNarozeni().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }


}
