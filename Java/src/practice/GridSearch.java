package practice;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/the-grid-search
public class GridSearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int x = 0; x < t; x++){
            int a = in.nextInt();
            int b = in.nextInt();
            String[] arr = new String[a];
            for(int i=0; i < a; i++){
                arr[i] = in.next();
                //System.out.println(i+"-->" +arr[i]);
            }
            //System.out.println("output:");
//            for(int i=0; i < a; i++){
//            	System.out.println(i+"-->" +arr[i]);
//            }
//            System.exit(0);
            int c = in.nextInt();
            int d = in.nextInt();
            
            String[] search = new String[c];
            for(int i=0; i < c; i++){
                search[i] = in.next();
            }
//            for(int i=0; i < c; i++){
//            	System.out.println(i+"-->" +search[i]);
//            }
            boolean flag = true;
            int searchlength = search.length;
            for(int i=0;i<a;i++){
            	if(arr[i].contains(search[0])){
            		if(i+searchlength<a){
            			for(int xx=1,jj=i+1;xx<search.length;xx++,jj++){
            				if(!arr[jj].contains(search[xx])){
            					flag=false;
            					break;
            				}
            			}
            		}
            	}
            }
            if(flag){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
        }
        in.close();
	}
}
