package Polymorphism_March_2017;

import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	public static List<Vehicle> convertArray(Object[] vehicleArray) {

		/* implement */

		List<Vehicle> list = new ArrayList<Vehicle>();
		for (Object a:vehicleArray) {
			// list.add((Vehicle)vehicleArray[i]);
			list.add((Vehicle)a);
		}
		return list;

	}

	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		/* implement */
		int totalmiles = 0;
		for (Vehicle v : vehicleList) {
			totalmiles += v.getMilesUsedToday();

		}
		return totalmiles;

	}
}
