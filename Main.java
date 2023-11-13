package ja;
import java.util.*;
import org.passay.*;

/**
 * Main
 */
public class Main {


    public static void main(String[] args) {
        int passLength = getLength();


    }

    public static int getLength() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter desired length of password: ");
        int length = sc.nextInt();

        return length;
        
    }

    public static  String generatePassword(){
        
    }


}
