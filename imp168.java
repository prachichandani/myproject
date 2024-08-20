import java.util.*;
public class imp168 {
    public static void main(String args[]){
        int l = -3;
        int r = 3;
        int op[] = new int[r-l+1];
        int index = 0;
        for(int i = l;i<=r;i++){
           op[index++] = i;
        }
        // for(int i =0;i<op.length;i++){
        //     System.out.println(op[i]);
        // }
        // System.out.println();
        int max = Integer.MAX_VALUE;
        int count = 0;
        for(int i =0;i<op.length;i++){
            if(op[i]%2!=0){
                count++;
                max = Math.max(max,op[i]);
            }
        }
        System.out.println(count);
        
        if(max>count){
            System.out.println("0");
        }else{
            System.out.println(max);
        }
       
    }
}
