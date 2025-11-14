This project is for my own entertainment / practice
Attempting to create a simple Neural Network from scratch using Java, with minimal extrinsic features [ ie : imports ] 


For running (compilation) of this, on LINUX systems run 'sudo apt install default-jdk'

Then run the following commands

javac Main.java  [ while cd'd in the main directory of MNISTImage/main ]
java Main.class



To download the MNIST Dataset used :

1. Install Kaggle CLI : pip install kaggle
2. Place your kaggle.json in ~/.kaggle/
3. Run the following :  'kaggle datasets download hojjatk/mnist-dataset -p data/ --unzip'


## Setup

1. Download and unzip the [JavaFX SDK](https://gluonhq.com/products/javafx/)
2. Place MNIST files in `data/` folder
3. Make the shell script executable:
   ```bash
   chmod +x run_mnist.sh

---

### 6. **Running the Viewer**
```markdown
## Run the Viewer

To compile and launch the JavaFX digit viewer:

```bash
./run_mnist.sh

---

### 7. **Troubleshooting**
```markdown
## Troubleshooting

- If you see MESA/ZINK errors, they are harmless in WSLg.
- If GUI doesn’t appear, ensure WSLg is enabled or an X server is running.
- If JavaFX classes aren’t found, make sure you’re compiling with `--module-path` and `--add-modules`.


## License

MIT License or specify your own.

## Credits

MNIST dataset from [Yann LeCun's website](http://yann.lecun.com/exdb/mnist/)
JavaFX from [GluonHQ](https://gluonhq.com/products/javafx/)
