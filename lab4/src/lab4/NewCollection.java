
package lab4;

import java.util.Collection;

public class NewCollection implements IList<IProduct> {

    private Collection<IProduct> list = (Collection<IProduct>) new LinkedList();
    
    @Override
    public void addItem(IProduct t) {
        list.add(t);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public Collection getAll() {
        return list;
    }
    
}
