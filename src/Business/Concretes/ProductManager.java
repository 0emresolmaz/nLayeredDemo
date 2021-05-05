package Business.Concretes;

import Business.Abstracts.ProductService;
import Core.LoggerService;
import DataAccess.Abstracts.ProductDao;
import Entities.Concretes.Product;
import JLogger.JLoggerManager;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        // İş kodları
        if (product.getCategoryId() == 1) {
            System.out.println("Bu kategoride ürün kabul edilmiyor");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün eklendi : " + product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
