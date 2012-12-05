package com.naleid.sample;

import spark.servlet.SparkApplication;
import static spark.Spark.get;
import static spark.Spark.post;
import spark.Request;
import spark.Response;
import spark.Route;

public class Api implements SparkApplication {

    public static void main(String[] args) {
        SparkApplication app = new Api();
        app.init();
    }

    @Override
    public void init() {

        System.out.println("Starting up SparkApplication");

        get(new Route("/api/hello/:name") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello, " + request.params(":name") + "!";
            }
        });
    }

}