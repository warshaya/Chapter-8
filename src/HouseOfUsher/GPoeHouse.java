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
		m_house = new GTower( houseBaseWidth, houseBaseHeight, houseRoofHeight );
		m_leftTower = new GTower( leftTowerBaseWidth, leftTowerBaseHeight, leftTowerRoofHeight );
		m_rightTower = new GTower( rightTowerBaseWidth, rightTowerBaseHeight, rightTowerRoofHeight );
		m_door = new GTower( doorBaseWidth, doorBaseHeight, doorRoofHeight );
		m_leftWindow = new GWindow( leftWindowWidth, leftWindowHeight, 1, 1 );
		m_rightWindow = new GWindow( rightWindowWidth, rightWindowHeight, 1, 1 );
	
		m_height = Math.max( Math.max( m_house.getObject().getHeight(), m_leftTower.getObject().getHeight() ),
					m_rightTower.getObject().getHeight() );

		m_width = Math.max( Math.max( m_house.getObject().getWidth(), m_leftTower.getObject().getWidth() ),
					m_rightTower.getObject().getWidth() );

		m_gCompound.add( m_house.getObject(), m_leftTower.getObject().getWidth(), m_height-m_house.getObject().getHeight() );
		m_gCompound.add( m_leftTower.getObject(), 0, m_height-m_leftTower.getObject().getHeight() );
		m_gCompound.add( m_rightTower.getObject(), m_leftTower.getObject().getWidth() + m_house.getObject().getWidth(),
					m_height-m_rightTower.getObject().getHeight() );
		m_gCompound.add( m_door.getObject(), m_leftTower.getObject().getWidth()+m_house.getObject().getWidth()/2-
					m_door.getObject().getWidth()/2, m_height-m_door.getObject().getHeight() );
		m_gCompound.add( m_leftWindow.getObject(), m_house.getObject().getX()+leftWindowDistanceFromWall,
					m_height-leftWindowDistanceFromGround-m_leftWindow.getObject().getHeight() );
		m_gCompound.add( m_rightWindow.getObject(), m_rightTower.getObject().getX()-m_rightWindow.getObject().getWidth()-
					rightWindowDistanceFromWall, m_height-rightWindowDistanceFromGround-
					m_rightWindow.getObject().getHeight() );
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
	private GTower m_house;
	private GTower m_leftTower;
	private GTower m_rightTower;
	private GTower m_door;
	private GWindow m_leftWindow;
	private GWindow m_rightWindow;	
	private double m_height;
	private double m_width;
}
