/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class TThat extends Token
{
    public TThat()
    {
        super.setText("that");
    }

    public TThat(int line, int pos)
    {
        super.setText("that");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TThat(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTThat(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TThat text.");
    }
}
