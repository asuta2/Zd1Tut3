package ba.unsa.etf.rpr;

public class MobilniBroj extends TelefonskiBroj {
    private int mreza;
    private String broj;
    public MobilniBroj(int mobilnaMreza, String broj){
        mreza=mobilnaMreza; this.broj=broj;
    }

    @Override
    public String ispisi() {
        return ("0" + mreza + "/" + broj);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(Integer.toString(mreza) + broj);
    }
}
