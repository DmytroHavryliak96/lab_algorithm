
package lab5.DataAccessLayer.EntityFactory;

public interface IEntityFactory<TEntity> {
    TEntity FromCsv (String csv);
    String ToCsv(TEntity obj);
}
