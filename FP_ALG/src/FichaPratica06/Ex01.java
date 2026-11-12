package FichaPratica06;
import java.util.Scanner;
import static FichaPratica06.Biblioteca.*;
public class Ex01 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Introduza um animal: ");
            String animal = input.nextLine();

            fazerBarulho(animal);
        }
}
