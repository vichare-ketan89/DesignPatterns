package com.dp.factorymethodpatttern;

public abstract class Pizza {
	
		private String crust;
		private float size;
		private String name;
		public String getCrust() {
			return crust;
		}
		public void setCrust(String crust) {
			this.crust = crust;
		}
		public float getSize() {
			return size;
		}
		public void setSize(float size) {
			this.size = size;
		}
		public abstract String getName();
		
		public void setName(String name) {
			this.name = name;
		}
		
		
}
