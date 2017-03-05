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
		m_diagonal = 8*m_units;
		m_upperPoint.setLocation( m_centerXPosition, 3*m_units );
		m_bottomPoint.setLocation( m_centerXPosition, 11*m_units );
		m_rightPoint.setLocation( m_centerXPosition + m_diagonal/2, m_centerOfSquareY );
		m_leftPoint.setLocation( m_centerXPosition - m_diagonal/2, m_centerOfSquareY );
		GLine lineLeft = new GLine( m_leftPoint.getX(), m_leftPoint.getY(),
					m_bottomPoint.getX(), m_bottomPoint.getY());
		add(lineLeft);
		GLine lineRight = new GLine( m_rightPoint.getX(), m_rightPoint.getY(),
					m_bottomPoint.getX(), m_bottomPoint.getY());
		add(lineRight);
		m_side = m_diagonal/2 / Math.cos(45);
		GLine testLineLeft = new GLine( m_upperPoint.getX(), m_upperPoint.getY(),
					m_leftPoint.getX(), m_leftPoint.getY());
		add(testLineLeft);
		GLine testLineRight = new GLine( m_upperPoint.getX(), m_upperPoint.getY(),
					m_rightPoint.getX(), m_rightPoint.getY());
		add(testLineRight); 
		m_circleDiameter = m_side;
		GArc leftHump = new GArc( m_centerXPosition, 
					m_centerOfSquareY,
					m_side, m_side, 45, 180);
		add(leftHump);
		GArc rightHump = new GArc( m_centerXPosition,
					m_centerOfSquareY,
					m_side, m_side, -45, 180);
		add(rightHump);
	}
}
