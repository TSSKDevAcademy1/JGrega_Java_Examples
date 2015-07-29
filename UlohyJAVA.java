/////////////////////////////////////////////////////////////////
///////////////////// MAIN SUBOR PRE ULOHY //////////////////////
////////////////////// ULOHA.1. ////////////////////////
public class Main {
	
	public static void main(String[] args){
		PrintTriangle t = new PrintTriangle(10);
	//	p.toString();
		System.out.println(t);
	}
	
}

////////////////////// ULOHA.2. ////////////////////////
public class Main {
	
	public static void main(String[] args){
		PrintLine l = new PrintLine(10,true);
	//	p.toString();
		System.out.println(l);
	}
	
}

////////////////////// ULOHA.3. ////////////////////////
public class Main {
	
	public static void main(String[] args){
		PrintSquare s = new PrintSquare(10);
	//	p.toString();
		System.out.println(s);
	}
	
}

//////////////////// ULOHA.4. ////////////////////////
public class Main {
	
	public static void main(String[] args){
		PrintSquare s = new PrintSquare(10,15);
	//	p.toString();
		System.out.println(s);
	}
	
}

///////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
/* /////////////// ULOHA.1. TRIANGLE CLASS ////////////////////
  TODO: Expected output from the program for size = 10
             *
            ***
           *****
          *******
         *********
        ***********
       *************
      ***************
     *****************
    *******************
*/

// Trieda Triangle
//- size: int (+ getery a setery)
//+ toString() - vypis trojuholnika podla size


public class PrintTriangle {
    private int size;
    private String send;
    
    public PrintTriangle(int size){
    	this.size = size;
    }

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}	
	
	@Override
	public String toString() {
		int i = 0;
		String str = "";
		String str2 = "";
		while(i < size) 
		{
	      str2 += printChars(size - i - 1, ' ');
	      str2 +=   printChars(2 * (i + 1) -1, '*'); 
	        str2 += "\n";
	        i++; 	        
	    }		
		return str2;
	}	
	
	public String printChars(int length, char c) {
	    String str1 = "";
		for(int i = 0; i < length; i++) {
	        str1 += c;
	    }
		return str1;
	}	
}


///////////////////// ULOHA.2. TRIEDA-LINE /////////////////////
//Trieda Line
//- length: int
//- vertical: boolean
//toString() - vypis ciary podla dlzky, ak je vertical tak sa vypise vertikalne, ak nie, tak horizontalne

public class PrintLine {
   private int length;
   private boolean vertical;
   
   
   
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public boolean isVertical() {
	return vertical;
}
public void setVertical(boolean vertical) {
	this.vertical = vertical;
}

public PrintLine(int length, boolean vertical){
	   this.length = length;
	   this.vertical = vertical;
   }

@Override
public String toString() {
	String str ="";
	
	for (int i = 0; i < length; i++) {
		//if(vertical == true)
	  str += "*";
	  if(vertical == true)
		str += "\n"; 
	}
	if(vertical == false)
		str += "\n";
	
	return str;
}


/////////////////////// ULOHA.3. TRIEDA-PrintSquare /////////////////////////
//Trieda Square
//- size: int
//toString() - vypis rovnostranneho trojuholnika podla size

public class PrintSquare {
	private int size;
	
	public PrintSquare(int size){
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
		
        @Override
	public String toString() {
		int i;
		int j;
		String str = "";
		
	for( i = 0; i < size; i++) {
            for(j = 0; j < size; j++) {
                str += "*";
            }
            str += "\n";
        }	
		
		return str;
	}    
}

////////////////////////////// ULOHA 4. TRIEDA-Rectangle //////////////////////////////
//Trieda Rectangle▄£ⁿ| |Ä,Ä
//- width: int
//- heigh|t: int
//toString() - vypis stvorca podla sirky a dlzky

public class PrintSquare {
	private int width;
	private int height;
	
	public PrintSquare(int width,int height){
		this.width = width;
		this.height = height;
	}
			
        public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

		@Override
	public String toString() {
		int i;
		int j;
		String str = "";
		
	for( i = 0; i < width; i++) {
            for(j = 0; j < height; j++) {
                str += "*";
            }
            str += "\n";
        }	
		
		return str;
	}    
}











