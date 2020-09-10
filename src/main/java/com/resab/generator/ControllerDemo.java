package com.resab.generator;

public class ControllerDemo {

    //    for crud

    // 复制这个内容到各个controller
    // 然后  替换 PmsBrandService 名字
    // 区分大小写

    //    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);
    //
    //    @Autowired
    //    private PmsBrandService brandService;
    //
    //    @ApiOperation("获取所有品牌列表")
    //    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    //    @ResponseBody
    //    public CommonResult<List<PmsBrand>> getBrandList() {
    //        return CommonResult.success(brandService.list());
    //    }
    //
    //    @ApiOperation("添加品牌")
    //    @RequestMapping(value = "/create", method = RequestMethod.POST)
    //    @ResponseBody
    //    public CommonResult createBrand(@RequestBody PmsBrand pmsBrand) {
    //        CommonResult commonResult;
    //        boolean result = brandService.save(pmsBrand);
    //        if (result) {
    //            commonResult = CommonResult.success(pmsBrand);
    //            LOGGER.debug("createBrand success:{}", pmsBrand);
    //        } else {
    //            commonResult = CommonResult.failed("操作失败");
    //            LOGGER.debug("createBrand failed:{}", pmsBrand);
    //        }
    //        return commonResult;
    //    }
    //
    //    @ApiOperation("更新指定id品牌信息")
    //    @RequestMapping(value = "/update", method = RequestMethod.POST)
    //    @ResponseBody
    //    public CommonResult updateBrand(@RequestBody PmsBrand pmsBrand) {
    //        CommonResult commonResult;
    //        boolean result = brandService.updateById(pmsBrand);
    //        if (result) {
    //            commonResult = CommonResult.success(pmsBrand);
    //            LOGGER.debug("updateBrand success:{}", pmsBrand);
    //        } else {
    //            commonResult = CommonResult.failed("操作失败");
    //            LOGGER.debug("updateBrand failed:{}", pmsBrand);
    //        }
    //        return commonResult;
    //    }
    //
    //    @ApiOperation("删除指定id的品牌")
    //    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    //    @ResponseBody
    //    public CommonResult deleteBrand(@PathVariable("id") Long id) {
    //        boolean result = brandService.removeById(id);
    //        if (result) {
    //            LOGGER.debug("deleteBrand success :id={}", id);
    //            return CommonResult.success(null);
    //        } else {
    //            LOGGER.debug("deleteBrand failed :id={}", id);
    //            return CommonResult.failed("操作失败");
    //        }
    //    }
    //
    //    @ApiOperation("分页查询品牌列表")
    //    @RequestMapping(value = "/list", method = RequestMethod.GET)
    //    @ResponseBody
    //    public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1")
    //                                                        @ApiParam("页码") Integer pageNum,
    //                                                        @RequestParam(value = "pageSize", defaultValue = "3")
    //                                                        @ApiParam("每页数量") Integer pageSize) {
    //        Page<PmsBrand> page = new Page<>(pageNum, pageSize);
    //        Page<PmsBrand> pageResult = brandService.page(page);
    //        return CommonResult.success(CommonPage.restPage(pageResult));
    //    }
    //
    //    @ApiOperation("获取指定id的品牌详情")
    //    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    //    @ResponseBody
    //    public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) {
    //        return CommonResult.success(brandService.getById(id));
    //    }

}