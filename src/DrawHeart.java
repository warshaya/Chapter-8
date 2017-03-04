import acm.program.*;
import acm.graphics.*;

public class DrawHeart extends GraphicsProgram{	

	private GPoint m_upperPoint = new GPoint();
	private GPoint m_leftPoint = new GPoint();
	private GPoint m_rightPoint = new GPoint();
	private GPoint m_bottomPoint = new GPoint();
	private double m_oneUnit;
	private double m_middlePoint;
	
	public void init()
	{
		setSize(600,300);
	}
	
	public void run()
	{
		m_oneUnit = Math.min(getWidth()/5, getHeight()/5);
		m_middlePoint = getWidth()/2;
		m_upperPoint.setLocation( m_middlePoint, m_oneUnit );
		m_bottomPoint.setLocation( m_middlePoint, 4*m_oneUnit );
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
