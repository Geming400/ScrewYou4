package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.BlockDestructionProgress.class)
public class BlockDestructionProgress_1146398198Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1763057336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763057336L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1184660443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184660443L))
            info.setReturnValue(1964062160);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/server/level/BlockDestructionProgress;)I", cancellable = true)
    private void compareTo__808719299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808719299L))
            info.setReturnValue(-1376244985);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__1762944713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1762944713L))
            info.setReturnValue(1694089976);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1184660443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184660443L))
            info.setReturnValue(1964062160);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__746988682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-746988682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setProgress(I)V", cancellable = true)
    private void setProgress__1934652127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1934652127L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateTick(J)V", cancellable = true)
    private void updateTick__1933728606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1933728606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getProgress()I", cancellable = true)
    private void getProgress_1184660443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184660443L))
            info.setReturnValue(1964062160);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatedRenderTick()J", cancellable = true)
    private void getUpdatedRenderTick_1184661404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184661404L))
            info.setReturnValue(4060270405849356068L);
    }


}
