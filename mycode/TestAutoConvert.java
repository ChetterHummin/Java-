/**
*���������Զ�ת��
*/
public class TestAutoConvert{
	public static void main(String[] args){
		//����С�����Ϳ����Զ�ת���������������
		int a=2345;
		long b=a;
		//int c=b;//long���Ͳ����Զ�ת����int
		double d=b;
		float f=b;
		
		//���������γ�����int���ͣ����ǿ����Զ�ת�ɣ�byte/short/char.
		//ֻҪ��������Ӧ�ı�����Χ
		byte h1=123;
		//byte h2=1234;//1234������byte�ı�����Χ
		
		char h3=97+25;
		System.out.println(h3);
		
	}
}