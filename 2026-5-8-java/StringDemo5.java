package Day15;

public class StringDemo5 {
    public static void main(String[] args) {
        //手机号隐藏
        String phoneNumber = "19172491158";
        String start = phoneNumber.substring(0,3);
        String end = phoneNumber.substring(7,11);
        String hide = start + "****" + end;
        System.out.println(hide);


        //身份信息查看
        String id = "421202200612306246";
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println("身份信息:");
        System.out.println("出生日期:" + year + "年" + month + "月" + day + "日");

        char sex = id.charAt(16);
        int gender = sex - 48;
        if(gender % 2 == 0){
            System.out.println("性别是:女");
        }
        else{
            System.out.println("性别是:男");
        }
    }
}
