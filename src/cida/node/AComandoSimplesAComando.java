/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AComandoSimplesAComando extends PAComando
{
    private PAComandoSimples _aComandoSimples_;

    public AComandoSimplesAComando()
    {
        // Constructor
    }

    public AComandoSimplesAComando(
        @SuppressWarnings("hiding") PAComandoSimples _aComandoSimples_)
    {
        // Constructor
        setAComandoSimples(_aComandoSimples_);

    }

    @Override
    public Object clone()
    {
        return new AComandoSimplesAComando(
            cloneNode(this._aComandoSimples_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoSimplesAComando(this);
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
            + toString(this._aComandoSimples_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
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
        if(this._aComandoSimples_ == oldChild)
        {
            setAComandoSimples((PAComandoSimples) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
