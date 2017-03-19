import acm.graphics.*;

public class Pumpkin extends GCompound
{	
	private GCompound m_nose = new PumpkinNose();
	private GObject m_stem = new PumpkinStem();
	private GCompound m_eyes = new PumpkinEyes();
	private GCompound m_mouth = new PumpkinMouth();
	private GObject m_body = new PumpkinBody( PumpkinDrawer.BODYWIDTH, PumpkinDrawer.BODYHEIGHT );
	
	public Pumpkin()
	{
	add( m_body );
	add( m_stem, 0, -PumpkinDrawer.BODYHEIGHT/2 );
	m_eyes.scale( 10, 10 );
	add( m_eyes, 0, PumpkinDrawer.EYE_LEVEL );
	m_mouth.scale( 10, 10 );
	add( m_mouth, m_mouth.getWidth()/2, PumpkinDrawer.BODYHEIGHT/4 );
	m_nose.scale( 11, 11 );
	add( m_nose );
	}
}
