import java.util.ArrayList;
import java.util.List;

public class MajiangUtil {
    public static void print(List<Pai> paiList) {
        List<String> nameList = new ArrayList<>();
        for (Pai pai: paiList) {
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
            nameList.add(str);
        }
        System.out.println(nameList);
    }

}