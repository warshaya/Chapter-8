import acm.graphics.*;

public class GRoof extends GPolygon
{
	public GRoof( int width, double height )
	{
		addVertex( 0, 0 );
		addVertex( width, 0 );
		addVertex( width/2.0, -height );
	}
}
