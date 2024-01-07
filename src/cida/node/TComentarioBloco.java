/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class TComentarioBloco extends Token
{
    public TComentarioBloco(String text)
    {
        setText(text);
    }

    public TComentarioBloco(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComentarioBloco(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComentarioBloco(this);
    }
}
