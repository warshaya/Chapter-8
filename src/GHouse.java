import acm.graphics.*;

public class GHouse extends GCompound
{
	private int m_width;
	private int m_height;

	private GRect m_walls;
	private GObject m_roof;

	public GHouse( int width, int height , int roofHeight)
	{
		m_width = width;
		m_height = height;

		m_walls = new GRect( 0, 0);
		m_walls.setSize( width, height );
		add( m_walls );

		m_roof = new GRoof( width, roofHeight );
		add ( m_roof );
		m_height += roofHeight;
	}

	public GHouse( double width, double height , double roofHeight)
	{
		this( (int)width, (int)height , (int)roofHeight );
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
