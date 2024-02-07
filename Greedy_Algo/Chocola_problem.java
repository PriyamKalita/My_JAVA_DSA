import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Chocola_problem {
    public static void main(String[] args) {
        int n =4; 
        int m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHar[] = {4, 1, 2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHar, Collections.reverseOrder());

        int h =0; 
        int v =0;
        int hp = 1;
        int vp = 1;
        int cost = 0;

        while (h < costHar.length && v < costVer.length) {
            if (costVer[v] <= costHar[h]) {
                cost += (costHar[h] * vp);
                hp++;
                h++;
            }else{
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < costHar.length) {
            cost += (costHar[h] * vp);
            hp++;
            h++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimum Cost of cut : " + cost);
    }
}
