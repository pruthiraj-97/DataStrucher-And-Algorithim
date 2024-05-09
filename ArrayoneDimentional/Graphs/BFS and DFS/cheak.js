async function example() {
    console.log('Before await');
    await new Promise(resolve => setTimeout(resolve, 1000)); // Simulating an asynchronous operation
    console.log('After await');
  }
  example();
  console.log('End of script');