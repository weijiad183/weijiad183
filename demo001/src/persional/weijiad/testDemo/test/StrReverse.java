package persional.weijiad.testDemo.test;
/**
 * �ַ����ķ�ת
 * StringBuilder ��reverse()����
 * @author duweijia
 *
 */
public class StrReverse {
	public static void main (String []args){
		String str = "abcde";
		String resStr = "";
		StringBuilder strBuilder = new StringBuilder(str);
		char []array = str.toCharArray();
		for (int i = array.length-1;i >= 0;i--) {
			resStr = resStr+array[i];
		}
		System.out.println(resStr+"111111111111111");
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		System.out.println(strBuilder.reverse());
	}
}
