
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.steakhouse.entities.Person;
import com.steakhouse.entities.Steakhouse;
import com.steakhouse.utils.MapUtils;
public class Invoker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Amit", new Point(0,0));
		int numberOfSteakhousesToReturn = 1;
		Steakhouse sh1 = new Steakhouse("sh1", new Point(1,2));
		Steakhouse sh2 = new Steakhouse("sh2", new Point(3,4));
		Steakhouse sh3 = new Steakhouse("sh3", new Point(1,-1));
		List<Steakhouse> listOfSteakhouses = new ArrayList<>();
		listOfSteakhouses.add(sh1);
		listOfSteakhouses.add(sh2);
		listOfSteakhouses.add(sh3);
		
		
		Map<Steakhouse, Double> mapOfSteahousesDistances = p.getDistanceFromSteakhouses(listOfSteakhouses);
		Map<Steakhouse, Double> sorted = MapUtils.sortByValue(mapOfSteahousesDistances);
		Map<Steakhouse, Double> sorted2 = MapUtils.sortByValue(getFirstNMapEntries(sorted,numberOfSteakhousesToReturn));
		printCoordinates(sorted2);
	}
	
	public static Map<Steakhouse, Double> getFirstNMapEntries(Map<Steakhouse, Double> sorted, int max) {
		HashMap<Steakhouse, Double> target = new HashMap<>();
		int count = 0;
		for (Entry<Steakhouse, Double> entry:sorted.entrySet()) {
		     if (count >= max) break;

		     target.put(entry.getKey(), entry.getValue());
		     count++;
		  }
		return target; 
		
	}
	
	public static void printCoordinates(Map<Steakhouse, Double> map){
		for(Map.Entry<Steakhouse, Double> item : map.entrySet()){
			System.out.println(item.getKey().getLocation());
		}
	}
	
}
