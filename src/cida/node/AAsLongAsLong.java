/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AAsLongAsLong extends PAsLong
{
    private TAs _as_;
    private TLong _long_;

    public AAsLongAsLong()
    {
        // Constructor
    }

    public AAsLongAsLong(
        @SuppressWarnings("hiding") TAs _as_,
        @SuppressWarnings("hiding") TLong _long_)
    {
        // Constructor
        setAs(_as_);

        setLong(_long_);

    }

    @Override
    public Object clone()
    {
        return new AAsLongAsLong(
            cloneNode(this._as_),
            cloneNode(this._long_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAsLongAsLong(this);
    }

    public TAs getAs()
    {
        return this._as_;
    }

    public void setAs(TAs node)
    {
        if(this._as_ != null)
        {
            this._as_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._as_ = node;
    }

    public TLong getLong()
    {
        return this._long_;
    }

    public void setLong(TLong node)
    {
        if(this._long_ != null)
        {
            this._long_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._long_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._as_)
            + toString(this._long_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._as_ == child)
        {
            this._as_ = null;
            return;
        }

        if(this._long_ == child)
        {
            this._long_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._as_ == oldChild)
        {
            setAs((TAs) newChild);
            return;
        }

        if(this._long_ == oldChild)
        {
            setLong((TLong) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
