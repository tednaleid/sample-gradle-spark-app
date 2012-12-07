package com.naleid.sample;

import dagger.ObjectGraph;
import spark.servlet.SparkApplication;
import static spark.Spark.get;
import static spark.Spark.post;
import spark.Request;
import spark.Response;
import spark.Route;

public class Api implements SparkApplication {

    ApiController apiController;

    public static void main(String[] args) {
        SparkApplication app = new Api();
        app.init();
    }

    @Override
    public void init() {
        ObjectGraph objectGraph = ObjectGraph.create(new ApiModule());
        apiController = objectGraph.get(ApiController.class);
        apiController.createRoutes();
    }

}