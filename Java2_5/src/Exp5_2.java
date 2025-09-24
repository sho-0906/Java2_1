
public class Exp5_2 {

	public static void main(String[] args) {
			
			if(args.length < 3) {
				System.out.println("整数を3つ指定してください");
				System.out.println("プログラムを終了します");
				return;
			}
			

			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int num3 = Integer.parseInt(args[2]);
			
			System.out.println(num1+num2+num3);
			}
		}
