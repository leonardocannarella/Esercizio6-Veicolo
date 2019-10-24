
/**
 * Test
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0 - 24/10/2019)
 */
public class Test
{
    public static void main (String [] args)
    {
        Veicolo c,d,e;
        BoxAuto b;
        b= new BoxAuto();
        c= new Veicolo("CL 356 KW","Audi","A3",2015,2000,5);
        d= new Veicolo("CL 356 KW","BMW","A3",2018,3000,5);
        e= new Veicolo("CL 356 KW","Fiat","A3",2017,3000,5);
        b.parcheggia(c);
        b.parcheggia(d);
        //System.out.println(c.toString());
        System.out.println(b.toString());
        b.esci(1);
        b.esci(c);
        System.out.println(b.toString());
        
    }
}
