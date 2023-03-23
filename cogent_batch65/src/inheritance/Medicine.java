package inheritance;

public class Medicine {
String mName;
String mAddress;
public String getmName() {
	return mName;
}
public void setmName(String mName) {
	this.mName = mName;
}
public String getmAddress() {
	return mAddress;
}
public void setmAddress(String mAddress) {
	this.mAddress = mAddress;
}

public void displayLabel(){
	System.out.println("Company Name "+ mName +" Company Address "+ mAddress);
}
}
