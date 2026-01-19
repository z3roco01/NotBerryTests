package z3roco01.nbt;

import z3roco01.nbt.tag.NBTCompound;

import java.io.*;

/**
 * Handles writing/reading from an NBT File
 */
public class NBTHandler {
    private final File file;
    private final byte[] bytes;
    private NBTCompound root = new NBTCompound();

    public NBTHandler(File file) throws IOException {
        this.file = file;

        this.bytes = new FileInputStream(file).readAllBytes();
    }

    public NBTHandler(String path) throws IOException {
        this(new File(path));
    }

    /**
     * Writes the contents of bytes to the file
     * @param gzip when true, will write contents gzipped
     */
    private void write(boolean gzip) throws IOException {
        new FileOutputStream(file).write(bytes);
    }

    /**
     * Parses bytes into NBT data
     */
    void parse() {
        root.clearChildren();
    }
}
