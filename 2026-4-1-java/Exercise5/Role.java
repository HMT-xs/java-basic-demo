package Exercise5;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role(){}
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

//    Role r1 = new Role();张三
//    Role r2 = new Role();李四
//    r1.攻击(r2);

    public void attack(Role role){
        Random r = new Random();
        int hurt = r.nextInt(20)+1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);

        System.out.println(this.getName() + "打了一下"+ role.getName() +",造成"+ role.getName() +"损失"+ hurt +"血量,李四剩余"+ remainBlood +"血量");
    }
}
