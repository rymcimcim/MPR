package repositories;

public interface IRepository<TEntity> {
	
	public void save(TEntity entity);
	public void update(TEntity entity);
	public void delete(TEntity entity);
	public TEntity get(int id);

}
