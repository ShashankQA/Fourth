package getRequest;

import org.codehaus.groovy.transform.EqualsAndHashCodeASTTransformation;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Rules {

	@Test 
	public void rules()
	{
	given().
		param("","").
		header("name","morpheus").
		header("job","leader").
		header("Content-Type","application/json").
		
	when().
		get("https://reqres.in/api/users").
		
	then().
	
	  
		statusCode(200).
		log().all();
		
	}
	
	
}
