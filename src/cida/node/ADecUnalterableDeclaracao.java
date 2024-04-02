/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class ADecUnalterableDeclaracao extends PDeclaracao
{
    private TUnalterable _unalterable_;
    private PTipo _tipo_;
    private TId _id_;
    private TAtribuicao _atribuicao_;
    private PExp0 _exp0_;
    private TPonto _ponto_;

    public ADecUnalterableDeclaracao()
    {
        // Constructor
    }

    public ADecUnalterableDeclaracao(
        @SuppressWarnings("hiding") TUnalterable _unalterable_,
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TAtribuicao _atribuicao_,
        @SuppressWarnings("hiding") PExp0 _exp0_,
        @SuppressWarnings("hiding") TPonto _ponto_)
    {
        // Constructor
        setUnalterable(_unalterable_);

        setTipo(_tipo_);

        setId(_id_);

        setAtribuicao(_atribuicao_);

        setExp0(_exp0_);

        setPonto(_ponto_);

    }

    @Override
    public Object clone()
    {
        return new ADecUnalterableDeclaracao(
            cloneNode(this._unalterable_),
            cloneNode(this._tipo_),
            cloneNode(this._id_),
            cloneNode(this._atribuicao_),
            cloneNode(this._exp0_),
            cloneNode(this._ponto_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecUnalterableDeclaracao(this);
    }

    public TUnalterable getUnalterable()
    {
        return this._unalterable_;
    }

    public void setUnalterable(TUnalterable node)
    {
        if(this._unalterable_ != null)
        {
            this._unalterable_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unalterable_ = node;
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
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

    public TAtribuicao getAtribuicao()
    {
        return this._atribuicao_;
    }

    public void setAtribuicao(TAtribuicao node)
    {
        if(this._atribuicao_ != null)
        {
            this._atribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atribuicao_ = node;
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

    public TPonto getPonto()
    {
        return this._ponto_;
    }

    public void setPonto(TPonto node)
    {
        if(this._ponto_ != null)
        {
            this._ponto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ponto_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unalterable_)
            + toString(this._tipo_)
            + toString(this._id_)
            + toString(this._atribuicao_)
            + toString(this._exp0_)
            + toString(this._ponto_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unalterable_ == child)
        {
            this._unalterable_ = null;
            return;
        }

        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._atribuicao_ == child)
        {
            this._atribuicao_ = null;
            return;
        }

        if(this._exp0_ == child)
        {
            this._exp0_ = null;
            return;
        }

        if(this._ponto_ == child)
        {
            this._ponto_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unalterable_ == oldChild)
        {
            setUnalterable((TUnalterable) newChild);
            return;
        }

        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._atribuicao_ == oldChild)
        {
            setAtribuicao((TAtribuicao) newChild);
            return;
        }

        if(this._exp0_ == oldChild)
        {
            setExp0((PExp0) newChild);
            return;
        }

        if(this._ponto_ == oldChild)
        {
            setPonto((TPonto) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
