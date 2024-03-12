/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AExpSomaExp1 extends PExp1
{
    private PExp1 _exp1_;
    private TDiferente _diferente_;
    private PExp2 _exp2_;

    public AExpSomaExp1()
    {
        // Constructor
    }

    public AExpSomaExp1(
        @SuppressWarnings("hiding") PExp1 _exp1_,
        @SuppressWarnings("hiding") TDiferente _diferente_,
        @SuppressWarnings("hiding") PExp2 _exp2_)
    {
        // Constructor
        setExp1(_exp1_);

        setDiferente(_diferente_);

        setExp2(_exp2_);

    }

    @Override
    public Object clone()
    {
        return new AExpSomaExp1(
            cloneNode(this._exp1_),
            cloneNode(this._diferente_),
            cloneNode(this._exp2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpSomaExp1(this);
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

    public TDiferente getDiferente()
    {
        return this._diferente_;
    }

    public void setDiferente(TDiferente node)
    {
        if(this._diferente_ != null)
        {
            this._diferente_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._diferente_ = node;
    }

    public PExp2 getExp2()
    {
        return this._exp2_;
    }

    public void setExp2(PExp2 node)
    {
        if(this._exp2_ != null)
        {
            this._exp2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp1_)
            + toString(this._diferente_)
            + toString(this._exp2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp1_ == child)
        {
            this._exp1_ = null;
            return;
        }

        if(this._diferente_ == child)
        {
            this._diferente_ = null;
            return;
        }

        if(this._exp2_ == child)
        {
            this._exp2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp1_ == oldChild)
        {
            setExp1((PExp1) newChild);
            return;
        }

        if(this._diferente_ == oldChild)
        {
            setDiferente((TDiferente) newChild);
            return;
        }

        if(this._exp2_ == oldChild)
        {
            setExp2((PExp2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
