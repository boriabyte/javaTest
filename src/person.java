public class person {


    private String name;
    private int age;
    private double height;
    private double weight;

    public person() {}

    public person(String uName, int uAge, double uHeight, double uWeight) {

        name = uName;
        age = uAge;
        height = uHeight;
        weight = uWeight;

    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setHeight(double newHeight){
        this.height = newHeight;
    }

    public void setWeight(double newWeight){
        this.weight = newWeight;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWeight(){
        return this.weight;
    }

}
