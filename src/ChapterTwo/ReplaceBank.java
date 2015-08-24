package ChapterTwo;

public class ReplaceBank {
	
	public String replaceBank(String str){
		int len=str.length();
		int bank=0;
		for(int i=len-1;i>=0;i--){
			if(str.charAt(i)==' ') bank=bank+1;
		}
		System.out.println("空格数:"+bank);
		char[]c=new char[len+2*bank];
		int clen=c.length-1;
		for(int i=len-1;i>=0;i--){
			System.out.println(str.charAt(i));
			if(str.charAt(i)==' '){
				c[clen--]='0';
				c[clen--]='2';
				c[clen--]='%';
			}else{
				c[clen--]=str.charAt(i);
				
			}				
		}
		
		//return new String(c);
		return String.valueOf(c);
	}
	
	public static void main(String[] args){
		String str="we are happy";
		ReplaceBank rb=new ReplaceBank();
		System.out.println(rb.replaceBank(str));
	}

}
