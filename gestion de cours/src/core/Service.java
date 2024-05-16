package core;

import java.util.List;

public interface Service<T>{
    boolean save(T objet);
    T find(int id);
    List<T> show();
  
}
