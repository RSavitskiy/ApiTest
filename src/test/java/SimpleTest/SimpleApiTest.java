package SimpleTest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class SimpleApiTest {



    public void  login() {

        Client client = new Client();
        WebResource recourse = client.resource("https://api-dev.tickertocker.com/api/v1/user?sort=id");
        ClientResponse response = recourse.accept("application/json").get(ClientResponse.class);

        String body = response.getEntity(String.class);

        JSONObject object = new JSONObject(body);

        System.out.println(object);

        Assert.assertEquals(200,response.getStatus());





    }





}
