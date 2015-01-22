import com.cisco.example.ExampleDomain;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestClient {
    public static void main(String[] args) throws Exception {
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:9999/hello");
        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }
        //String output = response.getEntity(String.class);
        ExampleDomain hello = response.getEntity(ExampleDomain.class);	//Get the object from the response
        System.out.println("Output client .... \n");
        System.out.println(hello.say);
    }
}
