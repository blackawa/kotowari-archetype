package ${package};

import enkan.system.devel.DevelCommandRegister;
import enkan.system.repl.PseudoRepl;
import enkan.system.repl.ReplBoot;
import enkan.system.repl.pseudo.ReplClient;

import kotowari.scaffold.command.ScaffoldCommandRegister;
import kotowari.system.KotowariCommandRegister;

public class Main {
    public static void main(String[] args) throws Exception {
        PseudoRepl repl = new PseudoRepl(MySystemFactory.class.getName());
        ReplBoot.start(repl,
                new ScaffoldCommandRegister(),
                new KotowariCommandRegister(),
                new DevelCommandRegister());

        new ReplClient().start(repl.getPort().get());
    }
}
