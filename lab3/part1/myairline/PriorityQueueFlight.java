package myairline;
import java.util.*;
public class PriorityQueueFlight{
    static ArrayList<flight> list = new ArrayList<flight>();
    static void insert(flight f)
    {
        list.add(f);
    }
    flight peek()
    {
        flight ft = flight.minPrice(list);
        return ft;
    }
    flight pop()
    {
        flight ft = flight.minPrice(list);
        list.remove(ft);
        return ft;
    }
    int isempty()
    {
        if(list.isEmpty())
            return 1;
        else
            return 0;
    }
}   
}