import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.IntStream;

public class VectorMultiply {

    private Collection<Integer> res = new ArrayList<>();

    private Collection<Integer> recursiveVectorMultiply(final Collection<Integer> result,
                                                        Iterator<Integer> iterator1,
                                                        Iterator<Integer> iterator2) {
        result.add(iterator1.next() * iterator2.next());
        return iterator1.hasNext() ? recursiveVectorMultiply(result, iterator1, iterator2) : result;
    }

    public Collection<Integer> recursiveVectorMultiply(final Collection<Integer> collection1, final Collection<Integer> collection2) throws VectorLengthException {
        if (collection1.size() <= 0 || collection1.size() != collection2.size()) {
            throw new VectorLengthException("Колво координат не может быть меньше меньня 1, а так же размер 2 векторов должен совпадать");
        }
        Collection<Integer> result = new ArrayList<>();
        return recursiveVectorMultiply(result, collection1.iterator(), collection2.iterator());
    }

    public Collection<Integer> notRecursiveVectorMultiply(final Collection<Integer> collection1, final Collection<Integer> collection2) throws VectorLengthException {
        if (collection1.size() <= 0 || collection2.size() != collection1.size()) {
            throw new VectorLengthException("Колво координат не может быть меньше меньня 1, а так же размер 2 векторов должен совпадать");
        }
        Iterator<Integer> iterator1 = collection1.iterator();
        Iterator<Integer> iterator2 = collection2.iterator();
        IntStream.range(0, collection1.size()).forEach(i -> res.add(iterator1.next() * iterator2.next()));
        return res;
    }

}


