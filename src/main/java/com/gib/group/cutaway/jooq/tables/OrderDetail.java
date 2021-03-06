/*
 * This file is generated by jOOQ.
*/
package com.gib.group.cutaway.jooq.tables;


import com.st.db.Keys;
import com.st.db.Public;
import com.st.db.tables.records.OrderDetailRecord;
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
public class OrderDetail extends TableImpl<OrderDetailRecord> {

    private static final long serialVersionUID = 2041738679;

    /**
     * The reference instance of <code>public.order_detail</code>
     */
    public static final OrderDetail ORDER_DETAIL = new OrderDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderDetailRecord> getRecordType() {
        return OrderDetailRecord.class;
    }

    /**
     * The column <code>public.order_detail.orderId</code>.
     */
    public final TableField<OrderDetailRecord, Long> ORDERID = createField("orderId", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.order_detail.productId</code>.
     */
    public final TableField<OrderDetailRecord, Long> PRODUCTID = createField("productId", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.order_detail</code> table reference
     */
    public OrderDetail() {
        this(DSL.name("order_detail"), null);
    }

    /**
     * Create an aliased <code>public.order_detail</code> table reference
     */
    public OrderDetail(String alias) {
        this(DSL.name(alias), ORDER_DETAIL);
    }

    /**
     * Create an aliased <code>public.order_detail</code> table reference
     */
    public OrderDetail(Name alias) {
        this(alias, ORDER_DETAIL);
    }

    private OrderDetail(Name alias, Table<OrderDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderDetail(Name alias, Table<OrderDetailRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<OrderDetailRecord> getPrimaryKey() {
        return Keys.ORDER_DETAIL_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderDetailRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderDetailRecord>>asList(Keys.ORDER_DETAIL_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OrderDetailRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OrderDetailRecord, ?>>asList(Keys.ORDER_DETAIL__FK_ORDERS_ORDERID, Keys.ORDER_DETAIL__FK_PRODUCT_PRODUCTID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderDetail as(String alias) {
        return new OrderDetail(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderDetail as(Name alias) {
        return new OrderDetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderDetail rename(String name) {
        return new OrderDetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderDetail rename(Name name) {
        return new OrderDetail(name, null);
    }
}
