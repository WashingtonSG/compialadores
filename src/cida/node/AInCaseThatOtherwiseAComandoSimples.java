/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AInCaseThatOtherwiseAComandoSimples extends PAComandoSimples
{
    private PExpr _expr_;
    private PAComandoComposto _aComandoComposto_;
    private PAComandoSimples _aComandoSimples_;

    public AInCaseThatOtherwiseAComandoSimples()
    {
        // Constructor
    }

    public AInCaseThatOtherwiseAComandoSimples(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") PAComandoComposto _aComandoComposto_,
        @SuppressWarnings("hiding") PAComandoSimples _aComandoSimples_)
    {
        // Constructor
        setExpr(_expr_);

        setAComandoComposto(_aComandoComposto_);

        setAComandoSimples(_aComandoSimples_);

    }

    @Override
    public Object clone()
    {
        return new AInCaseThatOtherwiseAComandoSimples(
            cloneNode(this._expr_),
            cloneNode(this._aComandoComposto_),
            cloneNode(this._aComandoSimples_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInCaseThatOtherwiseAComandoSimples(this);
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

    public PAComandoComposto getAComandoComposto()
    {
        return this._aComandoComposto_;
    }

    public void setAComandoComposto(PAComandoComposto node)
    {
        if(this._aComandoComposto_ != null)
        {
            this._aComandoComposto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aComandoComposto_ = node;
    }

    public PAComandoSimples getAComandoSimples()
    {
        return this._aComandoSimples_;
    }

    public void setAComandoSimples(PAComandoSimples node)
    {
        if(this._aComandoSimples_ != null)
        {
            this._aComandoSimples_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aComandoSimples_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._aComandoComposto_)
            + toString(this._aComandoSimples_);
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

        if(this._aComandoComposto_ == child)
        {
            this._aComandoComposto_ = null;
            return;
        }

        if(this._aComandoSimples_ == child)
        {
            this._aComandoSimples_ = null;
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

        if(this._aComandoComposto_ == oldChild)
        {
            setAComandoComposto((PAComandoComposto) newChild);
            return;
        }

        if(this._aComandoSimples_ == oldChild)
        {
            setAComandoSimples((PAComandoSimples) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
