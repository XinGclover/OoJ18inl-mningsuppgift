/*
 *  
Java18-OOJ
 */
package inlamningsuppgift1;

/**
 *
 * @author xingao
 */
public class Orm extends Husdjur implements IFoder{
    
    public Orm(){
        
    }
    public Orm(String namn, int vikt) {
        super(namn, vikt);
    }
    public String foderNamn(){
        return "Ormpellets";
    }
    public int foderGram() {
      return 20;
    }   
}
