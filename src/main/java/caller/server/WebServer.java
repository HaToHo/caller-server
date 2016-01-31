package caller.server;

import static spark.Spark.*;
import spark.servlet.SparkApplication;
import spark.Request;

public class WebServer implements SparkApplication {

    @Override
    public void init() {
        get("/hello", (req, res) -> "Hello");
        get("/hello/:name/:age", (req, res) -> greet(req));
    }

    public String greet(Request req) {
        return "Hello " + req.params().get(":name") +
                " you are " +  req.params().get(":age");
    }
}


