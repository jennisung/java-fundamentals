package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Business {
    public Shop(String name, String description, String price) {
        super(name, description, price);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price='" + getPrice() + '\'' +
                '}';
    }
}
