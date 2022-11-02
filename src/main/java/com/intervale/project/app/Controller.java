package com.intervale.project.app;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {   
    private final PrintedProductDao dao;

    public Controller(PrintedProductDao dao) {
        this.dao = dao;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public int createPrintedProduct(@RequestBody PrintedProduct printedProduct){
        return dao.createPrintedProduct(printedProduct);
    }

    @GetMapping
    public List<PrintedProduct> getPrintedProductAll(){
        return dao.getPrintedProductAll();
    }

    @GetMapping("/author")
    public List<PrintedProduct> getPrintedProductByAuthor(@RequestParam String author){
        return dao.getPrintedProductByAuthor(author);
    }

    @GetMapping("/dater")
    public List<PrintedProduct> getPrintedProductByDate(@RequestParam String date) {
        return dao.getPrintedProductByDate(date);
    }

    @GetMapping("/type")
    public List<PrintedProduct> getPrintedProductByType(@RequestParam String type){
        return dao.getPrintedProductByType(type);
    }

    @GetMapping("/publishingHouse")
    public List<PrintedProduct> getPrintedProductByPublishingHouse(@RequestParam String publishingHouse){
        return dao.getPrintedProductByPublishingHouse(publishingHouse);
    }

    @PutMapping
    public void editPrintedProduct(@RequestBody PrintedProduct printedProduct){
        dao.editPrintedProduct(printedProduct);
    }

    @DeleteMapping
    public void deletePrintedProduct(@RequestParam int id){
        dao.deletePrintedProduct(id);
    }





}
