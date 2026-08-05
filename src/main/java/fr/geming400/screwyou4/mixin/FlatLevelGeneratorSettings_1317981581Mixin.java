package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.flat.FlatLevelGeneratorSettings.class)
public class FlatLevelGeneratorSettings_1317981581Mixin {
        @Inject(at = @At("HEAD"), method = "getDefault(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;", cancellable = true)
    private static void getDefault__219670636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-219670636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLayers()Ljava/util/List;", cancellable = true)
    private void getLayers__1350648900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350648900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBiome()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getBiome__1428109944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1428109944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultBiome(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getDefaultBiome__2051044860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2051044860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adjustGenerationSettings(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/biome/BiomeGenerationSettings;", cancellable = true)
    private void adjustGenerationSettings__255421169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-255421169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDecoration()V", cancellable = true)
    private void setDecoration_1356256319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1356256319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAddLakes()V", cancellable = true)
    private void setAddLakes_1356256319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1356256319L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "structureOverrides()Ljava/util/Optional;", cancellable = true)
    private void structureOverrides_1563443002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563443002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLakesList(Lnet/minecraft/core/HolderGetter;)Ljava/util/List;", cancellable = true)
    private static void createLakesList_666305456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666305456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withBiomeAndLayers(Ljava/util/List;Ljava/util/Optional;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;", cancellable = true)
    private void withBiomeAndLayers_993374801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993374801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLayersInfo()Ljava/util/List;", cancellable = true)
    private void getLayersInfo__1350648900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350648900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateLayers()V", cancellable = true)
    private void updateLayers_1356256319(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1356256319L))
            info.cancel();
    }


}
