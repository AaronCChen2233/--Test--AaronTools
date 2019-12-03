package Tools;

import java.util.List;

/***
 * @author Aaron Chen
 */
public class ListTools {
    /***
     *
     * @param list
     * @param leftCount
     * @return
     */
    public static List<String> subList(List<String> list, int leftCount) {
        if(list.size()!=0){
            list = list.subList(0, (list.size() < leftCount ? list.size() : leftCount));
        }
        return list;
    }

    /***
     * clear this list
     * @param list
     * @return
     */
    public static List<String> clearList(List<String> list) {
        if(list != null){
            list.clear();
        }
        return list;
    }
}
