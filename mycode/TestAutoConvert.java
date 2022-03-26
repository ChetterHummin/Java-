/**
*测试类型自动转换
*/
public class TestAutoConvert{
	public static void main(String[] args){
		//容量小的类型可以自动转换成容量大的类型
		int a=2345;
		long b=a;
		//int c=b;//long类型不能自动转换成int
		double d=b;
		float f=b;
		
		//特例：整形常量是int类型，但是可以自动转成：byte/short/char.
		//只要不超过对应的表数范围
		byte h1=123;
		//byte h2=1234;//1234超过了byte的表数范围
		
		char h3=97+25;
		System.out.println(h3);
		
	}
}