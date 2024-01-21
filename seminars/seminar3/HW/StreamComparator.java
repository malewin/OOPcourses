package seminar3.HW;


import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        int stream1Size = o1.getGroupsList().size();
        int stream2Size = o2.getGroupsList().size();

        return Integer.compare(stream1Size, stream2Size);
    }
}