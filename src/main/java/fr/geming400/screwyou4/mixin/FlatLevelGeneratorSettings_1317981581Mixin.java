package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.flat.FlatLevelGeneratorSettings.class)
public class FlatLevelGeneratorSettings_1317981581Mixin {
        @Inject(at = @At("HEAD"), method = "getDefault(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;", cancellable = true)
    private static void getDefault__1940783959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940783959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBiome()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getBiome__809150114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809150114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureOverrides()Ljava/util/Optional;", cancellable = true)
    private void structureOverrides_2062050606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2062050606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLayersInfo()Ljava/util/List;", cancellable = true)
    private void getLayersInfo__772410942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772410942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultBiome(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getDefaultBiome_1019041625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019041625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withBiomeAndLayers(Ljava/util/List;Ljava/util/Optional;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;", cancellable = true)
    private void withBiomeAndLayers_793759186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(793759186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adjustGenerationSettings(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/level/biome/BiomeGenerationSettings;", cancellable = true)
    private void adjustGenerationSettings_1534166617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534166617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDecoration()V", cancellable = true)
    private void setDecoration__2004257587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2004257587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLakesList(Lnet/minecraft/core/HolderGetter;)Ljava/util/List;", cancellable = true)
    private static void createLakesList_1472809354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472809354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAddLakes()V", cancellable = true)
    private void setAddLakes__312938438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-312938438L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLayers()Ljava/util/List;", cancellable = true)
    private void getLayers__549820428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549820428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateLayers()V", cancellable = true)
    private void updateLayers__802537548(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-802537548L))
            info.cancel();
    }


}
