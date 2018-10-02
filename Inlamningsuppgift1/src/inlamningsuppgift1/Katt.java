/*
 *  
Java18-OOJ
 */
package inlamningsuppgift1;

/**
 *
 * @author xingao
 */
public class Katt extends Husdjur implements IFoder{
    
    public Katt(){
        
    }
    public Katt(String namn, int vikt) {
        super(namn, vikt);
    }
    public String foderNamn(){
        return "Kattfoder";
    }
    public int foderGram() {
      return super.getVike()/150;
    }   
}
