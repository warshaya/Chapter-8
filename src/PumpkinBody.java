import acm.graphics.*;
import java.awt.Color;

public class PumpkinBody extends GCompound
{
	public PumpkinBody( double width, double height )
	{
		GOval body = new GOval( width, height );
		body.setFilled( true );
		body.setColor( Color.ORANGE );
		body.setFillColor( Color.ORANGE );
		add( body, -width/2, -height/2 );
	}
}
