package output;

import java.util.Random;
import java.util.Scanner;

public class seizauranai {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
//		変数定義ーーーーーーーーーーーーーーーーーーー
		String[] seiza= {"山羊座","水瓶座","魚座","牡羊座","牡牛座","双子座","蟹座","獅子座","乙女座","天秤座","蠍座","射手座"}; //星座の変数(配列)
		String[] zyuni= {"1位","2位","3位","4位","5位","6位","7位","8位","9位","10位","11位","12位"};	//順位の変数(配列)
		Scanner scan = new Scanner(System.in); //Scannerの初期化
		Random  random = new Random(); //Randomの初期化
		int ran = random.nextInt(12)+1; //1〜12の数字を"ランダム"に出す変数
//		ーーーーーーーーーーーーーーーーーーーーーーー
		
//		実行後出力ーーーーーーーーーーーーーーーーーー
		System.out.println("星座占いスタート(*・∀・)!!!!!!");
		System.out.println("");
		System.out.println("★誕生月を入力してね★");
		int month = scan.nextInt();
		System.out.println("★誕生日を入力してね★");
		int day = scan.nextInt();
//		ーーーーーーーーーーーーーーーーーーーーーーー
		
//		判定出力ーーーーーーーーーーーーーーーーーーー
		int hantei=seizahantei(month,day); //①seizahanteiメソッドに引数＜month,day＞を渡す②seizahanteiメソッドから戻ってきた値を変数hanteiに入れる
		System.out.println("あなたの星座は~*"+seiza[hantei]+"*~です");	//〔例〕0が戻ってきたら配列の0になる
		int ranking=randomRanking(ran); //①randomRankingメソッドに引数＜ran＞を渡す②randomRankingメソッドから戻ってきた値を変数rankingに入れる
		System.out.println("運勢は...."+zyuni[ranking]+"!");
//		ーーーーーーーーーーーーーーーーーーーーーーー
	}
	
//		星座判別メソッドーーーーーーーーーーーーーーー
		public static int seizahantei(int usermonth,int userday) {
			if(usermonth==12&&userday>=22&&userday<=31||usermonth==1&&userday>=1&&userday<=19) {               //12月22日~12月31日または1月1日~1月19日まで
				return 0;									//山羊座
			}else if(usermonth==1&&userday>=20&&userday<=31||usermonth==2&&userday>=1&&userday<=18) {		   //1月20日~1月31日または2月1日~2月18日まで
				return 1;									//水瓶座
			}else if(usermonth==2&&userday>=19&&userday<=29||usermonth==3&&userday>=1&&userday<=20) {		   //2月19日~2月29日または3月1日~3月20日まで
				return 2;									//魚座
			}else if(usermonth==3&&userday>=21&&userday<=31||usermonth==4&&userday>=1&&userday<=19) {		   //3月21日~3月31日または4月1日~4月19日まで
				return 3;									//牡羊座
			}else if(usermonth==4&&userday>=20&&userday<=30||usermonth==5&&userday>=1&&userday<=20) {		   //4月20日~4月30日または5月1日~5月20日まで
				return 4;									//牡牛座
			}else if(usermonth==5&&userday>=21&&userday<=31||usermonth==6&&userday>=1&&userday<=21) {		   //5月21日~5月31日または6月1日~6月21日まで
				return 5;									//双子座
			}else if(usermonth==6&&userday>=22&&userday<=30||usermonth==7&&userday>=1&&userday<=22) {		   //6月22日~6月30日または7月1日~7月22日まで
				return 6;									//蟹座
			}else if(usermonth==7&&userday>=23&&userday<=31||usermonth==8&&userday>=1&&userday<=22) {		   //7月23日~7月31日または8月1日~8月22日まで
				return 7;									//獅子座
			}else if(usermonth==8&&userday>=23&&userday<=31||usermonth==9&&userday>=1&&userday<=22) {		   //8月23日~8月31日または9月1日~9月22日まで
				return 8;									//乙女座
			}else if(usermonth==9&&userday>=23&&userday<=30||usermonth==10&&userday>=1&&userday<=23) {		   //9月23日~9月30日または10月1日~10月23日まで
				return 9;									//天秤座
			}else if(usermonth==10&&userday>=24&&userday<=31||usermonth==11&&userday>=1&&userday<=22) {		   //10月24日~10月31日または11月1日~11月22日まで
				return 10;									//蠍座
			}else {																	   						   //11月23日~11月30日または12月1日~12月21日まで
				return 11;									//射手座
			}
		}
//		ーーーーーーーーーーーーーーーーーーーーーーー
		
//		(ランダム)ランキング出力メソッドーーーーーーー
		public static int randomRanking(int rank) {
			if(rank==1) {
				return 0;	//1位
			}else if(rank==2) {
				return 1;	//2位
			}else if(rank==3) {
				return 2;	//3位
			}else if(rank==4) {
				return 3;	//4位
			}else if(rank==5) {
				return 4;	//5位
			}else if(rank==6) {
				return 5;	//6位
			}else if(rank==7) {
				return 6;	//7位
			}else if(rank==8) {
				return 7;	//8位
			}else if(rank==9) {
				return 8;	//9位
			}else if(rank==10) {
				return 9;	//10位
			}else if(rank==11) {
				return 10;	//11位
			}else {
				return 11;	//12位
			}
		}
//		ーーーーーーーーーーーーーーーーーーーーーーー

}
