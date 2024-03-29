/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AExpOuExp extends PExp
{
    private PExp _exp_;
    private TOr _or_;
    private PExp1 _exp1_;

    public AExpOuExp()
    {
        // Constructor
    }

    public AExpOuExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TOr _or_,
        @SuppressWarnings("hiding") PExp1 _exp1_)
    {
        // Constructor
        setExp(_exp_);

        setOr(_or_);

        setExp1(_exp1_);

    }

    @Override
    public Object clone()
    {
        return new AExpOuExp(
            cloneNode(this._exp_),
            cloneNode(this._or_),
            cloneNode(this._exp1_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpOuExp(this);
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TOr getOr()
    {
        return this._or_;
    }

    public void setOr(TOr node)
    {
        if(this._or_ != null)
        {
            this._or_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._or_ = node;
    }

    public PExp1 getExp1()
    {
        return this._exp1_;
    }

    public void setExp1(PExp1 node)
    {
        if(this._exp1_ != null)
        {
            this._exp1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._or_)
            + toString(this._exp1_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._or_ == child)
        {
            this._or_ = null;
            return;
        }

        if(this._exp1_ == child)
        {
            this._exp1_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._or_ == oldChild)
        {
            setOr((TOr) newChild);
            return;
        }

        if(this._exp1_ == oldChild)
        {
            setExp1((PExp1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
