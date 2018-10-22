package getRequest;


	
	


	import org.testng.Reporter;
	import org.testng.annotations.Test;

	import static io.restassured.RestAssured.*;
	
	import io.restassured.response.Response;
	import junit.framework.Assert;


public class Direct {
		@Test
		public void testresponcecode()
		{
			int Scode =get("https://samples.openweathermap.org/data/2.5/weather?q=London&appid=b6907d289e10d714a6e88b30761fae22").statusCode();;
			  
			   System.out.println("status code is-" + Scode);
			   Assert.assertEquals(Scode, 200);
			     Reporter.log("status matched");
			     
			     
			   
		}
		@Test
		public void testresponce()
		{
			 String data = get("https://samples.openweathermap.org/data/2.5/weather?q=London&appid=b6907d289e10d714a6e88b30761fae22").asString();
			         System.out.println("status time is  " +data);
			         
			         long time = get("https://samples.openweathermap.org/data/2.5/weather?q=London&appid=b6907d289e10d714a6e88b30761fae22").getTime();
			   System.out.println("status code is  " +time);
			   
			
		}
		
		
		
		

	
}
