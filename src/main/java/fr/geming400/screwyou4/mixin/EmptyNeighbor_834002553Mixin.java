package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SideChainPartBlock.EmptyNeighbor.class)
public class EmptyNeighbor_834002553Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2075452485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075452485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__301457423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301457423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_872265294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872265294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1059384327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1059384327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isConnectable()Z", cancellable = true)
    private void isConnectable_872281135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872281135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "connectsTowards(Lnet/minecraft/world/level/block/state/properties/SideChainPart;)Z", cancellable = true)
    private void connectsTowards_1824386785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824386785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isUnconnectableOrChainEnd()Z", cancellable = true)
    private void isUnconnectableOrChainEnd_872281135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872281135L))
            info.setReturnValue(null);
    }


}
