package regularExpressions;

public class RegularExpressionReplace {

	public static void main(String[] args) {
		String str = "help   me  I  Have     no idea what's going on !    !   ! ";
		str = str.replaceAll(" {2,}"," ");
		System.out.println(str);
	}

}
