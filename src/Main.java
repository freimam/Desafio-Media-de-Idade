import java.util.Scanner; 
public class Main {
   
    public static void main(String [] args) {
		Scanner leitor = new Scanner(System.in); 

		int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();

		int media = (idade1 + idade2 + idade3) / 3; 
        
		if (media >= 0){
			if (media <= 25){
				System.out.println("Jovem! "); 
			}
		}
		if (media >= 26){
			if (media <= 60){
				System.out.println("Adulta! "); 
			}
		}
		if (media > 60){
			System.out.println("Idosa! "); 
			}

}
}