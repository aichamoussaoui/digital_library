import services.LibraryService;
import services.MenuService;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        MenuService menuService = new MenuService(libraryService);
        
        menuService.displayMainMenu();
    }
}