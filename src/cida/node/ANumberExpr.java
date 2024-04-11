/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class ANumberExpr extends PExpr
{
    private TNumber _number_;

    public ANumberExpr()
    {
        // Constructor
    }

    public ANumberExpr(
        @SuppressWarnings("hiding") TNumber _number_)
    {
        // Constructor
        setNumber(_number_);

    }

    @Override
    public Object clone()
    {
        return new ANumberExpr(
            cloneNode(this._number_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumberExpr(this);
    }

    public TNumber getNumber()
    {
        return this._number_;
    }

    public void setNumber(TNumber node)
    {
        if(this._number_ != null)
        {
            this._number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._number_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._number_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._number_ == child)
        {
            this._number_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._number_ == oldChild)
        {
            setNumber((TNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
