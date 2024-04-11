/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AInCaseCompostoAComandoComposto extends PAComandoComposto
{
    private PExpr _expr_;
    private PAComandoComposto _comando1_;
    private PAComandoComposto _comando2_;

    public AInCaseCompostoAComandoComposto()
    {
        // Constructor
    }

    public AInCaseCompostoAComandoComposto(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") PAComandoComposto _comando1_,
        @SuppressWarnings("hiding") PAComandoComposto _comando2_)
    {
        // Constructor
        setExpr(_expr_);

        setComando1(_comando1_);

        setComando2(_comando2_);

    }

    @Override
    public Object clone()
    {
        return new AInCaseCompostoAComandoComposto(
            cloneNode(this._expr_),
            cloneNode(this._comando1_),
            cloneNode(this._comando2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInCaseCompostoAComandoComposto(this);
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public PAComandoComposto getComando1()
    {
        return this._comando1_;
    }

    public void setComando1(PAComandoComposto node)
    {
        if(this._comando1_ != null)
        {
            this._comando1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando1_ = node;
    }

    public PAComandoComposto getComando2()
    {
        return this._comando2_;
    }

    public void setComando2(PAComandoComposto node)
    {
        if(this._comando2_ != null)
        {
            this._comando2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._comando1_)
            + toString(this._comando2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._comando1_ == child)
        {
            this._comando1_ = null;
            return;
        }

        if(this._comando2_ == child)
        {
            this._comando2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._comando1_ == oldChild)
        {
            setComando1((PAComandoComposto) newChild);
            return;
        }

        if(this._comando2_ == oldChild)
        {
            setComando2((PAComandoComposto) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
