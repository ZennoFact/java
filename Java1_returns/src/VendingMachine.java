import java.text.NumberFormat;
import java.util.Scanner;

public class VendingMachine {
	ItemInfo[] items;
	UserItem[] userItems;
	int minPrice;
	int money;

	public VendingMachine() {
		ItemData data = new ItemData();
		items = new ItemInfo[data.names.length];
		userItems = new UserItem[data.names.length];
		for (int i = 0; i < items.length; i++) {
			items[i] = new ItemInfo(data.names[i], data.prices[i]);
			userItems[i] = new UserItem(data.names[i], data.prices[i]);
		}

		minPrice = items[0].price;
		for (int i = 1; i < items.length; i++) {
			if (items[i].price < minPrice) {
				minPrice = items[i].price;
			}
		}
	}

	public UserItem[] start() {
		System.out.println("自動販売機です。");
		System.out.print("投入金額を決定してください > ");
		Scanner sc = new Scanner(System.in);
		money = sc.nextInt();

		if (minPrice <= money) {
			boolean isGet = true;
			while (isGet) {
				int index = this.choiceItem(money);
				if (index < 0 || 3 < index) {
					break;
				}

				money = this.buy(index, money);

				if(money < minPrice) {
					isGet = false;
				}
				System.out.println();
			}
			if (getItem()) {
				System.out.print("ご購入ありがとうございました。");
			}
		}
		else {
			System.out.println("投入金額が足りません。");
		}
		sc.close();
		return userItems;
	}

	private int choiceItem(int money) {
		NumberFormat nf = NumberFormat.getNumberInstance();
		System.out.println("投入金額：" + nf.format(money) + "円");
		System.out.println("購入する商品番号を入力してください。");
		for (int i = 0; i < items.length; i++) {
			System.out.println((i + 1) + ":" + items[i].showItem());
		}
		System.out.print("番号（1～4）：お釣り（それ以外の数字） > ");

		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt() - 1;
		sc.close();
		return result;
	}

	private int buy(int index, int money) {
		System.out.println();
		if (items[index].getCount() <= 0) {
			System.out.println("売り切れ中。");
		} else if (items[index].price <= money) {
			System.out.println("「" + items[index].name + "を購入。」");
			money -= items[index].price;
			items[index].setCount(items[index].getCount() - 1);
			userItems[index].setCount(userItems[index].getCount() + 1);
		} else System.out.println("投入金額不足");

		return money;
	}

	private boolean getItem() {
		boolean itemGet = false;
		for (int i = 0; i < items.length; i++) {
			if (0 < items[i].getCount()) itemGet = true;
		}
		return itemGet;
	}
}
