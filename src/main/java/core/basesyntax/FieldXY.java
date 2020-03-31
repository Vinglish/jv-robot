package core.basesyntax;

/**
 * <p>На игровом поле находится робот. Позиция робота на поле описывается двумя
 * целочисленным координатами: X и Y. 
 * Ось X смотрит слева направо, ось Y — снизу вверх.(Помните, как рисовали 
 * графики функций в школе?)
 * В начальный момент робот находится в некоторой позиции на поле.
 * Также известно, куда робот смотрит: вверх, вниз, направо или налево.
 * Ваша задача — привести робота в заданную точку игрового поля.
 * Реализуйте метод moveRobot()</p>
 */
public class FieldXY {

    public void moveRobot(Robot robot, int toX, int toY) {
        Direction directX = robot.getX() < toX ? Direction.RIGHT : Direction.LEFT;;
        Direction directY = robot.getY() < toY ? Direction.UP : Direction.DOWN;

        findDirection(robot, directX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        findDirection(robot, directY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public void findDirection(Robot robot, Direction currentDirect) {
        while (robot.getDirection() != currentDirect) {
            robot.turnLeft();
        }
    }
}

