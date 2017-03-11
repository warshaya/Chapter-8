import acm.graphics.*;

public class Initial extends GCompound {

	public final static int STYLE = 0;
	public final static int CURVY = 1;

	public final static GPoint TOPLEFT = new GPoint( -10, -20 );
	public final static GPoint TOPMIDDLE = new GPoint( 0, -20 );
	public final static GPoint TOPRIGHT = new GPoint( 10, -20 );
	public final static GPoint MIDDLELEFT = new GPoint( -10, 0 );
	public final static GPoint CENTER = new GPoint();
	public final static GPoint MIDDLERIGHT = new GPoint( 10, 0 );
	public final static GPoint BOTTOMLEFT = new GPoint( -10, 20 );
	public final static GPoint BOTTOMMIDDLE = new GPoint( 0, 20 );
	public final static GPoint BOTTOMRIGHT = new GPoint( 10, 20 );

	public void drawStroke( int style, GPoint start, GPoing end )
	{
		if ( style == CURVY )
		{

		}

		else if ( style == STRAIGHT )
		{
			GLine line = new GLine();
			line.setStartPoint( start.getX(), start.getY() );
			line.setEndPoint( end.getX(), end.getY() );	
			
		}
	} 

}
