package JazvaLearn2OfJeKou.DuoTai.Demo05;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("吉尔伽美什");
        /*hero.setSkill(new SkillIpml());
        hero.showMe();*/
       /* //第二种写法
        Skill sk = new Skill() {
            @Override
            public String use() {
                return "二刀流";
            }
        };
        hero.setSkill(sk);
        hero.showMe();*/
       //第三种写法
        hero.setSkill(new Skill() {
            @Override
            public String use() {
                return "一刀流居合";
            }
        });
        hero.showMe();
    }
}
