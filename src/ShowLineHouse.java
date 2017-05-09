import acm.program.*;
import acm.graphics.*;

public class ShowLineHouse extends GraphicsProgram
{
	private static final double WIDTH_OF_HOUSE = 1.4/3;
	private static final double HEIGHT_OF_HOUSE_WALLS = 1.5/3;
	private static final double HEIGHT_OF_ROOF = 1.0/6;
	private static final double WIDTH_OF_DOOR = .6/6;
	private static final double HEIGHT_OF_DOOR = 1.0/3;
	private static final double DOORKNOB_SIZE = 1.0/6;

	private double m_width;
	private double m_height;
	private double m_centerX;
	private double m_centerY;

	private double m_houseWidth;
	private double m_wallHeight;
	private double m_roofHeight;
	private double m_doorWidth;
	private double m_doorHeight;
	private double m_doorKnobSize;

	public void init()
	{

	}

	public void run()
	{
		m_width = getWidth();
		m_height = getHeight();
		m_centerX = m_width/2;
		m_centerY = m_height/2;
		
		m_houseWidth = m_width*WIDTH_OF_HOUSE;
		m_wallHeight = m_height*HEIGHT_OF_HOUSE_WALLS;
		m_roofHeight = m_height*HEIGHT_OF_ROOF;
		m_doorWidth = m_houseWidth*WIDTH_OF_DOOR;
		m_doorHeight = m_wallHeight*HEIGHT_OF_DOOR;
		m_doorKnobSize = m_doorWidth*DOORKNOB_SIZE;

		GObject m_brickHouse = new GHouse( m_houseWidth, m_wallHeight , m_roofHeight,
							m_doorWidth, m_doorHeight, m_doorKnobSize );
		add( m_brickHouse , m_centerX - m_brickHouse.getWidth()/2, 
					m_centerY - m_brickHouse.getHeight()/2 );
	}
}
