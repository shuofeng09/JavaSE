package xmut.pta;

public class 消失的车 {
    //甲说：它的前两位是一样的
    //
    // 乙说：它的后两位是一样的，但是和它的前两位不一样
    //
    // 丙说：它是一个数的平方
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int prefix = i / 100;
            int suffix = i % 100;
            int prefixOne = prefix / 10;
            int prefixTwo = prefix % 10;
            int suffixOne = suffix / 10;
            int suffixTwo = suffix % 10;
            if (prefixOne == prefixTwo && suffixOne == suffixTwo) {
                for (int j = 0; j < 100; j++) {
                    if (Math.sqrt(i) == j) {
                        System.out.println("车牌号码是" + i);
                        break;
                    }
                }
            }
        }

    }
}
