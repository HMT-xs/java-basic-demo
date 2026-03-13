public class MachineTest {
    public static void main(String[] args){
        //创建多态数组
       Machine[] machines={new Car(),new Bike()};
       for(Machine m:machines){
           m.start();
       }
    }
}
//Machine m1=new Machine();
//Machine m2=new Car();
//Machine m3=new Bike();
//m1.start();
//m2.start();
//m3.start();
