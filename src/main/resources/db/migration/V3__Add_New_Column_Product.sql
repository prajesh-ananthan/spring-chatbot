-- Add available column to products table
ALTER TABLE products
    ADD COLUMN available BOOLEAN NOT NULL DEFAULT true;