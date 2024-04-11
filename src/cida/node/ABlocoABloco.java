/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import java.util.*;
import cida.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoABloco extends PABloco
{
    private final LinkedList<PADeclaracao> _aDeclaracao_ = new LinkedList<PADeclaracao>();
    private final LinkedList<PAComando> _aComando_ = new LinkedList<PAComando>();

    public ABlocoABloco()
    {
        // Constructor
    }

    public ABlocoABloco(
        @SuppressWarnings("hiding") List<?> _aDeclaracao_,
        @SuppressWarnings("hiding") List<?> _aComando_)
    {
        // Constructor
        setADeclaracao(_aDeclaracao_);

        setAComando(_aComando_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoABloco(
            cloneList(this._aDeclaracao_),
            cloneList(this._aComando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoABloco(this);
    }

    public LinkedList<PADeclaracao> getADeclaracao()
    {
        return this._aDeclaracao_;
    }

    public void setADeclaracao(List<?> list)
    {
        for(PADeclaracao e : this._aDeclaracao_)
        {
            e.parent(null);
        }
        this._aDeclaracao_.clear();

        for(Object obj_e : list)
        {
            PADeclaracao e = (PADeclaracao) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._aDeclaracao_.add(e);
        }
    }

    public LinkedList<PAComando> getAComando()
    {
        return this._aComando_;
    }

    public void setAComando(List<?> list)
    {
        for(PAComando e : this._aComando_)
        {
            e.parent(null);
        }
        this._aComando_.clear();

        for(Object obj_e : list)
        {
            PAComando e = (PAComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._aComando_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aDeclaracao_)
            + toString(this._aComando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aDeclaracao_.remove(child))
        {
            return;
        }

        if(this._aComando_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PADeclaracao> i = this._aDeclaracao_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PADeclaracao) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PAComando> i = this._aComando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}