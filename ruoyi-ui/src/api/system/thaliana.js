import request from '@/utils/request'

// 查询第一个列表
export function listThaliana(query) {
  return request({
    url: '/system/thaliana/list',
    method: 'get',
    params: query
  })
}

// 查询第一个详细
export function getThaliana(pathway) {
  return request({
    url: '/system/thaliana/' + pathway,
    method: 'get'
  })
}

// 新增第一个
export function addThaliana(data) {
  return request({
    url: '/system/thaliana',
    method: 'post',
    data: data
  })
}

// 修改第一个
export function updateThaliana(data) {
  return request({
    url: '/system/thaliana',
    method: 'put',
    data: data
  })
}

// 删除第一个
export function delThaliana(pathway) {
  return request({
    url: '/system/thaliana/' + pathway,
    method: 'delete'
  })
}
