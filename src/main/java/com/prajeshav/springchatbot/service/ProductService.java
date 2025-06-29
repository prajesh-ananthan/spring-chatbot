package com.prajeshav.springchatbot.service;

import com.prajeshav.springchatbot.dto.ProductSearchResult;
import com.prajeshav.springchatbot.entities.Product;
import com.prajeshav.springchatbot.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductSearchResult searchProducts(String query) {
        List<Product> products = productRepository.searchProducts(query);
        var summary = buildProductSummary(products, "search for: " + query);
        return new ProductSearchResult(products, summary);
    }

    public ProductSearchResult getProductsByPriceRange(Double minPrice, Double maxPrice) {
        List<Product> products = productRepository.findByPriceBetween(minPrice, maxPrice);
        String summary = buildProductSummary(products,
                String.format("price range $%.2f - $%.2f", minPrice, maxPrice));
        return new ProductSearchResult(products, summary);
    }

    public ProductSearchResult getProductsByCategory(String category) {
        List<Product> products = productRepository.findByCategoryIgnoreCase(category);
        var summary = buildProductSummary(products, "category: " + category);
        return new ProductSearchResult(products, summary);
    }

    public ProductSearchResult getAvailableProducts() {
        List<Product> products = productRepository.findAvailableProducts();
        var summary = buildProductSummary(products, "available products");
        return new ProductSearchResult(products, summary);
    }

    private String buildProductSummary(List<Product> products, String searchContext) {
        if (products.isEmpty()) {
            return "No products found for " + searchContext;
        }

        StringBuilder summary = new StringBuilder();
        summary.append("Found ").append(products.size()).append(" product(s) for ").append(searchContext).append(":\n");

        products.stream()
                .limit(5) // Limit to prevent overwhelming the AI
                .forEach(product -> {
                    summary.append("• ").append(product.getName())
                            .append(" by ").append(product.getBrand())
                            .append(" - $").append(String.format("%.2f", product.getPrice()))
                            .append(" (Stock: ").append(product.getStock()).append(")")
                            .append(" [").append(product.getCategory()).append("]\n");
                });

        if (products.size() > 5) {
            summary.append("... and ").append(products.size() - 5).append(" more products");
        }

        return summary.toString();
    }
}