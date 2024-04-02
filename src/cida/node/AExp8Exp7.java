/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AExp8Exp7 extends PExp7
{
    private PExp8 _exp8_;

    public AExp8Exp7()
    {
        // Constructor
    }

    public AExp8Exp7(
        @SuppressWarnings("hiding") PExp8 _exp8_)
    {
        // Constructor
        setExp8(_exp8_);

    }

    @Override
    public Object clone()
    {
        return new AExp8Exp7(
            cloneNode(this._exp8_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExp8Exp7(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp8_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp8_ == child)
        {
            this._exp8_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp8_ == oldChild)
        {
            setExp8((PExp8) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
