/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AExp0Exp0 extends PExp0
{
    private PExp0 _exp0_;
    private TXor _xor_;
    private PExp _exp_;

    public AExp0Exp0()
    {
        // Constructor
    }

    public AExp0Exp0(
        @SuppressWarnings("hiding") PExp0 _exp0_,
        @SuppressWarnings("hiding") TXor _xor_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setExp0(_exp0_);

        setXor(_xor_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AExp0Exp0(
            cloneNode(this._exp0_),
            cloneNode(this._xor_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExp0Exp0(this);
    }

    public PExp0 getExp0()
    {
        return this._exp0_;
    }

    public void setExp0(PExp0 node)
    {
        if(this._exp0_ != null)
        {
            this._exp0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp0_ = node;
    }

    public TXor getXor()
    {
        return this._xor_;
    }

    public void setXor(TXor node)
    {
        if(this._xor_ != null)
        {
            this._xor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._xor_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp0_)
            + toString(this._xor_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp0_ == child)
        {
            this._exp0_ = null;
            return;
        }

        if(this._xor_ == child)
        {
            this._xor_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp0_ == oldChild)
        {
            setExp0((PExp0) newChild);
            return;
        }

        if(this._xor_ == oldChild)
        {
            setXor((TXor) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
