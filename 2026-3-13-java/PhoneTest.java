public class PhoneTest {
    public static void callTest(Phone phone){
        phone.call();
    }
    public static void main(String[] args) {
        callTest(new Phone());
        callTest(new SmartPhone());
    }
}
//Phone phone1=new Phone();
//Phone phone2=new SmartPhone();
//phone1.call();
//phone2.call();