/*
 * This file is generated by jOOQ.
*/
package com.gib.group.cutaway.jooq.tables;


import com.st.db.Keys;
import com.st.db.Public;
import com.st.db.tables.records.ProductsMarkRecord;
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
public class ProductsMark extends TableImpl<ProductsMarkRecord> {

    private static final long serialVersionUID = 1139653819;

    /**
     * The reference instance of <code>public.products_mark</code>
     */
    public static final ProductsMark PRODUCTS_MARK = new ProductsMark();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductsMarkRecord> getRecordType() {
        return ProductsMarkRecord.class;
    }

    /**
     * The column <code>public.products_mark.id</code>.
     */
    public final TableField<ProductsMarkRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.products_mark.name</code>.
     */
    public final TableField<ProductsMarkRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>public.products_mark</code> table reference
     */
    public ProductsMark() {
        this(DSL.name("products_mark"), null);
    }

    /**
     * Create an aliased <code>public.products_mark</code> table reference
     */
    public ProductsMark(String alias) {
        this(DSL.name(alias), PRODUCTS_MARK);
    }

    /**
     * Create an aliased <code>public.products_mark</code> table reference
     */
    public ProductsMark(Name alias) {
        this(alias, PRODUCTS_MARK);
    }

    private ProductsMark(Name alias, Table<ProductsMarkRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProductsMark(Name alias, Table<ProductsMarkRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ProductsMarkRecord> getPrimaryKey() {
        return Keys.PRODUCTS_MARK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductsMarkRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductsMarkRecord>>asList(Keys.PRODUCTS_MARK_PKEY, Keys.PRODUCTS_MARK_NAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsMark as(String alias) {
        return new ProductsMark(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductsMark as(Name alias) {
        return new ProductsMark(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductsMark rename(String name) {
        return new ProductsMark(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductsMark rename(Name name) {
        return new ProductsMark(name, null);
    }
}