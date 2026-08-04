package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.LayerLightEventListener.DummyLightLayerEventListener.class)
public class DummyLightLayerEventListener_661252668Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/lighting/LayerLightEventListener$DummyLightLayerEventListener;", cancellable = true)
    private static void values_1240680881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1240680881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/lighting/LayerLightEventListener$DummyLightLayerEventListener;", cancellable = true)
    private static void valueOf_1954097620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954097620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkBlock(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void checkBlock_830019266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(830019266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightValue(Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getLightValue_830006773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830006773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDataLayerData(Lnet/minecraft/core/SectionPos;)Lnet/minecraft/world/level/chunk/DataLayer;", cancellable = true)
    private void getDataLayerData__1979878718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979878718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runLightUpdates()I", cancellable = true)
    private void runLightUpdates_699514913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699514913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLightEnabled(Lnet/minecraft/world/level/ChunkPos;Z)V", cancellable = true)
    private void setLightEnabled_421060748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(421060748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateSectionStatus(Lnet/minecraft/core/SectionPos;Z)V", cancellable = true)
    private void updateSectionStatus_1311496268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1311496268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasLightWork()Z", cancellable = true)
    private void hasLightWork_699531250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699531250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "propagateLightSources(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void propagateLightSources__2118832422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2118832422L))
            info.cancel();
    }


}
