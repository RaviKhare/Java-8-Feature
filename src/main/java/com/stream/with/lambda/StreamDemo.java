/**
 * 
 */
package main.java.com.stream.with.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import main.java.com.service.StreamServiceImpl;

/**
 * @author rk250449
 *
 */
public class StreamDemo  {

	   

	public static void main(String[] args) throws IOException {
		System.out.println("1- Int Stream range to print ");
		IntStream.range(1, 10).forEach(System.out::println);
		
		System.out.println("\n 2- Skip from Int stream  ");
		IntStream.range(10, 20).skip(5).forEach(System.out::println);
		
		System.out.println("\n 3- Sum of Int stream  "+
		IntStream.range(10, 20).sum() );
		
		System.out.println("\n 4- String Stream values ");
		Stream.of("Newyork", "Washington", "Florida", "NewJersey", "Gerogia").forEach(System.out::println);

		System.out.println("\n 5- Sorted and findFirst ");
		Stream.of("Newyork", "Washington", "Florida", "NewJersey", "Gerogia").sorted().findFirst().ifPresent(System.out::println);

		System.out.println("\n 6- sorted and cout all - "+
		Stream.of("Newyork", "Washington", "Florida", "NewJersey", "Gerogia").sorted().count());
		
		System.out.println("\n 7- Stream String find start with 'N' - ");	
		Stream.of("Newyork", "Washington", "Florida", "NewJersey", "Gerogia").filter(s-> s.startsWith("N")).sorted().forEach(System.out::println);
			
		System.out.println("\n 8- Stream with List<String> find start with 's' - ");	
		List<String> employees = Arrays.asList("Mike", "Simon", "Ram", "Nitin", "Rohit", "Mohit","neha", "shyam" );
		employees.stream().filter(s -> s.startsWith("s")).sorted().forEach(System.out::println);
	
		System.out.println("\n 9- Stream with List<String> find start with 's' (does not matter case) - ");	
		employees.stream().map(String::toLowerCase).filter(s -> s.startsWith("s")).sorted().forEach(System.out::println);
	
		System.out.println("\n 10- Stream with files read - ");	
		Stream<String> file = Files.lines(Paths.get("C:\\Workspace_Reward_Program\\Java_8_Features\\src\\main\\resources\\playerlist.txt"));
	    file.forEach(System.out::println);
	    file.close();
	    
	    System.out.println("\n 11- Stream with files read, sort, print - ");	
	    Stream<String> fileSorted = Files.lines(Paths.get("C:\\Workspace_Reward_Program\\Java_8_Features\\src\\main\\resources\\playerlist.txt"));
		fileSorted.sorted().forEach(System.out::println);
	    fileSorted.close();
	    
	    System.out.println("\n 12- Stream with db values(prepared static list) read, player list whos grade having A- ");	
		StreamServiceImpl.getPlayerListGradeWise().stream().forEach(System.out::println);
		
		System.out.println("\n 13- Stream with db values(prepared static list) read, player list who all are currently Active - ");	
		StreamServiceImpl.getPlayerListWhoAllActive().stream().forEach(System.out::println);;
		
			
	}
}
