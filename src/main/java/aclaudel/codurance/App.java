package aclaudel.codurance;

import spark.Spark;

import static spark.Spark.get;

public class App {

    public static void main(String[] args) {
        Spark.port(3000);
        get("/hello", (req, res) -> "Hello World");
    }

}
