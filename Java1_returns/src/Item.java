/**
 * 自動販売機内の商品情報を扱うクラス。
 * 商品名，金額，個数の情報を持っている。
 * このクラスは，練習用に自販機内の商品情報クラスと，ユーザーが購入した商品情報クラスに継承して使用する。
 */
public class Item {
	final String name;
	final int price;
	private int count;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String showItem() {
		return this.name + " " + this.price + "円";
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
