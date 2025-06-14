package curriculum_A;

public class Qes1 {

	public static void main(String[] args) {
		//Qes1-1
		    byte byteNum=0;//変数の初期値を0に設定
		short shortNum=0;//変数の初期値を0に設定
		int intNum=0;//変数の初期値を0に設定
		long longNum=0;//変数の初期値を0に設定
		float floatNum=0.0f;//変数の初期値を0.0fに設定
		double doubleNum=0.0;//変数の初期値を0.0に設定
		char charletter='A';//変数の初期値をAに設定
		String Stringletters="Hello world";//変数の初期値をHello worldに設定
		boolean isBoolean=false;//変数の初期値をfalseに設定
		
		//1-2
		    byteNum=10;//変数を10に更新		    
		shortNum=100;//変数を100に更新		
		intNum=1000;//変数を1000に更新		
		longNum=10000;//変数を10000に更新
		floatNum=9.5f;//変数を9.5fに更新
		doubleNum=10.5;//変数を10.5に更新
		charletter='a';//変数をaに更新
		Stringletters="ハロー";//変数を"ハロー"に更新
		isBoolean=true;//変数を"true"に更新
		
		//1-3
	        System.out.println(intNum=11110);//コンソールに11110と出力
		System.out.println(intNum=20);//コンソールに11110と出力
		System.out.println(Stringletters="a ハロー true");//コンソールに11110と出力
		System.out.println(intNum=1+1+1+3+0);//コンソールに11130の数字を全てをたして出力
		System.out.println(1*10);//コンソールに1E+10の小数点以外の数字を全てをかけて出力
		System.out.println(10.5/100);//コンソールに10割る100をして出力
		System.out.println(10-100);//コンソールに10引く100をして出力
		
		System.out.println();//改行
		
		//1-4
		    String StringName="unknown";//変数の初期値を"unknown"に設定
		  StringName="山田太郎";//変数を"山田太郎"に更新
		System.out.println("こんにちは、"+StringName+"さん!");//コンソールに"こんにちは、山田太郎さん!"と出力
		
		System.out.println();//改行
		
		//1-5
		    int intAge=0;//変数の初期値を0に設定
		  intAge=25;//変数の初期値を25に更新
		System.out.println("年齢："+intAge+"歳");//コンソールに"年齢:25歳"と出力
		
		System.out.println();//改行
		
		//1-6
		  int  intNum1=0;//変数の初期値を0に設定
		  int  intNum2=1;//変数の初期値を1に設定
	    
	    intNum1=10;//変数を10に更新
	    intNum2=5;//変数を5に更新
	    
	      int  intSum=(intNum1+intNum2);//"intNum1"と"intNum2"をたしたものを"intSum"とする
	
	    System.out.println(intSum);//コンソールにintSumを出力
	    
	    System.out.println();
	    
	    //1-7
	        int intScore=0;//変数の初期値を0に設定
	       intScore=80;	//変数に80を代入
	      intScore=80+20;//変数80に20を追加
	   System.out.println(intScore); //コンソールに"intScore"を出力
	   
	   System.out.println();//改行
	   
	   //1-8
	       double doublePrice=0.0;//変数の初期値を0に設定
	     doublePrice=99.99;//変数を99.99に更新
	    int intPrice=(int)doublePrice;//明示的なキャスト
	   System.out.println(intPrice);//コンソールに変換した"intPrice"を出力
	   
	   System.out.println();//改行
	   
	   //1-9
	       String StringNumStr="000";//変数の初期値を"000"に設定
	      StringNumStr="123";//変数を"123"に更新
	     int intNumstr=Integer.parseInt(StringNumStr);//StringNumStr"123"をintNumstr(123)に変換
	   System.out.println(intNumstr);//コンソールに変換値"intNumstr"を出力
	   
	   System.out.println(intNumstr+10);//コンソールに変換値"intNumstr"に10をたし出力
	   
	   System.out.println();//改行
	   
	   //1-10
	       int intnum=0;//変数の初期値を0に設定
	      intnum=50;//変数を50に更新
	     String intStr=String.valueOf(intnum);//int型からStr型に変換
	    System.out.println(intStr);//コンソールにintnumを出力
	    System.out.println("得点:"+intStr+"点");//コンソールに"得点:50点"と出力
	    
	    System.out.println();//改行
	    
	    //1-11
	        int a=0;//変数の初期値を0に設定
	        int b=1;//変数の初期値を1に設定
	       a=10;//変数を10に更新
	       b=20;//変数を20に更新
	      boolean result=a<b?true:false;//aよりbが小さいかどうかを"boolean result"に代入
	    System.out.println("a<bの結果:"+result);//コンソールに結果を出力
	    
	    System.out.println();//	改行
	    
	    //1-12
	        int x=0;//変数の初期値を0に設定
	       x=15;//変数を15に更新
	      boolean res=x>10?true:false;//xの値が10より大きければtrue、小さければfalseとする
	     String letters=res?"OK":"NG";//trueの場合は"OK"falseの場合は"NG"とする
	    System.out.println(letters);//コンソールに結果を出力
	    
	    System.out.println();//改行
	    
	    //1-13
	    String text="私はJavaが好きです。Javaは楽しい!";//元の文章を設定
	    text=text.replace("Java","Python");//JavaをPythonに置き換える
	    System.out.println(text);//コンソールに置き換えたtextを出力
	    
	    
	    	
	    
	   
	   
	   
		
		

	}

}
