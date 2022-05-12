import com.domain.repository.ProductRepositoryimpl;

class App {
	public static void main(String[] args) {

		System.out.println("Spring Core :.....");
		ProductRepositoryimpl productRepositoryimpl = new ProductRepositoryimpl();
		System.out.println(productRepositoryimpl.findAll());

	}
}