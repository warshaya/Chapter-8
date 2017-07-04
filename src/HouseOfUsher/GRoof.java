import acm.graphics.*;

public class GRoof
{
	public GRoof( double width, double height )
	{
		m_GPolygon = new GPolygon();
		m_GPolygon.addVertex( width/2.0, 0 );
		m_GPolygon.addVertex( width, height );
		m_GPolygon.addVertex( 0, height );
	}

	public GObject getObject()
	{
		return m_GPolygon;
	}

	private GPolygon m_GPolygon;
}
