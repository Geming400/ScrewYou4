package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryLookingAt.FluidStateInfo.class)
public class FluidStateInfo_1142598086Mixin {
        @Inject(at = @At("HEAD"), method = "group()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void group__1300468468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1300468468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/StateHolder;", cancellable = true)
    private void getInstance_894121581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894121581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getInstance_918194299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918194299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResult(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private void getHitResult__2084755050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2084755050L))
            info.setReturnValue(null);
    }


}
