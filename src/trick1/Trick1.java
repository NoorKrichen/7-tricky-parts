package trick1;

class Trick1 {

	public static short returnShort(short s) {
		return s;
	}

	public static void main(String[] args) {
		short s1 = 5;
		short s2 = 7;
		returnShort(s1 + s2);
	}
}
//The sum of two shorts give us an int

//Every types that are under int will be promoted to int.
//This is included in the binary numeric promotion of java specification https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.6.2
