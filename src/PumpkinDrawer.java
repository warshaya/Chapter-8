import acm.program.*;
import acm.graphics.*;

public class PumpkinDrawer extends GraphicsProgram
{
	public static final double BODYWIDTH = 200;
	public static final double BODYHEIGHT = 200;
	public static final double EYE_LEVEL = -BODYHEIGHT/4; //from center of pumpkin
	public static final double STEMWIDTH = 15;
	public static final double STEMHEIGHT = 20;
		
	public void run()
	{
		GObject pumpkin = new Pumpkin();
		add( pumpkin, getWidth()/2, getHeight()/2 );		
	}
}
