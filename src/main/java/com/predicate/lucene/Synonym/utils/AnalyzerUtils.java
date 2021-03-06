package com.predicate.lucene.Synonym.utils;

import junit.framework.Assert;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
import org.apache.lucene.analysis.tokenattributes.PositionIncrementAttribute;
import org.apache.lucene.analysis.tokenattributes.TypeAttribute;

import java.io.IOException;

/**
 * @Author:付风松
 * @Description:
 * @Date:Created in  21:04 2018/5/20
 * @ModefiedBy:
 */
public class AnalyzerUtils {

    public static void displayTokens(Analyzer analyzer, String text) throws IOException {
        TokenStream tokenStream = analyzer.tokenStream("text", text);
        displayTokens(tokenStream);
    }

    public static void displayTokens(TokenStream tokenStream) throws IOException {
        OffsetAttribute offsetAttribute = tokenStream.addAttribute(OffsetAttribute.class);
        PositionIncrementAttribute positionIncrementAttribute = tokenStream.addAttribute(PositionIncrementAttribute.class);
        CharTermAttribute charTermAttribute = tokenStream.addAttribute(CharTermAttribute.class);
        TypeAttribute typeAttribute = tokenStream.addAttribute(TypeAttribute.class);
        tokenStream.reset();
        int position = 0;
        while (tokenStream.incrementToken()) {
            int increment = positionIncrementAttribute.getPositionIncrement();
            if (increment > 0) {
                position = position + increment;
                System.out.print(position + ":");
            }
            int startOffset = offsetAttribute.startOffset();
            int endOffset = offsetAttribute.endOffset();
            String term = charTermAttribute.toString();
            System.out.println("[" + term + "]" + ":(" + startOffset + "-->" + endOffset + "):" + typeAttribute.type());
        }

    }

    /**
     * 断言分词结果
     * @param analyzer
     * @param text        源字符串
     * @param expecteds   期望分词后结果
     * @throws IOException
     */
    public static void assertAnalyzerTo(Analyzer analyzer,String text,String[] expecteds) throws IOException {
        TokenStream tokenStream = analyzer.tokenStream("text", text);
        CharTermAttribute charTermAttribute = tokenStream.addAttribute(CharTermAttribute.class);
        for(String expected : expecteds) {
            Assert.assertTrue(tokenStream.incrementToken());
            Assert.assertEquals(expected, charTermAttribute.toString());
        }
        Assert.assertFalse(tokenStream.incrementToken());
        tokenStream.close();
    }
}
