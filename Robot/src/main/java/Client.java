import entity.Constants;
import jdbc.RobotQuery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        try {

            Socket socket = new Socket("127.0.0.1", 5200);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter write = new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            RobotQuery robotQuery = new RobotQuery();
            System.out.println(robotQuery.getRobot(Constants.QUERY_TYPE_INIT, "").question);

            while (!(line = br.readLine()).equals("end")) {
                write.println(line);
                write.flush();
                System.out.println(in.readLine());
            }

            write.close();
            in.close();
            socket.close();

        } catch (Exception e) {
            System.out.println("can not listen to:" + e);
        }
    }
}
