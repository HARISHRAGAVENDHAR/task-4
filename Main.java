package student;
class AgeNotWithinRangeException extends Exception {
	private static final long serialVersionUID = 1L;

	public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for invalid name
class NameNotValidException extends Exception {
    
	private static final long serialVersionUID = 1L;

	public NameNotValidException(String message) {
        super(message);
    }
}


class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

  
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
        }
        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains numbers or special symbols");
        }
        
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    
    private boolean isValidName(String name) {
        
        return name.matches("[a-zA-Z ]+");
    }

    
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
        }
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}


public class Main {
    public static void main(String[] args) {
        try {
            
            Student student1 = new Student(1, "John Doe", 18, "Computer Science");
            System.out.println("Student created: " + student1.getName());

            
            Student student2 = new Student(2, "Alice", 22, "Physics");
            System.out.println("Student created: " + student2.getName());
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

       