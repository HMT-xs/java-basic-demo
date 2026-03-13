public class SmartPhone extends Phone{
    public SmartPhone(String brand,double price){
        super(brand,price);
    }
    @Override
    public void call(){
        super.call();
    }
    public void videoCall(){
        System.out.println(brand+"手机正在打视频电话"+",价格："+price);
    }

    public static void main(String[] args){
        SmartPhone sp1=new SmartPhone("华为",5999);
        SmartPhone sp2=new SmartPhone("小米",4999);
        sp1.call();
        sp2.videoCall();
    }
}
