
import java.io.*;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int poolSizeThreads = 64;
        int port = 9999;
        Server server = new Server(port, poolSizeThreads);
        server.start();
    }
}