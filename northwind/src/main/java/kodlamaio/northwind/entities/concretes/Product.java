package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity // veritabanı nesnesi
@Table(name = "products") // db deki hangi tablo
@AllArgsConstructor
@NoArgsConstructor
public class Product
{

	@Id // bu id kolonudur.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 1-1 otomatik artar
	@Column(name = "product_id") // name isimli kolonun karşılığıdır. (Bu 3 ünün sırası önemli değil)
	private int id;

	// @Column(name = "category_id")
	// private int categoryId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "unit_price")
	private double unitPrice;

	@Column(name = "units_in_stock")
	private short unitsInStock;

	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;

	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;

}
