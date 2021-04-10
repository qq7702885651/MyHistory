package JazvaLearn2OfJeKou.DuoTai.Demo06.red.MainShow;

import JazvaLearn2OfJeKou.DuoTai.Demo06.red.Red.OpenMode;

import java.util.ArrayList;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("白嫖传智播客的课程");
        red.setOwnerName("王思聪");
        red.setOpenWay(new OpenMode() {
            @Override
            public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
                ArrayList<Integer> list = new ArrayList<>();

                int avg = totalMoney/totalCount;
                int mod = totalMoney%totalCount;

                for (int i = 0; i < totalCount - 1; i++) {
                    list.add(avg);
                }
                list.add(avg + mod);

                return list;
            }
        });
    }
}
