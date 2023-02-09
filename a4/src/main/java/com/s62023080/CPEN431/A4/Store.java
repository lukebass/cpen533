package com.s62023080.CPEN431.A4;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;

public class Store {
    private ConcurrentHashMap<Key, byte[]> store;

    public Store() {
        this.store = new ConcurrentHashMap<>();
    }

    public void put(byte[] key, byte[] value, int version) {
        byte[] composite = new byte[value.length + 4];
        ByteBuffer buffer = ByteBuffer.wrap(composite);
        buffer.putInt(version);
        buffer.put(value);
        this.store.put(new Key(key), composite);
    }

    public byte[] get(byte[] key) {
        return this.store.get(new Key(key));
    }

    public byte[] remove(byte[] key) {
        return this.store.remove(new Key(key));
    }

    public void clear() {
        this.store = new ConcurrentHashMap<>();
    }

    public int size() { return this.store.size(); }
}
