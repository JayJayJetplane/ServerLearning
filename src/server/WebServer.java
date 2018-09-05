package server;

import com.sun.net.httpserver.HttpServer;
import handler.RootHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

public class WebServer {

    public void createServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        System.out.println("server started on port 8000");
        server.createContext("/", new RootHandler());
        server.setExecutor(null);
        server.start();
    }

}
