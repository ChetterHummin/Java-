/**
*�����߼�����ϵ��������÷�
*/
public class TestOperator04{
	
	public static void main(String[] args){
		
		//�����߼������
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1&b2);//�룺��һ��false�������false
		System.out.println(b1|b2);//����һ��true�������true
		System.out.println(!b2);//ȡ��
		System.out.println(b1^b2);//�����ͬfalse����ͬtrue
		
		//��·�롢��·��
		//int b3=3/0;//�ᱨ���ܳ���0���쳣
		boolean b3=1>2&&(4<3/0);
		System.out.println(b3);
	}
}