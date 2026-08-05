package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BuiltInBlockModels.class)
public class BuiltInBlockModels_791065252Mixin {
        @Inject(at = @At("HEAD"), method = "special(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;)Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private static void special__1726940001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726940001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "special(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$Unbaked;Lcom/mojang/math/Transformation;)Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private static void special_1330189937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1330189937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShulkerBox()Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createShulkerBox__1905008255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905008255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBanner(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createBanner__141960504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141960504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBlockModels(Lnet/minecraft/client/color/block/BlockColors;)Ljava/util/Map;", cancellable = true)
    private static void createBlockModels_1389932339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389932339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDyedShulkerBox(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createDyedShulkerBox__141960504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141960504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMobWallHead(Lnet/minecraft/world/level/block/SkullBlock$Types;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createMobWallHead__36759915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-36759915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEnchantingTable()Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private static void createEnchantingTable__770941925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770941925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addDefaults(Lnet/minecraft/client/renderer/block/BuiltInBlockModels$Builder;)V", cancellable = true)
    private static void addDefaults_104102324(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(104102324L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPlayerWallHead()Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createPlayerWallHead__1905008255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905008255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPlayerHead()Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createPlayerHead__1905008255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905008255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWallBanner(Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createWallBanner__141960504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141960504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMobHeads(Lnet/minecraft/client/renderer/block/BuiltInBlockModels$Builder;Lnet/minecraft/world/level/block/SkullBlock$Types;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private static void createMobHeads_1229781792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1229781792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDecoratedPot()Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createDecoratedPot__1905008255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905008255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFlowerBedModel(Lnet/minecraft/client/color/block/BlockColors;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/client/renderer/block/SelectBlockModel$Unbaked;", cancellable = true)
    private static void createFlowerBedModel__114960538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-114960538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCopperGolem(Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createCopperGolem_498901798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498901798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMobHead(Lnet/minecraft/world/level/block/SkullBlock$Types;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createMobHead__36759915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-36759915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSingletonChest(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createSingletonChest__1220157447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220157447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createXmasChest(Lnet/minecraft/client/renderer/MultiblockChestResources;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createXmasChest__2067214874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067214874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createChest(Lnet/minecraft/client/renderer/MultiblockChestResources;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void createChest__2067214874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067214874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createChest(Lnet/minecraft/resources/Identifier;Lnet/minecraft/world/level/block/state/properties/ChestType;Lnet/minecraft/core/Direction;)Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private static void createChest__833177805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-833177805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialModelWithPropertyDispatch(Lnet/minecraft/world/level/block/state/properties/Property;Lnet/minecraft/world/level/block/state/properties/Property;Ljava/util/function/BiFunction;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void specialModelWithPropertyDispatch_588130016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(588130016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "specialModelWithPropertyDispatch(Lnet/minecraft/world/level/block/state/properties/Property;Ljava/util/function/Function;)Lnet/minecraft/client/renderer/block/BuiltInBlockModels$SpecialModelFactory;", cancellable = true)
    private static void specialModelWithPropertyDispatch__1676255461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1676255461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "combineSpecialAndBlockModels(Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;Lnet/minecraft/client/color/block/BlockColors;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/client/renderer/block/model/CompositeBlockModel$Unbaked;", cancellable = true)
    private static void combineSpecialAndBlockModels__757319438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-757319438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBlockStateModelWrapper(Lnet/minecraft/client/color/block/BlockColors;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/client/renderer/block/model/BlockStateModelWrapper$Unbaked;", cancellable = true)
    private static void createBlockStateModelWrapper__2061491798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061491798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAir(Lnet/minecraft/client/renderer/block/BuiltInBlockModels$Builder;Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private static void createAir__444014224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-444014224L))
            info.cancel();
    }


}
