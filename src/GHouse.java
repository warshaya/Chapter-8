import acm.graphics.*;

public class GHouse extends GCompound
{
	private int m_width, m_height;
	private GRect m_walls = new GRect( 0, 0 );
	private GObject m_roof = new GPolygon();
	
	public GHouse( int width, int height )
	{
		m_width = width;
		m_height = height;

		m_walls.setSize( m_width, m_height );
		add( m_walls );
	}

	public double getWidth()
	{
		return m_width;
	}

	public double getHeight()
	{
		return m_height;
	}
}
