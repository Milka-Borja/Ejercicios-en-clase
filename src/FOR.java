import java.util.Scanner;
public class FOR {
    public static void main(String[] args) {
        Scanner h= new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num=h.nextInt();
        for(int i=1;i<=12;i++){
           System.out.println(""+num+""+"*"+i+"="+num*i);

        }
    }
}
