/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author tasfi
 */
public class Loading {
    public static void main(String args[])
    {
        Start os=new Start();
        os.setVisible(true);
        Login lo =new Login();
        try{
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(80);
                
                if(i==50)
                {
                    os.dispose();
                    lo.show();
                }
            }
        }catch(Exception e)
        {
            
        }
    }
}
