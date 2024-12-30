import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableMain implements Comparator<Animal> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Animal(2,"Leo",10);
		Animal a2 = new Animal(3,"Bruno",10);
		Animal a3 = new Animal(7,"Don",10);
		Animal a4 = new Animal(1,"Maxo",10);
		
		List<Animal>list = new ArrayList<>();
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		
		
		//System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
