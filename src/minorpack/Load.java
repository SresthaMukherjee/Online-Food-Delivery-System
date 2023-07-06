/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minorpack;

/**
 *
 * @author Manager
 */
public class Load {
  
    public static void main(String[]args){
     Loading l = new Loading();
     l.setVisible(true);
     Navigator n = new Navigator();
     n.setVisible(false);
     
     try{
         for(int x=0;x<=100;x++)
         {
             Thread.sleep(110);
             l.lLoad.setText(Integer.toString(x)+"%");
             l.pbLoad.setValue(x);
             
             if(x==100)
             {
                 l.setVisible(false);
                 n.setVisible(true);
             }
         }
     }catch(Exception e){
         
     }
    }
}
