// Student class extends the Person class, inheriting its properties and methods.
public class Student extends Person{
    private  double gpa;
    // Default constructor calling the superclass (Person) default constructor.
    public Student(){
        super();
    }
    public Student(String name,String surname,double gpa){
        super(name,surname);
        setGpa(gpa);
    }


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String getPosition() {
        return "Student";
    }


    // Returns a payment amount based on the student's GPA.
    @Override
    public double getPaymentAmount(){
        if(this.gpa>2.67){
            return 36660.00;
        }
        else{
            return 0;
        }
    }
    // Overridden toString() method to provide a custom string representation of the Student object.
    @Override
    public String toString() {
        return super.toString()+
                "\ngpa = " + gpa+
                "\nsalary = " + getPaymentAmount()+" tg\n";

    }
}