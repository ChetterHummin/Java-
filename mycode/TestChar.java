/*
*����char�͵�Ӧ��
*/

public class TestChar{
	
	public static void main(String[] args){
		char c1='a';
		char c2='��';
		char c3='\u0061';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//java ���ַ������ǻ����������ͣ�����һЩ��
		String str="�Ұ��й�";
		System.out.println(str);
		
		//ת���ַ�
		char c5='\n';
		System.out.println("a\n\"b\"\nc\ne\n\\f\ng");
		System.out.println("o\tp\tq\tr\ts\tt");
	}
}