package day33interface;

public class LuxHonda extends Araba implements IcAraba, DisAraba {

	public static void main(String[] args) {
		LuxHonda luxHonda = new LuxHonda();
		luxHonda.benzin();
		luxHonda.direksiyon();
		luxHonda.kapi();
		luxHonda.klima();
		luxHonda.koltuk();
		luxHonda.move();
		System.out.println("IcAraba interfeca ' inden :" + IcAraba.price);// 2000
		System.out.println("DisAraba interfeca ' inden :" + DisAraba.price);// 3000
		System.out.println(old);//
		luxHonda.doseme();// interface 'de default keyword ile doseme yapmatim
	}

	@Override
	public void move() {
		System.out.println("3 saniyede 100km'lik hiza ulasir");
	}

	@Override
	public void kapi() {
		System.out.println("Parmak izi ayarli kapi");
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri direksiyon");

	}

	@Override
	public void koltuk() {
		System.out.println("Isitmali deri koltuk");
	}

	@Override
	public void klima() {
		System.out.println("Digital kilma");
	}

}