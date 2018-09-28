import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class PathCheckerApp {

	String choice = "y";
	
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Path Checker");
		System.out.println();
		
		
		String pathEntered = Console.getString("Enter a path:  ");
		File file = new File(pathEntered);
		
		if(file.exists() && file.isFile()) {
			
				System.out.println("That points to a file.");
			}
		
		else if(file.isDirectory() && file.exists()) {
				System.out.println("This path points to a directory.");
		}
		else {
			
			System.out.println("File does not exist.");
		}
		
		
	
	}
	
}
