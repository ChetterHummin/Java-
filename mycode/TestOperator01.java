/**
*����������������÷�
*/ 

public class TestOperator01{
	
	public static void main(String[] args){
		int a=3;
		int b=4;
		long c=a+b;
		
		double d=3+3.14;
		double d2=32/3;  //�����������ֱ�ӱ���������������֣�û����������
		
		//int arg=12;
		int e=-10%3;//ȡ�������������ź���߲�������ͬ
		System.out.println(d2);
		System.out.println(e);
		
		//�����������Լ�
		int g=30;
		g++;
		g--;
		g=10;
		int h=g++;//g++�ȸ�ֵ��������
		g=10;
		int i=++g;//++g��������ֵ
		
		System.out.println(h);
		System.out.println(i);
		
	}
}