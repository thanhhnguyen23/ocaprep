package ocaprep.ch03.immutability;

public class MutableExample {

	private String s;

	// setter makes it mutable
	public void setS(String newS) {
		s = newS;
	}

	public String getS() {
		return s;
	}
}

/*
 * final modifier preserves immutability
 */
final class Immutable {
	/*
	 * immutable only has a getter
	 */
	private String s = "name";

	public String getS() {
		return s;
	}
}
