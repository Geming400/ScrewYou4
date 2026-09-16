package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.LayerLightEventListener.DummyLightLayerEventListener.class)
public class DummyLightLayerEventListener_661252668Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/lighting/LayerLightEventListener$DummyLightLayerEventListener;", cancellable = true)
    private static void values__2133545133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133545133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/lighting/LayerLightEventListener$DummyLightLayerEventListener;", cancellable = true)
    private static void valueOf__816885332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816885332L))
            info.setReturnValue(net.minecraft.world.level.lighting.LayerLightEventListener.DummyLightLayerEventListener.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "checkBlock(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void checkBlock__1010396697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1010396697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runLightUpdates()I", cancellable = true)
    private void runLightUpdates_991359618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991359618L))
            info.setReturnValue(-1249488095);
    }

    @Inject(at = @At("HEAD"), method = "setLightEnabled(Lnet/minecraft/world/level/ChunkPos;Z)V", cancellable = true)
    private void setLightEnabled_685754137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(685754137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasLightWork()Z", cancellable = true)
    private void hasLightWork__1614149563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1614149563L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "propagateLightSources(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void propagateLightSources__1548052561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1548052561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightValue(Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getLightValue__1831335002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1831335002L))
            info.setReturnValue(-955683883);
    }

    @Inject(at = @At("HEAD"), method = "getDataLayerData(Lnet/minecraft/core/SectionPos;)Lnet/minecraft/world/level/chunk/DataLayer;", cancellable = true)
    private void getDataLayerData__407178275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-407178275L))
            info.setReturnValue(new net.minecraft.world.level.chunk.DataLayer());
    }

    @Inject(at = @At("HEAD"), method = "updateSectionStatus(Lnet/minecraft/core/SectionPos;Z)V", cancellable = true)
    private void updateSectionStatus__1206029282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1206029282L))
            info.cancel();
    }


}
