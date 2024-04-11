/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AInCaseThatSimplesAComandoSimples extends PAComandoSimples
{
    private PExpr _expr_;
    private PAComando _aComando_;

    public AInCaseThatSimplesAComandoSimples()
    {
        // Constructor
    }

    public AInCaseThatSimplesAComandoSimples(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") PAComando _aComando_)
    {
        // Constructor
        setExpr(_expr_);

        setAComando(_aComando_);

    }

    @Override
    public Object clone()
    {
        return new AInCaseThatSimplesAComandoSimples(
            cloneNode(this._expr_),
            cloneNode(this._aComando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInCaseThatSimplesAComandoSimples(this);
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

    public PAComando getAComando()
    {
        return this._aComando_;
    }

    public void setAComando(PAComando node)
    {
        if(this._aComando_ != null)
        {
            this._aComando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aComando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._aComando_);
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

        if(this._aComando_ == child)
        {
            this._aComando_ = null;
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

        if(this._aComando_ == oldChild)
        {
            setAComando((PAComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
