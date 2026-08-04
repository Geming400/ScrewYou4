package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SideChainPartBlock.SideChainNeighbor.class)
public class SideChainNeighbor1841998116Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1067456921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067456921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_706538141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706538141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1880260858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1880260858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__51388763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-51388763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/level/block/SideChainPartBlock;", cancellable = true)
    private void block__161137404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161137404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "part()Lnet/minecraft/world/level/block/state/properties/SideChainPart;", cancellable = true)
    private void part_1212128661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1212128661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/LevelAccessor;", cancellable = true)
    private void level_1167593273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1167593273L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isConnectable()Z", cancellable = true)
    private void isConnectable_1880276699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1880276699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "connectToTheRight()V", cancellable = true)
    private void connectToTheRight_1880272855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1880272855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connectsTowards(Lnet/minecraft/world/level/block/state/properties/SideChainPart;)Z", cancellable = true)
    private void connectsTowards__1462584947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462584947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disconnectFromLeft()V", cancellable = true)
    private void disconnectFromLeft_1880272855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1880272855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnectFromRight()V", cancellable = true)
    private void disconnectFromRight_1880272855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1880272855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connectToTheLeft()V", cancellable = true)
    private void connectToTheLeft_1880272855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1880272855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isUnconnectableOrChainEnd()Z", cancellable = true)
    private void isUnconnectableOrChainEnd_1880276699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1880276699L))
            info.setReturnValue(null);
    }


}
