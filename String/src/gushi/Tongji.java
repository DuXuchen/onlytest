package gushi;

public class Tongji {
	public void T(String string1,String string2) throws E{
		int r1,r2,s=0;
		//ͳ��ָ���ַ����ֵĴ���
		for(int i=0;i<100;i++) {
		    r1=string1.indexOf(string2);
				if(r1==-1)
			        break;
			string1 = string1.substring(r1+1,string1.length()-1);
		    s++;
		}
				
        //�����쳣
		if(s==0) {
			E e=new E("�׳��쳣");
			throw e;
		}
		
		System.out.print("\n"+string2+"�ֳ��ֵ�����Ϊ�� "+s);
	}
}
