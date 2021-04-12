import java.util.Random;


/**
 * Beschreiben Sie hier die Klasse Bubblesort.
 * 
 * @author Danny
 * @version 0.9
 */
public class Bubblesort
{
    Random zufallsgenerator = new Random(); 
    int zufallszahl = zufallsgenerator.nextInt(20) + 1; //Zufallszahl von 1-20
    private int temp = 0;
    
    public void bubbleSort(int[] arr) {
        int n = arr.length; //array länge
        int temp = 0; //temporäre variable zum variablentauschen
        for(int i=0; i < n; i++) //solange der Array ist
        {
            for(int j=1; j < (n-i); j++) //immer bis zum Ende -1 durchgehen
            {
                if(arr[j-1] > arr[j]) //wenn die Zahl größer ist als die nächste
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j]; //Variablentausch
                    arr[j] = temp;
                }
            }
        }
    }
    
    public void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public Bubblesort() 
    {
            System.out.print('\u000C'); //Konsole leeren
            int arr[] ={1,3,2,4,5,34,643,576,25,325,142,};
            
            System.out.println("Unsortierter Array: "); 
            for(int i=0; i < arr.length; i++)
            {
                System.out.print(arr[i] + ", "); //gibt alle Zahlen des Arrays aus
            }
            
            System.out.println(); //leere Zeile
            //bubbleSort(arr); //setzt den Array in die Methode und führt den Sort durch
            selectionSort(arr);
            
            System.out.println("Sortierter Array:");
            for(int i=0; i < arr.length; i++)
            {
                System.out.print(arr[i] + ", ");
            }
            System.err.println("187 Straßenbande");
    }
}
