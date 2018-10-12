package lt.kaunascoding.view;
// View dalyje esantis kodas bendrauja su vartotoju
public class CommandLineUI {
    public void showMenu() {
        System.out.println("Iveskite pasirinkima");
        System.out.println("1 - nurodyti failo varda");
        System.out.println("2 - sukurti faila");
        System.out.println("3 - papildyti faila tekstu");
        System.out.println("4 - parodyti failo turini");
        System.out.println("5 - trinti faila");
        System.out.println("0 - baigti darba");
    }
}
