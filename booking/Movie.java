package booking;

class Movie {
	private String name;
	private int ticketPrice; // in cents
	private String date;
	private int sold; // Sold number of tickets

	Movie (String name, int price, String date) {
		this.name = name;
		this.ticketPrice = price;
		this.date = date;
		this.sold = 0;
	}

	String getName() {
		return this.name;
	}

	void sell() {
		this.sold++;
	}

	void describe() {
		System.out.println("Movie: " + this.name);
		System.out.println("Ticket price: ¢" + this.ticketPrice);
		System.out.println("Date: " + this.date);
		System.out.println("Sold: " + this.sold);
	}
}
