import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");   
        LocalDateTime date = LocalDateTime.parse(appointmentDateDescription,formatter);
        return date;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        
        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("MMMM", Locale.ENGLISH);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEEE",Locale.ENGLISH);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("mm");

        
        String month = appointmentDate.format(formatter);
        String day = appointmentDate.format(formatter1);
        String minutes = appointmentDate.format(formatter2);
        int hour = appointmentDate.getHour();
        String period = "AM";
        if(hour > 12) {
            hour -= 12;
            period = "PM";
        }
        return "You have an appointment on " + day + ", " + month + " " + appointmentDate.getDayOfMonth() + ", " + appointmentDate.getYear() + ", at " + hour + ":" + minutes + " " + period + ".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(2026,9,15);
    }
}
