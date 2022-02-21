package Assignments;
public class SoftToy{
	
private int constNum=1;

private String originalString;
private char codeChar;

private SoftToy() {
	this.constNum=2;
	this.codeChar='a';
}

public SoftToy(String originalString) {
	
	this();
	this.originalString=originalString;
}

public SoftToy(String originalString, char codeChar){
this.originalString=originalString;
this.codeChar=codeChar;
	
}
public String getCodeString() {
	this.originalString=this.originalString.substring(0,this.constNum)+this.originalString.substring(this.constNum+1);
	return this.originalString;
}

public static void main(String[] args) {
	
	SoftToy demoObj1=new SoftToy("Caravan");
	System.out.println(demoObj1.getCodeString());
	
	SoftToy demoObj2=new SoftToy("Banyan", 'n');
	System.out.println(demoObj2.getCodeString());
			
	
}
	
}
