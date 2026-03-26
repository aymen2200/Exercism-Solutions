import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.*;
public class Gigasecond {
    LocalDate moment;
    LocalDateTime time;
    public Gigasecond(LocalDate moment) {
        this.moment = moment;
        time = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        time = moment;
    }

    public LocalDateTime getDateTime() {
        long seconds = time.toEpochSecond(ZoneOffset.UTC);
        seconds += 1000000000;
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(seconds),ZoneOffset.UTC);
    }
}
