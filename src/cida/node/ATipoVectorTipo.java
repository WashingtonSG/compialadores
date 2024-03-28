/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import java.util.*;
import cida.analysis.*;

@SuppressWarnings("nls")
public final class ATipoVectorTipo extends PTipo
{
    private PTipoBase _tipoBase_;
    private TVector _vector_;
    private TColcheteEsq _colcheteEsq_;
    private PExp0 _exp0_;
    private TColcheteDir _colcheteDir_;
    private final LinkedList<PColcheteVector> _colcheteVector_ = new LinkedList<PColcheteVector>();

    public ATipoVectorTipo()
    {
        // Constructor
    }

    public ATipoVectorTipo(
        @SuppressWarnings("hiding") PTipoBase _tipoBase_,
        @SuppressWarnings("hiding") TVector _vector_,
        @SuppressWarnings("hiding") TColcheteEsq _colcheteEsq_,
        @SuppressWarnings("hiding") PExp0 _exp0_,
        @SuppressWarnings("hiding") TColcheteDir _colcheteDir_,
        @SuppressWarnings("hiding") List<?> _colcheteVector_)
    {
        // Constructor
        setTipoBase(_tipoBase_);

        setVector(_vector_);

        setColcheteEsq(_colcheteEsq_);

        setExp0(_exp0_);

        setColcheteDir(_colcheteDir_);

        setColcheteVector(_colcheteVector_);

    }

    @Override
    public Object clone()
    {
        return new ATipoVectorTipo(
            cloneNode(this._tipoBase_),
            cloneNode(this._vector_),
            cloneNode(this._colcheteEsq_),
            cloneNode(this._exp0_),
            cloneNode(this._colcheteDir_),
            cloneList(this._colcheteVector_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoVectorTipo(this);
    }

    public PTipoBase getTipoBase()
    {
        return this._tipoBase_;
    }

    public void setTipoBase(PTipoBase node)
    {
        if(this._tipoBase_ != null)
        {
            this._tipoBase_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoBase_ = node;
    }

    public TVector getVector()
    {
        return this._vector_;
    }

    public void setVector(TVector node)
    {
        if(this._vector_ != null)
        {
            this._vector_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._vector_ = node;
    }

    public TColcheteEsq getColcheteEsq()
    {
        return this._colcheteEsq_;
    }

    public void setColcheteEsq(TColcheteEsq node)
    {
        if(this._colcheteEsq_ != null)
        {
            this._colcheteEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colcheteEsq_ = node;
    }

    public PExp0 getExp0()
    {
        return this._exp0_;
    }

    public void setExp0(PExp0 node)
    {
        if(this._exp0_ != null)
        {
            this._exp0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp0_ = node;
    }

    public TColcheteDir getColcheteDir()
    {
        return this._colcheteDir_;
    }

    public void setColcheteDir(TColcheteDir node)
    {
        if(this._colcheteDir_ != null)
        {
            this._colcheteDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colcheteDir_ = node;
    }

    public LinkedList<PColcheteVector> getColcheteVector()
    {
        return this._colcheteVector_;
    }

    public void setColcheteVector(List<?> list)
    {
        for(PColcheteVector e : this._colcheteVector_)
        {
            e.parent(null);
        }
        this._colcheteVector_.clear();

        for(Object obj_e : list)
        {
            PColcheteVector e = (PColcheteVector) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._colcheteVector_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoBase_)
            + toString(this._vector_)
            + toString(this._colcheteEsq_)
            + toString(this._exp0_)
            + toString(this._colcheteDir_)
            + toString(this._colcheteVector_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoBase_ == child)
        {
            this._tipoBase_ = null;
            return;
        }

        if(this._vector_ == child)
        {
            this._vector_ = null;
            return;
        }

        if(this._colcheteEsq_ == child)
        {
            this._colcheteEsq_ = null;
            return;
        }

        if(this._exp0_ == child)
        {
            this._exp0_ = null;
            return;
        }

        if(this._colcheteDir_ == child)
        {
            this._colcheteDir_ = null;
            return;
        }

        if(this._colcheteVector_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoBase_ == oldChild)
        {
            setTipoBase((PTipoBase) newChild);
            return;
        }

        if(this._vector_ == oldChild)
        {
            setVector((TVector) newChild);
            return;
        }

        if(this._colcheteEsq_ == oldChild)
        {
            setColcheteEsq((TColcheteEsq) newChild);
            return;
        }

        if(this._exp0_ == oldChild)
        {
            setExp0((PExp0) newChild);
            return;
        }

        if(this._colcheteDir_ == oldChild)
        {
            setColcheteDir((TColcheteDir) newChild);
            return;
        }

        for(ListIterator<PColcheteVector> i = this._colcheteVector_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PColcheteVector) newChild);
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
