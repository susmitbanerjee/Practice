package Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableClass {
        private final int sId;
        private final List<Integer> ints;

        public ImmutableClass(int sId, List<Integer> ints) {
            super();
            this.sId = sId;
            this.ints = ints;

        }

        public int getsId() {
            return sId;
        }

        public List<Integer> getInts() {
            List<Integer> listCopy = new ArrayList<>();
            for(int i: ints) {
                listCopy.add(i);
            }
		return Collections.unmodifiableList(listCopy);
        }
}

