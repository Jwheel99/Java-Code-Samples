import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Survey12{
    public static void main(String[] args) {

        System.out.println("Welcome to my Survey!");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter Username:");
       
            if (input.hasNext());

                String UserName = input.nextLine();
                UserName ="["+ UserName +"]_survey"+ ".txt";
                File Answers = new File(UserName);
   
        {
            BufferedReader reader;
            Scanner sc = new Scanner(System.in);
            
            try {
                
                reader = new BufferedReader(new FileReader("survey.txt"));
                
                FileWriter output = new FileWriter(Answers); 
              
                
                String line = reader.readLine();
                
                while (line != null) {
                    System.out.println(line);
                    
                    // read next line
                    if (sc.hasNext())

                    output.write(line + "\s" + sc.next() + "\n");
                    else;
                
                
                line = reader.readLine();
                }

                reader.close();
                output.close();
                sc.close();
                input.close();



            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
