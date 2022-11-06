package ba.unsa.etf.rpr;

public class FiksniBroj extends TelefonskiBroj{
    private Grad g;
    private String br;
    public FiksniBroj(Grad grad, String broj){
        br=broj;g=grad;
    }

    @Override
    public String ispisi() {
        return (g.imeGrada() + "/" + br );
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(g.imeGrada() + this.br);
    }
}
