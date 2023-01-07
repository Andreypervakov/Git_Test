public class Person {
    
    public String name;
    public byte age;
    public String sex;
    public boolean isEducated;

    // Empty Constructor 
    public Person() {};

    // Constructor
    public Person (String name, Byte age, String sex,boolean isEducated){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.isEducated = isEducated;
    }
   // Printing

    public void print(){
        System.out.printf("Name = %s, Age = %d, Sex = %s, Educated =%b; /n " , this.name, this.age, this.sex, this.isEducated);
           
        } 
    
       



}
   