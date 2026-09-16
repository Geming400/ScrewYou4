package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.BlockModelGenerators.class)
public class BlockModelGenerators627377584Mixin {
        @Inject(at = @At("HEAD"), method = "run()V", cancellable = true)
    private void run_1390489784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1390489784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "condition(Lnet/minecraft/world/level/block/state/properties/EnumProperty;Ljava/lang/Enum;[Ljava/lang/Enum;)Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;", cancellable = true)
    private static void condition__407167125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407167125L))
            info.setReturnValue(new net.minecraft.client.data.models.blockstates.ConditionBuilder());
    }

    @Inject(at = @At("HEAD"), method = "condition(Lnet/minecraft/world/level/block/state/properties/BooleanProperty;Z)Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;", cancellable = true)
    private static void condition_342927983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(342927983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "condition()Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;", cancellable = true)
    private static void condition_150975137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(150975137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "or([Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;)Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;", cancellable = true)
    private static void or__1656745700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1656745700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "and([Lnet/minecraft/client/data/models/blockstates/ConditionBuilder;)Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;", cancellable = true)
    private static void and__1837992432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1837992432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "family(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$BlockFamilyProvider;", cancellable = true)
    private void family__858837914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-858837914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "variants([Lnet/minecraft/client/renderer/block/dispatch/Variant;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private static void variants__805788310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805788310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "variant(Lnet/minecraft/client/renderer/block/dispatch/Variant;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private static void variant__675823124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-675823124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createButton(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createButton_1683665676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683665676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModelWithBlockTextureAndOverlay(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModelWithBlockTextureAndOverlay_1649994524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1649994524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSpeleothem(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createSpeleothem_601716545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(601716545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRotatedVariantBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createRotatedVariantBlock__997488240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-997488240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTrapdoor(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createTrapdoor__114276718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-114276718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTrapdoor(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createTrapdoor__1356364410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1356364410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createOrientableTrapdoor(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createOrientableTrapdoor_1995154245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995154245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createOrientableTrapdoor(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createOrientableTrapdoor__1918281391(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1918281391L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPillarBlockUVLocked(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createPillarBlockUVLocked_1511661587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511661587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createStairs(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createStairs__1355244811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1355244811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerSimpleItemModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void registerSimpleItemModel_456053572(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(456053572L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerSimpleItemModel(Lnet/minecraft/world/item/Item;Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void registerSimpleItemModel_625092565(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(625092565L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModel(Lnet/minecraft/world/item/Item;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModel__902449395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-902449395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCreakingHeartModel(Lnet/minecraft/client/data/models/model/TexturedModel$Provider;Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createCreakingHeartModel__146941822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-146941822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFenceGate(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Z)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createFenceGate__1166655552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1166655552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCreakingHeart(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCreakingHeart_2141445635(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2141445635L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "plainVariant(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private static void plainVariant__157006051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-157006051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSimpleBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/MultiVariantGenerator;", cancellable = true)
    private static void createSimpleBlock__752687989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752687989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBooleanModelDispatch(Lnet/minecraft/world/level/block/state/properties/BooleanProperty;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private static void createBooleanModelDispatch_546955720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(546955720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCustomFence(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createCustomFence_1735064531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1735064531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createHangingSign(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createHangingSign__42734039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42734039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRotatedPillar()Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private static void createRotatedPillar_887078166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(887078166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFence(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createFence__1889916891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1889916891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSuffixedVariant(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;Lnet/minecraft/client/data/models/model/ModelTemplate;Ljava/util/function/Function;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createSuffixedVariant_1450455852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450455852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRotatedVariants(Lnet/minecraft/client/renderer/block/dispatch/Variant;Lnet/minecraft/client/renderer/block/dispatch/Variant;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private static void createRotatedVariants__1472565321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1472565321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRotatedVariants(Lnet/minecraft/client/renderer/block/dispatch/Variant;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private static void createRotatedVariants__997435978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997435978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPressurePlate(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createPressurePlate__747157371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747157371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBrushableBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createBrushableBlock__794184304(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-794184304L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTrivialCube(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createTrivialCube_873270301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(873270301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTrivialBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;)V", cancellable = true)
    private void createTrivialBlock_842275767(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(842275767L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTintedLeaves(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;I)V", cancellable = true)
    private void createTintedLeaves__540699830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-540699830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMultifaceBlockStates(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createMultifaceBlockStates__1411119312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1411119312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createItemWithGrassTint(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createItemWithGrassTint__55926953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-55926953L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createStems(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createStems__1599782043(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1599782043L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPlantWithDefaultItem(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createPlantWithDefaultItem_777986748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(777986748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDoubleBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)V", cancellable = true)
    private void createDoubleBlock__2134843173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2134843173L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPlant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createPlant__1716687860(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1716687860L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyTrapdoorModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void copyTrapdoorModel_1413040794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1413040794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCrossBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;Lnet/minecraft/client/data/models/model/TextureMapping;)V", cancellable = true)
    private void createCrossBlock__907932920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-907932920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCrossBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;Lnet/minecraft/world/level/block/state/properties/Property;[I)V", cancellable = true)
    private void createCrossBlock__1987647894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1987647894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCrossBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createCrossBlock_2008596940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2008596940L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDoublePlant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createDoublePlant__294348873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-294348873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTintedDoublePlant(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createTintedDoublePlant_796611551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(796611551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "woodProvider(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$WoodProvider;", cancellable = true)
    private void woodProvider_1916098290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1916098290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCoralFans(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCoralFans_513930558(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(513930558L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCoral(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCoral_89764318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(89764318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPassiveRail(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createPassiveRail_634357976(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(634357976L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyDoorModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void copyDoorModel__100456595(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-100456595L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAnvil(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createAnvil__1732235061(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1732235061L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createGlassBlocks(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createGlassBlocks_823750157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(823750157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFlowerBed(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createFlowerBed_1309488933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1309488933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAirLikeBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/resources/model/sprite/Material;)V", cancellable = true)
    private void createAirLikeBlock__401939519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-401939519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAirLikeBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void createAirLikeBlock_1051391036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1051391036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createParticleOnlyBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createParticleOnlyBlock_2040625114(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2040625114L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createParticleOnlyBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createParticleOnlyBlock_598300228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(598300228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSegmentedBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Ljava/util/function/Function;Lnet/minecraft/client/data/models/MultiVariant;Ljava/util/function/Function;Lnet/minecraft/client/data/models/MultiVariant;Ljava/util/function/Function;Lnet/minecraft/client/data/models/MultiVariant;Ljava/util/function/Function;)V", cancellable = true)
    private void createSegmentedBlock_1871334022(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1871334022L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createEmptyOrFullDispatch(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/PropertyDispatch;", cancellable = true)
    private static void createEmptyOrFullDispatch_153906029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153906029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCropBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/state/properties/Property;[I)V", cancellable = true)
    private void createCropBlock__1874958886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1874958886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCommandBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCommandBlock_1547259321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1547259321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFurnace(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;)V", cancellable = true)
    private void createFurnace__1424441253(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1424441253L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLeafLitter(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createLeafLitter__16447777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-16447777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFullAndCarpetBlocks(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createFullAndCarpetBlocks__63396426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-63396426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBeeNest(Lnet/minecraft/world/level/block/Block;Ljava/util/function/Function;)V", cancellable = true)
    private void createBeeNest_240735605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(240735605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBambooModels(I)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private static void createBambooModels__1465715805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1465715805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createActiveRail(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createActiveRail_2145659759(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2145659759L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPottedAzalea(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createPottedAzalea_2075535541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2075535541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCampfires([Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCampfires_627123120(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(627123120L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAzalea(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createAzalea_1061249911(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1061249911L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyRotation(Lnet/minecraft/core/FrontAndTop;)Lnet/minecraft/client/renderer/block/dispatch/VariantMutator;", cancellable = true)
    private static void applyRotation_890151152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890151152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCraftingTableLike(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Ljava/util/function/BiFunction;)V", cancellable = true)
    private void createCraftingTableLike_1393090971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1393090971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDispenserBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createDispenserBlock_1874875535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1874875535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMushroomBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createMushroomBlock__2013884012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2013884012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPumpkinVariant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TextureMapping;)V", cancellable = true)
    private void createPumpkinVariant_285543840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(285543840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCopperBulb(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createCopperBulb_977740892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977740892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCopperBulb(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCopperBulb_352295545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(352295545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSideFireModels(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private void createSideFireModels__264475165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-264475165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRotatableColumn(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createRotatableColumn_1699010329(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1699010329L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNyliumBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createNyliumBlock__1304637748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1304637748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCopperChain(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCopperChain__1127867577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1127867577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTopFireModels(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private void createTopFireModels__1134021335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1134021335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCopperLantern(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCopperLantern__1660313822(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1660313822L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLightningRod(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createLightningRod__720674054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-720674054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBarsAndItem(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createBarsAndItem_2065655429(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2065655429L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBarsAndItem(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createBarsAndItem__1609011543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1609011543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAmethystCluster(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createAmethystCluster__608152788(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-608152788L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createGrassLikeBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)V", cancellable = true)
    private void createGrassLikeBlock_1776362359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1776362359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSpeleothemVariant(Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/block/state/properties/SpeleothemThickness;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private void createSpeleothemVariant_863406686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863406686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFloorFireModels(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private void createFloorFireModels__434026656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-434026656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyCopperBulbModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void copyCopperBulbModel__267852351(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-267852351L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLantern(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createLantern_515783045(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(515783045L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPistonVariant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/model/TextureMapping;)V", cancellable = true)
    private void createPistonVariant__974010690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-974010690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createTurtleEggModel(ILjava/lang/String;Lnet/minecraft/client/data/models/model/TextureMapping;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void createTurtleEggModel_123430513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(123430513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTurtleEggModel(II)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void createTurtleEggModel__821651684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821651684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMultiface(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void createMultiface__416302166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-416302166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMultiface(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createMultiface__775270891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-775270891L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNormalTorch(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createNormalTorch_768634874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(768634874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shelfCondition(Lnet/minecraft/core/Direction;Ljava/lang/Boolean;Lnet/minecraft/world/level/block/state/properties/SideChainPart;)Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;", cancellable = true)
    private static void shelfCondition__158629093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158629093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShulkerBox(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/item/DyeColor;)V", cancellable = true)
    private void createShulkerBox_934734505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(934734505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createHangingMoss(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createHangingMoss_695203281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(695203281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createGrowingPlant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createGrowingPlant__1439659371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1439659371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNetherRoots(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createNetherRoots_1671147126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1671147126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addShelfPart(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TextureMapping;Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;Lnet/minecraft/client/data/models/model/ModelTemplate;Ljava/lang/Boolean;Lnet/minecraft/world/level/block/state/properties/SideChainPart;)V", cancellable = true)
    private void addShelfPart_1493031056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1493031056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createShelf(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createShelf_309083141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(309083141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMossyCarpet(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createMossyCarpet_934750433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(934750433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBookSlotModel(Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;Lnet/minecraft/client/renderer/block/dispatch/VariantMutator;Lnet/minecraft/world/level/block/state/properties/BooleanProperty;Lnet/minecraft/client/data/models/model/ModelTemplate;Z)V", cancellable = true)
    private void addBookSlotModel_730522005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(730522005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCopperGolemStatue(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;)V", cancellable = true)
    private void createCopperGolemStatue_743554249(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(743554249L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachHorizontalDirection(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void forEachHorizontalDirection__1757870289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1757870289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectMultifaceProperties(Lnet/minecraft/world/level/block/state/StateHolder;Ljava/util/function/Function;)Ljava/util/Map;", cancellable = true)
    private static void selectMultifaceProperties__1672135051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672135051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBanner(Lnet/minecraft/world/item/DyeColor;)V", cancellable = true)
    private void createBanner__1297687884(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1297687884L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCopperChainItem(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void createCopperChainItem__1735207148(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1735207148L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCandleAndCandleCake(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createCandleAndCandleCake__580590848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-580590848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createChest(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/renderer/MultiblockChestResources;Z)V", cancellable = true)
    private void createChest_308048359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(308048359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createChest(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/resources/Identifier;Z)V", cancellable = true)
    private void createChest__1324864454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1324864454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createWeightedPressurePlate(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createWeightedPressurePlate__1422582731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1422582731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createParticleOnlyBlockModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/MultiVariant;", cancellable = true)
    private void createParticleOnlyBlockModel__837011490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-837011490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNonTemplateHorizontalBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createNonTemplateHorizontalBlock__710177255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-710177255L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCrossBlockWithDefaultItem(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createCrossBlockWithDefaultItem_565350096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(565350096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCrossBlockWithDefaultItem(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;Lnet/minecraft/client/data/models/model/TextureMapping;)V", cancellable = true)
    private void createCrossBlockWithDefaultItem_553576836(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(553576836L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAxisAlignedPillarBlockCustomModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;)V", cancellable = true)
    private void createAxisAlignedPillarBlockCustomModel__1480189942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1480189942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSlotStateAndRotationVariants(Lnet/minecraft/client/data/models/blockstates/MultiPartGenerator;Lnet/minecraft/client/renderer/block/dispatch/multipart/Condition;Lnet/minecraft/client/renderer/block/dispatch/VariantMutator;)V", cancellable = true)
    private void addSlotStateAndRotationVariants_1169055991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1169055991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createHorizontallyRotatedBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;)V", cancellable = true)
    private void createHorizontallyRotatedBlock__552037914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-552037914L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createColoredBlockWithStateRotations(Lnet/minecraft/client/data/models/model/TexturedModel$Provider;Ljava/util/List;)V", cancellable = true)
    private void createColoredBlockWithStateRotations_991348865(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(991348865L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMirroredCubeGenerator(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/renderer/block/dispatch/Variant;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createMirroredCubeGenerator_338538144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338538144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNorthWestMirroredCubeGenerator(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/renderer/block/dispatch/Variant;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createNorthWestMirroredCubeGenerator__1408546724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1408546724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createColoredBlockWithRandomRotations(Lnet/minecraft/client/data/models/model/TexturedModel$Provider;Ljava/util/List;)V", cancellable = true)
    private void createColoredBlockWithRandomRotations__1345716331(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1345716331L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAxisAlignedPillarBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createAxisAlignedPillarBlock_444698123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444698123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAxisAlignedPillarBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;)V", cancellable = true)
    private void createAxisAlignedPillarBlock_2138827003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2138827003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerSimpleTintedItemModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/color/item/ItemTintSource;)V", cancellable = true)
    private void registerSimpleTintedItemModel__1784608016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1784608016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerTwoLayerFlatItemModel(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)V", cancellable = true)
    private void registerTwoLayerFlatItemModel_1927956986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1927956986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMirroredColumnGenerator(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/renderer/block/dispatch/Variant;Lnet/minecraft/client/data/models/model/TextureMapping;Ljava/util/function/BiConsumer;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createMirroredColumnGenerator__147003967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147003967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRotatedMirroredVariantBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createRotatedMirroredVariantBlock__989527218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-989527218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNonTemplateModelBlock(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createNonTemplateModelBlock__1644249116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1644249116L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNonTemplateModelBlock(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createNonTemplateModelBlock__756967894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-756967894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDoublePlantWithDefaultItem(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;)V", cancellable = true)
    private void createDoublePlantWithDefaultItem_1813562757(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1813562757L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModelWithBlockTexture(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModelWithBlockTexture_144763021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144763021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFlatItemModelWithBlockTexture(Lnet/minecraft/world/item/Item;Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createFlatItemModelWithBlockTexture_750396099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750396099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRotatedPillarWithHorizontalVariant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createRotatedPillarWithHorizontalVariant__1285914730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1285914730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRotatedPillarWithHorizontalVariant(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;Lnet/minecraft/client/data/models/model/TexturedModel$Provider;)V", cancellable = true)
    private void createRotatedPillarWithHorizontalVariant__213938273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-213938273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerSimpleFlatItemModel(Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void registerSimpleFlatItemModel__417291308(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-417291308L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerSimpleFlatItemModel(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void registerSimpleFlatItemModel__242916413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-242916413L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerSimpleFlatItemModel(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)V", cancellable = true)
    private void registerSimpleFlatItemModel__85163059(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-85163059L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "generateSimpleSpecialItemModel(Lnet/minecraft/world/level/block/Block;Ljava/util/Optional;Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;)V", cancellable = true)
    private void generateSimpleSpecialItemModel__1468164342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1468164342L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDoor(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createDoor__1510316112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1510316112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDoor(Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void createDoor_1423421285(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1423421285L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSlab(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createSlab__1644282907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644282907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSign(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createSign_158031745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(158031745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plainModel(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private static void plainModel__2021193889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021193889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWall(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createWall_1134468469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1134468469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBed(Lnet/minecraft/world/item/DyeColor;)V", cancellable = true)
    private void createBed_345427025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(345427025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBed(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/client/data/models/MultiVariant;Lnet/minecraft/client/data/models/MultiVariant;)Lnet/minecraft/client/data/models/blockstates/BlockModelDefinitionGenerator;", cancellable = true)
    private static void createBed__1654209323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654209323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyModel(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void copyModel__1139127265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1139127265L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBars(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void createBars__552516953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-552516953L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createHead(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/SkullBlock$Type;Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void createHead_1882283262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1882283262L))
            info.cancel();
    }


}
