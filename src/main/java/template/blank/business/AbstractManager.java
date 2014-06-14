package template.blank.business;

import org.springframework.transaction.annotation.Transactional;


@Transactional
public abstract class AbstractManager<E> {

	public abstract E getDao();

}
