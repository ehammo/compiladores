class Factorial {
    public static void main(String[] t) {
    	System.out.println(new Fac().ComputeFac(10));
    }
}

class Fac {

    public int ComputeFac(int num){
    	boolean s;
		int num_aux ;
    	s = num;
		if (num < 1)
		    num_aux = 1 ;
		else 
		    num_aux = num * (this.ComputeFac(num-1)) ;
		return num_aux ;
	    }

}
