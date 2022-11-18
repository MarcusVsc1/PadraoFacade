package interfaces;

import exceptions.BrokenRuleException;

public interface Rule {
    void runRule(String password) throws BrokenRuleException;
}
