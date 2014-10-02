import java.util.Scanner;

public class VendingMachineReturns {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] shohin={"冷やし味噌汁120円","沸騰コーラ120円","ナタデココ100%150円","怪物200円"};
		int[] yen={120,120,150,200};
		int[] count={0,0,0,0};


		System.out.println("いらっしゃいませ"+"\n"+"お金を入れてください>");
		int maney=sc.nextInt();
		int num=0;

		do{
		if(maney>=120)
		{
		System.out.println("\n"+"残金は"+maney+"円です。"+"\n"+"\n購入番号を入力してください。");
		System.out.println(shohin[0]+"\n"+shohin[1]+"\n"+shohin[2]+"\n"+shohin[3]);
		System.out.print("購入番号(1～4)を選択してください。>");
		num=sc.nextInt();

		if(num<1||num>4)
		{
			break;
		}
		if(maney>=yen[num-1]){
			maney=maney-yen[num-1];
			System.out.println("\n"+shohin[num-1]+"が購入できました");
			count[num-1]+=1;
		   }else{
				System.out.println("お金が足りません");
		   		}
		       }

				}
				while(maney>=120&&1<=num&&num<=4);

			if((count[0]==0&&count[1]==0&&count[2]==0&&count[3]==0)||maney<120){
				System.out.println("");
				System.out.println("購入金額が不足しています。"+"\n"+"またのご利用お待ちしてます");
		}else{
			System.out.println("購入ありがとうございました。"+"\n"+"またのご利用お待ちしてます");
			}

		System.out.println("\n"+"～～購入した商品～～");
		for (int i=0;i<count.length;i++){
			if(count[i]>0)
				System.out.println(shohin[i]+":"+count[i]+"本"+"です");
		}
		System.out.println("残金は"+maney+"円です。");
	}
}
