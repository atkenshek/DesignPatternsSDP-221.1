package behavioral.visitor;

public interface IVisitor {
    void visit(Zoo zoo);
    void visit(Cinema cinema);
    void visit(Circus circus);
    //void visit(Astana astana);
}
