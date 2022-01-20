package trick5;

import java.util.ArrayList;
import java.util.List;

//A list of Integer elements can not be assigned to a List of Object elements despite that Integer is a subclass of Object

public class Trick5 {

	public static void main(String[] args) {
		List<Object> objects = new ArrayList<>();
		List<Integer> integers = new ArrayList<>();
		objects = integers;
	}

}
