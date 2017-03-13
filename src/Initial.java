import acm.graphics.*;

public class Initial extends GCompound {

	public final static int STYLE = 0;
	public final static int CURVY = 1;
	
	private final static int WIDTH = 20;
	private final static int HEIGHT = 40;

	public final static GPoint TOPLEFT = new GPoint( -10, -20 );
	public final static GPoint TOPMIDDLE = new GPoint( 0, -20 );
	public final static GPoint TOPRIGHT = new GPoint( 10, -20 );
	public final static GPoint MIDDLELEFT = new GPoint( -10, 0 );
	public final static GPoint CENTER = new GPoint();
	public final static GPoint MIDDLERIGHT = new GPoint( 10, 0 );
	public final static GPoint BOTTOMLEFT = new GPoint( -10, 20 );
	public final static GPoint BOTTOMMIDDLE = new GPoint( 0, 20 );
	public final static GPoint BOTTOMRIGHT = new GPoint( 10, 20 );

	public void drawStroke( int style, GPoint start, GPoint end )
	{
		if ( style == CURVY )
		{
			double rectBoundHeight;
			double beginX = -10;
			double beginY;
			double startAngle;
			double sweepAngle;
			if ( end.getY() - start.getY() <= HEIGHT/2 ) // decide if GArc is full-size or half-size
			{
				rectBoundHeight = HEIGHT/2; 
				if ( end.getY() < 0 ) // decide if GArc is in top half or bottom half
				{
					beginY = -10;
					
				{
				else
				{
					beginY = 0;
				}
			}
			else
			{
				rectBoundHeight = HEIGHT;
				beginY = -10;
			}
			// need to turn start and end points to start and sweep angles, use atan()
			
			GArc curve = new GCurve( beginX, beginY, WIDTH, rectBoundHeight, );
		}
		else if ( style == STRAIGHT )
		{
			GLine line = new GLine();
			line.setStartPoint( start.getX(), start.getY() );
			line.setEndPoint( end.getX(), end.getY() );	
			
		}
	} 

}
