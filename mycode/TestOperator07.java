/**
*������������Ԫ�����ӷ����÷������ȼ�������÷�
**/
public class TestOperator07{
	
	public static void main(String[] args){
		int score=90;
		String a=score<60?"������":"����";
		
		System.out.println(a);
		
		if(score<60){
			a="������";
		}else{
			a="����";
		}
		
		int x=-100;
		int flag=x>0?1:(x==0?0:-1);
		System.out.println(flag);//�������0
		
		
		//���ȼ�������÷�
		boolean s1=true,s2=true,s3=false;
		System.out.println(s1||s2&&s3);//�߼����������>��>��
		
		//����ʹ��С������֯���ʽ
		boolean s4=(3>1||4>3)&&(3<5);
		System.out.println(s4);
	}
}