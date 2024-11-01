const reviewWriteService = (() => {
    // 파일 업로드
    const upload = async (formData) => {
        const response =
        await fetch("/donation/upload", {
            method: "post",
            body: formData
        });
        const attachmentFileName = await response.json();
        return attachmentFileName;
    }

    return {upload: upload};
})();