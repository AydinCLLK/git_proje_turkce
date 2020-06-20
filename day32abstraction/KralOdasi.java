package day32abstraction;

public class KralOdasi extends Otel {

	public static void main(String[] args) {

		KralOdasi musteri3 = new KralOdasi();

		musteri3.kahvalti();
		String internatioanal;

		System.out.println("TV Ucretsiz:" + musteri3.tv("internatioanal", 12));
		System.out.println("Wifi Ucretsiz:" + musteri3.wifi(11));

	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz teras kat Kral Restaurant'tadir");
	}

	public int tv(String international, int saat) {
		if (international.equals("internatioanal")) {
			return saat * 5;

		} else {
			return 0;
		}
	}

}
