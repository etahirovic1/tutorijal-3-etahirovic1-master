package ba.unsa.etf.rpr.tutorijal_3;

public class MobilniBroj extends TelefonskiBroj {
    int mobilnaMreza = 0;
    String broj = new String();
    public String ispisi(int broj) {
        return String.valueOf(broj);
    }
    public int hashCode() {
        return (int) mobilnaMreza*broj.hashCode();
    }
    MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }
}