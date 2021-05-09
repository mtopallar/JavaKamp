package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service // bu class service görevi görecek.
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired // bein - proje class'ı spring buna karşılık gelen productdao nun karşılığı olan
				// sınıfı verir. Eşleşmeye kendisi bakar. Java dünyasında bu kulklanım çok
				// yaygındır. Tek instance bağımlmılığı vardır configure etmek mümkündür ama çok
				// tercih edilmez. tek instance derken bir interface i birdenfazla class
				// implemente ederse autowired normalde patlar.
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll()
	{
		return this.productDao.findAll();
	}

}