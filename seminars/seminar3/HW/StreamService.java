package seminar3.HW;

import java.util.ArrayList;
import java.util.List;

public class StreamService {

    List<Stream> streams;

    public StreamService(List<Stream> streams) {
        this.streams = streams;
    }

    public List<Stream> sortBySize() {
        List<Stream> sortedStreams = new ArrayList<>(streams);
        sortedStreams.sort(new StreamComparator());
        return sortedStreams;
    }
}
