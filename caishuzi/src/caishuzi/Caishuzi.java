package caishuzi;

import java.util.Scanner;

public class Caishuzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner in=new Scanner(System.in);
				int shuzuber=(int)(Math.random()*100+1);
				int a;
				int b=1;
				int c=100;
				int count=0;
				System.out.println("数字范围为"+b+"~"+c);
				do{
					a=in.nextInt();
					count=count+1;
					if(a>shuzuber)
					{
						System.out.println("偏大,数字范围为"+b+"~"+a);
						c=a;
					}

					if(a<shuzuber)
					{
						System.out.println("偏小,数字范围为"+a+"~"+c);
						b=a;
					}
				}while(a!=shuzuber);
				System.out.println("恭喜你猜对了，你猜了"+count+"次");
			}

		

	}

