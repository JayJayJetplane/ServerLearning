package server;

import com.sun.net.httpserver.HttpServer;
import handler.RootHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

public class WebServer {

    public void createServer(int port) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        System.out.println("server started on port " + port);
        server.createContext("/", new RootHandler());
        server.setExecutor(null);
        server.start();
    }

}
