/*
 *  
Java18-OOJ
 */
package inlamningsuppgift1;
import java.util.*;


/**
 *
 * @author xingao
 */
public class Husdjurshotell {
    //Skapa List av olika husdjur i den husdjurhotell
    private List<Hund> hund= new LinkedList<>();
    private List<Katt> katt= new LinkedList<>();
    private List<Orm> orm= new LinkedList<>();
    
    //Lägg till elementer i passande listan
     public void setHusdjurList(Husdjur d){
    //Testa om objekted av superklass tillhör en viss subklass
    //Omvandlar referensen av superklass till referensen av passande subklassen
        if(d instanceof Hund)
            hund.add((Hund) d);
        else if(d instanceof Katt)
            katt.add((Katt) d);
        else if(d instanceof Orm)
            orm.add((Orm) d);
            
     }
    
     //Söka husdjur genom att jämföra namn som läsas av med husdjurs namn
     //inom olika husdjurs listar och returnera information av foder.
     public String sokDjur (String namn){
         for(Hund h:hund)
            if(namn.equalsIgnoreCase(h.getNamn()))
                return h.foderNamn()+" : "+h.foderGram()+" g";
         for(Katt k:katt)
            if(namn.equalsIgnoreCase(k.getNamn()))
                return k.foderNamn()+" : "+k.foderGram()+" g";
         for(Orm o:orm)
            if(namn.equalsIgnoreCase(o.getNamn()))
                return o.foderNamn()+" : "+o.foderGram()+" g";
        
        return "Det finns inte den husdjur! Input igen.";
     }
      
     
}
