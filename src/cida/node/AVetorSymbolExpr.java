/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AVetorSymbolExpr extends PExpr
{
    private TVetorSymbol _vetorSymbol_;

    public AVetorSymbolExpr()
    {
        // Constructor
    }

    public AVetorSymbolExpr(
        @SuppressWarnings("hiding") TVetorSymbol _vetorSymbol_)
    {
        // Constructor
        setVetorSymbol(_vetorSymbol_);

    }

    @Override
    public Object clone()
    {
        return new AVetorSymbolExpr(
            cloneNode(this._vetorSymbol_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVetorSymbolExpr(this);
    }

    public TVetorSymbol getVetorSymbol()
    {
        return this._vetorSymbol_;
    }

    public void setVetorSymbol(TVetorSymbol node)
    {
        if(this._vetorSymbol_ != null)
        {
            this._vetorSymbol_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._vetorSymbol_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._vetorSymbol_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._vetorSymbol_ == child)
        {
            this._vetorSymbol_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._vetorSymbol_ == oldChild)
        {
            setVetorSymbol((TVetorSymbol) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
