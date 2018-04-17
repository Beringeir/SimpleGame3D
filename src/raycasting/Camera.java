package raycasting;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Camera implements KeyListener {
public double xPos, yPos, xDir, yDir, xPlane, yPlane;
	 	public boolean left, right, forward, back;
	 	public final double MOVE_SPEED = .08;
	 	public final double ROTATION_SPEED = .045;
	 	
  public Camera(double x, double y, double xd, double yd, double xp, double yp)
  {
	  xPos = x;
	  yPos = y;
	  xDir = xd;
	  yDir = yd;
	  xPlane = xp;
	  yPlane = yp;
  }
}
