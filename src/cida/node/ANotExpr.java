/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class ANotExpr extends PExpr
{
    private PExpr _right_;

    public ANotExpr()
    {
        // Constructor
    }

    public ANotExpr(
        @SuppressWarnings("hiding") PExpr _right_)
    {
        // Constructor
        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new ANotExpr(
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotExpr(this);
    }

    public PExpr getRight()
    {
        return this._right_;
    }

    public void setRight(PExpr node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._right_ == oldChild)
        {
            setRight((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
