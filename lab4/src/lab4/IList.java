
package lab4;

import java.util.Collection;

public interface IList<T> {
    void addItem(T t);
    void clear();
    Collection<T> getAll();
 }
