/**
 * 自動販売機を起動させるためのエントリポイント。
 * 起動と終了を実行する。
 * @author k.maeno
 *
 */
public class Main {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();

		UserItem[] items = vm.start();

		System.out.println("--購入結果--");
		for (UserItem item : items) {
			if(item.getCount() > 0) {
				System.out.println(item.name+":"+item.getCount()+"本");
			}
		}
		System.out.println("残金："+vm.money+"円");
	}

}
