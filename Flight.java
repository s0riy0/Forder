class Flight {
         // Attribute //
    private String flightNumber;
    private String destination;
    private int totalSeats;
    private int availableSeats;

    // Constuctor // --> มีข้อมูลครบ
    public Flight(String flightNumber, String destination, int totalSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }
    // สร้างเมธอท เพื่อให้คลาสมีความ --> private //
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    } 

    public int getAvailableSeats() {
        return availableSeats;
    }  

    public boolean bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Flight Number: " + flightNumber + ", Destination: " + destination +
               ", Available Seats: " + availableSeats;
    }
}

