import acm.program.*;
import acm.graphics.*;

public class DrawHeart extends GraphicsProgram{	

	private GPoint m_upperPoint = new GPoint();
	private GPoint m_leftPoint = new GPoint();
	private GPoint m_rightPoint = new GPoint();
	private GPoint m_bottomPoint = new GPoint();
	
	public void init()
	{
		setSize(600,300);
	}
	
	public void run()
	{
		m_upperPoint.setLocation( getWidth()/2, getHeight()/5);
		m_bottomPoint.setLocation( m_upperPoint.getX(), 4*m_upperPoint.getY());
		GLine line = new GLine(m_upperPoint.getX(), m_upperPoint.getY(),
									m_bottomPoint.getX(), m_bottomPoint.getY());
		add(line);
		
	}

	private int getDiagonalOfSquare()
	{
		return Math.min(3*getWidth()/5, 3*getHeight()/5);
	}


}
