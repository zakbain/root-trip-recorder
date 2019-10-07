import java.util.List;
import java.util.Map;

public interface TripReporter {
    public void generateReport(Map<Driver, List<Trip>> driverTrips);
}
