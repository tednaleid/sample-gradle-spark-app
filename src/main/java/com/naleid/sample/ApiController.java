package com.naleid.sample;


import spark.Filter;
import spark.Request;
import spark.Response;
import spark.Route;

import javax.inject.Inject;

import static spark.Spark.*;

public class ApiController {

    @Inject CookieHolder cookieHolder;
    @Inject SampleService sampleService;

    public void createRoutes() {
        before(new Filter() {
            @Override
            public void handle(Request request, Response response) {
                //String cookie = request.headers("cookie");
                // easier for testing with curl
                String cookie = request.queryParams("cookie");
                cookieHolder.setCookie(cookie);
            }
        });

        after(new Filter() {
            @Override
            public void handle(Request request, Response response) {
                cookieHolder.setCookie(null);
            }
        });

        get(new Route("/api/hello/:name") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello, " + request.params(":name") + "! cookie = " + sampleService.showThreadLocalCookie() + "\n";
            }
        });
    }
}
