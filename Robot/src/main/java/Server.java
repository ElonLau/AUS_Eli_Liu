import entity.Constants;
import entity.Robot;
import jdbc.RobotQuery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        Server socketService = new Server();
        socketService.oneServer();
    }

    public void oneServer() {
        try {
            ServerSocket server = null;

            try {
                server = new ServerSocket(5200); // initialize
            } catch (Exception e) {
                System.out.println("can not listen to:" + e);
            }
            Socket socket = null;

            try {
                socket = server.accept(); // accept
            } catch (Exception e) {
                System.out.println("Error." + e);
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            String line;
            RobotQuery robotQuery = new RobotQuery();

            String preQuestion = robotQuery.getRobot(Constants.QUERY_TYPE_INIT, "").question;

            while (!(line = in.readLine()).equals("end")) {
                System.out.println(line);
                String response = getAnswer(robotQuery, preQuestion, line);
                if (response == null) {
                    writer.println(Constants.MARKED_WORDS + " " + preQuestion); // MARKED_WORDS = "I'm sorry, I didn't
                                                                                // understand your response."; invalid
                                                                                // handler
                    writer.flush();
                    continue;
                }
                writer.println(response);
                writer.flush();
                preQuestion = response;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getAnswer(RobotQuery robotQuery, String preQuestion, String question) {
        Robot robot = robotQuery.getRobot(Constants.QUERY_TYPE_QUESTION, question);
        Robot preRobot = robotQuery.getRobot(Constants.QUERY_TYPE_ANSWER, preQuestion);
        if (robot == null || preRobot == null || preRobot.id != robot.parentId) {
            return null;
        }
        return robot.answer;
    }
}
