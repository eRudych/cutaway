/*
 * This file is generated by jOOQ.
*/
package com.gib.group.cutaway.jooq.tables.records;


import com.st.db.tables.Product;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class ProductRecord extends UpdatableRecordImpl<ProductRecord> implements Record11<Long, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1532058216;

    /**
     * Setter for <code>public.product.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.product.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.product.mark</code>.
     */
    public void setMark(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.product.mark</code>.
     */
    public String getMark() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.product.model</code>.
     */
    public void setModel(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.product.model</code>.
     */
    public String getModel() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.product.range</code>.
     */
    public void setRange(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.product.range</code>.
     */
    public String getRange() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.product.category</code>.
     */
    public void setCategory(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.product.category</code>.
     */
    public String getCategory() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.product.years</code>.
     */
    public void setYears(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.product.years</code>.
     */
    public String getYears() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.product.price</code>.
     */
    public void setPrice(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.product.price</code>.
     */
    public String getPrice() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.product.info</code>.
     */
    public void setInfo(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.product.info</code>.
     */
    public String getInfo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.product.photo1</code>.
     */
    public void setPhoto1(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.product.photo1</code>.
     */
    public String getPhoto1() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.product.photo2</code>.
     */
    public void setPhoto2(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.product.photo2</code>.
     */
    public String getPhoto2() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.product.photo3</code>.
     */
    public void setPhoto3(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.product.photo3</code>.
     */
    public String getPhoto3() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Product.PRODUCT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Product.PRODUCT.MARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Product.PRODUCT.MODEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Product.PRODUCT.RANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Product.PRODUCT.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Product.PRODUCT.YEARS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Product.PRODUCT.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Product.PRODUCT.INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Product.PRODUCT.PHOTO1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Product.PRODUCT.PHOTO2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Product.PRODUCT.PHOTO3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getMark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getYears();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPhoto1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getPhoto2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getPhoto3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRange();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getYears();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPhoto1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPhoto2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getPhoto3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value2(String value) {
        setMark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value3(String value) {
        setModel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value4(String value) {
        setRange(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value5(String value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value6(String value) {
        setYears(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value7(String value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value8(String value) {
        setInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value9(String value) {
        setPhoto1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value10(String value) {
        setPhoto2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value11(String value) {
        setPhoto3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductRecord
     */
    public ProductRecord() {
        super(Product.PRODUCT);
    }

    /**
     * Create a detached, initialised ProductRecord
     */
    public ProductRecord(Long id, String mark, String model, String range, String category, String years, String price, String info, String photo1, String photo2, String photo3) {
        super(Product.PRODUCT);

        set(0, id);
        set(1, mark);
        set(2, model);
        set(3, range);
        set(4, category);
        set(5, years);
        set(6, price);
        set(7, info);
        set(8, photo1);
        set(9, photo2);
        set(10, photo3);
    }
}
