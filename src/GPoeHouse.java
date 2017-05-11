import acm.graphics.*;

public class GPoeHouse extends GCompound
{
	private GObject m_house;
	private GObject m_turretOne;
	private GObject m_turretTwo;

	private double m_height;
	private double m_width;

	public GPoeHouse()
	{
		m_height = Math.max( m_house.getHeight(), m_turretOne.getHeight() );
		m_height = Math.max( m_height, m_turretTwo.getHeight() );

		m_width = Math.max( m_house.getWidth(), m_turretOne.getWidth() );
		m_width = Math.max( m_width, m_turretTwo.getWidth() );

		add( m_house, m_turretOne.getWidth(), m_height );
		add( m_turretOne, 0, m_height );
		add( m_turretTwo, m_turretOne.getWidth() + m_house.getWidth(), m_height );
	}
}
