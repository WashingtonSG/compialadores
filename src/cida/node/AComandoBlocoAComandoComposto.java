/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AComandoBlocoAComandoComposto extends PAComandoComposto
{
    private PABloco _aBloco_;

    public AComandoBlocoAComandoComposto()
    {
        // Constructor
    }

    public AComandoBlocoAComandoComposto(
        @SuppressWarnings("hiding") PABloco _aBloco_)
    {
        // Constructor
        setABloco(_aBloco_);

    }

    @Override
    public Object clone()
    {
        return new AComandoBlocoAComandoComposto(
            cloneNode(this._aBloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoBlocoAComandoComposto(this);
    }

    public PABloco getABloco()
    {
        return this._aBloco_;
    }

    public void setABloco(PABloco node)
    {
        if(this._aBloco_ != null)
        {
            this._aBloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aBloco_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aBloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aBloco_ == child)
        {
            this._aBloco_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aBloco_ == oldChild)
        {
            setABloco((PABloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
