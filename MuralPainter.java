import org.code.neighborhood.*;
public class MuralPainter extends PainterPlus {
//direction and for painter to paint backround
public void PaintBackground (String color, int size) {
setPaint(71);
if (canMove("south")) {
  PaintLine(color);
  paint(color);
  turnRight();
  move();
  paint(color);
  turnRight();
  PaintLine(color);
  paint(color);
  turnLeft();
  move();
  paint(color);
 turnLeft();
   PaintLine(color);
  paint(color);
  turnRight();
  move();
  paint(color);
  turnRight();
  PaintLine(color);
  paint(color);
  turnLeft();
  move();
  paint(color);
 turnLeft();
   PaintLine(color);
  paint(color);
  turnRight();
  move();
  paint(color);
  turnRight();
  PaintLine(color);
  paint(color);
  turnLeft();
  move();
  paint(color);
 turnLeft();
   PaintLine(color);
  paint(color);
  turnRight();
  move();
  paint(color);
  turnRight();
  PaintLine(color);
  paint(color);
  turnLeft();
 
    } 
}
}