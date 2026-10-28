const ShortestWord = require('../src/shortestWord'); 

describe('ShortestWord', () => {
    test.each([
        ['I am a Lady', 'I'],
        ['My name is Yemi', 'My'],
        ['Pankys Madik is my guy', 'is']
        
    ])('should find the shortest word in "%s" to be "%s"', (inputSentence, expectedShortest) => {
        
        const result = ShortestWord.shortestWord(inputSentence);
        
        expect(result).toBe(expectedShortest);
    });
});
