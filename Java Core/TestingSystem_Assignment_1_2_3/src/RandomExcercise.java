import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomExcercise {

	public static void main(String[] args) {

		 randomNumber();
//				 randomName();
//				 randomDate();
				// bubbleSort();
				// SortArray();
			
			}

			public static void randomNumber() {
//				Question 1:In ngẫu nhiên ra 1 số nguyên
				Random random = new Random();
			
				int x= random.nextInt();
				System.out.println(x);
				System.out.println("\n");

//				Question 2: In ngẫu nhiên ra 1 số thực
				
				float y = random.nextFloat();
				System.out.println(y);
				System.out.println("\n");

				// Question 7:  Lấy ngẫu nhiên 1 số có 3 chữ số
		// Cach 1:
				int z = ThreadLocalRandom.current().nextInt(100, 1000);
				System.out.println(z);
				System.out.println("\n");
		// cah 2:
//				int a = random.nextInt(999 - 100 + 1) + 100;
//				System.out.println(a);
//				System.out.println("\n");
				int z1 = ThreadLocalRandom.current().nextInt(10,100);
				System.out.println(z1);
			}

			public static void randomName() {
//				Question 3:
//				
				Random random = new Random();
				String[] students = { "Hoa", "Mai", "Lan", "Ngoc", "Lien", "Minh" };
				int i = random.nextInt(students.length);
				System.out.println(students[i]);
				System.out.println("\n");
			}

			public static void randomDate() {
//				Question 4:
//				
				Random random = new Random();

				int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
				int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();

				long randomInt = minDay + random.nextInt(maxDay - minDay);

				LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
				System.out.println(randomDay);
				System.out.println("\n");

//			Question 5:
//			

				int minDay1 = (int) LocalDate.of(2019, 9, 24).toEpochDay();
				int maxDay1 = (int) LocalDate.of(2020, 9, 24).toEpochDay();

				long randomInt1 = minDay1 + random.nextInt(maxDay1 - minDay1);

				LocalDate randomDay1 = LocalDate.ofEpochDay(randomInt1);
				System.out.println(randomDay1);
				System.out.println("\n");

//				Question 6:
//				

				int now = (int) LocalDate.now().toEpochDay();
				randomInt = now - random.nextInt(365);
				randomDay = LocalDate.ofEpochDay(randomInt);
				System.out.println(randomDay);

			

			

	
	}

}
