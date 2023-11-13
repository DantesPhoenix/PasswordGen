package ja;
import java.util.*;

/**
 * Main
 */
public class Main {


    public static void main(String[] args) {
        int passLength = getLength();
        String randomPassword = generatePassword(passLength);
        System.out.print("Your generated password is: " + randomPassword);

    }

    public static int getLength() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter desired length of password:\n" + "(1-5 characters is weak)\n" + "(6-11 characters is mid)\n" + "(12+ characters is strong)");
        int length = sc.nextInt();

        sc.close();

        return length;
        
    }

    public static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+[]{}-/|.,><?#~'@;:";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        
        }

        return password.toString();
    }


}
