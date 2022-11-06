package ba.unsa.etf.rpr;

public enum Grad {
    SARAJEVO("033"),MOSTAR("036"),BIHAĆ("037"),ZENICA("032");

    private final String imena;
    private Grad(String s) {
        imena = s;
    }
    public String imeGrada(){
        return imena;
    }
}
