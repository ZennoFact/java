
public class UserItem extends Item {
	public UserItem(String name, int price) {
		super(name, price);
		this.setCount(0);
	}

	public String showData() {
		return this.name + "を" + this.getCount() + "本購入。";
	}
}
