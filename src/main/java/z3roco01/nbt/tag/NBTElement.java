package z3roco01.nbt.tag;

/**
 * Generic NBT element, base of all others
 */
public abstract class NBTElement<T> {
    protected T value;
    public String name;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Returns the id byte of this tag
     */
    protected abstract byte getId();

    /**
     * Parses a tag of this type
     * @param bytes Array of bytes, starting at the tag
     */
    public abstract void parse(byte[] bytes);

    /**
     * Reads the name of the tag from bytes,
     * @param bytes Array of bytes, where the first index is the tag id
     */
    protected String parseName(byte[] bytes) {
        String name = "";



        return name;
    }
}
