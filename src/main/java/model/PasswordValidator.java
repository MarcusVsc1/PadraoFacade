package model;

import java.util.List;

import exceptions.BrokenRuleException;
import interfaces.Rule;

public class PasswordValidator {

    List<Rule> rules;

    public PasswordValidator(List<Rule> rules) {
        this.rules = rules;
    }

    public void validate(String senha) throws BrokenRuleException {

        for (Rule rule : rules) {
            rule.runRule(senha);
        }

    }
}