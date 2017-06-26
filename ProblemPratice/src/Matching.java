import java.util.regex.*;
public class Matching {
	
	
	
	public static void main(String args[]){
		
		int count=0;
		
	System.out.println(Pattern.matches("[amn]+", "amn"));//false (not a or m or n)
	System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
	System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes morethan once)
	Pattern p=Pattern.compile("[a][m][n]");
	Matcher m = p.matcher("saamnhdfjamnjhdjfamn");
	while(m.find())
	{
		count=count+1;
		System.out.println(m.groupCount());
		System.out.println(m.group(0));
	}
	System.out.println(String.valueOf(count));
	
	
	}
	}



