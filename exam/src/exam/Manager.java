package exam;

public class Manager extends Employee {
	public Manager(String name, int money) {
		this.name = name;
		this.money = money;
	}

	@Override
	public void print() {
		int m1 = (int) (money + 5000);
		System.out.println(name + "\t" + m1);
	}

	public Manager() {

	}
}
