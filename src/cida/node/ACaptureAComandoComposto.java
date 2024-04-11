/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import java.util.*;
import cida.analysis.*;

@SuppressWarnings("nls")
public final class ACaptureAComandoComposto extends PAComandoComposto
{
    private final LinkedList<PALocalVirgula> _aLocalVirgula_ = new LinkedList<PALocalVirgula>();
    private PALocal _aLocal_;

    public ACaptureAComandoComposto()
    {
        // Constructor
    }

    public ACaptureAComandoComposto(
        @SuppressWarnings("hiding") List<?> _aLocalVirgula_,
        @SuppressWarnings("hiding") PALocal _aLocal_)
    {
        // Constructor
        setALocalVirgula(_aLocalVirgula_);

        setALocal(_aLocal_);

    }

    @Override
    public Object clone()
    {
        return new ACaptureAComandoComposto(
            cloneList(this._aLocalVirgula_),
            cloneNode(this._aLocal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACaptureAComandoComposto(this);
    }

    public LinkedList<PALocalVirgula> getALocalVirgula()
    {
        return this._aLocalVirgula_;
    }

    public void setALocalVirgula(List<?> list)
    {
        for(PALocalVirgula e : this._aLocalVirgula_)
        {
            e.parent(null);
        }
        this._aLocalVirgula_.clear();

        for(Object obj_e : list)
        {
            PALocalVirgula e = (PALocalVirgula) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._aLocalVirgula_.add(e);
        }
    }

    public PALocal getALocal()
    {
        return this._aLocal_;
    }

    public void setALocal(PALocal node)
    {
        if(this._aLocal_ != null)
        {
            this._aLocal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aLocal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aLocalVirgula_)
            + toString(this._aLocal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aLocalVirgula_.remove(child))
        {
            return;
        }

        if(this._aLocal_ == child)
        {
            this._aLocal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PALocalVirgula> i = this._aLocalVirgula_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PALocalVirgula) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._aLocal_ == oldChild)
        {
            setALocal((PALocal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
