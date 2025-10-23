# SOLID
SOLID Principles in Java – Practical Refactoring Examples
This repository demonstrates the SOLID design principles through real-world Java refactoring exercises. Each principle is illustrated with before-and-after code, clear explanations, and UML diagrams to help developers understand why and how to apply SOLID in practice.

📚 What is SOLID?
SOLID is an acronym for five key object-oriented design principles introduced by Robert C. Martin ("Uncle Bob"). These principles help create software that is:

Maintainable
Testable
Extensible
Resilient to change
The five principles are:

S – Single Responsibility Principle (SRP)
O – Open/Closed Principle (OCP)
L – Liskov Substitution Principle (LSP)
I – Interface Segregation Principle (ISP)
D – Dependency Inversion Principle (DIP)


❌ Before refactoring: Code that violates the principle.  
✅ After refactoring: Clean, compliant implementation.  
📄 Detailed reports explaining the problem and solution.  
🖼️ PlantUML diagrams (in documentation) showing structural changes.  
🚀 How to Use This Repository  
1. Study the Examples  
Browse the code to see how common design flaws are fixed using SOLID.  

2. Run the Code  
All examples are self-contained Java classes. You can run them directly in any IDE (IntelliJ, Eclipse, VS Code).  

💡 Note: Some "before" versions intentionally throw exceptions or crash—this demonstrates the problem.   

3. Generate UML Diagrams
Use any PlantUML editor (e.g., PlantText ) to visualize the class diagrams included in the documentation.

4. Apply to Your Projects
Use these patterns to refactor your own codebases and improve design quality.  

📝 Key Takeaways
SRP
One class = one reason to change
Easier maintenance, fewer bugs  
OCP
Extend, don’t modify
Safe feature additions  
LSP
Subtypes must be substitutable
Reliable polymorphism  
ISP
Many client-specific interfaces > one fat interface
Reduced coupling, no dummy methods  
DIP
Depend on abstractions, not concretions
Decoupled, testable architecture  