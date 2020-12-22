/*
 * This file is generated by jOOQ.
*/
package com.gib.group.cutaway.jooq.tables.records;


import com.st.db.tables.Telegrammessages;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class TelegrammessagesRecord extends UpdatableRecordImpl<TelegrammessagesRecord> implements Record2<Integer, Long> {

    private static final long serialVersionUID = -225909882;

    /**
     * Setter for <code>public.telegramMessages.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.telegramMessages.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.telegramMessages.id_post</code>.
     */
    public void setIdPost(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.telegramMessages.id_post</code>.
     */
    public Long getIdPost() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Telegrammessages.TELEGRAMMESSAGES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Telegrammessages.TELEGRAMMESSAGES.ID_POST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getIdPost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getIdPost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TelegrammessagesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TelegrammessagesRecord value2(Long value) {
        setIdPost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TelegrammessagesRecord values(Integer value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TelegrammessagesRecord
     */
    public TelegrammessagesRecord() {
        super(Telegrammessages.TELEGRAMMESSAGES);
    }

    /**
     * Create a detached, initialised TelegrammessagesRecord
     */
    public TelegrammessagesRecord(Integer id, Long idPost) {
        super(Telegrammessages.TELEGRAMMESSAGES);

        set(0, id);
        set(1, idPost);
    }
}
