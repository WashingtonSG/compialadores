/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class ASymbolExpr extends PExpr
{
    private TSymbol _symbol_;

    public ASymbolExpr()
    {
        // Constructor
    }

    public ASymbolExpr(
        @SuppressWarnings("hiding") TSymbol _symbol_)
    {
        // Constructor
        setSymbol(_symbol_);

    }

    @Override
    public Object clone()
    {
        return new ASymbolExpr(
            cloneNode(this._symbol_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASymbolExpr(this);
    }

    public TSymbol getSymbol()
    {
        return this._symbol_;
    }

    public void setSymbol(TSymbol node)
    {
        if(this._symbol_ != null)
        {
            this._symbol_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._symbol_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._symbol_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._symbol_ == child)
        {
            this._symbol_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._symbol_ == oldChild)
        {
            setSymbol((TSymbol) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}