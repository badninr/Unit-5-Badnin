public interface Lockable {
    void setKey();
    void lock();
    void unlock();
    boolean locked();
}
