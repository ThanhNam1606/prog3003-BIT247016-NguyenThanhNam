
import TV.DVDPlayer;
import TV.SoundSystem;
import TV.TV;


public class Main {
   public class HomeTheaterFacade {

    private TV tv;
    private SoundSystem soundSystem;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade(TV tv, SoundSystem soundSystem, DVDPlayer dvdPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie() {
        System.out.println("Chuẩn bị xem phim...");

        tv.on();
        soundSystem.on();
        dvdPlayer.on();

        System.out.println("Sẵn sàng xem phim!");
    }
}
 
}
