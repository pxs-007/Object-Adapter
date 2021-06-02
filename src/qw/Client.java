package qw;

public class Client {
    public static void main(String[] args){
        Fruit f1=new Fruit();
        f1.setFruit("苹果");
        Fruit f2=new Fruit();
        f2.setFruit("香蕉");
        NewJuicer newJuicer=new Adapter();
        System.out.println(newJuicer.newPort(f1,f2));
    }

}
