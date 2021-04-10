package JazvaLearn2OfJeKou.DuoTai.Demo03;

public class FinalWork {
    private final String name;
    public FinalWork(){
        name = "老八";
    }
    public FinalWork(String name) {
        this.name = name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public String getName() {
        return name;
    }
}
