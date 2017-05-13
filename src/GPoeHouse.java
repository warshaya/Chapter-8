import acm.graphics.*;

public class GPoeHouse extends GCompound
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
				double rightWindowDistanceFromWall, double rightWindowDistanceFromGround )
	{
		m_house = new GTower( houseBaseWidth, houseBaseHeight, houseRoofHeight);
		m_leftTower = new GTower( leftTowerBaseWidth, leftTowerBaseHeight, leftTowerRoofHeight );
		m_rightTower = new GTower( rightTowerBaseWidth, rightTowerBaseHeight, rightTowerRoofHeight );
		m_door = new GTower( doorBaseWidth, doorBaseHeight, doorRoofHeight );
		m_leftWindow = new GWindow( leftWindowWidth, leftWindowHeight, 1, 1 );
		m_rightWindow = new GWindow( rightWindowWidth, rightWindowHeight, 1, 1 );
	
		m_height = Math.max( Math.max( m_house.getHeight(), m_leftTower.getHeight() ),
					m_rightTower.getHeight() );

		m_width = Math.max( Math.max( m_house.getWidth(), m_leftTower.getWidth() ),
					m_rightTower.getWidth() );

		add( m_house, m_leftTower.getWidth(), m_height-m_house.getHeight() );
		add( m_leftTower, 0, m_height-m_leftTower.getHeight() );
		add( m_rightTower, m_leftTower.getWidth() + m_house.getWidth(),
			m_height-m_rightTower.getHeight() );
		add( m_door, m_leftTower.getWidth()+m_house.getWidth()/2-m_door.getWidth()/2,
			m_height-m_door.getHeight() );
		add( m_leftWindow, m_house.getX()+leftWindowDistanceFromWall,
			m_height-leftWindowDistanceFromGround-m_leftWindow.getHeight() );
		add( m_rightWindow, m_rightTower.getX()-m_rightWindow.getWidth()-rightWindowDistanceFromWall,
			m_height-rightWindowDistanceFromGround-m_rightWindow.getHeight() );
	}

	private GObject m_house;
	private GObject m_leftTower;
	private GObject m_rightTower;
	private GObject m_door;
	private GObject m_leftWindow;
	private GObject m_rightWindow;	
	private double m_height;
	private double m_width;
}
