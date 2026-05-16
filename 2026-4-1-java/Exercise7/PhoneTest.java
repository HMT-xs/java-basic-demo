package Exercise7;

public class PhoneTest {
    public static void main(String[] args) {
        //创建数组存三部手机
        Phone[] arr = new Phone[3];

        //创建三部手机的对象
        Phone p1 = new Phone("小米", 3000, "白色");
        Phone p2 = new Phone("华为", 5000, "黑色");
        Phone p3 = new Phone("苹果", 8000, "银色");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }
        double ave = sum * 1.0 / arr.length;
        System.out.println(ave);
    }
}
