import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Wuxinwei
 * @Date: 2021/5/20 20:58
 * @Description:
 */
public class cs {
    public static void main(String[] args) {
        String str = "ahdiwvhbwswuivb@武鑫伟dd@习近平ff";
        String haha = str;/*.replaceAll("@","默");*/
        System.out.println(str);
        Map m = new HashMap();
        String reg = "[^@\u4e00-\u9fa5]";
        String jjstr = haha.replaceAll(reg, "");
        System.out.println(str);
        System.out.println(haha);
        System.out.println(jjstr);
    }
}
