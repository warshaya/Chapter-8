import acm.graphics.*;

public class GPoeHouse
{
	public GPoeHouse( double houseBaseWidth, double houseBaseHeight, double houseRoofHeight,
				double leftTowerBaseWidth, double leftTowerBaseHeight, 
				double leftTowerRoofHeight,
				double rightTowerBaseWidth, double rightTowerBaseHeight, 
				double rightTowerRoofHeight,
				double doorBaseWidth, double doorBaseHeight, double doorRoofHeight,
				double leftWindowWidth, double leftWindowHeight,
				double rightWindowWidth, double rightWindowHeight, 
				double leftWindowDistanceFromWall, double leftWindowDistanceFromGround,
				double rightWindowDistanceFromWall, double rightWindowDistanceFromGround)
	{
		m_gCompound = new GCompound();
		GTower house = new GTower( houseBaseWidth, houseBaseHeight, houseRoofHeight );
		GTower leftTower = new GTower( leftTowerBaseWidth, leftTowerBaseHeight, leftTowerRoofHeight );
		GTower rightTower = new GTower( rightTowerBaseWidth, rightTowerBaseHeight, rightTowerRoofHeight );
		GTower door = new GTower( doorBaseWidth, doorBaseHeight, doorRoofHeight );
		GWindow leftWindow = new GWindow( leftWindowWidth, leftWindowHeight, 1, 1 );
		GWindow rightWindow = new GWindow( rightWindowWidth, rightWindowHeight, 1, 1 );
	
		double height = Math.max( Math.max( house.getObject().getHeight(), leftTower.getObject().getHeight() ),
					rightTower.getObject().getHeight() );

		double width = Math.max( Math.max( house.getObject().getWidth(), leftTower.getObject().getWidth() ),
					rightTower.getObject().getWidth() );

		m_gCompound.add( house.getObject(), leftTower.getObject().getWidth(), height-house.getObject().getHeight() );
		m_gCompound.add( leftTower.getObject(), 0, height-leftTower.getObject().getHeight() );
		m_gCompound.add( rightTower.getObject(), leftTower.getObject().getWidth() + house.getObject().getWidth(),
					height-rightTower.getObject().getHeight() );
		m_gCompound.add( door.getObject(), leftTower.getObject().getWidth()+house.getObject().getWidth()/2-
					door.getObject().getWidth()/2, height-door.getObject().getHeight() );
		m_gCompound.add( leftWindow.getObject(), house.getObject().getX()+leftWindowDistanceFromWall,
					height-leftWindowDistanceFromGround-leftWindow.getObject().getHeight() );
		m_gCompound.add( rightWindow.getObject(), rightTower.getObject().getX()-rightWindow.getObject().getWidth()-
					rightWindowDistanceFromWall, height-rightWindowDistanceFromGround-
					rightWindow.getObject().getHeight() );
	}	

	public GObject getGObject()
	{
		return m_gCompound;
	}

	public double getWidth()
	{
		return m_gCompound.getWidth();
	}
	
	public double getHeight()
	{
		return m_gCompound.getHeight();
	}

	public void add( GObject gobj, double x, double y )
	{
		m_gCompound.add( gobj, x, y );
	}
	
	private GCompound m_gCompound;
}
