//Create a class Student with roll number and name. Write a method to display details.

class Student{
    int roll;
    String name;

    Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
    
    void display(){
        System.out.println("The value is "+ name);
        System.out.println("The roll number is "+ roll);
    }

    public static void main(String[] args){
        Student s1= new Student("Saksham",66);
        s1.display();
    }
    
    
}