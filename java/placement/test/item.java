// import java.util.Arrays;

import java.util.Arrays;
public class item {
    static void dis(int a[][], int n, int m){
        for(int i = 0; i< n; i++){
            for(int j = 0; j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int item [][] = new int [5][4];
        int top [] = new int [3];
        int n = 5;

        int item[][] = {{1,22,3,4},{1,23,6,4},{2,24,3,5},{2,25,9,2},{3,42,55,2}};
        // System.out.println(Arrays.toString(item[0]));
        int k[][] = new  int [5][2];
        int m =0;
        for(int i =0; i<n;i++){
            if(k[m][0]==item[i][0]){
                int s = item[i][2] *item[i][3];
                k[m][1] = s;
            }else{
                if(i == 0){m = 0;}else{m++;}
                k[m][0] = item[i][0];
                int s = item[i][2] *item[i][3];
                k[m][1] = s;
            }
        }
        dis(k,5,2);

        for(int i =0; i<n; i++){
            int temp[] [] = new int [1][2];
            for(int j = 0; j<n;j++){
                if(k[i][1]>k[j][1]){
                    temp[0][0] = k[j][0];
                    temp[0][1] = k[j][1];
                    k[j][0] = k[i][0];
                    k[j][1] = k[i][1];
                    k[i][0] = temp[0][0];
                    k[i][1] = temp[0][1];

                }
            }
        }
        dis(k,5,2);
        top[0] = k[0][0];
        top[1] = k[1][0];
        top [2] = k[2][0];
        System.out.println(Arrays.toString(top));
    }

}
