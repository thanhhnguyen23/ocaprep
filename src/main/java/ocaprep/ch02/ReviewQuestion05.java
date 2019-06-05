package ocaprep.ch02;

public class ReviewQuestion05 {
	/*
	 * what is the output of the following code snippet?
	 */
    public static void main(String[]args){
    	/* 
    	 * List<Integer> is child interface of the Collection API 
    	 * ArrayList<Integer> is implementation class of List 
    	 * 
    	 * should declare most general type, in this case it's the List interface
    	 */
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();

        list.add(10);
        list.add(14);

        for(int x : list){
            System.out.print(x + ", "); // output: 10, 
            break;
        }
    }
}
