
import com.sun.net.httpserver.Request;

import java.io.*;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Main {
    public static void main(String[] args) {
        int poolSizeThreads = 64;
        int port = 9999;
        Server server = new Server(port, poolSizeThreads);



                // код инициализации сервера (из вашего предыдущего ДЗ)

                // добавление хендлеров (обработчиков)
//                server.addHandler("GET", "/messages", new Handler() {
//
//
//                    public void handle(Request request, BufferedOutputStream responseStream) {
//                        // TODO: handlers code
//                    }
//                });
//                server.addHandler("POST", "/messages", new Handler() {
//                    public void handle(Request request, BufferedOutputStream responseStream) {
//                        // TODO: handlers code
//                    }
//                });

        //  server.listen(9999);
        server.start();
            }
        }

