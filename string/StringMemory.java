package string;

public class StringMemory {

	public static void main(String[] args) {
		String str1 = "nagen";//this is literals(save in internal pool/string pool)
		String str2 = "nagen";//Since String is immutable
		if(str1==str2) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		System.out.println(str1==str2);
		
		String str3 = new String("nagen");
		String str4 = new String("nagen");//when use new String every time creates a new memory in java heap.
		if(str3==str4) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		System.out.println(str1==str4);
		System.out.println(str1.equals(str4));//for equals method does not care where create the memory only content are same or not
		String sst = "na";
		String str5 = sst+"gen";//this sst is a veriable it can be anytime change so this is constaint
		if(str1==str5) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		System.out.println(str1==str5);//false
		final String sst1 = "na";
		String str6 = sst+"gen";
		if(str1==str6) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		String str7 = "na"+"gen";
		if(str1==str7) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
