/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AMultExp6 extends PExp6
{
    private PExp6 _exp6_;
    private TMult _mult_;
    private PExp7 _exp7_;

    public AMultExp6()
    {
        // Constructor
    }

    public AMultExp6(
        @SuppressWarnings("hiding") PExp6 _exp6_,
        @SuppressWarnings("hiding") TMult _mult_,
        @SuppressWarnings("hiding") PExp7 _exp7_)
    {
        // Constructor
        setExp6(_exp6_);

        setMult(_mult_);

        setExp7(_exp7_);

    }

    @Override
    public Object clone()
    {
        return new AMultExp6(
            cloneNode(this._exp6_),
            cloneNode(this._mult_),
            cloneNode(this._exp7_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultExp6(this);
    }

    public PExp6 getExp6()
    {
        return this._exp6_;
    }

    public void setExp6(PExp6 node)
    {
        if(this._exp6_ != null)
        {
            this._exp6_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp6_ = node;
    }

    public TMult getMult()
    {
        return this._mult_;
    }

    public void setMult(TMult node)
    {
        if(this._mult_ != null)
        {
            this._mult_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mult_ = node;
    }

    public PExp7 getExp7()
    {
        return this._exp7_;
    }

    public void setExp7(PExp7 node)
    {
        if(this._exp7_ != null)
        {
            this._exp7_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp7_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp6_)
            + toString(this._mult_)
            + toString(this._exp7_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp6_ == child)
        {
            this._exp6_ = null;
            return;
        }

        if(this._mult_ == child)
        {
            this._mult_ = null;
            return;
        }

        if(this._exp7_ == child)
        {
            this._exp7_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp6_ == oldChild)
        {
            setExp6((PExp6) newChild);
            return;
        }

        if(this._mult_ == oldChild)
        {
            setMult((TMult) newChild);
            return;
        }

        if(this._exp7_ == oldChild)
        {
            setExp7((PExp7) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
