package com.intervale.project.app;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PrintedProductDao {
    private final JdbcTemplate jdbcTemplate;

    public PrintedProductDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int createPrintedProduct(PrintedProduct printedProduct) {
        String req = "INSERT INTO printedProduct (name, type, dater, author, publishingHouse) VALUES (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(req, printedProduct.getName(), printedProduct.getType(), printedProduct.getDater(), printedProduct.getAuthor(), printedProduct.getPublishingHouse());
    }

    public List<PrintedProduct> getPrintedProductByAuthor(String author){
        String req = "SELECT * FROM printedProduct WHERE author=?";
        return jdbcTemplate.query(req, new PrintedProductMapper(), author);
    }

    public List<PrintedProduct> getPrintedProductAll(){
        String req = "SELECT * FROM printedProduct";
        return jdbcTemplate.query(req, new PrintedProductMapper());
    }

    public List<PrintedProduct> getPrintedProductByType(String type){
        String req = "SELECT * FROM printedProduct WHERE type=?";
        return jdbcTemplate.query(req, new PrintedProductMapper(), type);
    }

    public List<PrintedProduct> getPrintedProductByPublishingHouse(String publishingHouse){
        String req = "SELECT * FROM printedProduct WHERE publishingHouse=?";
        return jdbcTemplate.query(req, new PrintedProductMapper(), publishingHouse);
    }

    public List<PrintedProduct> getPrintedProductByDate(String date){
            String req = "SELECT * FROM printedProduct WHERE dater= ?";
            System.out.println(date);
            return jdbcTemplate.query(req, new PrintedProductMapper(), date);
    }

    public void editPrintedProduct(PrintedProduct printedProduct){
        String req = "UPDATE printedProduct SET name = ?, type = ?, dater = ?, author = ?, publishingHouse = ? WHERE id = ?";
        jdbcTemplate.update(req, printedProduct.getName(), printedProduct.getType(), printedProduct.getDater(), printedProduct.getAuthor(), printedProduct.getPublishingHouse(), printedProduct.getId());
    }

    public void deletePrintedProduct(int id){
        String req = "DELETE FROM printedProduct WHERE id=?";
        jdbcTemplate.update(req, id);
    }

}
