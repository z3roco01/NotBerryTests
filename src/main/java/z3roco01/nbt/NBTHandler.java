package z3roco01.nbt;

import java.io.File;

/**
 * Handles writing/reading from an NBT File
 */
public class NBTHandler {
    private final File file;

    public NBTHandler(File file) {
        this.file = file;


    }

    public NBTHandler(String path) {
        this(new File(path));
    }
}
