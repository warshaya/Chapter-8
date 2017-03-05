import acm.program.*;
import acm.graphics.*;

public class DrawHeart extends GraphicsProgram{	

	private GPoint m_upperPoint = new GPoint();
	private GPoint m_leftPoint = new GPoint();
	private GPoint m_rightPoint = new GPoint();
	private GPoint m_bottomPoint = new GPoint();
	private double m_units;
	private double m_centerXPosition;
	private double m_centerOfSquareY;
	private double m_side;
	private double m_radius;
	private GPoint m_leftCircleLocation;
	private GPoint m_rightCircleLocation; 
	private double m_circleDiameter;
	private double m_diagonal;

	public void init()
	{
		setSize(600,300);
	}
	
	public void run()
	{
		m_units = getHeight()/13; // one unit is 1/13 of the height, seemed to fit nicely
		m_centerXPosition = getWidth()/2;
		m_centerOfSquareY = 7*m_units;
		m_radius = 4*m_units;
		m_upperPoint.setLocation( m_centerXPosition, 3*m_units );
		m_bottomPoint.setLocation( m_centerXPosition, 11*m_units );
		m_rightPoint.setLocation( m_centerXPosition + m_radius, m_centerOfSquareY );
		m_leftPoint.setLocation( m_centerXPosition - m_radius, m_centerOfSquareY );
		GLine lineLeft = new GLine(m_leftPoint.getX(), m_leftPoint.getY(),
					m_bottomPoint.getX(), m_bottomPoint.getY());
		add(lineLeft);
		GLine lineRight = new GLine(m_rightPoint.getX(), m_rightPoint.getY(),
					m_bottomPoint.getX(), m_bottomPoint.getY());
		add(lineRight);
		m_side = Math.cos(45)*8*m_units;
		m_diagonal = 8*m_units;
		m_circleDiameter = m_side;
		GArc leftHump = new GArc(m_centerXPosition + m_side - m_diagonal, 
					m_centerOfSquareY-m_circleDiameter,
					m_circleDiameter, m_circleDiameter, 45, 180);
		add(leftHump);
	}
}
