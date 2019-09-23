#源码的一个下载工作
import input_data
mnist = input_data.read_data_sets("MNIST_data/", one_hot=True)
import tensorflow as tf #导入tensoflow
#我们通过操作符号变量来描述这些可交互的操作单元，可以用下面的方式创建一个
x = tf.placeholder("float", [None, 784])
#用于描述交互性操作的图中。它们可以用于计算输入值，也可以在计算中被修改。对于各种机器学习应用，一般都会有模型参数，可以用Variable表示
W = tf.Variable(tf.zeros([784,10]))
b = tf.Variable(tf.zeros([10]))
#模型的实现
y = tf.nn.softmax(tf.matmul(x,W) + b)
#为了计算交叉熵，我们首先需要添加一个新的占位符用于输入正确值
y_ = tf.placeholder("float", [None,10])
#计算交叉熵
cross_entropy = -tf.reduce_sum(y_*tf.log(y))

train_step = tf.train.GradientDescentOptimizer(0.01).minimize(cross_entropy)

#在运行计算之前，我们需要添加一个操作来初始化我们创建的变量：
init = tf.initialize_all_variables() #初始化
#在session里面启动模型，并初始化变量
sess = tf.Session()
sess.run(init)
#训练模型
for i in range(1000):
  batch_xs, batch_ys = mnist.train.next_batch(100)
  sess.run(train_step, feed_dict={x: batch_xs, y_: batch_ys})

#模型的评估
correct_prediction = tf.equal(tf.argmax(y,1), tf.argmax(y_,1))
accuracy = tf.reduce_mean(tf.cast(correct_prediction, "float"))
print(sess.run(accuracy, feed_dict={x: mnist.test.images, y_: mnist.test.labels}))
