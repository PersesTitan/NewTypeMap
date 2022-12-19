import java.util.*;

public class PairList<A, B> implements List<A> {
    List<A> pairA = new ArrayList<>();
    List<B> pairB = new ArrayList<>();

    @Override
    public int size() {
        return pairA.size();
    }

    @Override
    public boolean isEmpty() {
        return pairA.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return pairA.contains(o);
    }

    @Override
    public Iterator<A> iterator() {
        return pairA.iterator();
    }

    @Override
    public Object[] toArray() {
        return pairA.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return pairA.toArray(a);
    }

    @Override
    public boolean add(A a) {
        return pairA.add(a);
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends A> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends A> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public A get(int index) {
        return null;
    }

    @Override
    public A set(int index, A element) {
        return null;
    }

    @Override
    public void add(int index, A element) {

    }

    @Override
    public A remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<A> listIterator() {
        return null;
    }

    @Override
    public ListIterator<A> listIterator(int index) {
        return null;
    }

    @Override
    public List<A> subList(int fromIndex, int toIndex) {
        return null;
    }

    /**
     * No Override <br>
     * public
     */
    public boolean containsA(A o) {
        return pairA.contains(o);
    }

    public boolean containsB(B o) {
        return pairB.contains(o);
    }

    public Iterator<A> iteratorA() {
        return pairA.iterator();
    }

    public Iterator<B> iteratorB() {
        return pairB.iterator();
    }

    public Object[] toArrayA() {
        return pairA.toArray();
    }

    public Object[] toArrayB() {
        return pairA.toArray();
    }

    public boolean add(A a, B b) {
        pairA.add(a);
        pairB.add(b);
        return true;
    }
}
