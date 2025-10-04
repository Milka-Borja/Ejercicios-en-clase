import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        String user = "admin123";
        String pass = "admin123";
        Scanner h = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese el usuario: ");
            String a = h.nextLine();
            System.out.println("Ingrese la contraseña: ");
            String b = h.nextLine();
            if (a.equals(user) && b.equals(pass)) {
                System.out.println("Login exitoso");
                break;
            } else {
                System.out.println("Usuario o  contraseña incorrectos");
            }
        }
    }
}
