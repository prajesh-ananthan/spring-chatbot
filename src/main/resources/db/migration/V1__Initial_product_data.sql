CREATE TABLE IF NOT EXISTS products
(
    id             BIGINT PRIMARY KEY AUTO_INCREMENT,
    name           VARCHAR(255)   NOT NULL,
    price          DECIMAL(10, 2) NOT NULL,
    description    VARCHAR(1000)  NOT NULL,
    stock_quantity INT            NOT NULL,
    category       VARCHAR(255)   NOT NULL,
    brand          VARCHAR(500),
    created_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

INSERT INTO products (name, price, description, stock_quantity, category, brand)
VALUES
-- Computers
('MacBook Pro 14"', 1999.99, 'Apple M3 chip, 16GB RAM, 512GB SSD', 5, 'Computers', 'Apple'),
('Dell XPS 13', 1299.99, 'Intel i7, 16GB RAM, 512GB SSD', 8, 'Computers', 'Dell'),
('Gaming Laptop ASUS ROG', 1599.99, 'RTX 4060, AMD Ryzen 7, 32GB RAM', 3, 'Computers', 'ASUS'),

-- Accessories
('Logitech MX Master 3', 99.99, 'Advanced wireless mouse for productivity', 25, 'Accessories', 'Logitech'),
('Apple Magic Mouse', 79.99, 'Multi-touch wireless mouse', 15, 'Accessories', 'Apple'),
('Mechanical Keyboard K95', 179.99, 'RGB mechanical gaming keyboard', 12, 'Accessories', 'Corsair'),
('Apple Magic Keyboard', 149.99, 'Wireless keyboard with numeric keypad', 10, 'Accessories', 'Apple'),

-- Monitors
('Dell UltraSharp 27"', 399.99, '4K USB-C monitor with color accuracy', 7, 'Monitors', 'Dell'),
('LG 34" Ultrawide', 599.99, '34-inch curved ultrawide monitor', 4, 'Monitors', 'LG'),

-- Audio
('Sony WH-1000XM5', 349.99, 'Industry-leading noise canceling headphones', 20, 'Audio', 'Sony'),
('AirPods Pro', 249.99, 'Active noise cancellation, spatial audio', 30, 'Audio', 'Apple');