import java.util.ArrayList;
public class e{
    public static ArrayList<Integer> union(ArrayList<Integer> n1, ArrayList<Integer> n2){
        ArrayList uniao = new ArrayList<>(100);
        uniao.add(n1);
        uniao.add(n2);
        return uniao;
    }
}