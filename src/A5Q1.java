
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = input.nextLine();
        String Matten = word;
        
          
        //Replace the first letter of the word with i if it starts with a vowel
        if (Matten.startsWith("a")
                || Matten.startsWith("o")
                || Matten.startsWith("e")
                || Matten.startsWith("u")) {
            Matten = Matten.substring(1);
            Matten = "i" + Matten + "ee";
            System.out.println("In Mattenenglisch " + Matten);
        } else {
//if word doesn't start with a vowel
            while (!word.startsWith("a")
                    && !word.startsWith("e")
                    && !word.startsWith("i")
                    && !word.startsWith("o")
                    && !word.startsWith("u")) {
                

            
                    
                if (!Matten.startsWith("a")
                        || !Matten.startsWith("e")
                        || !Matten.startsWith("o")
                        || !Matten.startsWith("u")
                        || !Matten.startsWith("i")
                        || !Matten.startsWith("y")) {
                    String first = Matten.substring(0, 1);
                    String last = Matten.substring(1);
                    Matten = last + first;
            //Replace it with i
                    if (Matten.startsWith("o")
                            || Matten.startsWith("a")
                            || Matten.startsWith("e")
                            || Matten.startsWith("u")) {
                        String firstLetter = Matten.substring(0, 1);
                        Matten = Matten.replaceFirst(firstLetter, "i");
                        System.out.println("In Matten: " + Matten + "ee");
                        break;
                    }
                } else {
                    String firstLetter = Matten.substring(0, 1);
                    Matten = Matten.replaceFirst(firstLetter, "i");
                    System.out.println("Matten: " + Matten + "ee");
                    break;
                    
                 
                }

            }
        }
    }
}
