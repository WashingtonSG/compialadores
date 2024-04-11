/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class ADecAlterableADeclaracao extends PADeclaracao
{
    private PATipo _aTipo_;
    private TId _id_;

    public ADecAlterableADeclaracao()
    {
        // Constructor
    }

    public ADecAlterableADeclaracao(
        @SuppressWarnings("hiding") PATipo _aTipo_,
        @SuppressWarnings("hiding") TId _id_)
    {
        // Constructor
        setATipo(_aTipo_);

        setId(_id_);

    }

    @Override
    public Object clone()
    {
        return new ADecAlterableADeclaracao(
            cloneNode(this._aTipo_),
            cloneNode(this._id_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecAlterableADeclaracao(this);
    }

    public PATipo getATipo()
    {
        return this._aTipo_;
    }

    public void setATipo(PATipo node)
    {
        if(this._aTipo_ != null)
        {
            this._aTipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aTipo_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aTipo_)
            + toString(this._id_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aTipo_ == child)
        {
            this._aTipo_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aTipo_ == oldChild)
        {
            setATipo((PATipo) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
