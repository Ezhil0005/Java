
public class Consonants
{
    public static void main(String []args)
    {
    
         System.out.print("Vowels are :");

        for(char i='a';i<='z';i++)
        {
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
            {
         System.out.print(i+" ");
            }
        }
        System.out.print("\nConsonants are :");
        for(char j='a';j<='z';j++)
             if(j!='a'&& j!='e'&& j!='i'&&j!='o'&&j!='u')
          {
            System.out.print(j+" ");
          }
        }
        
        
}
