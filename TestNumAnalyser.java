import java.util.Scanner;
class NumAnalyser 
{
    private String text;
    private int[] num;
    public void setNum (int[] num) { this.num = num; }
    public int[] getNum () { return num; }; 

    // Pegar o input do usuário como txt:
    public void setTxt(String text) { this.text = text;}

    // Transformar o array String em um array de Int
    public void txtProcess() 
    {
     String[] textSplit = text.split(",");
     num = new int[textSplit.length];
     for (int i = 0; i < textSplit.length; i ++) 
     {
         num[i] = Integer.parseInt(textSplit[i]);
     }
    }


    // Pegar o menor elemento
    public int getMin() 
    { 
    int min = num[0];
    for (int i = 0; i < num.length; i ++) 
    { 
        if (num[i] < min) 
        {
            min = num[i];
        }
    }
    return min;
    }


    // Pegar o maior elemento
    public int getMax() 
    {
    int max = num[0];
    for (int i = 0; i < num.length; i ++) 
    { 
        if (num[i] > max) 
        {
            max = num[i];
        }
    }
    return max;
    }
}

public class TestNumAnalyser 
{
  public static void main(String[] args) {
    NumAnalyser na = new NumAnalyser();
    Scanner sc = new Scanner(System.in);
    System.out.print("Entre com os numeros inteiros e separados por vírgula:");
    String in = sc.nextLine();
    na.setTxt(in);
    na.txtProcess();
    System.out.printf("Menor Elemento do Array: %d\nMaior Elemento do Array: %d\n", na.getMin(),      na.getMax());
    sc.close();
  }
}