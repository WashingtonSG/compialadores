/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AExpNegativoExp5 extends PExp5
{
    private TMenos _menos_;
    private PExp5 _exp5_;

    public AExpNegativoExp5()
    {
        // Constructor
    }

    public AExpNegativoExp5(
        @SuppressWarnings("hiding") TMenos _menos_,
        @SuppressWarnings("hiding") PExp5 _exp5_)
    {
        // Constructor
        setMenos(_menos_);

        setExp5(_exp5_);

    }

    @Override
    public Object clone()
    {
        return new AExpNegativoExp5(
            cloneNode(this._menos_),
            cloneNode(this._exp5_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpNegativoExp5(this);
    }

    public TMenos getMenos()
    {
        return this._menos_;
    }

    public void setMenos(TMenos node)
    {
        if(this._menos_ != null)
        {
            this._menos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menos_ = node;
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
            + toString(this._menos_)
            + toString(this._exp5_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._menos_ == child)
        {
            this._menos_ = null;
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
        if(this._menos_ == oldChild)
        {
            setMenos((TMenos) newChild);
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