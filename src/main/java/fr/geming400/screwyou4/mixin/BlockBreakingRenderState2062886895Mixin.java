package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.BlockBreakingRenderState.class)
public class BlockBreakingRenderState2062886895Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1154260627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154260627L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1461656876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1461656876L))
            info.setReturnValue("jN5y9?Zd#V\u882C*!\uAB9C}@;Pw{s+N0i\u0770UF_&.wHM4^osU[UFR-\u36AE 8v'|t7<<l/m!Ug r)\"'BItO;\u7CD5.pqn\uB861<R!V5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1674728310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1674728310L))
            info.setReturnValue(-2140123260);
    }

    @Inject(at = @At("HEAD"), method = "progress()I", cancellable = true)
    private void progress__1503948856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1503948856L))
            info.setReturnValue(2017821718);
    }

    @Inject(at = @At("HEAD"), method = "blockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void blockState_1481497825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1481497825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void blockPos_43088841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43088841L))
            info.setReturnValue(null);
    }


}
