package booking;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		var avail = new Movie[] {
			new Movie("Dr.Strange",  200, "2024-02-20"),
			new Movie("Iron Man",    300, "2024-03-29"),
			new Movie("Venom",       500, "2023-09-20"),
		};
		var movies = new Movies(avail);
		var scanner = new Scanner(System.in);
		var input = "";


		System.out.println("Type 'h' if you need help");
		while (true) {
			System.out.print(">> ");
			input = scanner.nextLine();

			if (input.equals("buy")) {
				for (int i = 0; i < movies.list.size(); i++) {
					System.out.printf("\"%s\":(%d) ", movies.list.get(i).getName(), i);
				}
				System.out.printf("%nChoose: ");
				System.out.flush(); // Flush stdout to see the output

				movies.list
					.get(scanner.nextInt())
					.sell();
				scanner.nextLine(); // Also clean input from remaining new line
				continue;
			}

			if (input.equals("list")) {
				for (var movie : movies.list) {
					movie.describe();
					System.out.println();
				}
				continue;
			}

			if (input.equals("h")) {
				System.out.println(
					"list -> lists all available movies\n" +
					"buy -> prompts you to buy a ticket\n" +
					"h -> prints this message\n" +
					"quit -> terminates the program\n"
				);
				continue;
			}

			if (input.equals("quit"))
				break;

			System.out.printf("Unknown command: '%s'%n", input);

		}

		scanner.close();
	}
}
