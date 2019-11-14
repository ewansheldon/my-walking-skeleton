package aclaudel.codurance;

import spark.Spark;

import static spark.Spark.get;

public class App {

    public static final int DEFAULT_PORT = 80;

    public static void main(String[] args) {
        Spark.port(getPort());
        get("/hello", (req, res) -> "Hello World");
        get("/", (req, res) -> "Welcome");
        get("/jose", (req, res) -> "Hola Jose");
    }

    private static int getPort() {
        String port = System.getenv("PORT");
        if (port != null)
            return Integer.parseInt(port);
        return DEFAULT_PORT;
    }

}
