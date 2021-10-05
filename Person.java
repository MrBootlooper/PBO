abstract class Person { 
    public String fname = "John";
    public int age = 24;
    public abstract void study();
}

class Student extends Person {
    public int graduationYear = 2018;
    public void study(){
        System.out.println("studying all day long");
    }
}


class MyClass {
    public static void main(String[] args) {
        Student myobj = new Student();

        System.out.println("Name: " + myobj.fname);
        System.out.println("Age: " + myobj.age);
        System.out.println("Graduated: " + myobj.graduationYear);

    }
}