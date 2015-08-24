package ChapterFive;

import java.util.LinkedList;

public class PrintMinNumber {
	
	public void printMinNumber(int[] a,int index,LinkedList<String> list){
		if(index==a.length){
			
			StringBuffer sb=new StringBuffer();
			for(int i:a)
				sb.append(String.valueOf(i));
            
			if(list.isEmpty()){
				list.push(sb.toString());
			}else{
				String str=list.pop();
				if(str.compareTo(sb.toString())<=0){
					list.push(str);
				}else{
					list.push(sb.toString());
				}
			}
			
			return;
		}
		for(int i=index;i<a.length;i++){
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
			
			printMinNumber(a,index+1,list);
			
			temp=a[index];
			a[index]=a[i];
			a[i]=temp;
		}
		
	}
	
	//方法er
	public void printMinNumber1(int[] a){
		if(a.length==0){
			System.out.println("kong");
			return;
		}
		if(a.length==1){
			System.out.println(a[0]);
			return;
		}
		
	   String com=String.valueOf(a[0]);
	   
	   for(int i=1;i<a.length;i++){
		   String temp1=com+String.valueOf(a[i]);
		   String temp2=String.valueOf(a[i])+com;
		   if(temp1.compareTo(temp2)>=0){
			   com=temp2;
		   }else{
			   com=temp1;
		   }
	   }
	   System.out.println("combination min:"+com);
		
	}
	
	public static void main(String[] args){
		PrintMinNumber pmm=new PrintMinNumber();
		int[] a={3,32,321};
		
		LinkedList list=new LinkedList();
		
		pmm.printMinNumber(a, 0,list);
		System.out.println(list.peek());
		pmm.printMinNumber1(a);
	}

}
