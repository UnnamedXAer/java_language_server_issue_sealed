package com.efi.storage;

import java.util.Optional;

public final class SqlStorage extends Storage {

  @Override
  public void close() throws Exception {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'close'");
  }

  @Override
  public Optional<Object> get(int id) throws Exception {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  private String add(String a) {
    return String.format("%s%s", a, a);
  }
}
