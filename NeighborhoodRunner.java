import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  MuralPainter kyle = new MuralPainter();
     BallPainter noah = new BallPainter();
//paints backround then paints soccer ball
    kyle.PaintBackground("green", 8);
    noah.PaintBall("white", 6);
    noah.PaintBlack("black");

    
  }
}