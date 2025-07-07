package curriculum_B;

public class Qes2 {

	public static void main(String[] args) {
		//2-1
		  int intSco=0;//初期値を0に設定
		 intSco=75;if(intSco>=60);//代数に75を代入し、条件を明示する
		System.out.println("合格です");	//結果を出力
		
		System.out.println();//改行
		
		//2-2
		int intAge=0;//初期値を0に設定
		intAge=25;if(intAge>=20&&intAge<=30) {//代数に25を代入し、条件を明示する
		System.out.println("適正年齢です"); //条件を満たした場合の結果を出力する
		}else{
		
        System.out.println("対象外です");//条件を満さない場合の結果を出力する
        
		}
        System.out.println();{//改行
        
		
        //2-3
        int Ageint=0;//初期値を0に設定
        Ageint=18;if(Ageint>20) {//代数に18を代入し、条件を明示する
        System.out.println("成人です");//条件を満たした場合の結果を出力
        }else {
        	if(Ageint>=13&&Ageint<=19) {//新たな条件を明示する
        System.out.println("ティーンエージャーです");//条件を満たした結果を出力
           }else {
        System.out.println("子供です");//条件を満たした結果を出力
           }
        System.out.println();{//改行
        
        //2-4
        int intX=0;
        int intY=1;
        int intZ=2; 
        /*初期値をそれぞれ
         0、1、2に設定 */
        intX=30;
        intY=15;
        intZ=50;
        /*代数にX、y、zに
         それぞれ30、15、50を代入*/
        
        int max;//最大値を判定
        if(intX>=intY&&intX>=intZ) {
        max=intX;
        }else if(intY>=intX&&intY>=intZ) {
        }else {
        	max=intZ;
        	/*各代数を比較し、判定を行う*/
        	System.out.println("最大値は："+max);//結果を出力
        }
        System.out.println();//改行
        
        //2-5
        int intNum=0;//初期値を0に設定
        if(intNum>0) {//代数が0より大きい場合の条件を提示
        	System.out.println("正の数です");//結果を出力
        }else if(intNum<0) {//代数が0より小さい場合の条件を提示
        	System.out.println("負の数です");//結果を出力
        }else {//それ以外の条件を提示
        	System.out.println("0です");//結果を出力
        }
        System.out.println();//改行
        
        //2-6
        int Numint=0;//初期値を0に設定
        if(Numint%2==0) {//条件を提示
        	System.out.println("偶数です");//結果を出力
        }else {//それ以外の条件を提示
        	System.out.println("奇数です");//結果を出力
        }
        System.out.println();//改行
        
        //2-7
        int intScore=0;//初期値を0に設定
        intScore=75;//代数を75とする
        if(intScore>=90) {
        	System.out.println("優");
        }else if(intScore>=70) {
        	System.out.println("良");
        }else if(intScore>=50) {
        	System.out.println("可");
        }else {
        	System.out.println("不可");
        }/*各条件を
        代数の90、70、50、それ以外とし
        それぞれ、優、良、可、不可となるよう設定し出力*/
        	System.out.println();{//改行
        	
        	//2-8
        	String Strtext=("test");//textと出力
        	if(Strtext.equals("null")||Strtext.equals("")){//条件を提示
        		System.out.println("入力が無効です");//結果を出力
        	}else {//それ以外の条件を提示
        		System.out.println(Strtext);//結果を出力
        		
        		System.out.println();//改行
        		
        	//2-9
        		int intDay=0;//初期値を0に設定
        		intDay=1;//代数に1を代入
        		switch(intDay) {
        		case 1:
        			System.out.println("月曜日");
        			break;
        		case 2:
        			System.out.println("火曜日");
        			break;
        		case 3:
        			System.out.println("水曜日");
        			break;
        		case 4:
        			System.out.println("木曜日");
        			break;
        		case 5:
        			System.out.println("金曜日");
        			break;
        		case 6:
        			System.out.println("土曜日");
        			break;
        		case 7:
        			System.out.println("日曜日");
        			break;
        		}/*場合とそれに応じて結果を出力*/		
        		System.out.println();{//改行
        		
        		//2-10
        		int intMonth=0;//初期値を0に設定
        		intMonth=1;//代数に1を代入
        		switch(intMonth) {
        		case 12,1,2:
        			System.out.println("冬");
        		    break;
        		case 3,4,5:
        			System.out.println("春");
        		    break;
        		case 6,7,8:
        			System.out.println("夏");
        		    break;
        		case 9,10,11:
        			System.out.println("秋");
        		    break;
        	    default:
        	    	System.out.println("無効な月です");
        		
        		}/*場合とそれに応じて結果を出力*/
        		
        		}
        	}
        }
        	}
        	}
        
        
		}

	}
}

