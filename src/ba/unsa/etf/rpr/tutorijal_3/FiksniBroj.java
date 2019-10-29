package ba.unsa.etf.rpr.tutorijal_3;

enum Grad {SARAJEVO, TUZLA;}
public class FiksniBroj extends TelefonskiBroj {
    Grad grad = null;
    String broj = new String();
    public String ispisi(int broj) {
        return String.valueOf(broj);
    }
    public int hashCode() {
        return (int) grad.hashCode()*broj.hashCode();
    }
    FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }
}
