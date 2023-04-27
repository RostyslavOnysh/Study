package MateAcademy.OOP.JV_Robot;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        Direction dirX = (robot.getX() - toX > 0) ? Direction.RIGHT : Direction.LEFT;
        Direction dirY = (robot.getY() - toY > 0) ? Direction.DOWN : Direction.UP;

        while (robot.getDirection() != dirX) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while (robot.getDirection() != dirY) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
