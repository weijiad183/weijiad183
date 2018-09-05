package persional.weijiad.testDemo.webService.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * 接口发布
 * @author duweijia
 *
 */
@WebService
public class PublishWebService {
	
	/**
	 * 发布
	 * @param cityName
	 * @return
	 */
	public String getWeather(String cityName){
		return cityName+"多云转晴";
	}
	
	/**
	 * 发布的接口
	 * @param name
	 * @return
	 */
	public String getValue(String name){
		return "hello"+name;
	}
	
	/**
	 * 该方法不发布
	 */
	@WebMethod(exclude=true)
	public String getValue1(String name){
		return "hello girl"+name;
	}
	
	/**
	 * 静态方法不发布
	 * @param name
	 * @return
	 */
	public static String getValue3(String name){
		return "hello boy"+name;
	}
	
	/**
	 * 主函数启动发布
	 * @param args
	 */
	public static void main(String []args){
		Endpoint.publish("http://localhost:8016/webSerivce/servicePub?wsdl", new PublishWebService());
		System.out.println("发布成功");
	}
}
