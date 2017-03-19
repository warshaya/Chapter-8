import acm.graphics.*;

public class PumpkinStem extends GCompound
{
	private GRect m_stem = new GRect( PumpkinDrawer.STEMWIDTH , PumpkinDrawer.STEMHEIGHT );	

	public PumpkinStem()
	{
		m_stem.setFilled( true );
		add( m_stem, -PumpkinDrawer.STEMWIDTH/2, -PumpkinDrawer.STEMHEIGHT );
	}
}
