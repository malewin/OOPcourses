package seminar3.HW;

import seminar3.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    List<StudentGroup> groupsList;
    int counter;

    public StreamIterator(Stream stream) {
        this.groupsList = stream.getGroupsList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < groupsList.size();
    }

    @Override
    public StudentGroup next() {
        if(hasNext())
            return groupsList.get(counter++);
        return null;
    }
}
