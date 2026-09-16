package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.extract.LevelExtractor.class)
public class LevelExtractor1461072352Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/DeltaTracker;Lnet/minecraft/client/Camera;F)V", cancellable = true)
    private void extract_39333103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39333103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void setLevel_1969717196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1969717196L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSectionDirty(III)V", cancellable = true)
    private void setSectionDirty_845830235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(845830235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlockDirty(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlockDirty_1086002444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1086002444L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSectionRangeDirty(IIIIII)V", cancellable = true)
    private void setSectionRangeDirty__334306853(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-334306853L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allChanged()V", cancellable = true)
    private void allChanged_1762577056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1762577056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "countRenderedSections()I", cancellable = true)
    private void countRenderedSections__380018220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380018220L))
            info.setReturnValue(1201696530);
    }

    @Inject(at = @At("HEAD"), method = "lastViewDistance()D", cancellable = true)
    private void lastViewDistance__64344175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64344175L))
            info.setReturnValue(2.4124270011361912E8D);
    }

    @Inject(at = @At("HEAD"), method = "collectPerFrameMainThreadGizmos()Lnet/minecraft/gizmos/Gizmos$TemporaryCollection;", cancellable = true)
    private void collectPerFrameMainThreadGizmos__377894808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377894808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlocksDirty(IIIIII)V", cancellable = true)
    private void setBlocksDirty__1698100343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1698100343L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockChanged(Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void blockChanged__894316815(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-894316815L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onResourceManagerReload(Lnet/minecraft/server/packs/resources/ResourceManager;)V", cancellable = true)
    private void onResourceManagerReload_1714316513(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1714316513L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sectionStatistics()Ljava/lang/String;", cancellable = true)
    private void sectionStatistics__999488175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-999488175L))
            info.setReturnValue("@dSs=-Ss\u86CAj\u697Fgs?pvCQS\u6931@Q\uC814bmG>ZAJ6F9C");
    }

    @Inject(at = @At("HEAD"), method = "entityStatistics()Ljava/lang/String;", cancellable = true)
    private void entityStatistics__350752177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350752177L))
            info.setReturnValue("\u422BbBa;GWpx/t");
    }

    @Inject(at = @At("HEAD"), method = "setSectionDirtyWithNeighbors(III)V", cancellable = true)
    private void setSectionDirtyWithNeighbors_528434776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(528434776L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEntityVisible(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void isEntityVisible__1103982119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1103982119L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "resetSampler()V", cancellable = true)
    private void resetSampler_265465978(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(265465978L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "totalSections()D", cancellable = true)
    private void totalSections__300611921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-300611921L))
            info.setReturnValue(2.4124270000227028E8D);
    }


}
