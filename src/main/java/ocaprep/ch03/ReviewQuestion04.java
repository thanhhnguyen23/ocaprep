package ocaprep.ch03;

public class ReviewQuestion04 {
	public static void main(String[] args) {
		// result of following code
		
		// output
		// aaa -> abbaa -> abbaccca
		
		StringBuilder sb = new StringBuilder();
		// zero-index
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		System.out.println(sb);
	}

}
