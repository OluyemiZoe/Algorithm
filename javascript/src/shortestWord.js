class ShortestWord {
    static shortestWord(sentence) {
        const words = sentence.split(" ");
        let shortestWord = words[0];

        for (const word of words) {
            if (word.length < shortestWord.length) {
                shortestWord = word;
            }
        }
        console.log(shortestWord)
        return shortestWord;
    }
}


module.exports = ShortestWord;
