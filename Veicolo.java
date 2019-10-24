
/**
 * Aggiungi qui una descrizione della classe Veicolo
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Veicolo implements IVeicolo
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private String targa;
    private String marca;
    private String modello;
    private int cilindrata;
    private int annoa;
    private int numerop;
    private boolean acceso;

    public Veicolo(String targa,String marca,String modello,int cilindrata,int annoa,int numerop)
    {
      setTarga(targa); 
      setMarca(marca);
      setModello(modello);
      setCilindrata(cilindrata);
      setAnnoa(annoa);
      setNumerop(numerop);    
      spegni();
    }
    
    private void setTarga(String targa)
    {
        this.targa=targa;
    }
    public String getTarga()
    {
        return targa;
    }
    private void setMarca(String marca)
    {
        this.marca=marca;
    }
    public String getMarca()
    {
        return marca;
    }
    private void setModello(String modello)
    {
        this.modello=modello;
    }
    public String getModello()
    {
        return modello;
    } 
    private void setCilindrata(int cilindrata)
    {
        this.cilindrata=cilindrata;
    }
    public int getCilindrata()
    {
        return cilindrata;
    }  
    private void setAnnoa(int annoa)
    {
        this.annoa=annoa;
    }
    public int getAnnoa()
    {
        return annoa;
    } 
    private void setNumerop(int numerop)
    {
        this.numerop =numerop;
    }
    public int getNumerop()
    {
        return numerop;
    }   
    public void accendi()
    {
       acceso=true;
    }
    public void spegni()  
    {
       acceso=false;
    }
    public String isAcceso()
    {
        if(acceso)
            return "acceso";
        else
            return "spento";
    }

    public String toString()
    {
        return"Codice: "+getTarga()+
        "\nTarga: "+getMarca()+
        "\nModello: "+getModello()+
        "\nCilindrata: "+getCilindrata()+
        "\nAnno immatricolazione: "+getAnnoa()+
        "\nNumero posti: "+getNumerop()+
        "\nStato del veicolo: "+isAcceso()+
        "\n";
    }
}
