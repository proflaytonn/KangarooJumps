
public class Solution {

		public static void main(String[] args) {
			//hackerrank case : https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
			
//	        int x1 = 0;
//	        int v1 = 3;
//	        int x2 = 4;
//	        int v2 = 2;

//	        int x1 = 0;
//	        int v1 = 2;
//	        int x2 = 5;
//	        int v2 = 3;

//	        int x1 = 14;
//	        int v1 = 4;
//	        int x2 = 98;
//	        int v2 = 2;

//	        int x1 = 43;
//	        int v1 = 2;
//	        int x2 = 70;
//	        int v2 = 2;
			
//	        int x1 = 1571;
//	        int v1 = 4240;
//	        int x2 = 9023;
//	        int v2 = 4234;

	        int x1 = 28;
	        int v1 = 8; //9x
	        int x2 = 96;
	        int v2 = 2; //4x print NO karena jump nya beda, walaupun ketemu di titik yg sama

	        int distanceX1 = x1+v1;
	        int distanceX2 = x2+v2;
	        int moduloNum = distanceX2 % distanceX1;
	        int totalX1 = 0;
	        int totalX2 = 0;

	        if(distanceX1 == distanceX2)
	        {
	            System.out.println("YES");
	        }
	        else if(v2 > v1)
	        {
	            System.out.println("NO");
	        }
	        else if(v1 == v2 && x2>x1)
	        {
	            System.out.println("NO");
	        }
	        else if(moduloNum % (v1-v2) == 0 )
	        {
	            System.out.println("YES");
	        }
	        else if((v1-v2) % (moduloNum % (v1-v2)) == 0)
	        {
	            do {
	                do {
	                    x1 = x1 + v1;
	                    totalX1++;
	                }
	                while (x1 < x2);
	                do {
	                    x2 = x2 + v2;
	                    totalX2++;
	                }
	                while (x2 < x1);
	            }while(x1 != x2);

	            if(totalX1 == totalX2)
	            {
	                System.out.println("YES");
	            }
	            else System.out.println("NO");
	        }
	        else if(moduloNum == 0 && x2 % x1 == 0)
	        {
	            System.out.println("YES");
	        }
	        else System.out.println("NO");
	    }

}
