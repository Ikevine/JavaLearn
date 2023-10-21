public class  Generics <Y>{

    Y money;
    public int age;
    public  Generics(Y name , int age){
        this.money = name;
        this.age = age;
    }
    //means parameterized type , allow us to create
    //Genric function
    //I need function for number and words at the sametime


    @Override
    public String toString() {
        return "Generics{" +
                "name=" + money +
                ", age=" + age +
                '}';
    }

    public <T> void Display(T name){
        System.out.println(name);
        System.out.println();
    }


}

//instatient the object with different tyoe

