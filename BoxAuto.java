
/**
 * Aggiungi qui una descrizione della classe BoxAuto
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class BoxAuto
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private Veicolo a;
    private Veicolo b;
    private Veicolo c;
    /**
     * Costruttore degli oggetti di classe  BoxAuto
     */
    public BoxAuto()
    {
        a=null;
        b=null;
        c=null;
    }
    public String parcheggia(Veicolo t)
    {
        if(a==null)
        {    
            a=t;
            return "Veicolo parcheggiato nel box 1";
        }
        else if(b==null)
            {
                    b=t;
                    return "Veicolo parcheggiato nel box 2";
            }
             else if(c==null)
                 {
                     c=t;
                     return "Veicolo parcheggiato nel box 3";
                 }
        return "Box pieno";
    }
    public String esci(int n)
    {
        if(n==1)
        {
            a=null;
            return "Veicolo rimosso dal box 1";
        }
        else if(n==2)
        {
            b=null;
            return "Veicolo rimosso dal box 2";
        }
        else if(n==3)
        {
            c=null;
            return "Veicolo rimosso dal box 3";
        }
        return "Veicolo inesistente";
    }
    public String toString()
    {
        String s="";
        if(a==null)
            s=s+"box 1 vuoto\n";
        else
            s=s+"box 1 occupato da:\n"+a.toString();
        if(b==null)
            s=s+"box 2 vuoto\n";
        else
            s=s+"box 2 occupato da:\n"+b.toString();
        if(c==null)
            s=s+"box 3 vuoto\n";
        else
            s=s+"box 3 occupato da:\n"+c.toString();
        return s;
        
        
    }
    public String esci(Veicolo v)
    {
        if(a==v)
        {
            a=null;
            return "Veicolo rimosso dal box 1";
        }
        else if(b==v)
        {
            b=null;
            return "Veicolo rimosso dal box 2";
        }
        else if(c==v)
        {
            c=null;
            return "Veicolo rimosso dal box 3";
        }
        return "Veicolo inesistente";
    }

}
