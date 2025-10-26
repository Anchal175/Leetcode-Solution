const cancellable = (fn, args, t) => {
  fn(...args);
  const id = setInterval(() => fn(...args), t);
  return () => clearInterval(id);
};