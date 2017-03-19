import acm.graphics.*;

public class PumpkinNose extends GCompound
{
	private GPolygon m_nose = new GPolygon();

	public PumpkinNose()
	{
		m_nose.addVertex( -1, 0 );
		m_nose.addVertex( 1, 0 );
		m_nose.addVertex( 0, -2 );
		m_nose.setFilled ( true );
		add( m_nose );
	}
}
