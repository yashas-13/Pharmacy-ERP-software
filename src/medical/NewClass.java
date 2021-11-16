/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author jbj
 */
public class NewClass {
   public static String p_name,brand,bill_no,date,m1;
   public static long oq,s_id,total;
   public static javax.swing.JPanel jp1;
   
 
   public void get_panel(javax.swing.JPanel j)
   {
       jp1=j;
   }
   public javax.swing.JPanel set_panel()
   {
       return jp1;
   }
  public void get_p_name(String str)
  {
      p_name=str;
  }
  public String set_p_name()
  {
      return p_name;
  }
public void get_brand(String str)
  {
      brand=str;
  }
  public String set_brand()
  {
      return brand;
  }
 public void get_oq(long str)
  {
      oq=str;
  }
  public long set_oq()
  {
      return oq;
  }
  public void get_s_id(long str)
  {
      s_id=str;
  }
  public long set_s_id()
  {
      return s_id;
  }
  public void get_bill_no(String str)
  {
      bill_no=str;
  }
  public String set_bill_no()
  {
      return bill_no;
  }
  public void get_date(String str)
  {
      date=str;
  }
  public String set_date()
  {
      return date;
  }
  public void get_total(long str)
  {
      total=str;
  }
  public long set_total()
  {
      return total;
  }
  /*public void qq()
  {
      order_internal o=new order_internal();
o.setVisible(true);
  }*/
 /* public int mdi(javax.swing.JMenuItem m)
  {
     m1=m.getName();
      
     return 0;
  }
   public String mdi1()
   {
       return m1;
   }
    */
}
