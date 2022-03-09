import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
 private List<Item> menu = new ArrayList<Item>();
 public CopyOnWriteArrayList<Item> selectedMenu = new CopyOnWriteArrayList<Item>();
 private int totalAmount;
 
public class Restaurant {
    private String name;
    private String location;
    public LocalTime openingTime;
    public LocalTime closingTime;
    private List<Item> menu = new ArrayList<Item>();

    public Restaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        this.name = name;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

   public boolean isRestaurantOpen() {
    	
    	 System.out.println(" openingTime :"+openingTime);
    	 System.out.println(" closingTime :"+closingTime);
    	if(getCurrentTime().isAfter(openingTime) && getCurrentTime().isBefore(closingTime)) {
    		return true;
    	}else {
    		return false;
    	}
    }

    public LocalTime getCurrentTime(){ return  LocalTime.now(); }

    public List<Item> getMenu() {
        return menu;
        
    }

    private Item findItemByName(String itemName){
        for(Item item: menu) {
            if(item.getName().equals(itemName))
                return item;
        }
        return null;
    }

    public void addToMenu(String name, int price) {
        Item newItem = new Item(name,price);
        menu.add(newItem);
    }
    
    public void removeFromMenu(String itemName) throws itemNotFoundException {

        Item itemToBeRemoved = findItemByName(itemName);
        if (itemToBeRemoved == null)
            throw new itemNotFoundException(itemName);

        menu.remove(itemToBeRemoved);
    }
    public void displayDetails(){
        System.out.println("Restaurant:"+ name + "\n"
                +"Location:"+ location + "\n"
                +"Opening time:"+ openingTime +"\n"
                +"Closing time:"+ closingTime +"\n"
                +"Menu:"+"\n"+getMenu());

    }

    public String getName() {
        return name;
    }

//Function to Select Item
    public List<Item> selectItemByName(String itemName){
      
        return null;
    }
    
    //Function to UnSelect Item
    public List<Item> UnSelectItemByName(String itemName){
    	
        	return null;
       
    }
    
    //calculate totalAmount
    public int calculateAmount(){
    	
        return null;
   
}
