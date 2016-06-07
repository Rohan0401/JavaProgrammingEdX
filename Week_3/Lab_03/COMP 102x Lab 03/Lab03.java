import comp102x.ColorImage;
import comp102x.Canvas;

public class Lab03
{  
    
    public void loadAnImage() 
    {
        // Please write your code after this line
          ColorImage image = new ColorImage();
          Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
          canvas.add(image);
          
         
        
        
        
    }
    
    public void loadTwoImagesOnTheSameCanvas()
    {
        // Please write your code after this line
         ColorImage firstImage = new ColorImage(); //First Image Load
         ColorImage secondImage = new ColorImage(); // Second Image Load
          Canvas canvas = new Canvas(2*firstImage.getWidth(), firstImage.getHeight()); // Adding Canvas
          canvas.add(firstImage,0,0);
          canvas.add(secondImage,firstImage.getWidth(),0);
          
          
        
        
        
    }
    
    public void imageAddition() 
    {    
        // Please write your code after this line
         ColorImage firstImage = new ColorImage(); //First Image Load
         ColorImage secondImage = new ColorImage(); // Second Image Load
         ColorImage addImage = ColorImage.add(firstImage,secondImage); // Adding two Imagese
        
          Canvas canvas = new Canvas((3*firstImage.getWidth()+20), firstImage.getHeight()); // Adding Canvas
          canvas.add(firstImage,0,0);
          canvas.add(secondImage,firstImage.getWidth()+10,0);
          canvas.add(addImage,(firstImage.getWidth()+10+secondImage.getWidth()+10),0);
        
        
        
    }
   
    public void imageMultiplication() 
    {
        // Please write your code after this line
         ColorImage firstImage = new ColorImage(); //First Image Load
         ColorImage secondImage = new ColorImage(); // Second Image Load
         ColorImage addImage = ColorImage.multiply(firstImage,secondImage); // Multiplying two Imagese
        
          Canvas canvas = new Canvas((3*firstImage.getWidth()+20), firstImage.getHeight()); // Adding Canvas
          canvas.add(firstImage,0,0);
          canvas.add(secondImage,firstImage.getWidth()+10,0);
          canvas.add(addImage,(firstImage.getWidth()+10+secondImage.getWidth()+10),0);
      
        
        
    }
    
    public void changeColor()
    {
        ColorImage image = new ColorImage();
        image.increaseRed(40);
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        //image.save();
    }
}
