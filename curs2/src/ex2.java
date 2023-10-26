import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un cuvant: ");
        String string=sc.nextLine();
        System.out.println("Length is: "+string.length()+"\n Uppercase: "+ string.toUpperCase());
        String search="Java";
        if(string.toLowerCase().contains(search.toLowerCase())){
            System.out.print("Da");
        } else {
            System.out.println("Nu");
        }

    }
}
