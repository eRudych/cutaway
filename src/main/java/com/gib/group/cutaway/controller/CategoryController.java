package com.gib.group.cutaway.controller;



import org.springframework.web.bind.annotation.*;

/**
 * Created By Zhu Lin on 3/10/2018.
 */
@RestController
@CrossOrigin
public class CategoryController {
//    @Autowired
//    CategoryService categoryService;
//    @Autowired
//    ProductService productService;


    /**
     * Show products in category
     *
     * @param categoryType
     * @param page
     * @param size
     * @return
     */
//    @GetMapping("/category/{type}")
//    public CategoryPage showOne(@PathVariable("type") Integer categoryType,
//                                @RequestParam(value = "page", defaultValue = "1") Integer page,
//                                @RequestParam(value = "size", defaultValue = "3") Integer size) {
//
//        ProductCategory cat = categoryService.findByCategoryType(categoryType);
//        PageRequest request = PageRequest.of(page - 1, size);
//        Page<ProductInfo> productInCategory = productService.findAllInCategory(categoryType, request);
//        var tmp = new CategoryPage("", productInCategory);
//        tmp.setCategory(cat.getCategoryName());
//        return tmp;
//    }
}
