import entity.Constants;
import jdbc.RobotQuery;
import org.junit.Assert;
import org.junit.Test;

public class RobotTest {
    @Test
    public void robotTest() {
        RobotQuery robotQuery = new RobotQuery();
        Assert.assertNotNull(robotQuery.getRobot(Constants.QUERY_TYPE_INIT, ""));
        Assert.assertNull(robotQuery.getRobot(Constants.QUERY_TYPE_QUESTION, "name"));
        Assert.assertNotNull(robotQuery.getRobot(Constants.QUERY_TYPE_QUESTION, "yes"));
        Assert.assertNotNull(robotQuery.getRobot(Constants.QUERY_TYPE_ANSWER,
                "Great the shift is at 1313 Mockingbird Ln at 2/15/2021 4:00pm-12:00am.We'll see you there!"));
    }
}
