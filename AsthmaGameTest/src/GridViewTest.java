import edu.upenn.cis.cis350.AsthmaGameActivity;
import edu.upenn.cis.cis350.Direction;
import edu.upenn.cis.cis350.R;
import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import edu.upenn.cis.cis350.GameGridView;


//public class GridViewTest extends ActivityInstrumentationTestCase2<AsthmaGameActivity> {

//	public GridViewTest(){
//		
//		super("edu.upenn.cis350", AsthmaGameActivity.class);
//		  }
//		
//	private AsthmaGameActivity _activity;
//	private GridView _gridview;
//	
//	
//	 public void setUp() throws Exception { 
//		      super.setUp();
//		      _activity = getActivity();
//		      _activity.cancelTimer();
//		      _gridview = (GridView)_activity.findViewById(R.id.gridview1);
//		      
//		   }
//	
//	 public void testGridValues(){
//		 _activity.runOnUiThread(new Runnable(){
//			 public void run(){	 
//				 
//			 }
//	
//		 });
//		 getInstrumentation().waitForIdleSync();
//		
//		 assertEquals(( _gridview).getGridValue(_gridview.getCharX(),(_gridview.getCharY())), 2);
//		 assertEquals(( _gridview).getGridValue(_gridview.getVill_1X(),(_gridview.getVill_1Y())), 3);
//		 assertEquals(( _gridview).getGridValue(_gridview.getVill_2X(),(_gridview.getVill_2Y())), 3);
//		 assertEquals(( _gridview).getGridValue(_gridview.getVill_3X(),(_gridview.getVill_3Y())), 3);
//		 assertEquals(( _gridview).getGridValue(_gridview.getVill_4X(),(_gridview.getVill_4Y())), 3);
//
//	 }
//	 
//	 public void testCharacterMovement(){
//		 //test character moving left
//		 _gridview.getCharacter().setDirection(Direction.Left);
//		 int init_charx = _gridview.getCharX();
//		 int init_chary = _gridview.getCharY();
//		 _activity.runManually();
//		assertEquals(2,(_gridview).getGridValue(init_charx-1, init_chary));
//		assertEquals(0,(_gridview).getGridValue(init_charx, init_chary));
//		 
//		//test character moving right
//		 _gridview.getCharacter().setDirection(Direction.Right);
//		 init_charx = _gridview.getCharX();
//		 init_chary = _gridview.getCharY();
//		 _activity.runManually();
//		assertEquals(2,(_gridview).getGridValue(init_charx+1, init_chary));
//		assertEquals(0,(_gridview).getGridValue(init_charx, init_chary));
//		
//		//test character moving up
//		 _gridview.getCharacter().setDirection(Direction.Up);
//		 init_charx = _gridview.getCharX();
//		 init_chary = _gridview.getCharY();
//		 _activity.runManually();
//		assertEquals(2,(_gridview).getGridValue(init_charx, init_chary-1));
//		assertEquals(0,(_gridview).getGridValue(init_charx, init_chary));
//		
//		//test character moving down
//		 _gridview.getCharacter().setDirection(Direction.Down);
//		  init_charx = _gridview.getCharX();
//		 init_chary = _gridview.getCharY();
//		 _activity.runManually();
//		assertEquals(2,(_gridview).getGridValue(init_charx, init_chary+1));
//		assertEquals(0,(_gridview).getGridValue(init_charx, init_chary));
//		
//		//test an invalid movement
//		 _gridview.getCharacter().setDirection(Direction.Right);
//		 init_charx = _gridview.getCharX();
//		 init_chary = _gridview.getCharY();
//		 _activity.runManually();
//		assertEquals(1,(_gridview).getGridValue(init_charx+1, init_chary));
//		assertEquals(2,(_gridview).getGridValue(init_charx, init_chary));
//		
//		
//	 }
//	 
//	 
//	 
//	 public void testVillainMovementLeft(){
//		 _activity.cancelTimer();
//		 int init_villx;
//		 int init_villy;
//		 _gridview.setVillainPosition(7, 7);
//		 _gridview.getCharacter().move(6, 7);
//		 _gridview.getCharacter().setDirection(Direction.Left);
//		// test villain movement left
//		init_villx = _gridview.getVillain().getX();
//		init_villy = _gridview.getVillain().getY();
//		_gridview.getVillain().setDirection(Direction.Left);
//		_activity.runManually();
//		assertEquals(3, _gridview.getGridValue(init_villx - 1, init_villy));
//		assertEquals(0, _gridview.getGridValue(init_villx, init_villy));
//	 }
//	 
//	  public void testVillainMovementRight(){
//		  
//			 _activity.cancelTimer();
//			 int init_villx;
//			 int init_villy;
//			 _gridview.setVillainPosition(7, 7);
//			 _gridview.getCharacter().move(8, 7);
//			 _gridview.getCharacter().setDirection(Direction.Right);
//			// test villain movement left
//			init_villx = _gridview.getVillain().getX();
//			init_villy = _gridview.getVillain().getY();
//			_gridview.getVillain().setDirection(Direction.Right);
//			_activity.runManually();
//			assertEquals(3, _gridview.getGridValue(init_villx + 1, init_villy));
//			assertEquals(0, _gridview.getGridValue(init_villx, init_villy));
//		  
//		  
//	  }
//	  public void testVillainMovementUp(){
//		  
//			 _activity.cancelTimer();
//			 int init_villx;
//			 int init_villy;
//			 _gridview.setVillainPosition(7, 7);
//			 _gridview.getCharacter().move(7, 6);
//			 _gridview.getCharacter().setDirection(Direction.Up);
//			// test villain movement left
//			init_villx = _gridview.getVillain().getX();
//			init_villy = _gridview.getVillain().getY();
//			_gridview.getVillain().setDirection(Direction.Up);
//			_activity.runManually();
//			assertEquals(3, _gridview.getGridValue(init_villx , init_villy-1));
//			assertEquals(0, _gridview.getGridValue(init_villx, init_villy));
//		  
//	  }
//	 
//	  public void testVillainMovementDown(){
//		
//			 int init_villx;
//			 int init_villy;
//			 _gridview.setGridValue(7, 8, 0);
//			 _gridview.setVillainPosition(7, 7);
//			 _gridview.getCharacter().move(7, 8);
//			 _gridview.getCharacter().setDirection(Direction.Down);
//			// test villain movement left
//			init_villx = _gridview.getVillain().getX();
//			init_villy = _gridview.getVillain().getY();
//			_gridview.getVillain().setDirection(Direction.Down);
//			_activity.runManually();
//			assertEquals(3, _gridview.getGridValue(init_villx , init_villy+1));
//			assertEquals(0, _gridview.getGridValue(init_villx, init_villy));
//		  
//		  
//		  
//		  
//	  }
//	 
//	public void testCollision(){
//		 _gridview.setMeter(10);
//		 int init_villx = _gridview.getVillain().getX();
//		 int init_villy = _gridview.getVillain().getY();
//		 _gridview.setVillainPosition(7, 7);
//		 _gridview.getCharacter().move(7,7);
//		 _gridview.checkCollision();
//		 assertTrue(_gridview.getCollision());
//		 assertEquals(9, _gridview.getMeter());
//		 _activity.runManually();
//		 assertEquals(3, _gridview.getGridValue(init_villx, init_villy));
//	 }
//	 
//	 
//	public void testInhaler(){
//		_gridview.setMeter(5);
//		_gridview.setGridValue(12, 10, 4);
//		_gridview.getCharacter().move(11, 10);
//		_gridview.getCharacter().setDirection(Direction.Right);
//		_activity.runManually();
//		assertEquals(10,_gridview.getMeter());
//		assertEquals(2,_gridview.getGridValue(12, 10));
//		
//		
//	} 
//	 
	 
//}
