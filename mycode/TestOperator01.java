/**
*测试算术运算符的用法
*/ 

public class TestOperator01{
	
	public static void main(String[] args){
		int a=3;
		int b=4;
		long c=a+b;
		
		double d=3+3.14;
		double d2=32/3;  //两个数相除，直接保留结果的整数部分，没有四舍五入
		
		//int arg=12;
		int e=-10%3;//取余操作。结果符号和左边操作数相同
		System.out.println(d2);
		System.out.println(e);
		
		//测试自增，自减
		int g=30;
		g++;
		g--;
		g=10;
		int h=g++;//g++先赋值，后自增
		g=10;
		int i=++g;//++g先自增后赋值
		
		System.out.println(h);
		System.out.println(i);
		
	}
}