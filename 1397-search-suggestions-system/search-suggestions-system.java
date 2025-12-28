class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie trie = new Trie();
        for (String s: products) {
            trie.insert(s);
        }
        // trie.print();
        List<List<String>> res = new ArrayList<>();
        for (int i = 1; i <= searchWord.length(); i++) {
            res.add(trie.top3(searchWord.substring(0, i)));
        }
        return res;
    }

    class Trie{
        Trie[] next;
        String word;

        Trie() {
            next = new Trie[26];
        }

        void insert(String s) {
            Trie cur = this;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (cur.next[c - 'a'] == null) {
                    cur.next[c - 'a'] = new Trie();
                }
                cur = cur.next[c - 'a'];
                if (i == s.length() - 1) cur.word = s;
            }
        }

        List<String> top3(String s) {
            Trie cur = this;
            List<String> res = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (cur.next[c - 'a'] == null) {
                    return res;
                }
                cur = cur.next[c - 'a'];
            }
            dfs(res, cur);
            return res;
        }

        void dfs(List<String> res, Trie node) {            
            if (node.word != null) res.add(node.word);
            if (res.size() == 3) return;
            for(Trie cur: node.next) {
                if (cur != null) {
                    dfs(res, cur);
                    if (res.size() == 3) return;
                }
            }
        }

        void print() {
            for(int i = 0; i < 26; i++) {
                Trie cur = this.next[i];
                if (cur != null) {
                    System.out.println((char)(i + 'a'));
                    if (cur.word != null) System.out.println("word: " + cur.word);
                    cur.print();                    
                }
            }
        }
    }
}