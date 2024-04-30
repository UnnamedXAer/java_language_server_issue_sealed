package com.efi.unsealeadstorage;

import java.util.Optional;

public abstract
class StorageUnsealed implements AutoCloseable
{
  public abstract Optional<Object> get(int id) throws Exception;
}
