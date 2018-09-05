package persional.weijiad.testDemo.webService.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * �ӿڷ���
 * @author duweijia
 *
 */
@WebService
public class PublishWebService {
	
	/**
	 * ����
	 * @param cityName
	 * @return
	 */
	public String getWeather(String cityName){
		return cityName+"����ת��";
	}
	
	/**
	 * �����Ľӿ�
	 * @param name
	 * @return
	 */
	public String getValue(String name){
		return "hello"+name;
	}
	
	/**
	 * �÷���������
	 */
	@WebMethod(exclude=true)
	public String getValue1(String name){
		return "hello girl"+name;
	}
	
	/**
	 * ��̬����������
	 * @param name
	 * @return
	 */
	public static String getValue3(String name){
		return "hello boy"+name;
	}
	
	/**
	 * ��������������
	 * @param args
	 */
	public static void main(String []args){
		Endpoint.publish("http://localhost:8016/webSerivce/servicePub?wsdl", new PublishWebService());
		System.out.println("�����ɹ�");
	}
}
