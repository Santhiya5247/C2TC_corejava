package com.tnsif.day6;

public class Studen extends Person 
{
		private String  clas;
		private  float per;
		
		
		private Studen()
		{
			System.out.println("Studen  class  default  constructor");
			clas="A";
			per=70;
		}


		public Studen(String clas, float per) 
		{
			this.clas = clas;
			this.per = per;
		}
		//Getters and Setters
		public String getClas() {
			return clas;
		}
		public void setClas(String clas) {
			this.clas = clas;
		}
		public float getPer() {
			return per;
		}
		public void setPer(float per) {
			this.per = per;
		}
		@Override
		public String toString() {
			return "Studen [clas=" + clas + ", per=" + per + ", getName()=" + getName() + ", getCity()=" + getCity()
					+ "]";
		}
				
}
