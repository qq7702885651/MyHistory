package JazvaLearn2OfJeKou.DuoTai.Demo2;

public class Computer {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关闭");
    }
    //创建了一个方法用于实现键盘和鼠标
    public void useDevice(USB usb){
        USB mouse = new Mouse();
        USB keyboard = new Keyboard();

        //向下转性的判断
        if(usb instanceof Mouse){
            mouse.open();
            Mouse m = (Mouse) usb;
            m.click();
            mouse.close();
        }else if(usb instanceof Keyboard){
            keyboard.open();
            Keyboard k = (Keyboard)usb;
            k.onIO();
            keyboard.close();

        }



    }
}
