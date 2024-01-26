public abstract class Person implements Payable,Comparable<Person> {
    private int id; //creating all variables
    private static int CounterId = 0;
    private String name;
    private String surname;
    public Person(){
    }
    public Person(String name,String surname) {
        CounterId++;
        id = CounterId; //add +1 to id for every person
        setName(name);
        setSurname(surname);
    }


    // just getters and setters
    public int GetID(){
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    // This method compares two Person objects based on their payment amounts.
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
    // This is an abstract method that should be implemented by concrete subclasses. It returns string
    public abstract String getPosition();
    // This overridden method provides a custom string representation of the Person object.
    // It includes information about the person's position, ID, name, and surname.
    @Override
    public String toString() {
        return  getPosition() + " " +
                "id = " + GetID() + ", name = " + name + ", surname = " + surname;
    }
}
