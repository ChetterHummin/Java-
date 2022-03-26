/**
*测试位运算符的用法
*/
public class TestOperator05{
	public static void main(String[] args){
		int a=7;//0111
		int b=8;//1000
		System.out.println(a&b);//0000
		System.out.println(a|b);//1111
		System.out.println(a^b);//11111
		System.out.println(~b);//0111
		
		//移位
		//乘以2，除以2，使用移位操作，最快！！！
		int c=5<<1;//相当于5*2
		System.out.println(c);
		System.out.println(5<<2);//相当于：5*2*2
		System.out.println(40>>3);//相当于：40/8
		
	}
}