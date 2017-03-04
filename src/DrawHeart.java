import acm.program.*;
import acm.graphics.*;

public class DrawHeart extends GraphicsProgram{	

	private GPoint m_upperPoint = new GPoint();
	private GPoint m_leftPoint = new GPoint();
	private GPoint m_rightPoint = new GPoint();
	private GPoint m_bottomPoint = new GPoint();
	private double m_unit;
	private double m_centerXPosition;
	private double m_centerOfSquareY;
	private double m_side;
	private GPoint m_leftCircleLocation;
	private GPoint m_rightCircleLocation; 
	private double m_circleDiameter;	

	public void init()
	{
		setSize(600,300);
	}
	
	public void run()
	{
		m_unit = getHeight()/13;
		m_centerXPosition = getWidth()/2;
		m_centerOfSquareY = 7*m_unit;
		m_upperPoint.setLocation( m_centerXPosition, 3*m_unit );
		m_bottomPoint.setLocation( m_centerXPosition, 11*m_oneUnit );
		m_rightPoint.setLocation( m_middlePoint + 2*m_oneUnit, 2*m_oneUnit );
		m_leftPoint.setLocation( m_middlePoint - 2*m_oneUnit, 2*m_oneUnit );
		GLine lineLeft = new GLine(m_leftPoint.getX(), m_leftPoint.getY(),
									m_bottomPoint.getX(), m_bottomPoint.getY());
		add(lineLeft);
		GLine lineRight = new GLine(m_rightPoint.getX(), m_rightPoint.getY(),
				m_bottomPoint.getX(), m_bottomPoint.getY());
		add(lineRight);
		GArc leftHump = new GArc(m_middlePoint - 2.5*m_oneUnit, 0, 2.5*m_oneUnit, 2.5*m_oneUnit, 
									45, 180);
		add(leftHump);
		
	}




}
