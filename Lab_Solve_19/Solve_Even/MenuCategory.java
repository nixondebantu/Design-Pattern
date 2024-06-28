package Lab_Solve_19.Solve_Even;

import java.util.ArrayList;
import java.util.List;

public class MenuCategory implements MenuComponent {
    private String name;
    private List<MenuComponent> menuComponents;

    public MenuCategory(String name) {
        this.name = name;
        menuComponents = new ArrayList<>();
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public void display() {
        System.out.println("Category: " + name);
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.display();
        }
    }

}
