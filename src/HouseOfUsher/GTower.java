import acm.graphics.*;

public class GTower
{
	public GTower( double baseWidth, double baseHeight, double roofHeight )
	{
		m_gCompound = new GCompound();
		GObject base = new GRect( baseWidth, baseHeight );
		GRoof roof = new GRoof( baseWidth, roofHeight );

		m_gCompound.add( roof.getObject() );
		m_gCompound.add( base, 0, roof.getObject().getHeight() );
	}

	public GObject getObject()
	{
		return m_gCompound;
	}

	private GCompound m_gCompound;
}
