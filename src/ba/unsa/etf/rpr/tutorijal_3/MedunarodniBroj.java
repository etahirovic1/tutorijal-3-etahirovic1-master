package ba.unsa.etf.rpr.tutorijal_3;

public class MedunarodniBroj extends TelefonskiBroj {
    String drzava = new String();
    String broj = new String();
    public String ispisi(int broj) {
        return String.valueOf(broj);
    }
    public int hashCode() {
        return (int) drzava.hashCode()*broj.hashCode();
    }
    MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }
}