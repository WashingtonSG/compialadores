/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.analysis;

import java.util.*;
import cida.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPPrograma().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAProgramaPrograma(AProgramaPrograma node)
    {
        defaultIn(node);
    }

    public void outAProgramaPrograma(AProgramaPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgramaPrograma(AProgramaPrograma node)
    {
        inAProgramaPrograma(node);
        if(node.getCode() != null)
        {
            node.getCode().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
        }
        outAProgramaPrograma(node);
    }

    public void inABlocoBloco(ABlocoBloco node)
    {
        defaultIn(node);
    }

    public void outABlocoBloco(ABlocoBloco node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlocoBloco(ABlocoBloco node)
    {
        inABlocoBloco(node);
        if(node.getAbreBloco() != null)
        {
            node.getAbreBloco().apply(this);
        }
        {
            List<PDeclaracao> copy = new ArrayList<PDeclaracao>(node.getDeclaracao());
            for(PDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFechaBloco() != null)
        {
            node.getFechaBloco().apply(this);
        }
        outABlocoBloco(node);
    }

    public void inADecAlterableDeclaracao(ADecAlterableDeclaracao node)
    {
        defaultIn(node);
    }

    public void outADecAlterableDeclaracao(ADecAlterableDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecAlterableDeclaracao(ADecAlterableDeclaracao node)
    {
        inADecAlterableDeclaracao(node);
        if(node.getAlterable() != null)
        {
            node.getAlterable().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getPonto() != null)
        {
            node.getPonto().apply(this);
        }
        outADecAlterableDeclaracao(node);
    }

    public void inADecUnalterableDeclaracao(ADecUnalterableDeclaracao node)
    {
        defaultIn(node);
    }

    public void outADecUnalterableDeclaracao(ADecUnalterableDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecUnalterableDeclaracao(ADecUnalterableDeclaracao node)
    {
        inADecUnalterableDeclaracao(node);
        if(node.getUnalterable() != null)
        {
            node.getUnalterable().apply(this);
        }
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getAtribuicao() != null)
        {
            node.getAtribuicao().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getPonto() != null)
        {
            node.getPonto().apply(this);
        }
        outADecUnalterableDeclaracao(node);
    }

    public void inANumberTipoBase(ANumberTipoBase node)
    {
        defaultIn(node);
    }

    public void outANumberTipoBase(ANumberTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberTipoBase(ANumberTipoBase node)
    {
        inANumberTipoBase(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberTipoBase(node);
    }

    public void inAAnswerTipoBase(AAnswerTipoBase node)
    {
        defaultIn(node);
    }

    public void outAAnswerTipoBase(AAnswerTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAnswerTipoBase(AAnswerTipoBase node)
    {
        inAAnswerTipoBase(node);
        if(node.getAnswer() != null)
        {
            node.getAnswer().apply(this);
        }
        outAAnswerTipoBase(node);
    }

    public void inASymbolTipoBase(ASymbolTipoBase node)
    {
        defaultIn(node);
    }

    public void outASymbolTipoBase(ASymbolTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASymbolTipoBase(ASymbolTipoBase node)
    {
        inASymbolTipoBase(node);
        if(node.getSymbol() != null)
        {
            node.getSymbol().apply(this);
        }
        outASymbolTipoBase(node);
    }

    public void inATipoBaseTipo(ATipoBaseTipo node)
    {
        defaultIn(node);
    }

    public void outATipoBaseTipo(ATipoBaseTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoBaseTipo(ATipoBaseTipo node)
    {
        inATipoBaseTipo(node);
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        outATipoBaseTipo(node);
    }

    public void inATipoVectorTipo(ATipoVectorTipo node)
    {
        defaultIn(node);
    }

    public void outATipoVectorTipo(ATipoVectorTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoVectorTipo(ATipoVectorTipo node)
    {
        inATipoVectorTipo(node);
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        if(node.getVector() != null)
        {
            node.getVector().apply(this);
        }
        if(node.getColcheteEsq() != null)
        {
            node.getColcheteEsq().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getColcheteDir() != null)
        {
            node.getColcheteDir().apply(this);
        }
        {
            List<PColcheteVector> copy = new ArrayList<PColcheteVector>(node.getColcheteVector());
            for(PColcheteVector e : copy)
            {
                e.apply(this);
            }
        }
        outATipoVectorTipo(node);
    }

    public void inAExpressaoColcheteVector(AExpressaoColcheteVector node)
    {
        defaultIn(node);
    }

    public void outAExpressaoColcheteVector(AExpressaoColcheteVector node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressaoColcheteVector(AExpressaoColcheteVector node)
    {
        inAExpressaoColcheteVector(node);
        if(node.getColcheteEsq() != null)
        {
            node.getColcheteEsq().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getColcheteDir() != null)
        {
            node.getColcheteDir().apply(this);
        }
        outAExpressaoColcheteVector(node);
    }

    public void inAIdLocal(AIdLocal node)
    {
        defaultIn(node);
    }

    public void outAIdLocal(AIdLocal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdLocal(AIdLocal node)
    {
        inAIdLocal(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdLocal(node);
    }

    public void inADecLocalLocal(ADecLocalLocal node)
    {
        defaultIn(node);
    }

    public void outADecLocalLocal(ADecLocalLocal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecLocalLocal(ADecLocalLocal node)
    {
        inADecLocalLocal(node);
        if(node.getLocal() != null)
        {
            node.getLocal().apply(this);
        }
        if(node.getColcheteEsq() != null)
        {
            node.getColcheteEsq().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getColcheteDir() != null)
        {
            node.getColcheteDir().apply(this);
        }
        outADecLocalLocal(node);
    }

    public void inALocalVirgulaLocalVirgula(ALocalVirgulaLocalVirgula node)
    {
        defaultIn(node);
    }

    public void outALocalVirgulaLocalVirgula(ALocalVirgulaLocalVirgula node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALocalVirgulaLocalVirgula(ALocalVirgulaLocalVirgula node)
    {
        inALocalVirgulaLocalVirgula(node);
        if(node.getLocal() != null)
        {
            node.getLocal().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        outALocalVirgulaLocalVirgula(node);
    }

    public void inAExpVirgulaExpVirgula(AExpVirgulaExpVirgula node)
    {
        defaultIn(node);
    }

    public void outAExpVirgulaExpVirgula(AExpVirgulaExpVirgula node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpVirgulaExpVirgula(AExpVirgulaExpVirgula node)
    {
        inAExpVirgulaExpVirgula(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        outAExpVirgulaExpVirgula(node);
    }

    public void inAAsLongAsLong(AAsLongAsLong node)
    {
        defaultIn(node);
    }

    public void outAAsLongAsLong(AAsLongAsLong node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAsLongAsLong(AAsLongAsLong node)
    {
        inAAsLongAsLong(node);
        if(node.getAs() != null)
        {
            node.getAs().apply(this);
        }
        if(node.getLong() != null)
        {
            node.getLong().apply(this);
        }
        outAAsLongAsLong(node);
    }

    public void inAExpToExpTo(AExpToExpTo node)
    {
        defaultIn(node);
    }

    public void outAExpToExpTo(AExpToExpTo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpToExpTo(AExpToExpTo node)
    {
        inAExpToExpTo(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getTo() != null)
        {
            node.getTo().apply(this);
        }
        outAExpToExpTo(node);
    }

    public void inAComandoLocalComando(AComandoLocalComando node)
    {
        defaultIn(node);
    }

    public void outAComandoLocalComando(AComandoLocalComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoLocalComando(AComandoLocalComando node)
    {
        inAComandoLocalComando(node);
        if(node.getLocal() != null)
        {
            node.getLocal().apply(this);
        }
        if(node.getAtribuicao() != null)
        {
            node.getAtribuicao().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getPonto() != null)
        {
            node.getPonto().apply(this);
        }
        outAComandoLocalComando(node);
    }

    public void inACaptureComando(ACaptureComando node)
    {
        defaultIn(node);
    }

    public void outACaptureComando(ACaptureComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaptureComando(ACaptureComando node)
    {
        inACaptureComando(node);
        if(node.getCapture() != null)
        {
            node.getCapture().apply(this);
        }
        if(node.getParEsq() != null)
        {
            node.getParEsq().apply(this);
        }
        {
            List<PLocalVirgula> copy = new ArrayList<PLocalVirgula>(node.getLocalVirgula());
            for(PLocalVirgula e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getLocal() != null)
        {
            node.getLocal().apply(this);
        }
        if(node.getParDir() != null)
        {
            node.getParDir().apply(this);
        }
        if(node.getPonto() != null)
        {
            node.getPonto().apply(this);
        }
        outACaptureComando(node);
    }

    public void inAShowComando(AShowComando node)
    {
        defaultIn(node);
    }

    public void outAShowComando(AShowComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAShowComando(AShowComando node)
    {
        inAShowComando(node);
        if(node.getShow() != null)
        {
            node.getShow().apply(this);
        }
        if(node.getParEsq() != null)
        {
            node.getParEsq().apply(this);
        }
        {
            List<PExpVirgula> copy = new ArrayList<PExpVirgula>(node.getExpVirgula());
            for(PExpVirgula e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getParDir() != null)
        {
            node.getParDir().apply(this);
        }
        if(node.getPonto() != null)
        {
            node.getPonto().apply(this);
        }
        outAShowComando(node);
    }

    public void inAInCaseThatComando(AInCaseThatComando node)
    {
        defaultIn(node);
    }

    public void outAInCaseThatComando(AInCaseThatComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInCaseThatComando(AInCaseThatComando node)
    {
        inAInCaseThatComando(node);
        if(node.getIn() != null)
        {
            node.getIn().apply(this);
        }
        if(node.getCase() != null)
        {
            node.getCase().apply(this);
        }
        if(node.getThat() != null)
        {
            node.getThat().apply(this);
        }
        if(node.getParEsq() != null)
        {
            node.getParEsq().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getParDir() != null)
        {
            node.getParDir().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getOtherwise() != null)
        {
            node.getOtherwise().apply(this);
        }
        outAInCaseThatComando(node);
    }

    public void inAAsLongAsComando(AAsLongAsComando node)
    {
        defaultIn(node);
    }

    public void outAAsLongAsComando(AAsLongAsComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAsLongAsComando(AAsLongAsComando node)
    {
        inAAsLongAsComando(node);
        if(node.getAsLong() != null)
        {
            node.getAsLong().apply(this);
        }
        if(node.getAs() != null)
        {
            node.getAs().apply(this);
        }
        if(node.getParEsq() != null)
        {
            node.getParEsq().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getParDir() != null)
        {
            node.getParDir().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAAsLongAsComando(node);
    }

    public void inAConsideringComando(AConsideringComando node)
    {
        defaultIn(node);
    }

    public void outAConsideringComando(AConsideringComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConsideringComando(AConsideringComando node)
    {
        inAConsideringComando(node);
        if(node.getConsidering() != null)
        {
            node.getConsidering().apply(this);
        }
        if(node.getLocal() != null)
        {
            node.getLocal().apply(this);
        }
        if(node.getFrom() != null)
        {
            node.getFrom().apply(this);
        }
        if(node.getExpTo() != null)
        {
            node.getExpTo().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getBy() != null)
        {
            node.getBy().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAConsideringComando(node);
    }

    public void inAComandoBlocoComando(AComandoBlocoComando node)
    {
        defaultIn(node);
    }

    public void outAComandoBlocoComando(AComandoBlocoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoBlocoComando(AComandoBlocoComando node)
    {
        inAComandoBlocoComando(node);
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
        }
        outAComandoBlocoComando(node);
    }

    public void inAExpTerminalExp(AExpTerminalExp node)
    {
        defaultIn(node);
    }

    public void outAExpTerminalExp(AExpTerminalExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpTerminalExp(AExpTerminalExp node)
    {
        inAExpTerminalExp(node);
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpTerminalExp(node);
    }

    public void inAExpSomaExp(AExpSomaExp node)
    {
        defaultIn(node);
    }

    public void outAExpSomaExp(AExpSomaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpSomaExp(AExpSomaExp node)
    {
        inAExpSomaExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getSoma() != null)
        {
            node.getSoma().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpSomaExp(node);
    }

    public void inAExpSubtracaoExp(AExpSubtracaoExp node)
    {
        defaultIn(node);
    }

    public void outAExpSubtracaoExp(AExpSubtracaoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpSubtracaoExp(AExpSubtracaoExp node)
    {
        inAExpSubtracaoExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpSubtracaoExp(node);
    }

    public void inAExpMultExp(AExpMultExp node)
    {
        defaultIn(node);
    }

    public void outAExpMultExp(AExpMultExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpMultExp(AExpMultExp node)
    {
        inAExpMultExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpMultExp(node);
    }

    public void inAExpDivExp(AExpDivExp node)
    {
        defaultIn(node);
    }

    public void outAExpDivExp(AExpDivExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpDivExp(AExpDivExp node)
    {
        inAExpDivExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpDivExp(node);
    }

    public void inAExpModExp(AExpModExp node)
    {
        defaultIn(node);
    }

    public void outAExpModExp(AExpModExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpModExp(AExpModExp node)
    {
        inAExpModExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getMod() != null)
        {
            node.getMod().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpModExp(node);
    }

    public void inAExpComparaExp(AExpComparaExp node)
    {
        defaultIn(node);
    }

    public void outAExpComparaExp(AExpComparaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpComparaExp(AExpComparaExp node)
    {
        inAExpComparaExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getComparacao() != null)
        {
            node.getComparacao().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpComparaExp(node);
    }

    public void inAExpDiferenteExp(AExpDiferenteExp node)
    {
        defaultIn(node);
    }

    public void outAExpDiferenteExp(AExpDiferenteExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpDiferenteExp(AExpDiferenteExp node)
    {
        inAExpDiferenteExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getDiferente() != null)
        {
            node.getDiferente().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpDiferenteExp(node);
    }

    public void inAExpMenorIgualExp(AExpMenorIgualExp node)
    {
        defaultIn(node);
    }

    public void outAExpMenorIgualExp(AExpMenorIgualExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpMenorIgualExp(AExpMenorIgualExp node)
    {
        inAExpMenorIgualExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getMenorIgual() != null)
        {
            node.getMenorIgual().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpMenorIgualExp(node);
    }

    public void inAExpMaiorIgualExp(AExpMaiorIgualExp node)
    {
        defaultIn(node);
    }

    public void outAExpMaiorIgualExp(AExpMaiorIgualExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpMaiorIgualExp(AExpMaiorIgualExp node)
    {
        inAExpMaiorIgualExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getMaiorIgual() != null)
        {
            node.getMaiorIgual().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpMaiorIgualExp(node);
    }

    public void inAExpMenorExp(AExpMenorExp node)
    {
        defaultIn(node);
    }

    public void outAExpMenorExp(AExpMenorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpMenorExp(AExpMenorExp node)
    {
        inAExpMenorExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getMenor() != null)
        {
            node.getMenor().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpMenorExp(node);
    }

    public void inAExpMaiorExp(AExpMaiorExp node)
    {
        defaultIn(node);
    }

    public void outAExpMaiorExp(AExpMaiorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpMaiorExp(AExpMaiorExp node)
    {
        inAExpMaiorExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getMaior() != null)
        {
            node.getMaior().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpMaiorExp(node);
    }

    public void inAExpAndExp(AExpAndExp node)
    {
        defaultIn(node);
    }

    public void outAExpAndExp(AExpAndExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpAndExp(AExpAndExp node)
    {
        inAExpAndExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getAnd() != null)
        {
            node.getAnd().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpAndExp(node);
    }

    public void inAExpOrExp(AExpOrExp node)
    {
        defaultIn(node);
    }

    public void outAExpOrExp(AExpOrExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpOrExp(AExpOrExp node)
    {
        inAExpOrExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getOr() != null)
        {
            node.getOr().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpOrExp(node);
    }

    public void inAExpXorExp(AExpXorExp node)
    {
        defaultIn(node);
    }

    public void outAExpXorExp(AExpXorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpXorExp(AExpXorExp node)
    {
        inAExpXorExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getXor() != null)
        {
            node.getXor().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpXorExp(node);
    }

    public void inAExpSymbolExpTerminal(AExpSymbolExpTerminal node)
    {
        defaultIn(node);
    }

    public void outAExpSymbolExpTerminal(AExpSymbolExpTerminal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpSymbolExpTerminal(AExpSymbolExpTerminal node)
    {
        inAExpSymbolExpTerminal(node);
        if(node.getSymbol() != null)
        {
            node.getSymbol().apply(this);
        }
        outAExpSymbolExpTerminal(node);
    }

    public void inAExpNumberExpTerminal(AExpNumberExpTerminal node)
    {
        defaultIn(node);
    }

    public void outAExpNumberExpTerminal(AExpNumberExpTerminal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpNumberExpTerminal(AExpNumberExpTerminal node)
    {
        inAExpNumberExpTerminal(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outAExpNumberExpTerminal(node);
    }

    public void inAExpAnswerExpTerminal(AExpAnswerExpTerminal node)
    {
        defaultIn(node);
    }

    public void outAExpAnswerExpTerminal(AExpAnswerExpTerminal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpAnswerExpTerminal(AExpAnswerExpTerminal node)
    {
        inAExpAnswerExpTerminal(node);
        if(node.getAnswer() != null)
        {
            node.getAnswer().apply(this);
        }
        outAExpAnswerExpTerminal(node);
    }

    public void inAExpStringExpTerminal(AExpStringExpTerminal node)
    {
        defaultIn(node);
    }

    public void outAExpStringExpTerminal(AExpStringExpTerminal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpStringExpTerminal(AExpStringExpTerminal node)
    {
        inAExpStringExpTerminal(node);
        if(node.getVetorSymbol() != null)
        {
            node.getVetorSymbol().apply(this);
        }
        outAExpStringExpTerminal(node);
    }

    public void inAExpLocalExpTerminal(AExpLocalExpTerminal node)
    {
        defaultIn(node);
    }

    public void outAExpLocalExpTerminal(AExpLocalExpTerminal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLocalExpTerminal(AExpLocalExpTerminal node)
    {
        inAExpLocalExpTerminal(node);
        if(node.getLocal() != null)
        {
            node.getLocal().apply(this);
        }
        outAExpLocalExpTerminal(node);
    }

    public void inAExpNotExpTerminal(AExpNotExpTerminal node)
    {
        defaultIn(node);
    }

    public void outAExpNotExpTerminal(AExpNotExpTerminal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpNotExpTerminal(AExpNotExpTerminal node)
    {
        inAExpNotExpTerminal(node);
        if(node.getNot() != null)
        {
            node.getNot().apply(this);
        }
        if(node.getExpTerminal() != null)
        {
            node.getExpTerminal().apply(this);
        }
        outAExpNotExpTerminal(node);
    }

    public void inAExpPareExpTerminal(AExpPareExpTerminal node)
    {
        defaultIn(node);
    }

    public void outAExpPareExpTerminal(AExpPareExpTerminal node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpPareExpTerminal(AExpPareExpTerminal node)
    {
        inAExpPareExpTerminal(node);
        if(node.getParEsq() != null)
        {
            node.getParEsq().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getParDir() != null)
        {
            node.getParDir().apply(this);
        }
        outAExpPareExpTerminal(node);
    }
}
