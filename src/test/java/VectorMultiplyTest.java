import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class VectorMultiplyTest {
    VectorMultiply vectorMultiply = new VectorMultiply();
    ArrayList<Integer> vec1 = new ArrayList<>(
            Arrays.asList(1, 2, 3));
    ArrayList<Integer> vec2 = new ArrayList<>(
            Arrays.asList(3, 4, 5));
    @org.junit.Test
    public void notRecursiveVectorMultiply() throws Exception {
            Collection<Integer> actual = vectorMultiply.notRecursiveVectorMultiply(vec1, vec2);
            Collection<Integer> expected =  new ArrayList<>(Arrays.asList(3, 8, 15));
        assertThat(actual,is(equalTo(expected)));
    }

    @org.junit.Test
    public void recursiveVectorMultiply() throws Exception {
        Collection<Integer> actual = vectorMultiply.recursiveVectorMultiply(vec1, vec2);
        Collection<Integer> expected =  new ArrayList<>(Arrays.asList(3, 8, 15));
        assertThat(actual,is(equalTo(expected)));
        }
    }