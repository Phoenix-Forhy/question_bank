import request from '@/utils/request'

// 查询第二个列表
export function listAestivum(query) {
  return request({
    url: '/system/aestivum/list',
    method: 'get',
    params: query
  })
}

// 查询第二个详细
export function getAestivum(pathway) {
  return request({
    url: '/system/aestivum/' + pathway,
    method: 'get'
  })
}

// 新增第二个
export function addAestivum(data) {
  return request({
    url: '/system/aestivum',
    method: 'post',
    data: data
  })
}

// 修改第二个
export function updateAestivum(data) {
  return request({
    url: '/system/aestivum',
    method: 'put',
    data: data
  })
}

// 删除第二个
export function delAestivum(pathway) {
  return request({
    url: '/system/aestivum/' + pathway,
    method: 'delete'
  })
}
