/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AExpNotExp5 extends PExp5
{
    private TNot _not_;
    private PExp5 _exp5_;

    public AExpNotExp5()
    {
        // Constructor
    }

    public AExpNotExp5(
        @SuppressWarnings("hiding") TNot _not_,
        @SuppressWarnings("hiding") PExp5 _exp5_)
    {
        // Constructor
        setNot(_not_);

        setExp5(_exp5_);

    }

    @Override
    public Object clone()
    {
        return new AExpNotExp5(
            cloneNode(this._not_),
            cloneNode(this._exp5_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpNotExp5(this);
    }

    public TNot getNot()
    {
        return this._not_;
    }

    public void setNot(TNot node)
    {
        if(this._not_ != null)
        {
            this._not_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._not_ = node;
    }

    public PExp5 getExp5()
    {
        return this._exp5_;
    }

    public void setExp5(PExp5 node)
    {
        if(this._exp5_ != null)
        {
            this._exp5_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp5_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._not_)
            + toString(this._exp5_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._not_ == child)
        {
            this._not_ = null;
            return;
        }

        if(this._exp5_ == child)
        {
            this._exp5_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._not_ == oldChild)
        {
            setNot((TNot) newChild);
            return;
        }

        if(this._exp5_ == oldChild)
        {
            setExp5((PExp5) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
