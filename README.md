# Root Trip Recorder

### Object Modeling ###
Design for change - I have coded my solution anticipating for three future changes
1. The nature of associating trips and drivers will change - For now, it is a 1 to many
relationship of driver to trip. However, this may change - multiple drivers could 
be associated to the same trip. Or the trips may be grouped by requirements, so that
we need to have a relationship between the driver and their local trips vs a driver and 
their long distance trips.   
2. The process of creating a report will change - The customer may decide that the report 
must be in a different format, or sent to a different destination than command line
3. The process for recording trips will change - The trips may need to be migrated
from a different source. Or multiple entry points from a website will populate
the possible trips. 

### Interfaces and Classes ###
1. Driver -> Object for keeping track of Driver Information (Name)
2. Trip -> Object for keeping track of a trip (not coupled with driver)
3. TripRecorder -> The class responsible for holding known drivers, list of trips, 
and connecting the drivers to its history of trips 
4. TripFactory -> Create trips based on necessary requirements   
5. TripReporter -> Generates reports of driver and trip information 
6. TripConsole -> Main entry point! Handle client interactions via the command line

### Testing ###
1. Test Driven Development - I wrote the interfaces, and tests first before 
implementing any code (you can prove this via git commit logs). 
This way I focused on testing the behavior and interface contracts rather than 
specific implementation details.  

2. Acceptance Testing - End to End Testing of customer requirements, recording a driver,
recording a trip, etc. 

3. Boundary Testing - 

