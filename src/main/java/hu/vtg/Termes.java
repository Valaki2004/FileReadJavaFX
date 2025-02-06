package hu.vtg;

import java.time.LocalDate;

public class Termes {

    Integer id;
    String Nev;
    String Dulo;
    Integer Mennyiseg;
    LocalDate BetakaritasVege;
    
    public Termes() {}

    public Termes(Integer id, String nev, String dulo, Integer mennyiseg, LocalDate betakaritasVege) {
        this.id = id;
        this.Nev = nev;
        Dulo = dulo;
        Mennyiseg = mennyiseg;
        BetakaritasVege = betakaritasVege;
    }

    public Termes(String nev, String dulo, Integer mennyiseg, LocalDate betakaritasVege) {
        this.Nev = nev;
        Dulo = dulo;
        Mennyiseg = mennyiseg;
        BetakaritasVege = betakaritasVege;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNev() {
        return Nev;
    }

    public void setNev(String nev) {
        this.Nev = nev;
    }

    public String getDulo() {
        return Dulo;
    }

    public void setDulo(String dulo) {
        Dulo = dulo;
    }

    public Integer getMennyiseg() {
        return Mennyiseg;
    }

    public void setMennyiseg(Integer mennyiseg) {
        Mennyiseg = mennyiseg;
    }

    public LocalDate getBetakaritasVege() {
        return BetakaritasVege;
    }

    public void setBetakaritasVege(LocalDate betakaritasVege) {
        BetakaritasVege = betakaritasVege;
    }
}
