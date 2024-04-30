package com.efi.storage;

import java.util.Optional;

public abstract sealed class Storage implements AutoCloseable
    permits SqlStorage {
  public abstract Optional<Object> get(int id) throws Exception;
}
