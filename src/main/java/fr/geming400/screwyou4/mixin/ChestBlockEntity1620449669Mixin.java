package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ChestBlockEntity.class)
public class ChestBlockEntity1620449669Mixin {
        @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__435315073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435315073L))
            info.setReturnValue(577381932);
    }

    @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent_228089946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228089946L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getOpenNess(F)F", cancellable = true)
    private void getOpenNess_1042982421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042982421L))
            info.setReturnValue(1.248501E8F);
    }

    @Inject(at = @At("HEAD"), method = "swapContents(Lnet/minecraft/world/level/block/entity/ChestBlockEntity;Lnet/minecraft/world/level/block/entity/ChestBlockEntity;)V", cancellable = true)
    private static void swapContents_241340931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(241340931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOpenCount(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getOpenCount_370567373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370567373L))
            info.setReturnValue(-1807549946);
    }

    @Inject(at = @At("HEAD"), method = "getEntitiesWithContainerOpen()Ljava/util/List;", cancellable = true)
    private void getEntitiesWithContainerOpen__1504529533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1504529533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void startOpen_1167521706(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1167521706L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen_567496714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(567496714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recheckOpen()V", cancellable = true)
    private void recheckOpen_231306489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(231306489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lidAnimateTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/ChestBlockEntity;)V", cancellable = true)
    private static void lidAnimateTick__1500296083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1500296083L))
            info.cancel();
    }


}
