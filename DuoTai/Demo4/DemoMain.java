package JazvaLearn2OfJeKou.DuoTai.Demo4;

public class DemoMain {
    public static void main(String[] args) {
        Hero Arthur = new Hero();
        Weapon kingSword = new Weapon("誓约胜利之剑");

        Arthur.setName("亚瑟王");
        Arthur.setAge(99);
        Arthur.setWeapon(kingSword);

        Arthur.showMe();
    }
}
