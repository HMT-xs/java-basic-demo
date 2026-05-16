package Exercise8;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend gf1 = new GirlFriend("张三", 18, "女", "唱歌");
        GirlFriend gf2 = new GirlFriend("李四", 19, "女", "跳舞");
        GirlFriend gf3 = new GirlFriend("王五", 20, "女", "弹琴");
        GirlFriend gf4 = new GirlFriend("赵六", 21, "女", "打球");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum = sum + gf.getAge();
        }
        int ave = sum / arr.length;
        System.out.println("平均年龄为:" + ave);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge() < ave){
                System.out.print("小于平均年龄的有:");
                System.out.println(arr[i].getName() +"," + arr[i].getAge() + "," + arr[i].getGender() + "," + arr[i].getHobby());
                count++;
            }
        }
        System.out.println("小于平均年龄的共有" + count + "人");
    }
}
