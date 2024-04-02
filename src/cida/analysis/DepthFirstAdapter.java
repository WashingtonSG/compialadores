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
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getAtribuicao() != null)
        {
            node.getAtribuicao().apply(this);
        }
        if(node.getExp0() != null)
        {
            node.getExp0().apply(this);
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
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getVector() != null)
        {
            node.getVector().apply(this);
        }
        if(node.getColcheteEsq() != null)
        {
            node.getColcheteEsq().apply(this);
        }
        if(node.getExp0() != null)
        {
            node.getExp0().apply(this);
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
        if(node.getExp0() != null)
        {
            node.getExp0().apply(this);
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
        if(node.getExp0() != null)
        {
            node.getExp0().apply(this);
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
        if(node.getExp0() != null)
        {
            node.getExp0().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        outAExpVirgulaExpVirgula(node);
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
        if(node.getExp0() != null)
        {
            node.getExp0().apply(this);
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
        if(node.getExp0() != null)
        {
            node.getExp0().apply(this);
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
        if(node.getExp0() != null)
        {
            node.getExp0().apply(this);
        }
        if(node.getParDir() != null)
        {
            node.getParDir().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        if(node.getComando1() != null)
        {
            node.getComando1().apply(this);
        }
        if(node.getOtherwise() != null)
        {
            node.getOtherwise().apply(this);
        }
        if(node.getComando2() != null)
        {
            node.getComando2().apply(this);
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
        if(node.getAs1() != null)
        {
            node.getAs1().apply(this);
        }
        if(node.getLong() != null)
        {
            node.getLong().apply(this);
        }
        if(node.getAs2() != null)
        {
            node.getAs2().apply(this);
        }
        if(node.getParEsq() != null)
        {
            node.getParEsq().apply(this);
        }
        if(node.getExp0() != null)
        {
            node.getExp0().apply(this);
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
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        if(node.getTo() != null)
        {
            node.getTo().apply(this);
        }
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
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

    public void inAExp1Exp0(AExp1Exp0 node)
    {
        defaultIn(node);
    }

    public void outAExp1Exp0(AExp1Exp0 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp1Exp0(AExp1Exp0 node)
    {
        inAExp1Exp0(node);
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAExp1Exp0(node);
    }

    public void inAXorExp0(AXorExp0 node)
    {
        defaultIn(node);
    }

    public void outAXorExp0(AXorExp0 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExp0(AXorExp0 node)
    {
        inAXorExp0(node);
        if(node.getExp0() != null)
        {
            node.getExp0().apply(this);
        }
        if(node.getXor() != null)
        {
            node.getXor().apply(this);
        }
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        outAXorExp0(node);
    }

    public void inAExp2Exp1(AExp2Exp1 node)
    {
        defaultIn(node);
    }

    public void outAExp2Exp1(AExp2Exp1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp2Exp1(AExp2Exp1 node)
    {
        inAExp2Exp1(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        outAExp2Exp1(node);
    }

    public void inAOrExp1(AOrExp1 node)
    {
        defaultIn(node);
    }

    public void outAOrExp1(AOrExp1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrExp1(AOrExp1 node)
    {
        inAOrExp1(node);
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        if(node.getOr() != null)
        {
            node.getOr().apply(this);
        }
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        outAOrExp1(node);
    }

    public void inAAndExp1(AAndExp1 node)
    {
        defaultIn(node);
    }

    public void outAAndExp1(AAndExp1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndExp1(AAndExp1 node)
    {
        inAAndExp1(node);
        if(node.getExp1() != null)
        {
            node.getExp1().apply(this);
        }
        if(node.getAnd() != null)
        {
            node.getAnd().apply(this);
        }
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        outAAndExp1(node);
    }

    public void inAExp2Exp2(AExp2Exp2 node)
    {
        defaultIn(node);
    }

    public void outAExp2Exp2(AExp2Exp2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp2Exp2(AExp2Exp2 node)
    {
        inAExp2Exp2(node);
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        outAExp2Exp2(node);
    }

    public void inADiferenteExp2(ADiferenteExp2 node)
    {
        defaultIn(node);
    }

    public void outADiferenteExp2(ADiferenteExp2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferenteExp2(ADiferenteExp2 node)
    {
        inADiferenteExp2(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getDiferente() != null)
        {
            node.getDiferente().apply(this);
        }
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        outADiferenteExp2(node);
    }

    public void inAComparacaoExp2(AComparacaoExp2 node)
    {
        defaultIn(node);
    }

    public void outAComparacaoExp2(AComparacaoExp2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComparacaoExp2(AComparacaoExp2 node)
    {
        inAComparacaoExp2(node);
        if(node.getExp2() != null)
        {
            node.getExp2().apply(this);
        }
        if(node.getComparacao() != null)
        {
            node.getComparacao().apply(this);
        }
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        outAComparacaoExp2(node);
    }

    public void inAExp3Exp3(AExp3Exp3 node)
    {
        defaultIn(node);
    }

    public void outAExp3Exp3(AExp3Exp3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp3Exp3(AExp3Exp3 node)
    {
        inAExp3Exp3(node);
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        outAExp3Exp3(node);
    }

    public void inAMaiorIgualExp3(AMaiorIgualExp3 node)
    {
        defaultIn(node);
    }

    public void outAMaiorIgualExp3(AMaiorIgualExp3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorIgualExp3(AMaiorIgualExp3 node)
    {
        inAMaiorIgualExp3(node);
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        if(node.getMaiorIgual() != null)
        {
            node.getMaiorIgual().apply(this);
        }
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        outAMaiorIgualExp3(node);
    }

    public void inAMenorIgualExp3(AMenorIgualExp3 node)
    {
        defaultIn(node);
    }

    public void outAMenorIgualExp3(AMenorIgualExp3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorIgualExp3(AMenorIgualExp3 node)
    {
        inAMenorIgualExp3(node);
        if(node.getExp3() != null)
        {
            node.getExp3().apply(this);
        }
        if(node.getMenorIgual() != null)
        {
            node.getMenorIgual().apply(this);
        }
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        outAMenorIgualExp3(node);
    }

    public void inAExp5Exp4(AExp5Exp4 node)
    {
        defaultIn(node);
    }

    public void outAExp5Exp4(AExp5Exp4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp5Exp4(AExp5Exp4 node)
    {
        inAExp5Exp4(node);
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
        }
        outAExp5Exp4(node);
    }

    public void inAMaiorExp4(AMaiorExp4 node)
    {
        defaultIn(node);
    }

    public void outAMaiorExp4(AMaiorExp4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorExp4(AMaiorExp4 node)
    {
        inAMaiorExp4(node);
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        if(node.getMaior() != null)
        {
            node.getMaior().apply(this);
        }
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
        }
        outAMaiorExp4(node);
    }

    public void inAMenorExp4(AMenorExp4 node)
    {
        defaultIn(node);
    }

    public void outAMenorExp4(AMenorExp4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorExp4(AMenorExp4 node)
    {
        inAMenorExp4(node);
        if(node.getExp4() != null)
        {
            node.getExp4().apply(this);
        }
        if(node.getMenor() != null)
        {
            node.getMenor().apply(this);
        }
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
        }
        outAMenorExp4(node);
    }

    public void inAExp6Exp5(AExp6Exp5 node)
    {
        defaultIn(node);
    }

    public void outAExp6Exp5(AExp6Exp5 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp6Exp5(AExp6Exp5 node)
    {
        inAExp6Exp5(node);
        if(node.getExp6() != null)
        {
            node.getExp6().apply(this);
        }
        outAExp6Exp5(node);
    }

    public void inASubExp5(ASubExp5 node)
    {
        defaultIn(node);
    }

    public void outASubExp5(ASubExp5 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubExp5(ASubExp5 node)
    {
        inASubExp5(node);
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
        }
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        if(node.getExp6() != null)
        {
            node.getExp6().apply(this);
        }
        outASubExp5(node);
    }

    public void inASomaExp5(ASomaExp5 node)
    {
        defaultIn(node);
    }

    public void outASomaExp5(ASomaExp5 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomaExp5(ASomaExp5 node)
    {
        inASomaExp5(node);
        if(node.getExp5() != null)
        {
            node.getExp5().apply(this);
        }
        if(node.getSoma() != null)
        {
            node.getSoma().apply(this);
        }
        if(node.getExp6() != null)
        {
            node.getExp6().apply(this);
        }
        outASomaExp5(node);
    }

    public void inAExp7Exp6(AExp7Exp6 node)
    {
        defaultIn(node);
    }

    public void outAExp7Exp6(AExp7Exp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp7Exp6(AExp7Exp6 node)
    {
        inAExp7Exp6(node);
        if(node.getExp7() != null)
        {
            node.getExp7().apply(this);
        }
        outAExp7Exp6(node);
    }

    public void inAModExp6(AModExp6 node)
    {
        defaultIn(node);
    }

    public void outAModExp6(AModExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModExp6(AModExp6 node)
    {
        inAModExp6(node);
        if(node.getExp6() != null)
        {
            node.getExp6().apply(this);
        }
        if(node.getMod() != null)
        {
            node.getMod().apply(this);
        }
        if(node.getExp7() != null)
        {
            node.getExp7().apply(this);
        }
        outAModExp6(node);
    }

    public void inADivExp6(ADivExp6 node)
    {
        defaultIn(node);
    }

    public void outADivExp6(ADivExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExp6(ADivExp6 node)
    {
        inADivExp6(node);
        if(node.getExp6() != null)
        {
            node.getExp6().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getExp7() != null)
        {
            node.getExp7().apply(this);
        }
        outADivExp6(node);
    }

    public void inAMultExp6(AMultExp6 node)
    {
        defaultIn(node);
    }

    public void outAMultExp6(AMultExp6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExp6(AMultExp6 node)
    {
        inAMultExp6(node);
        if(node.getExp6() != null)
        {
            node.getExp6().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getExp7() != null)
        {
            node.getExp7().apply(this);
        }
        outAMultExp6(node);
    }

    public void inAExp8Exp7(AExp8Exp7 node)
    {
        defaultIn(node);
    }

    public void outAExp8Exp7(AExp8Exp7 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp8Exp7(AExp8Exp7 node)
    {
        inAExp8Exp7(node);
        if(node.getExp8() != null)
        {
            node.getExp8().apply(this);
        }
        outAExp8Exp7(node);
    }

    public void inANotExp7(ANotExp7 node)
    {
        defaultIn(node);
    }

    public void outANotExp7(ANotExp7 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotExp7(ANotExp7 node)
    {
        inANotExp7(node);
        if(node.getNot() != null)
        {
            node.getNot().apply(this);
        }
        if(node.getExp7() != null)
        {
            node.getExp7().apply(this);
        }
        outANotExp7(node);
    }

    public void inAMenosExp7(AMenosExp7 node)
    {
        defaultIn(node);
    }

    public void outAMenosExp7(AMenosExp7 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosExp7(AMenosExp7 node)
    {
        inAMenosExp7(node);
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        if(node.getExp7() != null)
        {
            node.getExp7().apply(this);
        }
        outAMenosExp7(node);
    }

    public void inASymbolExp8(ASymbolExp8 node)
    {
        defaultIn(node);
    }

    public void outASymbolExp8(ASymbolExp8 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASymbolExp8(ASymbolExp8 node)
    {
        inASymbolExp8(node);
        if(node.getSymbol() != null)
        {
            node.getSymbol().apply(this);
        }
        outASymbolExp8(node);
    }

    public void inANumberExp8(ANumberExp8 node)
    {
        defaultIn(node);
    }

    public void outANumberExp8(ANumberExp8 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberExp8(ANumberExp8 node)
    {
        inANumberExp8(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberExp8(node);
    }

    public void inAAnswerExp8(AAnswerExp8 node)
    {
        defaultIn(node);
    }

    public void outAAnswerExp8(AAnswerExp8 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAnswerExp8(AAnswerExp8 node)
    {
        inAAnswerExp8(node);
        if(node.getAnswer() != null)
        {
            node.getAnswer().apply(this);
        }
        outAAnswerExp8(node);
    }

    public void inAVetorSymbolExp8(AVetorSymbolExp8 node)
    {
        defaultIn(node);
    }

    public void outAVetorSymbolExp8(AVetorSymbolExp8 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorSymbolExp8(AVetorSymbolExp8 node)
    {
        inAVetorSymbolExp8(node);
        if(node.getVetorSymbol() != null)
        {
            node.getVetorSymbol().apply(this);
        }
        outAVetorSymbolExp8(node);
    }

    public void inALocalExp8(ALocalExp8 node)
    {
        defaultIn(node);
    }

    public void outALocalExp8(ALocalExp8 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALocalExp8(ALocalExp8 node)
    {
        inALocalExp8(node);
        if(node.getLocal() != null)
        {
            node.getLocal().apply(this);
        }
        outALocalExp8(node);
    }

    public void inAParenExp8(AParenExp8 node)
    {
        defaultIn(node);
    }

    public void outAParenExp8(AParenExp8 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParenExp8(AParenExp8 node)
    {
        inAParenExp8(node);
        if(node.getParEsq() != null)
        {
            node.getParEsq().apply(this);
        }
        if(node.getExp8() != null)
        {
            node.getExp8().apply(this);
        }
        if(node.getParDir() != null)
        {
            node.getParDir().apply(this);
        }
        outAParenExp8(node);
    }
}
