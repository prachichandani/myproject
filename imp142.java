//max area in histogram
import java.util.*;
public class imp142 {

    public static void histogram(int arr[]){
       Stack <Integer> s = new Stack<>();
       //nsr
       int nsr [] = new int[arr.length];
       int nsl [] = new int[arr.length];
    
        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);

        }
        s = new Stack<>(); // khali kar rhi hu
        for(int i =0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl [i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        int maxarea =0;
        for(int i =0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i]-1;
            int area = height*width;
            maxarea = Math.max(maxarea, area);
        }
        System.out.println(maxarea);


    }
    public static void main(String args[]){
        int arr [] = {2,1,5,6,2,3};
        histogram(arr);
    }
    
}
