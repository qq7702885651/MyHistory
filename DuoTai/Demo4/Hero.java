package JazvaLearn2OfJeKou.DuoTai.Demo4;

public class Hero {
    private String name;
    private int age;
    private Weapon weapon;
    public Hero(){

    }
    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void showMe(){
        System.out.println(this.name + this.age + this.weapon.getSword());
    }
}
