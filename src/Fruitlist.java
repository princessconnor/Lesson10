/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class Fruitlist {
static int logicalSize=4;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fruits[]=new String[10];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Kiwi";
        fruits[3] = "Strawberry";
               //add orange
        int loc = findInsertPoint(fruits, "Orange");
        insert(fruits, "Orange", loc);
        loc = findInsertPoint(fruits, "Cherry");
        insert(fruits, "Cherry", loc);
         //print 
        for(int x=0; x<logicalSize; x++)
        {
            System.out.println(fruits[x]);
        }
         System.out.println("\nRemove Kiwi\n------------------------\n");
        loc = search(fruits, "Kiwi");
        delete(fruits, loc);
        for(int x=0; x<logicalSize; x++)
        {
             System.out.println(fruits[x]);
        }
        
        
    }
    public static int search (Object[] a, Object searchValue){
	   int left = 0;
	   int right = a.length-1;
	   while (left <= right){
	      int midpoint = (left + right) / 2;
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	      if (result == 0)
	         return midpoint;
	      else if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   return -1;	
		   
}
    public static boolean insert(Object array[], Object newItem, int targetIndex)
{
	// Check for a full array and return false if full
	if (logicalSize == array.length)
	   return false;
	// Check for valid target index or return false 
	if (targetIndex < 0 || targetIndex > logicalSize)
	   return false;
	// Shift items down by one position
	for (int i = logicalSize; i > targetIndex; i--)      
	   array[i] = array[i - 1];
	// Add new item, increment logical size,return true                       
	array[targetIndex] = newItem; 
	logicalSize++;
	return true; 
}
    public static boolean delete(Object array[], int targetIndex)
{
	if (targetIndex < 0 || targetIndex >= logicalSize)
		   return false;
		 
		// Shift items up by one position
		for (int i = targetIndex; i < logicalSize - 1; i++)       
		   array[i] = array[i + 1];
		 
		// Decrement logical size and return true 
		logicalSize--; 
		return true;                                   
}
    public static int findInsertPoint (Object a[], Object searchValue){
	   int left = 0;
	   int right = logicalSize-1;
	   int midpoint=0;
	   
	   while (left <= right){
	      midpoint = (left + right) / 2;
	   
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	   
	     if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   if(((Comparable)a[midpoint]).compareTo(searchValue) < 0)
	   midpoint++;
	   return midpoint;	   
}
    
}
