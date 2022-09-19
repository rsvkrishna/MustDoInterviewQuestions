package EOPI;

public class Testing {
    public static void main(String[] args) {
        String a ="An error occurred: TemplateTaskServiceAM.processTaskResponse: Attempted to invoke method \"equalsIgnoreCase\" in class \"java.lang.String\" on a null object reference.\n" +
                "at line 6 in /Ruleset(StartAfterCond_RuleSet_18)/Rule(Rule1)/Pattern(v0_DOOFLine)/Test[1]. Contact your help desk. (DOO-2685513) An application error has occurred. Your help desk can use the\n" +
                "                following information to obtain a more detailed description of\n" +
                "                this incident: Incident ID: 35, Server Domain: fusion_domain,\n" +
                "                Server Instance: FAServer_1, Application Name: ORA_FSCM_SERVICESAPP.";

        //System.out.println(a);

        /*a = a.replaceAll("\\n\\t\\s{3,}", " ");
        System.out.println(a);*/
        a = a.replaceAll("\\s{3,}", " ").replace("\n"," ");
        System.out.println(a);
    }
}
