public class BelajarJava {
	
	public static void main(String[] args) {	
		
//		Type data pada JAVA:
//		String: (Type data untuk menyatakan kalimat)
//		Integer: (Type data untuk meyatakan bilangan bulat)
//		Double: (Type data untuk menyatakan bilangan desimal)
//		Boolean: (Type data untuk menyatakan ya/tidak)
		
//		String
	  	String Text = "Jumlah tipe data: ";
		  System.out.println(Text);
		
//		Integer
	  	int Angka = 1;
	  	System.out.print(Angka);
		
//		Double
		double Desimal = 1.5;
		System.out.println(Desimal);
		
//		Bolean
	  	boolean IsAlive = false;
		  System.out.println(IsAlive);
		
//		Variable
//		Sebuah wadah untuk menampung suatu nilai (Penulisan variable
//		tidak boleh diawali oleh angka dan tidak boleh ada simbol2 
//		kecuali ( _ ), dan tidak boleh ada Spasi)
		
//		Array
//		Array adalah sebuah variabel yang bisa menampung lebih dari satu
//		nilai dengan type data yang sama
	  	String[] Students = {"Dalzy", "Zulfahmi"};
	  	System.out.println(Students[0] + Students[1]);
	  	int[] Grades = {90, 80, 20, 0};
	  	System.out.println(Grades[0] + Grades[2]);
		
//		Menggunakan kalkulasi dengan bilangan bulat
	  	int a = 20;
	  	int b = 15;
	  	int result = a / b;
	  	System.out.println(result);
		
//		Menggunakan kalkulasi dengan bilangan desimal
	  	double A = 20;
	  	double B = 15;
	  	double Result = A / B;
	  	System.out.println(Result);
		
//		Menggunakan operator aritmatika
	  	System.out.println(1 * 2);
	  	System.out.println(1 / 2);
	  	System.out.println(1 + 2);
	  	System.out.println(1 - 2);
	  	System.out.println(1 % 2);
		
//		Menggunakan operator logika
	  	System.out.println(1 == 2);
	  	System.out.println(1 != 2);
	  	System.out.println(1 >= 2);
	  	System.out.println(1 <= 2);
		
//		Pengkondisian
	  	String Order = "AYAM";
	  	if (Order.toLowerCase().equals("ayam")) {
		System.out.println("Ayam akan disajikan");			
	  	} else if (Order.toLowerCase().equals("ikan")) {
		System.out.println("Ikan akan disajikan");
	  	} else if (Order.toLowerCase().equals("sapi")) {
		System.out.println("Stok Sapi habis");
	  	} else {
		System.out.println("Menu tidak tersedia");			
	  	}

//		Switch
		String key = "W";
		switch (key) {
		case "W":
		System.out.println("Move Forward");
		break;
		case "A":
		System.out.println("Move Left");
		break;
		case "S":
		System.out.println("Move Backward");
		break;
		case "D":
		System.out.println("Move Right");
		break;
		}	
	}
}
