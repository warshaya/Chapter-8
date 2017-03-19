import acm.graphics.*;
import java.awt.Color;

public class PumpkinEyes extends GCompound
{
	private GPolygon m_leftEye = new GPolygon();
	private GPolygon m_rightEye = new GPolygon();

	public PumpkinEyes()
	{
		add( m_leftEye, -3, 0 );
		add( m_rightEye, 3, 0 );

	
		m_leftEye.addVertex( -1.0, -1.0 );
		m_leftEye.addVertex( 1, -1 );
		m_leftEye.addVertex( 0, 1 );
		m_leftEye.setFilled( true );

		m_rightEye.addVertex( -1, -1 );
		m_rightEye.addVertex( 1, -1 );
		m_rightEye.addVertex( 0, 1 );
		m_rightEye.setFilled( true );
	}

}
