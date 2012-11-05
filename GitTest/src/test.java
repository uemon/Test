import java.io.*;

public class test {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub

        String nameAusgabedatei; 
        File ausgabedatei; 
        FileWriter fw; 
        BufferedWriter bw; 

        
          nameAusgabedatei = "testdatei"; 
          ausgabedatei = new File(nameAusgabedatei+".html"); 
          fw = new FileWriter(ausgabedatei); 
          bw = new BufferedWriter(fw); 
          bw.write("<html><h1>Hallo</h1></html>"); 
          bw.close(); 
        
    }
}


