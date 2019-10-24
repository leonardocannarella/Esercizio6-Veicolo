
/**
 * Parcheggio
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 24/10/2019)
 */
public class Parcheggio
{
    private Veicolo park[];
    private int n;
    private String nome;
    
    public Parcheggio(int dim, String nome)
    {
        park = new Veicolo[dim];
        
        setDim(dim);
        setNome(nome);
    }
    
    public void setNome(String s)
    {
        nome=s;
    }
    
    public void setDim(int d)
    {
        n=d;
    }
    
    public String parcheggia(Veicolo v)
    {
        int i;
        for(i=0; i<n; i++)
        {
           if(park[i]==null)
           {
               park[i]=v;
               return "Auto parcheggiata in posizione " + i;
           }
        }
        return "Parcheggio pieno";
    }
    
    public String parcheggia(Veicolo v, int pos)
    {
        if((pos<0)||(pos>n-1))
            return "Posizione inesistente";
        
        if(park[pos]!=null)
            return "Parcheggio già occupato";
        
        park[pos]=v;
        return "Auto parcheggiata in posizione " + pos;
    }
    
    public String esci(int pos)
    {
        if((pos<0)||(pos>n-1))
            return "Posizione inesistente";
        
        if(park[pos]==null)
            return "Parcheggio già vuoto";
        
        park[pos]=null;
        return "Parcheggio "+ pos + " liberato";
    }
}
