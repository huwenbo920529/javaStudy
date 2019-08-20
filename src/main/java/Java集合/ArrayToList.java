package Java集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/15 16:49
 * Description:
 */
public class ArrayToList {
    public static void main(String[] args) {
        int n = 5;
        String[] name = new String[n];
        for(int i= 0; i< n; i++){
            name[i] = String.valueOf(i);
        }
        List<String> list = Arrays.asList(name);
        System.out.println();
        for(String li: list){
            String str = li;
            System.out.println(str+ " ");
        }
    }
}
