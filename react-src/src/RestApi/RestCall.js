const METHOD = {
    GET: "get",
    POST: "post"
};

export const restGetCall = (url, headers, callback) => {
    let requestObj = {
        method: METHOD.GET,
        headers: headers
    };
    fetch(url, requestObj)
    .then(res => res.json())
    .then(res => callback(res));
}

export const restPostCall = (url, headers, requestBody, callback) => {
    let requestObj = {
        method: METHOD.POST,
        body: requestBody,
        headers: headers
    };
    fetch(url, requestObj)
    .then(res => res.json())
    .then(res => callback(res));
}