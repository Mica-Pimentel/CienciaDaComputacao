
import java.util.Scanner;

public class LoginSimples {

    public static void main(String[] args) {
        System.out.println("LOGIN DO SISTEMA"
                + "\nINSIRA SUA CREDENCIAL");
        Scanner in = new Scanner(System.in);

        String userID = in.nextLine();
        System.out.println("INSIRA SUA SENHA");
        String userKey = in.nextLine();
        if (validarCredenciais(userID, userKey)){
            System.out.println("login efetuado com susseço");
        }else{
        System.out.println("usuario ou senha errada");
        }

    }

    public static boolean validarCredenciais(String userID, String userKey) {
        String id = "MicaelPimentel";
        String key = "123456789";
        if (userID.equals(id) && userKey.equals(key)) {
            return true;

        } else {
            return false;
        }

    }

}
