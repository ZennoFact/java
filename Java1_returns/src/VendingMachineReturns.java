import java.util.Scanner;

public class VendingMachineReturns {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] s={"冷やし味噌汁120円","沸騰コーラ120円","ナタデココ100%150円","怪物200円"};
		int[] y={120,120,150,200};
		int[] c={0,0,0,0};


		System.out.println("いらっしゃいませ"+"\n"+"お金を入れてください>");
		int m=sc.nextInt();
		int n=0;

		do{
		if(m>=120)
		{
		System.out.println("\n"+"残金は"+m+"円です。"+"\n"+"\n購入番号を入力してください。");
		System.out.println(s[0]+"\n"+s[1]+"\n"+s[2]+"\n"+s[3]);
		System.out.print("購入番号(1～4)を選択してください。>");
		n=sc.nextInt();

		if(n<1||n>4)
		{
			break;
		}
		if(m>=y[n-1]){
			m=m-y[n-1];
			System.out.println("\n"+s[n-1]+"が購入できました");
			c[n-1]+=1;
		   }else{
				System.out.println("お金が足りません");
		   		}
		       }

				}
				while(m>=120&&1<=n&&n<=4);

			if((c[0]==0&&c[1]==0&&c[2]==0&&c[3]==0)||m<120){
				System.out.println("");
				System.out.println("購入金額が不足しています。"+"\n"+"またのご利用お待ちしてます");
		}else{
			System.out.println("購入ありがとうございました。"+"\n"+"またのご利用お待ちしてます");
			}

		System.out.println("\n"+"～～購入した商品～～");
		for (int i=0;i<c.length;i++){
			if(c[i]>0)
				System.out.println(s[i]+":"+c[i]+"本"+"です");
		}
		System.out.println("残金は"+m+"円です。");
	}
}
