package lakabus;
public class Bus {
	private	int busno;
	private	boolean ac;
	private	int capacity;
		
		public Bus(int no,boolean ac,int cap) {
			this.busno=no;
			this.ac=ac;
			this.capacity=cap;		
		}
		public int getbusno() {
			return busno;
		}
		public boolean isac() {
			return ac;
		}
		public int getcapacity() {
			return capacity;
		}
		public void setac(boolean val) {
			ac=val;
		}
		public void setcapcity(int cap) {
			capacity=cap;
			
		}
		public void displaybusinfo() {
			System.out.println("bus no:"+ busno + "ac:" + ac + " totalcapcity:" + capacity);
			
		}

	}
