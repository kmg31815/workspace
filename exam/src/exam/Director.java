package exam;

public class Director extends Manager {
	int bonus;

	public Director(String name, int money, int bonus) {
		this.name = name;
		this.money = money;
		this.bonus = bonus;
	}

	@Override
	public void print() {
		int m2 = (int) (money + 5000);
		System.out.println(name + "\t" + m2 + "(" + bonus + ")");
	}
}
