package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.BlockModelGenerators.class)
public class BlockModelGenerators627377584Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_665652323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(665652323L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "condition(Lnet/minecraft/world/level/block/state/properties/EnumProperty;Ljava/lang/Enum;[Ljava/lang/Enum;)Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;", cancellable = true)
    private static void condition_669911654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669911654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "condition()Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;", cancellable = true)
    private static void condition_1715118492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715118492L))
            info.setReturnValue(new net.minecraft.client.data.models.blockstates.ConditionBuilder());
    }

    @Inject(at = @At("HEAD"), method = "condition(Lnet/minecraft/world/level/block/state/properties/BooleanProperty;Z)Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;", cancellable = true)
    private static void condition_1701670292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701670292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "or([Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;)Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;", cancellable = true)
    private static void or_636774777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(636774777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "and([Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;)Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;", cancellable = true)
    private static void and_636774777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(636774777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "family(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void family__1402149886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1402149886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "variants([Lnet/minecraft/client/renderer/block/dispatch/Variant;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private static void variants__521689508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-521689508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "variant(Lnet/minecraft/client/renderer/block/dispatch/Variant;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private static void variant_333746385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333746385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plainModel(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private static void plainModel_1834395680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1834395680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDoor(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createDoor__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDoor(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createDoor__1891756102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1891756102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWall(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createWall__1090226289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090226289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBed(Lnet/minecraft/world/item/DyeColor;)V", cancellable = true)
    private void createBed__97819796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-97819796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBed(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createBed_1256598938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256598938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSign(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createSign__633603846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-633603846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSlab(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createSlab__1090226289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090226289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createChest(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/renderer/MultiblockChestResources;Z)V", cancellable = true)
    private void createChest_72228354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(72228354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createChest(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/resources/Identifier;Z)V", cancellable = true)
    private void createChest_1944499157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1944499157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModelWithBlockTextureAndOverlay(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModelWithBlockTextureAndOverlay__840835026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-840835026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerSimpleTintedItemModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/color/item/ItemTintSource;)V", cancellable = true)
    private void registerSimpleTintedItemModel__2097467959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2097467959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAxisAlignedPillarBlockCustomModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;)V", cancellable = true)
    private void createAxisAlignedPillarBlockCustomModel_520074758(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(520074758L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModelWithBlockTexture(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModelWithBlockTexture__840835026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-840835026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModelWithBlockTexture(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModelWithBlockTexture_775600824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(775600824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMirroredCubeGenerator(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/renderer/block/dispatch/Variant;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createMirroredCubeGenerator__1599778908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599778908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTwoLayerFlatItemModel(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)V", cancellable = true)
    private void registerTwoLayerFlatItemModel__811485787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-811485787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRotatedPillarWithHorizontalVariant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;)V", cancellable = true)
    private void createRotatedPillarWithHorizontalVariant__2086310885(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2086310885L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRotatedPillarWithHorizontalVariant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createRotatedPillarWithHorizontalVariant_1256598938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256598938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNonTemplateModelBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createNonTemplateModelBlock__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNonTemplateModelBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createNonTemplateModelBlock__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createColoredBlockWithStateRotations(Lnet/minecraft/client/data/models/model/TexturedModel$Provider;Ljava/util/List;)V", cancellable = true)
    private void createColoredBlockWithStateRotations_1918105488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1918105488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNorthWestMirroredCubeGenerator(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/renderer/block/dispatch/Variant;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createNorthWestMirroredCubeGenerator__1599778908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599778908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMirroredColumnGenerator(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/renderer/block/dispatch/Variant;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createMirroredColumnGenerator__1599778908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599778908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createParticleOnlyBlockModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private void createParticleOnlyBlockModel_1828589128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1828589128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createColoredBlockWithRandomRotations(Lnet/minecraft/client/data/models/model/TexturedModel$Provider;Ljava/util/List;)V", cancellable = true)
    private void createColoredBlockWithRandomRotations_1918105488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1918105488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRotatedMirroredVariantBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createRotatedMirroredVariantBlock__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createHorizontallyRotatedBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;)V", cancellable = true)
    private void createHorizontallyRotatedBlock_1880960663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1880960663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDoublePlantWithDefaultItem(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createDoublePlantWithDefaultItem__2141409931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2141409931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCrossBlockWithDefaultItem(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createCrossBlockWithDefaultItem__2141409931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2141409931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCrossBlockWithDefaultItem(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;Lnet/minecraft/client/data/models/model/TextureMapping;)V", cancellable = true)
    private void createCrossBlockWithDefaultItem_818836799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(818836799L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createWeightedPressurePlate(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createWeightedPressurePlate__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNonTemplateHorizontalBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createNonTemplateHorizontalBlock__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerSimpleFlatItemModel(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void registerSimpleFlatItemModel__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerSimpleFlatItemModel(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)V", cancellable = true)
    private void registerSimpleFlatItemModel__811485787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-811485787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerSimpleFlatItemModel(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void registerSimpleFlatItemModel__2136706132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2136706132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAxisAlignedPillarBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;)V", cancellable = true)
    private void createAxisAlignedPillarBlock_1880960663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1880960663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAxisAlignedPillarBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createAxisAlignedPillarBlock__1050601745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050601745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSpeleothem(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createSpeleothem__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createButton(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createButton_1256598938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256598938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMossyCarpet(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createMossyCarpet__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createShelf(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createShelf__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addShelfPart(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TextureMapping;Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;Lnet/minecraft/client/data/models/model/ModelTemplate;Ljava/lang/Boolean;Lnet/minecraft/world/level/block/state/properties/SideChainPart;)V", cancellable = true)
    private void addShelfPart_1823000748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1823000748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTurtleEggModel(ILjava/lang/String;Lnet/minecraft/client/data/models/model/TextureMapping;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void createTurtleEggModel_995274965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995274965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTurtleEggModel(II)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void createTurtleEggModel__1296718464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1296718464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createHangingMoss(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createHangingMoss__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMultiface(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createMultiface__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMultiface(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void createMultiface_1447165284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1447165284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectMultifaceProperties(Lnet/minecraft/world/level/block/state/StateHolder;Ljava/util/function/Function;)Ljava/util/Map;", cancellable = true)
    private static void selectMultifaceProperties_738568162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738568162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachHorizontalDirection(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void forEachHorizontalDirection__1110773058(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1110773058L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shelfCondition(Lnet/minecraft/core/Direction;Ljava/lang/Boolean;Lnet/minecraft/world/level/block/state/properties/SideChainPart;)Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;", cancellable = true)
    private static void shelfCondition__668061620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-668061620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShulkerBox(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/item/DyeColor;)V", cancellable = true)
    private void createShulkerBox_1308447012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1308447012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBookSlotModel(Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;Lnet/minecraft/client/renderer/block/dispatch/VariantMutator;Lnet/minecraft/world/level/block/state/properties/BooleanProperty;Lnet/minecraft/client/data/models/model/ModelTemplate;Z)V", cancellable = true)
    private void addBookSlotModel_1369259412(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1369259412L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createGrowingPlant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createGrowingPlant__1981525315(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1981525315L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCopperGolemStatue(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;)V", cancellable = true)
    private void createCopperGolemStatue_1427061454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1427061454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBanner(Lnet/minecraft/world/item/DyeColor;)V", cancellable = true)
    private void createBanner__97819796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-97819796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNetherRoots(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createNetherRoots__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCandleAndCandleCake(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCandleAndCandleCake__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCopperChainItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void createCopperChainItem_717660979(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(717660979L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNormalTorch(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createNormalTorch__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPillarBlockUVLocked(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createPillarBlockUVLocked__1527146043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527146043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCustomFence(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createCustomFence_1768423471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768423471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSuffixedVariant(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;Lnet/minecraft/client/data/models/model/ModelTemplate;Ljava/util/function/Function;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createSuffixedVariant__1322827885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1322827885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerSimpleItemModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void registerSimpleItemModel__222464989(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-222464989L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerSimpleItemModel(Lnet/minecraft/world/item/Item;Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void registerSimpleItemModel_1100158900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1100158900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createStairs(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createStairs__1090226289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090226289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRotatedVariantBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createRotatedVariantBlock__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBrushableBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createBrushableBlock__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBooleanModelDispatch(Lnet/minecraft/world/level/block/state/properties/BooleanProperty;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private static void createBooleanModelDispatch_204892095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(204892095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRotatedVariants(Lnet/minecraft/client/renderer/block/dispatch/Variant;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private static void createRotatedVariants_333746385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333746385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRotatedVariants(Lnet/minecraft/client/renderer/block/dispatch/Variant;Lnet/minecraft/client/renderer/block/dispatch/Variant;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private static void createRotatedVariants__786601838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-786601838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFence(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createFence_1256598938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256598938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createOrientableTrapdoor(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createOrientableTrapdoor__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createOrientableTrapdoor(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createOrientableTrapdoor__1090226289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090226289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createHangingSign(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createHangingSign__1891756102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1891756102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSimpleBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/MultiVariantGenerator;", cancellable = true)
    private static void createSimpleBlock__1529081492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1529081492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCreakingHeart(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCreakingHeart__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "plainVariant(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private static void plainVariant_1768234200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768234200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRotatedPillar()Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private static void createRotatedPillar__1206744115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1206744115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCreakingHeartModel(Lnet/minecraft/client/data/models/model/TexturedModel$Provider;Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createCreakingHeartModel__1353064735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1353064735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTrapdoor(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createTrapdoor__1090226289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090226289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTrapdoor(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createTrapdoor__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModel(Lnet/minecraft/world/item/Item;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModel__89661714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89661714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFenceGate(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Z)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createFenceGate__345983808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-345983808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTintedLeaves(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;I)V", cancellable = true)
    private void createTintedLeaves_861132056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(861132056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "woodProvider(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$WoodProvider;", cancellable = true)
    private void woodProvider__1358571920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1358571920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPressurePlate(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createPressurePlate_1256598938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256598938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCoralFans(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCoralFans__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDoubleBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)V", cancellable = true)
    private void createDoubleBlock__600685509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-600685509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTrivialCube(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createTrivialCube__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMultifaceBlockStates(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createMultifaceBlockStates__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyDoorModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void copyDoorModel__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createStems(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createStems__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCrossBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;Lnet/minecraft/client/data/models/model/TextureMapping;)V", cancellable = true)
    private void createCrossBlock_818836799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(818836799L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCrossBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createCrossBlock__2141409931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2141409931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCrossBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;Lnet/minecraft/world/level/block/state/properties/Property;[I)V", cancellable = true)
    private void createCrossBlock__1049457823(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1049457823L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPlant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createPlant__1981525315(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1981525315L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPlantWithDefaultItem(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createPlantWithDefaultItem__1981525315(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1981525315L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTrivialBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;)V", cancellable = true)
    private void createTrivialBlock_1880960663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1880960663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCoral(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCoral_1519127123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1519127123L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDoublePlant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createDoublePlant__2141409931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2141409931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyTrapdoorModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void copyTrapdoorModel__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createItemWithGrassTint(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createItemWithGrassTint__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFlowerBed(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createFlowerBed__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCommandBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCommandBlock__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAirLikeBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void createAirLikeBlock_1447165284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1447165284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAirLikeBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/resources/model/sprite/Material;)V", cancellable = true)
    private void createAirLikeBlock__1529344615(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1529344615L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createParticleOnlyBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createParticleOnlyBlock__524539037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524539037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createParticleOnlyBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createParticleOnlyBlock__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPassiveRail(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createPassiveRail__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFullAndCarpetBlocks(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createFullAndCarpetBlocks__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSegmentedBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Ljava/util/function/Function;Lnet/minecraft/client/data/models/MultiVariant;Ljava/util/function/Function;Lnet/minecraft/client/data/models/MultiVariant;Ljava/util/function/Function;Lnet/minecraft/client/data/models/MultiVariant;Ljava/util/function/Function;)V", cancellable = true)
    private void createSegmentedBlock__1647984049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1647984049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createGlassBlocks(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createGlassBlocks__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBambooModels(I)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private static void createBambooModels_1247027977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247027977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEmptyOrFullDispatch(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private static void createEmptyOrFullDispatch__1445804304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1445804304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBeeNest(Lnet/minecraft/world/level/block/Block;Ljava/util/function/Function;)V", cancellable = true)
    private void createBeeNest_903792915(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(903792915L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLeafLitter(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createLeafLitter__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAnvil(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createAnvil__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createActiveRail(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createActiveRail__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTintedDoublePlant(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createTintedDoublePlant__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCraftingTableLike(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Ljava/util/function/BiFunction;)V", cancellable = true)
    private void createCraftingTableLike_102081044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(102081044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPumpkinVariant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TextureMapping;)V", cancellable = true)
    private void createPumpkinVariant__432548775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-432548775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAzalea(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createAzalea__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPottedAzalea(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createPottedAzalea__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMushroomBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createMushroomBlock__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFurnace(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;)V", cancellable = true)
    private void createFurnace_1880960663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1880960663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCampfires([Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCampfires__977318608(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-977318608L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyRotation(Lnet/minecraft/core/FrontAndTop;)Lnet/minecraft/client/renderer/block/dispatch/VariantMutator;", cancellable = true)
    private static void applyRotation__1050044292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050044292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDispenserBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createDispenserBlock__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCropBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/state/properties/Property;[I)V", cancellable = true)
    private void createCropBlock__746934533(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-746934533L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLightningRod(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createLightningRod__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCopperLantern(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCopperLantern__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createGrassLikeBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)V", cancellable = true)
    private void createGrassLikeBlock__600685509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-600685509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFloorFireModels(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private void createFloorFireModels_954465936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(954465936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSpeleothemVariant(Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/block/state/properties/SpeleothemThickness;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private void createSpeleothemVariant__109577825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109577825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyCopperBulbModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void copyCopperBulbModel__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSideFireModels(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private void createSideFireModels_954465936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(954465936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNyliumBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createNyliumBlock__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLantern(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createLantern__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCopperChain(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCopperChain__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBarsAndItem(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createBarsAndItem__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBarsAndItem(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createBarsAndItem__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCopperBulb(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCopperBulb__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCopperBulb(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createCopperBulb__633603846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-633603846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAmethystCluster(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createAmethystCluster__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRotatableColumn(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createRotatableColumn__947397733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947397733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTopFireModels(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private void createTopFireModels_954465936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(954465936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPistonVariant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/model/TextureMapping;)V", cancellable = true)
    private void createPistonVariant__114860658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-114860658L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void copyModel__524538541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-524538541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBars(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void createBars__545598773(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-545598773L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createHead(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/SkullBlock$Type;Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void createHead__791690238(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-791690238L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateSimpleSpecialItemModel(Lnet/minecraft/world/level/block/Block;Ljava/util/Optional;Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;)V", cancellable = true)
    private void generateSimpleSpecialItemModel_182114374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(182114374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSlotStateAndRotationVariants(Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;Lnet/minecraft/client/renderer/block/dispatch/VariantMutator;)V", cancellable = true)
    private void addSlotStateAndRotationVariants_1563024776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1563024776L))
            info.cancel();
    }


}
