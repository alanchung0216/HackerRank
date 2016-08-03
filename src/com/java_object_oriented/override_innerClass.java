package com.java_object_oriented;

public class override_innerClass {

	public class Sports{

	    String getName(){
	        return "Generic Sports";
	    }
	  
	    void getNumberOfTeamMembers(){
	        System.out.println( "Each team has n players in " + getName() );
	    }
	}
	static class static_inner {
		int i;		
	}
	
	public class Soccer extends Sports{
	    @Override
	    String getName(){
	        return "Soccer Class";
	    }
	    @Override
	    void getNumberOfTeamMembers() {
	        System.out.println("Each team has 11 players in " + getName());
	    }
	}
	    
	public static void main(String[] args) {
		override_innerClass os = new override_innerClass();
		
		// this is how to access static_inner
		override_innerClass.static_inner test = new override_innerClass.static_inner();
		
		//override_innerClass.Sports c1 = os.new Sports();
		Sports c1 = os.new Sports(); // ok too
		//override_innerClass.Soccer c2 = os.new Soccer();
        Soccer c2 = os.new Soccer(); // ok too
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
	}
}

