public interface Lockable {
    void setKey(int key);
    boolean lock (int key);
    boolean unlock (int key);
}
