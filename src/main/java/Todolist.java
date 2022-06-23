import java.util.ArrayList;
import java.util.Date;

public class Todolist {
    private String title;
    private String description;
    private Date date;
    private ArrayList items;


    public Todolist(String title,String description, Date date, ArrayList items){
        this.title = title;
        this.description = description;
        this.title=title;
        this.date=new Date();
    }

    public Todolist(){
        this.title = "default";
        this.description = "default";
        this.title = "default";
        this.date=new Date();
        this.items = new ArrayList();
    }

    public void showtable(ArrayList items){
        int i = 0;

        for (i=0; i<items.size(); i++){
            System.out.println("item : "  + items.get(i));
        }
    }
    public ArrayList addItem(Items item){
        if (this.items.size() < 10){
            this.items.add(items);
            System.out.println("Your item has been added!!!");
            System.out.println("Added: " + item.getName());
            System.out.println("Added: " + item.getAddDate());
            return this.items;
        }
        else if (items.size() >= 10){
            System.out.println("You cannot add more items it's already fulled!!!");
            return items;
        }
        return items;
    }

    public void removeItem(int index){
        this.items.remove(index);
    }
}
