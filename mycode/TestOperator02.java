/**
*测试扩展运算符的用法
*/
public class TestOperator02{
	
	public static void main(String[] args){
		int a=3;
		int b=4;
		a+=b;
		System.out.println(a);//相当于：a=a+b;
		
		a=3;
		a*=b+3;//相当于：a=a*(b+3);
		System.out.println(a);
	}
}