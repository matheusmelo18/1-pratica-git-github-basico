import java.util.ArrayList;
public class f{
public static ArrayList<Integer> intersect (ArrayList<Integer> n1, ArrayList<Integer> n2){
ArrayList<Integer> intersect = new ArrayList (100);
for(int i = 0; i<intersect.size(); i++){if(n1.get(i)==n2.get(i) || n2.get(i)==n1.get(i))intersect.add(n1);intersect.add(n2);}
return intersect;
	}
}
