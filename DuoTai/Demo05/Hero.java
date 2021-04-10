package JazvaLearn2OfJeKou.DuoTai.Demo05;

public class Hero {
    private String name;
    private Skill skill;

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
    public void showMe(){
        System.out.print("英雄名称："+this.name+"英雄技能："+this.skill.use());
    }
}
