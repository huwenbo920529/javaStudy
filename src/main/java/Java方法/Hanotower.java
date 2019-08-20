package Java方法;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/10 17:06
 * Description:
 */
public class Hanotower {
    public static void doTowers(int topN, char from, char inter,  char to){
        if(topN == 1){
            System.out.println("Disk 1 from " + from + " to " + to);
        }else {
            doTowers(topN -1, from, to, inter);
            System.out.println("Disk " + topN + " from "+ from + " to " + to);
            doTowers(topN-1, inter, from, to);
        }
    }

    public static void main(String[] args) {
        int nDisk = 3;
        doTowers(nDisk, 'A', 'B', 'C');
    }
}
