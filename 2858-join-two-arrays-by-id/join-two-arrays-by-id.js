/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    let map = {};

    // Add all items from arr1
    for (let item of arr1) {
        map[item.id] = item;
    }

    // Merge items from arr2 (overwrite if same id)
    for (let item of arr2) {
        if (map[item.id]) {
            map[item.id] = { ...map[item.id], ...item };
        } else {
            map[item.id] = item;
        }
    }

    // Convert back to array & sort by id
    return Object.values(map).sort((a, b) => a.id - b.id);
};
