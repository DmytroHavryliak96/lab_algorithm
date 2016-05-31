
package lab5.DataAccessLayer.DataStorage;

import java.util.Collection;
import java.util.LinkedList;


public interface IDataStorage <TEntity> {
    /*Collection<TEntity>*/ void Load(String filename);
    void Save(String filename);    
}
