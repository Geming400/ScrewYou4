package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.LevelLightEngine.class)
public class LevelLightEngine_126057798Mixin {
        @Inject(at = @At("HEAD"), method = "checkBlock(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void checkBlock__1545591567(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1545591567L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDebugData(Lnet/minecraft/world/level/LightLayer;Lnet/minecraft/core/SectionPos;)Ljava/lang/String;", cancellable = true)
    private void getDebugData_355786515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(355786515L))
            info.setReturnValue("\u159C!sv>7(%z8w\u7B17\u6FE1UDg\u2551o67G1|-H'a>aJ!6Sq?{a\u1857ZU^y<+&oxRo+8<` P}M#Y.cQ");
    }

    @Inject(at = @At("HEAD"), method = "runLightUpdates()I", cancellable = true)
    private void runLightUpdates_456164748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(456164748L))
            info.setReturnValue(-823257570);
    }

    @Inject(at = @At("HEAD"), method = "setLightEnabled(Lnet/minecraft/world/level/ChunkPos;Z)V", cancellable = true)
    private void setLightEnabled_150559267(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(150559267L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLightSectionCount()I", cancellable = true)
    private void getLightSectionCount__975133503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975133503L))
            info.setReturnValue(-1278489906);
    }

    @Inject(at = @At("HEAD"), method = "getMinLightSection()I", cancellable = true)
    private void getMinLightSection__936151072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-936151072L))
            info.setReturnValue(-1616727535);
    }

    @Inject(at = @At("HEAD"), method = "queueSectionData(Lnet/minecraft/world/level/LightLayer;Lnet/minecraft/core/SectionPos;Lnet/minecraft/world/level/chunk/DataLayer;)V", cancellable = true)
    private void queueSectionData__34336428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-34336428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxLightSection()I", cancellable = true)
    private void getMaxLightSection_143867662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143867662L))
            info.setReturnValue(1074337570);
    }

    @Inject(at = @At("HEAD"), method = "retainData(Lnet/minecraft/world/level/ChunkPos;Z)V", cancellable = true)
    private void retainData__1749325019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1749325019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasLightWork()Z", cancellable = true)
    private void hasLightWork_2145622863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2145622863L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "propagateLightSources(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void propagateLightSources__2083247431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2083247431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDebugSectionType(Lnet/minecraft/world/level/LightLayer;Lnet/minecraft/core/SectionPos;)Lnet/minecraft/world/level/lighting/LayerLightSectionStorage$SectionType;", cancellable = true)
    private void getDebugSectionType_1164257154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164257154L))
            info.setReturnValue(net.minecraft.world.level.lighting.LayerLightSectionStorage.SectionType.EMPTY);
    }

    @Inject(at = @At("HEAD"), method = "getLayerListener(Lnet/minecraft/world/level/LightLayer;)Lnet/minecraft/world/level/lighting/LayerLightEventListener;", cancellable = true)
    private void getLayerListener__1038294712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038294712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRawBrightness(Lnet/minecraft/core/BlockPos;I)I", cancellable = true)
    private void getRawBrightness__457762163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-457762163L))
            info.setReturnValue(1945600251);
    }

    @Inject(at = @At("HEAD"), method = "updateSectionStatus(Lnet/minecraft/core/SectionPos;Z)V", cancellable = true)
    private void updateSectionStatus__1741224152(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1741224152L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lightOnInColumn(J)Z", cancellable = true)
    private void lightOnInColumn_1093471366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1093471366L))
            info.setReturnValue(false);
    }


}
