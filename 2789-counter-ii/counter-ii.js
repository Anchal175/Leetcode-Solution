var createCounter = function(init) {
  let current = init; // store current value separately

  return {
    increment: function() {
      current += 1;
      return current;
    },
    decrement: function() {
      current -= 1;
      return current;
    },
    reset: function() {
      current = init; // reset to original value
      return current;
    }
  };
};
