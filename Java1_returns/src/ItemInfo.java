import java.util.Random;

public class ItemInfo extends Item {
	public ItemInfo(String name, int price) {
		super(name, price);
		Random rnd = new Random();
		this.setCount(rnd.nextInt(100));
	}

	public String showData() {
		return this.name + "は残り" + this.getCount() + "本。";
	}

	@Override
	public String showItem() {
		if (0 < this.getCount()) {
			return super.showItem();
		}
		else {
			return this.name + "は売り切れです";
		}
	}
}
