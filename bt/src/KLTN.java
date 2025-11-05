public class KLTN<T, V> implements Comparable<KLTN<T, V>> {
    private T student;
    private V supervisor;
    private String thesisName;

    /**
     * KTLN
     * @param student sv
     * @param supervisor nguoihuongdan
     * @param thesisName tenKTLN
     */

    public KLTN(T student, V supervisor, String thesisName) {
        this.student = student;
        this.supervisor = supervisor;
        this.thesisName = thesisName;
    }

    public String getThesisName() {
        return thesisName;
    }

    public T getStudent() {
        return student;
    }

    public V getSupervisor() {
        return supervisor;
    }

    /**
     * SS KLTN
     * @param other KLTNkhac
     * @return kq
     */

    @Override
    public int compareTo(KLTN<T, V> other) {
        return this.thesisName.compareToIgnoreCase(other.thesisName);
    }

    @Override
    public String toString() {
        return "KLTN: " + thesisName  + student  + supervisor  ;
    }
}
