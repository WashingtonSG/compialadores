/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AParenExp8 extends PExp8
{
    private TParEsq _parEsq_;
    private PExp8 _exp8_;
    private TParDir _parDir_;

    public AParenExp8()
    {
        // Constructor
    }

    public AParenExp8(
        @SuppressWarnings("hiding") TParEsq _parEsq_,
        @SuppressWarnings("hiding") PExp8 _exp8_,
        @SuppressWarnings("hiding") TParDir _parDir_)
    {
        // Constructor
        setParEsq(_parEsq_);

        setExp8(_exp8_);

        setParDir(_parDir_);

    }

    @Override
    public Object clone()
    {
        return new AParenExp8(
            cloneNode(this._parEsq_),
            cloneNode(this._exp8_),
            cloneNode(this._parDir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParenExp8(this);
    }

    public TParEsq getParEsq()
    {
        return this._parEsq_;
    }

    public void setParEsq(TParEsq node)
    {
        if(this._parEsq_ != null)
        {
            this._parEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parEsq_ = node;
    }

    public PExp8 getExp8()
    {
        return this._exp8_;
    }

    public void setExp8(PExp8 node)
    {
        if(this._exp8_ != null)
        {
            this._exp8_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp8_ = node;
    }

    public TParDir getParDir()
    {
        return this._parDir_;
    }

    public void setParDir(TParDir node)
    {
        if(this._parDir_ != null)
        {
            this._parDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parDir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parEsq_)
            + toString(this._exp8_)
            + toString(this._parDir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parEsq_ == child)
        {
            this._parEsq_ = null;
            return;
        }

        if(this._exp8_ == child)
        {
            this._exp8_ = null;
            return;
        }

        if(this._parDir_ == child)
        {
            this._parDir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parEsq_ == oldChild)
        {
            setParEsq((TParEsq) newChild);
            return;
        }

        if(this._exp8_ == oldChild)
        {
            setExp8((PExp8) newChild);
            return;
        }

        if(this._parDir_ == oldChild)
        {
            setParDir((TParDir) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
