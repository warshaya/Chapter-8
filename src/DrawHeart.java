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
	private double m_diagonal;
	private GLine m_lineLeft = new GLine(0,0,0,0);
	private GLine m_lineRight = new GLine(0,0,0,0);
	private GArc m_leftHump = new GArc(0,0,0,0);
	private GArc m_rightHump = new GArc(0,0,0,0);
	private GCompound m_heart = new GCompound();
	private GPolygon m_middleSquare = new GPolygon();

	public void init()
	{
		setSize(600,300);
	}
	
	public void run()
	{
		setUnits();
		findCenter();
		calculateOtherDimensions();
		setPointsForShape();
		drawAHeart();
		add( m_heart );
	}

	private void setUnits()
	{
		m_units = getHeight()/13; // one unit is 1/13 of the height, seemed to fit nicely
	}

	private void findCenter()
	{
		m_centerXPosition = getWidth()/2;
		m_centerOfSquareY = 7*m_units;
	}

	private void calculateOtherDimensions()
	{
		m_diagonal = 8*m_units;
		m_side = 4 * Math.sqrt(2) * m_units;
	}

	private void setPointsForShape()
	{
		m_upperPoint.setLocation( m_centerXPosition, 3*m_units );
		m_bottomPoint.setLocation( m_centerXPosition, 11*m_units );
		m_rightPoint.setLocation( m_centerXPosition + m_diagonal/2, m_centerOfSquareY );
		m_leftPoint.setLocation( m_centerXPosition - m_diagonal/2, m_centerOfSquareY );
	}

	private void drawAHeart()
	{
	//	m_lineLeft.setStartPoint( m_leftPoint.getX(), m_leftPoint.getY() );
	//	m_lineLeft.setEndPoint( m_bottomPoint.getX(), m_bottomPoint.getY() );
	//	add( m_lineLeft );
	//	m_lineRight.setStartPoint( m_rightPoint.getX(), m_rightPoint.getY() );
	//	m_lineRight.setEndPoint( m_bottomPoint.getX(), m_bottomPoint.getY() );
	//	add (m_lineRight );
		m_middleSquare.addVertex( m_diagonal/2, 0 );
		m_middleSquare.addEdge( -m_diagonal/2, m_diagonal/2);
		m_middleSquare.addEdge( -m_diagonal/2, -m_diagonal/2);
		m_middleSquare.addEdge( m_diagonal/2, -m_diagonal/2);
		m_middleSquare.addEdge( m_diagonal/2, m_diagonal/2);
		m_middleSquare.setColor( color.RED );
		m_middleSquare.setFillColor (color.RED );
		m_middleSquare.setFilled( true );
		m_heart.add( m_middleSquare );
		m_leftHump.setFrameRectangle( m_centerXPosition - 2*m_units - m_side/2, 
					m_centerOfSquareY - 2*m_units - m_side/2 ,
					m_side, m_side );
		m_leftHump.setStartAngle( 45 );
		m_leftHump.setSweepAngle( 180 );
		add( m_leftHump );
		m_rightHump.setFrameRectangle( m_centerXPosition + 2*m_units - m_side/2,
					m_centerOfSquareY - 2*m_units - m_side/2,
					m_side, m_side );
		m_rightHump.setStartAngle( -45 );
		m_rightHump.setSweepAngle( 180);
		add( m_rightHump );
	}
}
