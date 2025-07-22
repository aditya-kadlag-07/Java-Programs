public class staticmethod {
	
	    int a=10;
	    static int b=10;
	    public static  void demo()
	    {
	       // System.out.println("Demo");
	    	//System.out.println(this.a);
	    }
	    {
	       // System.out.println(b);
	        //System.out.println(stati.b);
	        System.out.println(this.a);
	    }
	    static{
	       int a=20;
	    	System.out.println(a);
	    	System.out.println("static block");
	    }
	    //static variable --> static method,directly,class name,object reference
	    //static v-->static block by three ways
	    //static v-->ns method--directly, class name reference 
	    // ns v --> ns method--directly,class name refrence
	    //ns 
	    //
	    public static void main(String[] args)
	    {
	    /*System.out.println(b);
	    System.out.println(CM1.b);  
	     CM1 cm = new CM1();
	     System.out.println(CM1.b);
	     CM1 cm1 = new CM1();
	     cm1.a=20;*/
	    // System.out.println(CM1.a);
	    //  CM1.demo();
	     
	     staticmethod a = new staticmethod();
	    }

}




