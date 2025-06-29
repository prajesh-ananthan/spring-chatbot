/**
 * Created by Prajesh AV
 * Date: 29/6/2025
 */

package com.prajeshav.springchatbot.dto;

import com.prajeshav.springchatbot.entities.Product;
import lombok.Getter;

import java.util.List;

/**
 * Created by Prajesh AV
 * Date: 29/6/2025
 */

@Getter
public class ProductSearchResult() {
    private List<Product> products;
    private String summary;
    private int totalCount;

    public ProductSearchResult(List<Product> products, String summary) {
        this.products = products;
        this.summary = summary;
        this.totalCount = products.size();
    }
}
