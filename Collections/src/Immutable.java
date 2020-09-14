
public  final class Immutable {
 
	 final int StNo;
	 final String SName;
	 public Immutable(int Stno,String SName)
	 {
		 this.StNo=Stno;
		 this.SName=SName;
	 }
	 
	 public String getStNo()
	 {
		 return SName;
	 }
	 public int getSName()
	 {
		 return StNo;
	 }

 public static void main(String args[])
 {
	 Immutable im=new Immutable(1,"Mouli");
	 System.out.println(im.getSName());
	 System.out.println(im.getStNo());
	 
 }
}