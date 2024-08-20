import java.util.*; //chocola problem
public class imp166 {
    public static void main(String args[]){
        int n =4; int m = 6;
        Integer costver [] = {2,1,3,1,4};
        Integer costhor [] = {4,1,2};,
        Arrays.sort(costver, Collections.reverseOrder());
        Arrays.sort(costhor, Collections.reverseOrder());
        int h =0;
        int v =0;
        int hp=1; int vp =1;
        int cost = 0;
        while(h<costhor.length&&v<costver.length){
            if(costver[v]<=costhor[h]){
                cost+=(costhor[h]*vp);
                h++;
                hp++;
            }else{
                cost+=(costver[v]*hp);
                v++;
                vp++;
            }
        }
        while(h<costhor.length){
            cost+=(costhor[h]*vp);
            h++;
            hp++;
        }
        while(v<costver.length){
            cost+=(costver[v]*hp);
            v++;
            vp++;
        }
        System.out.println(cost);
    }
    
}
