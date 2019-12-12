package test;

public class StringTest {

	public static void main(String[] args) {
		
		
		String oldStream = "vspu_01";
		String oldStreamBaseBuildStr = null;
	    if(oldStream.length()>2) {
		oldStreamBaseBuildStr = oldStream.substring(2);
		oldStream = oldStream.substring(0, 1);
	    }
	    
	    System.out.println("oldStream "+oldStream);
	    
	    System.out.println("oldStreamBaseBuildStr "+oldStreamBaseBuildStr);

	}

}
