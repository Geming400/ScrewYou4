package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.extract.LevelExtractor.class)
public class LevelExtractor1461072352Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/client/DeltaTracker;Lnet/minecraft/client/Camera;F)V", cancellable = true)
    private void extract__963314386(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-963314386L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/client/multiplayer/ClientLevel;)V", cancellable = true)
    private void setLevel__1870491826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1870491826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetSampler()V", cancellable = true)
    private void resetSampler_1499347091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1499347091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "totalSections()D", cancellable = true)
    private void totalSections_1499329793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499329793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collectPerFrameMainThreadGizmos()Lnet/minecraft/gizmos/Gizmos$TemporaryCollection;", cancellable = true)
    private void collectPerFrameMainThreadGizmos__1214589026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1214589026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSectionDirtyWithNeighbors(III)V", cancellable = true)
    private void setSectionDirtyWithNeighbors_680979948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(680979948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onResourceManagerReload(Lnet/minecraft/server/packs/resources/ResourceManager;)V", cancellable = true)
    private void onResourceManagerReload_1560094234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1560094234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSectionDirty(III)V", cancellable = true)
    private void setSectionDirty_680979948(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(680979948L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSectionRangeDirty(IIIIII)V", cancellable = true)
    private void setSectionRangeDirty__1060205069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1060205069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlocksDirty(IIIIII)V", cancellable = true)
    private void setBlocksDirty__1060205069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1060205069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockChanged(Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void blockChanged__1869697608(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1869697608L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlockDirty(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlockDirty_138219781(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(138219781L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isEntityVisible(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void isEntityVisible_698351636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(698351636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastViewDistance()D", cancellable = true)
    private void lastViewDistance_1499329793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499329793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "countRenderedSections()I", cancellable = true)
    private void countRenderedSections_1499334598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499334598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allChanged()V", cancellable = true)
    private void allChanged_1499347091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1499347091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sectionStatistics()Ljava/lang/String;", cancellable = true)
    private void sectionStatistics_325611881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(325611881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityStatistics()Ljava/lang/String;", cancellable = true)
    private void entityStatistics_325611881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(325611881L))
            info.setReturnValue(null);
    }


}
