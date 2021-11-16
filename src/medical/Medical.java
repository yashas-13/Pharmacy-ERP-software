/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jbj
 */
public class Medical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
      
   //new loading().setVisible(true);
   try {
       loading l=new loading();
       login1 l1=new login1();
                   l.setVisible(true);
                  // login1 St=new login1();
                    for(int i=0;i<=100;i++)
        {
           
            Thread.sleep(30);
            l.jLabel3.setText(Integer.toString(i)+"%");
            l.jProgressBar1.setValue(i);
             //JOptionPane.showMessageDialog(null,i);
            if(i==100)
            {
             l.dispose();
             l1.setVisible(true);
            }
            
        }
        //this.dispose();
       
                } catch (InterruptedException ex) {
                    Logger.getLogger(loading.class.getName()).log(Level.SEVERE, null, ex);
                }
    
    }
    
}
