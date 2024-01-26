package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    public List<StudentGroup> getSteamGroup() {
        return steamGroup;
    }

    public void setSteamGroup(List<StudentGroup> steamGroup) {
        this.steamGroup = steamGroup;
    }

    private List<StudentGroup> steamGroup;
    private int numberSteam;

    public StudentSteam(List<StudentGroup> steamGroup, int numberSteam) {
        this.steamGroup = steamGroup;
        this.numberSteam = numberSteam;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < steamGroup.size();
            }

            @Override
            public StudentGroup next() {
                return steamGroup.get(counter++);
            }
        };
    }

    @Override
    public String toString() {
        return "Номер потока = " + Integer.toString(numberSteam) ;
    }
}
