
package model;

import java.util.HashMap;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class A {
    
     public static void main(String[] args) {
        
        
        try {
            
            String filePath = "src//reports//Adyapan.jasper";
            
  
            
            HashMap parameters = new HashMap();

          JREmptyDataSource dataSource = new JREmptyDataSource();

        
        JasperPrint jp = JasperFillManager.fillReport(filePath, parameters,dataSource);
        
        
        JasperViewer.viewReport(jp);
        
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
    }
    
}
