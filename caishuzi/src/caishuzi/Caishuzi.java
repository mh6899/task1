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
				System.out.println("���ַ�ΧΪ"+b+"~"+c);
				do{
					a=in.nextInt();
					count=count+1;
					if(a>shuzuber)
					{
						System.out.println("ƫ��,���ַ�ΧΪ"+b+"~"+a);
						c=a;
					}

					if(a<shuzuber)
					{
						System.out.println("ƫС,���ַ�ΧΪ"+a+"~"+c);
						b=a;
					}
				}while(a!=shuzuber);
				System.out.println("��ϲ��¶��ˣ������"+count+"��");
			}

		

	}

