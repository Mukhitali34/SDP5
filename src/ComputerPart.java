package src;

interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}