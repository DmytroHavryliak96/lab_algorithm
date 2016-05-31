
package lab5.DataAccessLayer.DataProvider;

import java.util.Collection;


public interface IDataProvider <TEntity> {
    void Update(TEntity ent, int index);
    void Delete(int index);
    void add(TEntity ent);
    TEntity GetById (int i);
    Collection<TEntity> GetAll();
}
