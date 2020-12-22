/*
 * This file is generated by jOOQ.
*/
package com.gib.group.cutaway.jooq.tables;


import com.st.db.Keys;
import com.st.db.Public;
import com.st.db.tables.records.ProductsCategoryRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductsCategory extends TableImpl<ProductsCategoryRecord> {

    private static final long serialVersionUID = -1963095491;

    /**
     * The reference instance of <code>public.products_category</code>
     */
    public static final ProductsCategory PRODUCTS_CATEGORY = new ProductsCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductsCategoryRecord> getRecordType() {
        return ProductsCategoryRecord.class;
    }

    /**
     * The column <code>public.products_category.id</code>.
     */
    public final TableField<ProductsCategoryRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.products_category.name</code>.
     */
    public final TableField<ProductsCategoryRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>public.products_category</code> table reference
     */
    public ProductsCategory() {
        this(DSL.name("products_category"), null);
    }

    /**
     * Create an aliased <code>public.products_category</code> table reference
     */
    public ProductsCategory(String alias) {
        this(DSL.name(alias), PRODUCTS_CATEGORY);
    }

    /**
     * Create an aliased <code>public.products_category</code> table reference
     */
    public ProductsCategory(Name alias) {
        this(alias, PRODUCTS_CATEGORY);
    }

    private ProductsCategory(Name alias, Table<ProductsCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProductsCategory(Name alias, Table<ProductsCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProductsCategoryRecord> getPrimaryKey() {
        return Keys.PRODUCTS_CATEGORY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductsCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductsCategoryRecord>>asList(Keys.PRODUCTS_CATEGORY_PKEY, Keys.PRODUCTS_CATEGORY_NAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsCategory as(String alias) {
        return new ProductsCategory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsCategory as(Name alias) {
        return new ProductsCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductsCategory rename(String name) {
        return new ProductsCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductsCategory rename(Name name) {
        return new ProductsCategory(name, null);
    }
}