
package com.questions;

public class AirplaneSeatBook {
    private boolean[][] seats;

    // Constructor to initialize the seating arrangement
    public AirplaneSeatBook(int rows, int cols) {
        seats = new boolean[rows][cols];
    }

    // Book a seat
    public boolean bookSeat(int row, int col) {
        if (isValidSeat(row, col) && !seats[row][col]) {
            seats[row][col] = true;
            return true;
        }
        return false;
    }

    // Cancel a booking
    public boolean cancelBooking(int row, int col) {
        if (isValidSeat(row, col) && seats[row][col]) {
            seats[row][col] = false;
            return true;
        }
        return false;
    }

    // Check seat availability
    public boolean isSeatAvailable(int row, int col) {
        return isValidSeat(row, col) && !seats[row][col];
    }

    // Display the current seating chart
    public void displaySeatingChart() {
        for (boolean[] row : seats) {
            for (boolean seat : row) {
                System.out.print(seat ? "X " : "O ");
            }
            System.out.println();
        }
    }

    // Helper method to validate seat indices
    private boolean isValidSeat(int row, int col) {
        return row >= 0 && row < seats.length && col >= 0 && col < seats[0].length;
    }

    public static void main(String[] args) {
    	AirplaneSeatBook manager = new AirplaneSeatBook(5, 6); // 5 rows, 6 columns

        // Display initial seating chart
        manager.displaySeatingChart();

        // Book some seats
        System.out.println("Booking seat at (2, 3): " + manager.bookSeat(2, 3));
        System.out.println("Booking seat at (0, 0): " + manager.bookSeat(0, 0));

        // Display seating chart after booking
        manager.displaySeatingChart();

        // Check seat availability
        System.out.println("Seat at (2, 3) available: " + manager.isSeatAvailable(2, 3));
        System.out.println("Seat at (1, 1) available: " + manager.isSeatAvailable(1, 1));

        // Cancel a booking
        System.out.println("Canceling booking at (2, 3): " + manager.cancelBooking(2, 3));

        // Display seating chart after cancellation
        manager.displaySeatingChart();
    }
}
