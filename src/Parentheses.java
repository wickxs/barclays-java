class Parentheses {

    boolean isValid(String expr) {
        boolean valid = true;

        int parenthesesCount = 0;

        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) == '(') parenthesesCount++;
            if (expr.charAt(i) == ')') parenthesesCount--;

            if (parenthesesCount < 0) {
                valid = false;
                break;
            }
        }

        if (parenthesesCount > 0) valid = false;

        return valid;
    }
}