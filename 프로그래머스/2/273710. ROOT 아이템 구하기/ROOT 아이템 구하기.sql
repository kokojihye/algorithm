SELECT ITEM_TREE.ITEM_ID AS ITEM_ID, II.ITEM_NAME AS ITEM_NAME
FROM (
    SELECT IT.ITEM_ID
    FROM ITEM_TREE IT
    WHERE IT.PARENT_ITEM_ID IS NULL
) AS ITEM_TREE 
INNER JOIN ITEM_INFO II ON II.ITEM_ID = ITEM_TREE.ITEM_ID