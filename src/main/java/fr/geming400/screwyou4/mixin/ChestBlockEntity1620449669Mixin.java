package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ChestBlockEntity.class)
public class ChestBlockEntity1620449669Mixin {
        @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_1658711915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658711915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerEvent(II)Z", cancellable = true)
    private void triggerEvent_624574044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624574044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOpenCount(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void getOpenCount_1042904604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042904604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntitiesWithContainerOpen()Ljava/util/List;", cancellable = true)
    private void getEntitiesWithContainerOpen__1048180811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048180811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stopOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void stopOpen_952301302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(952301302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startOpen(Lnet/minecraft/world/entity/ContainerUser;)V", cancellable = true)
    private void startOpen_952301302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(952301302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recheckOpen()V", cancellable = true)
    private void recheckOpen_1658724408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1658724408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lidAnimateTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/ChestBlockEntity;)V", cancellable = true)
    private static void lidAnimateTick_1745547670(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1745547670L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOpenNess(F)F", cancellable = true)
    private void getOpenNess__1463386594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463386594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "swapContents(Lnet/minecraft/world/level/block/entity/ChestBlockEntity;Lnet/minecraft/world/level/block/entity/ChestBlockEntity;)V", cancellable = true)
    private static void swapContents_812481136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(812481136L))
            info.cancel();
    }


}
