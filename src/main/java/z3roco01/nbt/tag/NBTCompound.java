package z3roco01.nbt.tag;

import java.util.ArrayList;

public class NBTCompound extends NBTElement<ArrayList<NBTElement<?>>> {
    /**
     * Removes every single child element
     */
    public void clearChildren() {
        value.clear();
    }

    /**
     * Adds a child to the list
     */
    public void addChild(NBTElement<?> child) {
        value.add(child);
    }

    /**
     * Removes a child from the list
     */
    public void removeChild(NBTElement<?> child) {
        value.remove(child);
    }

    /**
     * Returns a (copy) of the list of children
     */
    public ArrayList<NBTElement<?>> getChildren() {
        return getValue();
    }

    @Override
    public ArrayList<NBTElement<?>> getValue() {
        // create copy of array list, so they do not modify the actual list
        return new ArrayList<>(value);
    }

    @Override
    public void setValue(ArrayList<NBTElement<?>> value) {
        // do not allow overriding of children list
    }

    @Override
    protected byte getId() {
        return (byte)NBTId.COMPOUND.ordinal();
    }

    @Override
    public void parse(byte[] bytes) {
        // TODO: Better error handling
        if(bytes[0] != getId()) return;

        int i = 0;
        while(true) {

        }
    }
}
