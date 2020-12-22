/*
 * This file is generated by jOOQ.
*/
package com.gib.group.cutaway.jooq.tables;


import com.st.db.Keys;
import com.st.db.Public;
import com.st.db.tables.records.ProductRecord;
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
public class Product extends TableImpl<ProductRecord> {

    private static final long serialVersionUID = -1315525413;

    /**
     * The reference instance of <code>public.product</code>
     */
    public static final Product PRODUCT = new Product();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductRecord> getRecordType() {
        return ProductRecord.class;
    }

    /**
     * The column <code>public.product.id</code>.
     */
    public final TableField<ProductRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.product.mark</code>.
     */
    public final TableField<ProductRecord, String> MARK = createField("mark", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.product.model</code>.
     */
    public final TableField<ProductRecord, String> MODEL = createField("model", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.product.range</code>.
     */
    public final TableField<ProductRecord, String> RANGE = createField("range", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.product.category</code>.
     */
    public final TableField<ProductRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.product.years</code>.
     */
    public final TableField<ProductRecord, String> YEARS = createField("years", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.product.price</code>.
     */
    public final TableField<ProductRecord, String> PRICE = createField("price", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.product.info</code>.
     */
    public final TableField<ProductRecord, String> INFO = createField("info", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.product.photo1</code>.
     */
    public final TableField<ProductRecord, String> PHOTO1 = createField("photo1", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.product.photo2</code>.
     */
    public final TableField<ProductRecord, String> PHOTO2 = createField("photo2", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.product.photo3</code>.
     */
    public final TableField<ProductRecord, String> PHOTO3 = createField("photo3", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.product</code> table reference
     */
    public Product() {
        this(DSL.name("product"), null);
    }

    /**
     * Create an aliased <code>public.product</code> table reference
     */
    public Product(String alias) {
        this(DSL.name(alias), PRODUCT);
    }

    /**
     * Create an aliased <code>public.product</code> table reference
     */
    public Product(Name alias) {
        this(alias, PRODUCT);
    }

    private Product(Name alias, Table<ProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private Product(Name alias, Table<ProductRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ProductRecord> getPrimaryKey() {
        return Keys.PRODUCT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductRecord>>asList(Keys.PRODUCT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ProductRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProductRecord, ?>>asList(Keys.PRODUCT__FK_PRODUCTS_MARK, Keys.PRODUCT__FK_PRODUCTS_CATEGORY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product as(String alias) {
        return new Product(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product as(Name alias) {
        return new Product(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Product rename(String name) {
        return new Product(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Product rename(Name name) {
        return new Product(name, null);
    }
}
