import server.WebServer;

public class Main {

    public static void main(String[] args) throws Exception {
        WebServer webServer = new WebServer();
        webServer.createServer(8000);
    }
}

