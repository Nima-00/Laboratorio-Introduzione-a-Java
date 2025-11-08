# ☕ Laboratorio: Introduzione a Java

## Organizzazione Repository

```
├── esercizi
│    ├── ...
│    └── ...
│
├── notebook
│    ├── esercizi
│    │   ├── ...
│    │   └── ...
│    │
│    └── soluzioni
│        ├── ...
│        └── ...
│
├── LICENSE
└── README.md
```

## Setup Iniziale

### Opzione 1: Compilazione Standard

**Da VS Code:**
1. Installa l'estensione **Extension Pack for Java**
2. Usa il pulsante **Run Java** in alto a destra

**Da terminale:**
```bash
javac FileName.java       # Compila
java FileName             # Esegue (senza .class)
```

### Opzione 2: Jupyter Notebook con Java

Per usare Java in Jupyter è necessario installare il kernel IJava:
```bash
# Inizializza conda e riavvia il terminale
conda init
# Chiudi e riapri il terminale (Ctrl+D)

# Crea e attiva l'ambiente
conda create -n my_java
conda activate my_java

# Installa Jupyter
pip uninstall jupyter notebook jupyterlab -y
conda install -c conda-forge jupyter notebook

# Installa il kernel IJava
git clone https://github.com/SpencerPark/IJava.git
cd IJava/
./gradlew installKernel

# Verifica l'installazione
jupyter kernelspec list
# Dovresti vedere: java

# Pulizia (opzionale)
cd ..
rm -rf IJava/
```

**Utilizzo:**
1. Attiva l'ambiente: `conda activate my_java`
2. Apri un file `.ipynb` in VS Code
3. Clicca su **"Seleziona kernel"** in alto a destra
4. Se richiesto, installa le estensioni **Python + Jupyter**
5. Seleziona **"Kernel Jupyter..."** → **Java**
