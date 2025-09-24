	import java.util.Random;
import java.util.Scanner;
	
public class Exp5_3 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("サイコロを降りますか？");	
		System.out.println("振る(Y)／振らない(N)");
		
		String input = sc.nextLine(); 

		if (input.equals("y")) { 
            int dice = random.nextInt(6) + 1;    // 1～6 の乱数  
            System.out.println("出た目は: " + dice); 
        } else if (input.equals("n")) { 
            System.out.println("ゲームを終了します。"); 
        } else { 
            System.out.println("y  か  n  を入力してください。");  
        } 
		sc.close();
	}
}
