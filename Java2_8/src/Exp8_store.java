public class Exp8_store { 
    public static void main(String[] args) {  
         
        //  インスタンスの生成① 
    Exp8_food plane = new Exp8_food(); 

 

    // plene への代入 
    plane.name ="ハンバーガー";  
    plane.value = 190; 
    plane.calorie = 259; 

        System.out.println("品名：" + plane.name + " 値段："+ plane.value +   " カロリー：" + plane.calorie);

    //  インスタンスの生成② 
      Exp8_food tsukimi = new Exp8_food(); 


    // tsukimi への代入 
    tsukimi.name ="月見バーガー";  
    tsukimi.value = 440; 
    tsukimi.calorie = 401; 
    System.out.println("品名：" + tsukimi.name + " 値段："+ tsukimi.value +   " カロリー：" + tsukimi.calorie);

    } 
} 