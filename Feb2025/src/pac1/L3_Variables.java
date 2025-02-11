package pac1;


public class L3_Variables {

		
		private double dblwidth= 100;
		private double dblheight= 50;
		private double dbldepth= 2;
		private static int L3_Variables;

		
		public double calcVolume() {
			double dblTemp;
			dblTemp = dblwidth * dblheight * dbldepth;
			return dblTemp;
		}
		
		// TODO Auto-generated method stub

		public static void main(String[] args) {
			L3_Variables obj=new L3_Variables();
			System.out.println(obj.calcVolume());
		
	}

}
