import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File userInfo = new File("./data/user_info.txt");
            
            if (userInfo.createNewFile()) {
                WelcomeProtocol.introduction();
            } else {
                System.out.println("Welcome");
            }
        } catch (IOException error) {
            System.out.println("ERR");
            error.printStackTrace();
        }
    }
}
