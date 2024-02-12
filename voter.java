package student;
public class voter {
    private int voterId;
    private String name;
    private int age;

    public voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            voter voter1 = new voter(1, "John", 20);
            System.out.println("Voter created successfully.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            voter voter2 = new voter(2, "Alice", 16);
            System.out.println("Voter created successfully.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}