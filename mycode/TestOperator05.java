/**
*����λ��������÷�
*/
public class TestOperator05{
	public static void main(String[] args){
		int a=7;//0111
		int b=8;//1000
		System.out.println(a&b);//0000
		System.out.println(a|b);//1111
		System.out.println(a^b);//11111
		System.out.println(~b);//0111
		
		//��λ
		//����2������2��ʹ����λ��������죡����
		int c=5<<1;//�൱��5*2
		System.out.println(c);
		System.out.println(5<<2);//�൱�ڣ�5*2*2
		System.out.println(40>>3);//�൱�ڣ�40/8
		
	}
}