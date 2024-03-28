/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AExpComparacaoExp1 extends PExp1
{
    private PExp1 _exp1_;
    private TComparacao _comparacao_;
    private PExp2 _exp2_;

    public AExpComparacaoExp1()
    {
        // Constructor
    }

    public AExpComparacaoExp1(
        @SuppressWarnings("hiding") PExp1 _exp1_,
        @SuppressWarnings("hiding") TComparacao _comparacao_,
        @SuppressWarnings("hiding") PExp2 _exp2_)
    {
        // Constructor
        setExp1(_exp1_);

        setComparacao(_comparacao_);

        setExp2(_exp2_);

    }

    @Override
    public Object clone()
    {
        return new AExpComparacaoExp1(
            cloneNode(this._exp1_),
            cloneNode(this._comparacao_),
            cloneNode(this._exp2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpComparacaoExp1(this);
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

    public TComparacao getComparacao()
    {
        return this._comparacao_;
    }

    public void setComparacao(TComparacao node)
    {
        if(this._comparacao_ != null)
        {
            this._comparacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comparacao_ = node;
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
            + toString(this._comparacao_)
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

        if(this._comparacao_ == child)
        {
            this._comparacao_ = null;
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

        if(this._comparacao_ == oldChild)
        {
            setComparacao((TComparacao) newChild);
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