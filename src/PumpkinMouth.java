import acm.graphics.*;

public class PumpkinMouth extends GCompound
{
	private GPolygon m_mouth = new GPolygon();

	public PumpkinMouth()
	{
		for( int i=0; i<11; i++ )
		{
			m_mouth.addVertex( -5 + i, .5*Math.pow( -1, i ) );
		}
		for( int i=7; i>0; i-- )
		{
			m_mouth.addVertex( -4 + i, 2 + .5*Math.pow( -1, i+1 ) );
		}
		m_mouth.setFilled( true );
		add( m_mouth, -m_mouth.getWidth()/2, -m_mouth.getHeight()/2 );
	}
}
