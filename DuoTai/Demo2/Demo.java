package JazvaLearn2OfJeKou.DuoTai.Demo2;
/*模拟笔记本电脑接口的示例*/
public class Demo {
    public static void main(String[] args) {
        Computer on = new Computer();
        USB mouse = new Mouse();
        USB keyboard = new Keyboard();

        on.powerOn();
        on.useDevice(mouse);
        on.useDevice(keyboard);
        on.powerOff();

    }
}
