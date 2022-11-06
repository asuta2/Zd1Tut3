package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Imenik {
    private HashMap<Integer,String> Book;
    public void dodaj(String ime, TelefonskiBroj broj) {
        Book.put(broj.hashCode(),ime);
    }
    public String dajBroj(String ime){
        String s=null;
        for(HashMap.Entry<Integer, String> temp: Book.entrySet())
        {
            if(temp.getValue().equals(ime))
            {
                s="0"+temp.getKey();
                break;
            }
        }
        return s;
    }
    public String dajIme(TelefonskiBroj broj){
       return Book.get(broj.hashCode());
    }
    public String naSlovo(char s){
        return null;
    }
    public Set<String> izGrada(Grad g){
        return null;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        return null;
    }

}
