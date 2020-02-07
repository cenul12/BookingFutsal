/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bokingfutsal;

/**
 *
 * @author User
 */
public class Bokingfutsal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        Loading load = new Loading();
        load.setVisible(true);
        try{
            for(int x = 0; x<=100; x++){
                Thread.sleep(20);
                Loading.lblload.setText(Integer.toString(x)+"%");
                Loading.btnload.setValue(x);    
            }
        }catch(Exception e){}
        load.setVisible(false);

        login login = new login();
        login.setVisible(true); 
        
        
        
    }
    
}

