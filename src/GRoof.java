import acm.graphics.*;

public class GRoof extends GPolygon
{
	public GRoof( double width, double height )
	{
		addVertex( width/2.0, 0 );
		addVertex( width, height );
		addVertex( 0, height );
	}
}
