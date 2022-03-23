package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
String text= "We learn java basics as part of java sessions in java week1";

int count;

text=text.toLowerCase();

String words[]=text.split(" ");


System.out.println("Duplicates to be removed: ");

for (int i = 0; i < words.length; i++) {
	
	count=1;
	for(int j=i+1;j<words.length;j++)
	{
		if(words[i].equals(words[j])) {
			
			count++;
			words[j]="0";
		}
	}
	if(count>1 && words[i]!="0")
		System.out.println(words[i]);
	
}



	}

}







