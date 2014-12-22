package pkgbyte.streams;
import java.io.*;

public class ByteStreams {
   
    public static void main(String[] args){
        FileInputStream input = null;
        FileOutputStream output = null;
        
        
        try {
            input = new FileInputStream("text/inputText.txt");
            output = new FileOutputStream("text/output.txt");
            
            int count;
            
            while ((count=input.read()) != -1) {
                output.write(count);
            }
            System.out.println("Complete, no errors on write.");
        }
        catch (IOException e) {
            e.getMessage();
        }
        //Close Streams after try is done
        //IO statements need to be in a try block, with a catch block.
        finally {
            try {
                if (input !=null) {
                    input.close();
                }
                if (output != null) {
                output.close();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
        
        
    }
    


}
