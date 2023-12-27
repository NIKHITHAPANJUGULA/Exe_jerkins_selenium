package basicTest;

	

	import org.junit.After;
	import org.junit.Before;

	public class NopCom {

	    @Before
	    public void setup() {
	        
	        System.out.println("launching app on chrome browser");
	        
	    }
	    
	    @After
	    public void teardown() {
	        
	        System.out.println("closing an app");
	        
	    }
	    
	}

	
	
	
	
	
	

