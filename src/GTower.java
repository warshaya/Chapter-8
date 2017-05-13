import acm.graphics.*;

public class GTower extends GCompound
{
	public GTower( double baseWidth, double baseHeight, double roofHeight )
	{
		m_base = new GRect( baseWidth, baseHeight );
		m_roof = new GRoof( baseWidth, roofHeight );

		add( m_roof );
		add( m_base, 0, m_roof.getHeight() );
	}

	private GObject m_base;
	private GObject m_roof;
}
