import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Main
{
	public static void main(String[] args) {
		File file = new File("doc.txt");

		try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())) {
			while (sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}