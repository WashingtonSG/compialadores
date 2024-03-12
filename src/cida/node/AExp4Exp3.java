/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AExp4Exp3 extends PExp3
{
    private PExp4 _exp4_;

    public AExp4Exp3()
    {
        // Constructor
    }

    public AExp4Exp3(
        @SuppressWarnings("hiding") PExp4 _exp4_)
    {
        // Constructor
        setExp4(_exp4_);

    }

    @Override
    public Object clone()
    {
        return new AExp4Exp3(
            cloneNode(this._exp4_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExp4Exp3(this);
    }

    public PExp4 getExp4()
    {
        return this._exp4_;
    }

    public void setExp4(PExp4 node)
    {
        if(this._exp4_ != null)
        {
            this._exp4_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp4_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp4_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp4_ == child)
        {
            this._exp4_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp4_ == oldChild)
        {
            setExp4((PExp4) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
