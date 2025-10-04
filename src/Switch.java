import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        String user = "admin123";
        String clav = "admin123";
        Scanner m = new Scanner(System.in);
        System.out.println("Ingrese la opcion que desea: \n1.- Login\n2.-Tabla de multiplicar");
        int opcion = m.nextInt();
        m.nextLine();
        switch(opcion) {
            case 1:
                while (true) {
                    System.out.println("Ingrese el usuario: ");
                    String u = m.nextLine();
                    System.out.println("Ingrese la clave: ");
                    String c = m.nextLine();
                    if (u.equals(user) && c.equals(clav)) {
                        System.out.println("Ingreso exitoso");
                        break;
                    } else {
                        System.out.println("Usuario o contraseña incorrectos, intente de nuevo");
                    }
                }
                break;
            case 2:
                System.out.println("Ingrese un numero: ");
                int num = m.nextInt();
                for (int i = 1; i <= 12; i++) {
                    System.out.println(" " + num + " * " + i + " = " + (num * i));
                }
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
