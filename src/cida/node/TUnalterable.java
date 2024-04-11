/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class TUnalterable extends Token
{
    public TUnalterable()
    {
        super.setText("unalterable");
    }

    public TUnalterable(int line, int pos)
    {
        super.setText("unalterable");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TUnalterable(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTUnalterable(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TUnalterable text.");
    }
}