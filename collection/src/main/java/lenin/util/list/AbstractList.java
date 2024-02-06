package lenin.util.list;

import lenin.util.collection.Collection;

public abstract class AbstractList<E> implements List<E>, Collection<E>, Cloneable {

  protected int size;

  protected AbstractList() {
    size = 0;
  }

  @Override
  public int size() {
    return size;
  }
  
}
