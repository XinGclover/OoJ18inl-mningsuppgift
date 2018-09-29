/*
 *  
Java-utveckling18
 */

package sidan136;

import javax.swing.*;

public class Sidan136 {

  
    public static void main(String[] arg) {
      String t = JOptionPane.showInputDialog("Ett tal?");
      boolean ok= true;
      for(int i=0;i<t.length();i++)
          if (t.charAt(i)<'a'||t.charAt(i)>'z'){
              ok = false;
              break;
          }
        if (ok)
            JOptionPane.showMessageDialog(null,"Talet ar OK");
        else
            JOptionPane.showMessageDialog(null, "Inget tal");
    }

}
