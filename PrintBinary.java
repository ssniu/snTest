package class003;

/**
 * print binary number of an integer
 * @author katie
 * 从31位开始，不带符号位，&1，因为1&0=0，1&1因为1的位置不同不一定就一定等于1，可能是10000000
 * 所以用是不是=0来判断到底是是不是1
 *
 */
public class PrintBinary {

	public static void main(String[] args) {
		//int num = 150;//11111111111111111111111101101010
		              //00000000000000000000000010010110
		int num = -2;
		printBinary(num);
		
		printBinary(num >> 1);

	}
	
	public static void printBinary(int num) {
		for(int i = 31; i>=0; i--) {
			System.out.print((num & (1 <<i)) == 0 ? 0 : 1);
		}
		System.out.println();
	}

}
