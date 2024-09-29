public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Author Yesenin = new Author("Сергей", "Есенин");

        Book captainsDaughter = new Book("Капитанская дочка", pushkin, 1836);
        Book cleanCode = new Book("Чёрный человек", Yesenin, 1926);

        captainsDaughter.setPublishingYear(2020);
        System.out.println(captainsDaughter.getTitle() + " " + captainsDaughter.getAuthor() + " " + captainsDaughter.
                getPublishingYear());


    }
}