package zadacha1;

public class Glavna {

	public static void main(String[] args) {
		int a = 6;
		int b = 1;

		KalkulatorZaCeliBroevi obj1 = new KalkulatorZaCeliBroevi();

		System.out.println(obj1.sobiranje(a, b));
		System.out.println(obj1.odzemanje(a, b));
		System.out.println(obj1.mnozenje(a, b));
		System.out.println(obj1.delenje(a, b));
		System.out.println(obj1.stepenuvanje(a, b));
		System.out.println(obj1.ostatok(a, b));
	}

}
