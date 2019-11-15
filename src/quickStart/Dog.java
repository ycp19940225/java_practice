package quickStart;

public class Dog {
    private String dog;
    private Dog(String name){
        System.out.println("名称是：" + name);
    }

    private void setDog(String dogIn){
        dog = dogIn;
    }

    private void getDog(){
        System.out.println("获取dog" + dog);
    }

    public static void main(String []args){
        Dog myDog = new Dog("ycp");
        String a = "s";
        myDog.setDog(a);
        myDog.getDog();

        System.out.println("外部获取" + myDog.dog);
    }
}
