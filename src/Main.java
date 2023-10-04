import com.engeto.Booking;
import com.engeto.Room;
import com.engeto.Visitor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//(2016, 3, 31)

        Visitor visitor = new Visitor("Adela", "Malikova", LocalDate.of(1980, 3, 9), 9, 3, true, 5899 );
        Visitor visitor2 = new Visitor("Jan", "Dvoracek", LocalDate.of(1938, 2, 15), 2, 1, false, 4899 );
        Visitor visitor3 = new Visitor("Jana", "Modra", LocalDate.of(1991, 8, 30), 5, 2, true, 5899 );
        Booking booking1 = new Booking(9, LocalDate.of(2023, 3, 21), LocalDate.of(2023, 4, 15), true, false);
        Booking booking2 = new Booking(2, LocalDate.of(2023, 5, 21), LocalDate.of(2023, 5, 28), false, true);
        Booking booking3 = new Booking(15, LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 19), false, true);
        Room room = new Room(1,true, true, 1000);
        Room room1 = new Room(2, true, true, 1000);


        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);
        bookingList.add(booking3);
        System.out.println("1 Test:");
        System.out.println(visitor.getName() + " " + visitor.getSurname() + "("+ visitor.getDateOfBirth()+ ")");
        System.out.println('\n');
        System.out.println("2 Test:");
        System.out.println("Cena pokoje je: " + room.getPricePerNight() + ", cislo pokoje je: " + room.getRoomnumer() + ", pokoj ma balkon: " + room.isHasBalcony() + ", pokoj je jednoluzkovy: " + room.isOneBed());
        System.out.println('\n');
        System.out.println("3 Test:");
        System.out.println("Rezevace pro Adelu je na pokoj c.: " + booking1.getRoomNumber() + ". Zacina:" + booking1.getStartOfVacation() + " a konci: " + booking1.getEndOfVacation());
        System.out.println('\n');
        System.out.println("4 Test:");
        int i = 1;
        for(Booking book : bookingList) {
            System.out.println(i+ " - Rezervace zacina: " + book.getStartOfVacation() + ". Tato rezervace konci: " + book.getEndOfVacation());
            i++;
        }


    }
}

//Potřebujeme evidovat hosty (guest), které ubytováváme v hotelu.
//
//O každém hostu musíme uložit jméno, příjmení a datum narození.
//
//Hosty vždy ubytováváme na pokojích (room). Pokoj je identifikován svým číslem.
// O každém pokoji chceme evidovat, kolik lůžek tam je (neřeš přistýlky apod.),
// zda má pokoj balkón a zda má výhled na moře a jaká je cena pokoje za jednu noc (předpokládej, že je cena pevně daná bez ohledu na sezónu a počet ubytovaných).
//
//V rámci jedné rezervace (booking) vždy přiřazujeme pokoj jednomu nebo více hostům na časové období mezi dvěma daty (například pokoj číslo 3 na období od 15. 7. do 24. 7. 2021). Pobyt je buď pracovní, nebo rekreační (type of vacation).
//
//Chceme také mít k dispozici třídu, která bude uchovávat všechny rezervace (například list of bookings), které jsme v systému vytvořili a bude mít metodu, která vypíše informace o všech rezervacích.
