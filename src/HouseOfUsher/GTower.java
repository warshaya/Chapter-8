import acm.graphics.*;

public class GTower
{
	public GTower( double baseWidth, double baseHeight, double roofHeight )
	{
		m_gCompound = new GCompound();
		m_base = new GRect( baseWidth, baseHeight );
		m_roof = new GRoof( baseWidth, roofHeight );

		m_gCompound.add( m_roof.getObject() );
		m_gCompound.add( m_base, 0, m_roof.getObject().getHeight() );
	}

	public GObject getObject()
	{
		return m_gCompound;
	}

	private GCompound m_gCompound;
	private GObject m_base;
	private GRoof m_roof;
}
