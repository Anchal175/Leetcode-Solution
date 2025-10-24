var cancellable = function(fn, args, t) {
  const timer = setTimeout(() => fn(...args), t);
  const cancelFn = () => clearTimeout(timer);
  return cancelFn;
};
