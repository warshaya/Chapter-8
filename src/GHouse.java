import acm.graphics.*;

public class GHouse extends GCompound
{
	private GRect m_walls;
	private GObject m_roof;
	private GObject m_door;

	public GHouse( double wallWidth, double wallHeight , double roofHeight)
	{
		m_walls = new GRect( wallWidth, wallHeight);
		add( m_walls, 0, roofHeight);

		m_roof = new GRoof( wallWidth, roofHeight );
		add ( m_roof, 0, 0 );
	}
}
