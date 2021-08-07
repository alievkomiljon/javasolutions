package Polymorphism_March_2018;

public class Main {

	public static void main(String[] args) {

		FirstClass fc = new FirstClass(Status.SILVER);
		BusinessClass bc = new BusinessClass(Status.GOLD);
		EconomyClass ec = new EconomyClass(441);
		BoardingTime [] objs = {fc, bc, ec};
		//expected output: 26.7
		System.out.println(Main.computeAverageBoardingTime(objs));

	}

	public static double computeAverageBoardingTime(BoardingTime[] customers) {
		double sum = 0;
		for(BoardingTime boardingTime : customers) {
			sum += boardingTime.computeBoardingTime();
		}
	
		return sum / customers.length;
	}
	
	//Modify this code
/*	public static double computeAverageBoardingTime(Object[] objs) {
		double sum = 0;
		for (Object o : objs) {
			if (o instanceof BusinessClass) {
				BusinessClass bc = (BusinessClass) o;
				sum += bc.computeBoardingTime();
			}
			if (o instanceof FirstClass) {
				FirstClass bc = (FirstClass) o;
				sum += bc.computeBoardingTime();
			}
			if (o instanceof EconomyClass) {
				EconomyClass bc = (EconomyClass) o;
				sum += bc.computeBoardingTime();
			}

		}
		return sum / objs.length;
	}*/
}
