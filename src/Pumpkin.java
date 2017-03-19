import acm.graphics.*;

public class Pumpkin extends GCompound
{	
	private GObject m_nose = new GRect( 10, 10 );
	private GObject m_stem = new GRect( 5, 5 );
	private GObject m_eyes = new PumpkinEyes();
	private GObject m_mouth = new GRect( 30, 30);
	private GObject m_body = new PumpkinBody( PumpkinDrawer.BODYWIDTH, PumpkinDrawer.BODYHEIGHT );
	
	public Pumpkin()
	{
	add(m_body);
	add(m_stem);
	add(m_eyes, 0, -5 );
	add(m_mouth);
	add(m_nose);
	}
}
