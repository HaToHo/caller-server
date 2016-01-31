package caller.server;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import spark.Request;

import java.util.HashMap;


@RunWith(MockitoJUnitRunner.class)
public class WebServerTest {

    WebServer myWebServer;

    @Mock
    private Request request;

    @Before
    public void setup() {
        myWebServer = new WebServer();
    }

    @Test
    public void testName() throws Exception {
        HashMap<String, String> myTestMap = new HashMap<String, String>();
        myTestMap.put(":name", "Hans");
        myTestMap.put(":age", "37");
        Mockito.when(request.params()).thenReturn(myTestMap);
        assert myWebServer.greet(request).equals("Hello Hans you are 37");
        assert false;
    }
}


