import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int endProgram = 1;
        Scanner scan = new Scanner(System.in);
        User user = new User();
        while (endProgram != 0){
            System.out.println("0 pour quitter, 1 pour creer un user, 2 pour ajouter un item, 3 pour voir lz todolist, 4 pour supp un item" );
            endProgram = scan.nextInt();
            if(endProgram == 1){
                User newUser = User.createUser();
                user = newUser;
            }
            else if(endProgram == 2) {
                Items newItem = Items.createItem();
                user.getTodolist().addItem(newItem);
            }
            else if(endProgram == 3){
                Todolist.showtable(user.getTodolist());
            }
            else if(endProgram == 4){
                int nb = scan.nextInt();
                user.getTodolist().removeItem(nb);
            }
            else {
                System.out.println("0 pour quitter, 1 pour creer un user, 2 pour ajouter un item, 3 pour voir lz todolist, 4 pour supp un item" );
                endProgram = scan.nextInt();
            }
        }


    }

}
