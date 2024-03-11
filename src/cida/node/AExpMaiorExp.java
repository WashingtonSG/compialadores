/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AExpMaiorExp extends PExp
{
    private PExp _exp_;
    private TMaior _maior_;
    private PExpTerminal _expTerminal_;

    public AExpMaiorExp()
    {
        // Constructor
    }

    public AExpMaiorExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TMaior _maior_,
        @SuppressWarnings("hiding") PExpTerminal _expTerminal_)
    {
        // Constructor
        setExp(_exp_);

        setMaior(_maior_);

        setExpTerminal(_expTerminal_);

    }

    @Override
    public Object clone()
    {
        return new AExpMaiorExp(
            cloneNode(this._exp_),
            cloneNode(this._maior_),
            cloneNode(this._expTerminal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpMaiorExp(this);
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TMaior getMaior()
    {
        return this._maior_;
    }

    public void setMaior(TMaior node)
    {
        if(this._maior_ != null)
        {
            this._maior_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maior_ = node;
    }

    public PExpTerminal getExpTerminal()
    {
        return this._expTerminal_;
    }

    public void setExpTerminal(PExpTerminal node)
    {
        if(this._expTerminal_ != null)
        {
            this._expTerminal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expTerminal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._maior_)
            + toString(this._expTerminal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._maior_ == child)
        {
            this._maior_ = null;
            return;
        }

        if(this._expTerminal_ == child)
        {
            this._expTerminal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._maior_ == oldChild)
        {
            setMaior((TMaior) newChild);
            return;
        }

        if(this._expTerminal_ == oldChild)
        {
            setExpTerminal((PExpTerminal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}