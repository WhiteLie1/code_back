import input_data
#自动下载和安装整个数据集
mnist = input_data.read_data_sets("MNIST_data/", one_hot=True)