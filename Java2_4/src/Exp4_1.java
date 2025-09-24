
public class Exp4_1 {

	public static void main(String[] args) {

		int month = 9;
		
		if(month == 0 || month > 12) {
			System.out.println("不正な月です");
			System.out.println("プログラムを終了します");
			return;
		}
		
		
		
		String season = switch(month){
		case 3,4,5 -> "春";
		case 6,7,8 -> "夏";
		case 9,10,11 -> "秋";
		case 12,1,2 -> "冬";
		default -> "不明";
		};
		
		switch(season) {
		case "春" -> System.out.println("入力された" + month + "月は春です。桜の季節です");
		case "夏" -> System.out.println("入力された" + month + "月は夏です。向日葵の季節です");
		case "秋" -> System.out.println("入力された" + month + "月は秋です。紅葉の季節です");
		case "冬" -> System.out.println("入力された" + month + "月は冬です。椿の季節です");
		};
		
	}

}
