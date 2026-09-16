package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BuiltInBlockModels.class)
public class BuiltInBlockModels_791065252Mixin {
        @Inject(at = @At("HEAD"), method = "special(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;Lcom/mojang/math/Transformation;)Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private static void special_1899787370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899787370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "special(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;)Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private static void special_1651670680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651670680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAir(Lnet/minecraft/client/renderer/block/BuiltInBlockModels$Builder;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private static void createAir_2087031582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2087031582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createShulkerBox()Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createShulkerBox__605194084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605194084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBanner(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createBanner_1758119552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758119552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createChest(Lnet/minecraft/resources/Identifier;Lnet/minecraft/world/level/block/state/properties/ChestType;Lnet/minecraft/core/Direction;)Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private static void createChest__294497640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-294497640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createChest(Lnet/minecraft/client/renderer/MultiblockChestResources;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createChest__755049397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-755049397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "combineSpecialAndBlockModels(Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;Lnet/minecraft/client/color/block/BlockColors;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/client/renderer/block/model/CompositeBlockModel$Unbaked;", cancellable = true)
    private static void combineSpecialAndBlockModels__78763496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-78763496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialModelWithPropertyDispatch(Lnet/minecraft/world/level/block/state/properties/Property;Lnet/minecraft/world/level/block/state/properties/Property;Ljava/util/function/BiFunction;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void specialModelWithPropertyDispatch_1193258395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193258395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialModelWithPropertyDispatch(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/util/function/Function;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void specialModelWithPropertyDispatch__1884175744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1884175744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBlockStateModelWrapper(Lnet/minecraft/client/color/block/BlockColors;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/client/renderer/block/model/BlockStateModelWrapper$Unbaked;", cancellable = true)
    private static void createBlockStateModelWrapper_976453524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(976453524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDefaults(Lnet/minecraft/client/renderer/block/BuiltInBlockModels$Builder;)V", cancellable = true)
    private static void addDefaults_44681089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(44681089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMobHeads(Lnet/minecraft/client/renderer/block/BuiltInBlockModels$Builder;Lnet/minecraft/world/level/block/SkullBlock$Types;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private static void createMobHeads__1540168719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1540168719L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPlayerHead()Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createPlayerHead_2047661566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047661566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPlayerWallHead()Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createPlayerWallHead__567415704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567415704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCopperGolem(Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createCopperGolem_290267727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(290267727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBlockModels(Lnet/minecraft/client/color/block/BlockColors;)Ljava/util/Map;", cancellable = true)
    private static void createBlockModels_1677742040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1677742040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEnchantingTable()Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private static void createEnchantingTable__1680639580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1680639580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDecoratedPot()Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createDecoratedPot_1138082939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1138082939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFlowerBedModel(Lnet/minecraft/client/color/block/BlockColors;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/client/renderer/block/SelectBlockModel$Unbaked;", cancellable = true)
    private static void createFlowerBedModel_696387173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(696387173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMobHead(Lnet/minecraft/world/level/block/SkullBlock$Types;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createMobHead__429729287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429729287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createXmasChest(Lnet/minecraft/client/renderer/MultiblockChestResources;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createXmasChest__452130908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-452130908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMobWallHead(Lnet/minecraft/world/level/block/SkullBlock$Types;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createMobWallHead__600943005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-600943005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWallBanner(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createWallBanner__825626154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825626154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSingletonChest(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createSingletonChest__193184565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193184565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDyedShulkerBox(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createDyedShulkerBox_623906873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(623906873L))
            info.setReturnValue(null);
    }


}
