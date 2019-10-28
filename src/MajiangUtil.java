import java.util.ArrayList;
import java.util.List;

public class MajiangUtil {
    public static void print(List<Pai> paiList) {
        List<String> nameList = new ArrayList<>();
        for (Pai pai : paiList) {
            nameList.add(getString(pai));
        }
        System.out.println(nameList);
    }

    public static List<Pai> getTestPaiList(int i) {
        List<Pai> list = new ArrayList<>();
        if (i == 0) {
            list.add(new Pai('a', 0, 0));
            list.add(new Pai('a', 0, 1));
            list.add(new Pai('a', 0, 2));
            list.add(new Pai('a', 0, 3));
            list.add(new Pai('a', 1, 0));
            list.add(new Pai('a', 2, 0));
            list.add(new Pai('a', 1, 1));
            list.add(new Pai('a', 2, 2));
            list.add(new Pai('a', 3, 0));
            list.add(new Pai('a', 8, 0));
            list.add(new Pai('a', 8, 1));
            list.add(new Pai('a', 8, 2));
            list.add(new Pai('a', 6, 0));
            list.add(new Pai('a', 6, 1));
        } else if (i == 1){
            list.add(new Pai('a', 0, 0));
            list.add(new Pai('b', 0, 1));
            list.add(new Pai('c', 0, 2));
            list.add(new Pai('d', 0, 3));
            list.add(new Pai('c', 1, 0));
            list.add(new Pai('b', 2, 0));
            list.add(new Pai('a', 1, 1));
            list.add(new Pai('a', 2, 2));
            list.add(new Pai('b', 3, 0));
            list.add(new Pai('b', 8, 0));
            list.add(new Pai('c', 8, 1));
            list.add(new Pai('c', 8, 2));
            list.add(new Pai('b', 6, 0));
            list.add(new Pai('a', 6, 1));
        }
        return list;
    }

    public static String getString(Pai pai) {
        String str = "";
        switch (pai.getHuaSe()) {
            case 'a':
                str = "Tiao";
                str = pai.getSeq() + 1 + " " + str;
                break;
            case 'b':
                str = "Bing";
                str = pai.getSeq() + 1 + " " + str;
                break;
            case 'c':
                str = "Wan";
                str = pai.getSeq() + 1 + " " + str;
                break;
            case 'd':
                switch (pai.getSeq()) {
                case 0:
                    str = "Dong";
                    break;
                case 1:
                    str = "Nan";
                    break;
                case 2:
                    str = "Xi";
                    break;
                case 3:
                    str = "Bei";
                    break;
                case 4:
                    str = "Zhong";
                    break;
                case 5:
                    str = "Fa";
                    break;
                case 6:
                    str = "Bai";
                    break;
                }
                break;
            default:
                str = "Error: Misc Pai";
                break;
            }
            return str;
    }

}