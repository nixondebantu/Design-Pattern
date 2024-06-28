package Lab_Solve_19.Solve_Even;

public class Main {
    public static void main(String[] args) {
        MenuCategory appetizers = new MenuCategory("Appetizers");
        MenuCategory mainCourses = new MenuCategory("Main Courses");
        MenuCategory desserts = new MenuCategory("Desserts");

        MenuComponent springRolls = new Dish("Spring Rolls");
        MenuComponent garlicBread = new Dish("Garlic Bread");

        MenuComponent steak = new Dish("Steak");
        MenuComponent pasta = new Dish("Pasta");

        MenuComponent iceCream = new Dish("Ice Cream");
        MenuComponent cheesecake = new Dish("Cheesecake");

        appetizers.add(springRolls);
        appetizers.add(garlicBread);

        mainCourses.add(steak);
        mainCourses.add(pasta);

        desserts.add(iceCream);
        desserts.add(cheesecake);

        MenuCategory menu = new MenuCategory("Restaurant Menu");
        menu.add(appetizers);
        menu.add(mainCourses);
        menu.add(desserts);

        menu.display();
    }
}
