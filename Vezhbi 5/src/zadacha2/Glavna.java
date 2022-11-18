package zadacha2;

public class Glavna {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 5;

		KalkulatorZaDecimalniBroevi obj1 = new KalkulatorZaDecimalniBroevi();

		System.out.println(obj1.sobiranje(a, b));
		System.out.println(obj1.odzemanje(a, b));
		System.out.println(obj1.mnozenje(a, b));
		System.out.println(obj1.delenje(a, b));
		System.out.println(obj1.stepenuvanje(a, b));
		System.out.println(obj1.ostatok(a, b));

	}

}
