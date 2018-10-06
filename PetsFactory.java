/*
 *  
Java18-OOJ
 */
package inlamningsuppgift1;

/**
 *
 * @author xingao
 */
public class PetsFactory {

    
    public Husdjur getInstans(String klassnamn){
      Husdjur d;
      d = new Husdjur();
      if("Hund".equals(klassnamn))
          d=new Hund();
      if("Katt".equals(klassnamn))
          d=new Katt();
      if("Orm".equals(klassnamn))
          d=new Orm();
      return d;
  }  
  
}
