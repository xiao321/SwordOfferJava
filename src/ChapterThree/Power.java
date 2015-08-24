package ChapterThree;

public class Power {
	/**
	 * 
	 * power(这里用一句话描述这个方法的作用)
	 * base 为0或负数  exponent为0或负数
	 * @param base
	 * @param exponent
	 * @return
	 * @exception
	 * 创建人：肖丙贤
	 * 修改人：
	 * 修改时间：2015-8-17 上午10:57:24
	 * 修改备注：
	 * @since  1.0.0
	 */
	public double power(double base,int exponent){
		if(base==0) return Double.NaN;//double比较大小注意
		if(exponent==0) return 1;
		else if(exponent>0)
			return base*power(base,exponent-1);
		else
			return (1/base)*power(base,exponent+1);
	}
	
	public static void main(String[] args){
		Power p=new Power();
		System.out.println(0/2.13);
	}

}
