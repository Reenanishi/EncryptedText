package  com.encyrptedtext;

import java.util.Scanner;

public class EncryptedTest {
    public static void main(String[] args) {
        try{

            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter filename ");

            String filename = myObj.nextLine();
            System.out.println("Your filename is : " + filename);

            System.out.println("Enter password or text to encrypt ");

            String originalString = myObj.nextLine();
            System.out.println("Your original string is : " + originalString);

            EncrpytedMain.marshallText(originalString, filename);

            String text = EncrpytedMain.unmarshallText(filename);
            System.out.println("Decrypted string " + text);

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }


}
