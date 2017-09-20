public class UselessWords {

    public static final String[] CONJUNCTIONS = {"and", "but", "or", "while", "whereas", "as well as", "both", "either",
            "neither", "not only", "also", "before", "as soon as", "as long as", "as", "after", "whether", "if", "that",
            "whose", "who", "although", "than", "so", "least", "for fear that", "unless", "supposing", "once",
            "in case", "in spite of", "now", "for", "because", "in order that", "while", "when", "till", "until",
            "since", "no sooner when", "hardly when", "what", "which", "where", "how", "why"};

    public static final String[] PREPOSITIONS = {"at", "on", "in", "about", "above", "below", "after", "before",
            "by", "from", "of", "since", "to", "with"};

    public static final String[] PRONOUNS = {"all", "a", "another", "any", "both", "each", "either", "every", "few", "he",
            "her", "hers", "herself", "him", "himself", "his", "i", "it", "its", "itself", "some", "such", "she", "our",
            "oneself", "one another", "none", "myself", "my", "much", "mine", "me", "many", "little", "the same", "their",
            "them", "themselves", "these", "they", "this", "those", "us", "we", "what", "whatever", "which", "whichever",
            "who", "whoever", "whom", "whose", "you", "your", "yourself"};

    public static boolean contains_useless_words(String word) {
        for (int y = 0; y < CONJUNCTIONS.length; y++) {
            if (word.contains(CONJUNCTIONS[y])) {
                return true;
            }
        }
        for (int y = 0; y < PREPOSITIONS.length; y++) {
            if (word.contains(PREPOSITIONS[y])) {
                return true;
            }
        }
        for (int y = 0; y < PRONOUNS.length; y++) {
            if (word.contains(PRONOUNS[y])) {
                return true;
            }
        }
        return false;
    }
}
