package package1.app;

import package1.data.*;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId("Iphone");
        category.setId(null);
        System.out.println(category.getId());
        category.setExpensive(true);
    
    }

}
