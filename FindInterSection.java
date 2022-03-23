package week1.day2;

public class FindInterSection
{
    public static void main(String[] args) {
      int []a={1,4,7,8,9};
      int []b={2,4,6,7,9};
      int i=0,j=0;

      while(i<a.length && j<b.length)
      {
          if(a[i]<b[j])
          {
              i++;
          }
          else if(b[j]<a[i])
          {
              j++;
          }
          else
          {
              System.out.print(b[j]+" ");
              i++;
              j++;
          }
      }
    }
}