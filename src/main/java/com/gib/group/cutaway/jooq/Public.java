/*
 * This file is generated by jOOQ.
*/
package com.gib.group.cutaway.jooq;


import com.st.db.tables.*;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 401612216;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.messages</code>.
     */
    public final Messages MESSAGES = com.st.db.tables.Messages.MESSAGES;

    /**
     * The table <code>public.order</code>.
     */
    public final Order ORDER = com.st.db.tables.Order.ORDER;

    /**
     * The table <code>public.order_detail</code>.
     */
    public final OrderDetail ORDER_DETAIL = com.st.db.tables.OrderDetail.ORDER_DETAIL;

    /**
     * The table <code>public.posts</code>.
     */
    public final Posts POSTS = com.st.db.tables.Posts.POSTS;

    /**
     * The table <code>public.product</code>.
     */
    public final Product PRODUCT = com.st.db.tables.Product.PRODUCT;

    /**
     * The table <code>public.products_category</code>.
     */
    public final ProductsCategory PRODUCTS_CATEGORY = com.st.db.tables.ProductsCategory.PRODUCTS_CATEGORY;

    /**
     * The table <code>public.products_mark</code>.
     */
    public final ProductsMark PRODUCTS_MARK = com.st.db.tables.ProductsMark.PRODUCTS_MARK;

    /**
     * The table <code>public.telegramMessages</code>.
     */
    public final Telegrammessages TELEGRAMMESSAGES = com.st.db.tables.Telegrammessages.TELEGRAMMESSAGES;

    /**
     * The table <code>public.users</code>.
     */
    public final Users USERS = com.st.db.tables.Users.USERS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Messages.MESSAGES,
            Order.ORDER,
            OrderDetail.ORDER_DETAIL,
            Posts.POSTS,
            Product.PRODUCT,
            ProductsCategory.PRODUCTS_CATEGORY,
            ProductsMark.PRODUCTS_MARK,
            Telegrammessages.TELEGRAMMESSAGES,
            Users.USERS);
    }
}
