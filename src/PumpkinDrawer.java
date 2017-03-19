import acm.program.*;
import acm.graphics.*;

public class PumpkinDrawer extends GraphicsProgram
{
	public static final double BODYWIDTH = 200;
	public static final double BODYHEIGHT = 200;
	
	public void run()
	{
		GObject m_pumpkin = new Pumpkin();
		add( m_pumpkin, getWidth()/2, getHeight()/2 );		
	}
}
