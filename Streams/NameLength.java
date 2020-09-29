package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Soniya","Sharmila","Gogilavani");
		List<String> LongNames=names.stream().filter(string->string.length()>6||string.length()<8).collect(Collectors.toList());
		for(String name:LongNames)
		{
			System.out.println(name);
		}
		
		
	}

}
