package ba.unsa.etf.rpr;

public class MedunarodniBroj extends TelefonskiBroj
{
    public String getDr() {
        return dr;
    }

    private String dr;

    public String getBr() {
        return br;
    }

    private String br;

    public MedunarodniBroj(String drzava, String broj)
    {
        br=broj; dr=drzava;
    }
    @Override
    public String ispisi() {
        return (getDr() + "/" + getBr());
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(getDr() + getBr());
    }
}
