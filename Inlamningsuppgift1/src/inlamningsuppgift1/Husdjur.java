/*
 *  
Java18-OOJ
 */
package inlamningsuppgift1;

/**
 *
 * @author xingao
 */
public class Husdjur {
    private String namn;
    private int vikt;
    private String foder;
    private int fodersgram;
     
    public Husdjur(){
        
    }
    public Husdjur(String namn,int vikt){
        this.namn=namn;
        this.vikt=vikt;
       
    }
    
    public String getNamn(){
        return namn;
    }
    
    public int getVike(){
        return vikt;
    }
      
}
