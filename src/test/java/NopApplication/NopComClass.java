package NopApplication;


	import org.junit.After;
	import org.junit.Before;

	public class NopComClass {

	    @Before
	    public void setup() {
	        
	        System.out.println("launching app on chrome browser");
	        
	    }
	    
	    @After
	    public void teardown() {
	        
	        System.out.println("closing an app");
	        
	    }
	    
	}

	
	
	
	

