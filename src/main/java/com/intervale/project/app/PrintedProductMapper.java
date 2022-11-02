package com.intervale.project.app;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PrintedProductMapper implements RowMapper<PrintedProduct> {

    @Override
    public PrintedProduct mapRow(ResultSet rs, int i) throws SQLException{
        PrintedProduct printedProduct = new PrintedProduct();
        printedProduct.setId(rs.getInt("id"));
        printedProduct.setName(rs.getString("name"));
        printedProduct.setType(rs.getString("type"));
        printedProduct.setDater(rs.getString("dater"));
        printedProduct.setAuthor(rs.getString("author"));
        printedProduct.setPublishingHouse(rs.getString("publishingHouse"));
        return printedProduct;
    }

}
