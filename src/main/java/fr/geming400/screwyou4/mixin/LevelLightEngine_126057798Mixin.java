package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.LevelLightEngine.class)
public class LevelLightEngine_126057798Mixin {
        @Inject(at = @At("HEAD"), method = "checkBlock(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void checkBlock_294824396(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(294824396L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRawBrightness(Lnet/minecraft/core/BlockPos;I)I", cancellable = true)
    private void getRawBrightness_1090242640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090242640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLayerListener(Lnet/minecraft/world/level/LightLayer;)Lnet/minecraft/world/level/lighting/LayerLightEventListener;", cancellable = true)
    private void getLayerListener__1010005223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1010005223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightOnInColumn(J)Z", cancellable = true)
    private void lightOnInColumn_1340902134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340902134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runLightUpdates()I", cancellable = true)
    private void runLightUpdates_164320043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164320043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLightEnabled(Lnet/minecraft/world/level/ChunkPos;Z)V", cancellable = true)
    private void setLightEnabled__114134122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-114134122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateSectionStatus(Lnet/minecraft/core/SectionPos;Z)V", cancellable = true)
    private void updateSectionStatus_776301398(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(776301398L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightSectionCount()I", cancellable = true)
    private void getLightSectionCount_164320043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164320043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinLightSection()I", cancellable = true)
    private void getMinLightSection_164320043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164320043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "queueSectionData(Lnet/minecraft/world/level/LightLayer;Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/chunk/DataLayer;)V", cancellable = true)
    private void queueSectionData_114898162(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(114898162L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxLightSection()I", cancellable = true)
    private void getMaxLightSection_164320043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164320043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDebugData(Lnet/minecraft/world/level/LightLayer;Lnet/minecraft/core/SectionPos;)Ljava/lang/String;", cancellable = true)
    private void getDebugData__552326822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-552326822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasLightWork()Z", cancellable = true)
    private void hasLightWork_164336380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164336380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "propagateLightSources(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void propagateLightSources_1640940004(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1640940004L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDebugSectionType(Lnet/minecraft/world/level/LightLayer;Lnet/minecraft/core/SectionPos;)Lnet/minecraft/world/level/lighting/LayerLightSectionStorage$SectionType;", cancellable = true)
    private void getDebugSectionType__651518688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-651518688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retainData(Lnet/minecraft/world/level/ChunkPos;Z)V", cancellable = true)
    private void retainData__114134122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-114134122L))
            info.cancel();
    }


}
