public class Diamond{

	int size;
	int padding = 0;

	public Diamond(){
		this.size = 1;
	}

	public Diamond(int size){
		if(size%2!=1){
			throw new IllegalArgumentException("invalid size, size has to be odd");
		}

		this.size = size;
		
	}

	public void grow() {
		this.size += 2;
	}

	public void shrink() {
		if (this.size > 1) {
			this.size -= 2;	
		}
		
	}

	public void setPadding(int padding) {
		if(padding <= 0){
			throw new IllegalArgumentException("invalid padding, padding has to be positiv");
		}
		this.padding = padding;
	}

	public void print(){
/*		int half = this.height/2+1;

		for(int y = 0; y < this.height; y++) {
			for(int x = 1; x <= this.width; x++) {

				if ((y < half) && ((x < half-y) || (x > half+y))) {
					System.out.print('.');
				//} else if ((y > half) && ((x <= y-half+1) || (x > y-half))) {
				} else if ((y >= half) && ((x <= y-half+1) || (x <= half+y))) {
					System.out.print('.');
				} else {
					System.out.print('#');
				}

			}
			System.out.println();
		}

*/

		int half = this.size/2;

		for(int y = -half-this.padding; y <= half+this.padding; y++) {
			int ty = (y > 0) ? y : -y;
			for(int x = -half-this.padding; x <= half+this.padding; x++) {
				int tx = (x > 0) ? x : -x;
				if (tx+ty > half) {
					System.out.print('.');
				} else {
					System.out.print('#');
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		Diamond d = new Diamond();
		

		for (String s: args) {
			if (args[i].equals("g")) {
				d.grow();
			} else if (args[i].equals("s")) {
				d.shrink();
			} else if (args[i].equals("p")) {
				if(args[i].length()>1){
					for(int i = arg[i].length-1; i=arg[i].length; i++){
						char[] array =
						if(!Character.isDigit()){
							throw new IllegalArgumentException("invalid parameter" + args[i]);
						} else {

						}
					}
				d.print();
			} 
			d.print();
			} else {
				d = new Diamond(Integer.parseInt(args[i]));
			}
		}
	}
}