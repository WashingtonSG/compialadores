/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import java.util.*;
import cida.analysis.*;

@SuppressWarnings("nls")
public final class AShowAComandoComposto extends PAComandoComposto
{
    private final LinkedList<PAExpVirgula> _aExpVirgula_ = new LinkedList<PAExpVirgula>();
    private PExpr _expr_;

    public AShowAComandoComposto()
    {
        // Constructor
    }

    public AShowAComandoComposto(
        @SuppressWarnings("hiding") List<?> _aExpVirgula_,
        @SuppressWarnings("hiding") PExpr _expr_)
    {
        // Constructor
        setAExpVirgula(_aExpVirgula_);

        setExpr(_expr_);

    }

    @Override
    public Object clone()
    {
        return new AShowAComandoComposto(
            cloneList(this._aExpVirgula_),
            cloneNode(this._expr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAShowAComandoComposto(this);
    }

    public LinkedList<PAExpVirgula> getAExpVirgula()
    {
        return this._aExpVirgula_;
    }

    public void setAExpVirgula(List<?> list)
    {
        for(PAExpVirgula e : this._aExpVirgula_)
        {
            e.parent(null);
        }
        this._aExpVirgula_.clear();

        for(Object obj_e : list)
        {
            PAExpVirgula e = (PAExpVirgula) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._aExpVirgula_.add(e);
        }
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._aExpVirgula_)
            + toString(this._expr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aExpVirgula_.remove(child))
        {
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PAExpVirgula> i = this._aExpVirgula_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAExpVirgula) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
