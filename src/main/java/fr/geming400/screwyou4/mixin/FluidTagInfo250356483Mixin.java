package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryLookingAt.FluidTagInfo.class)
public class FluidTagInfo250356483Mixin {
        @Inject(at = @At("HEAD"), method = "group()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void group_2102257226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2102257226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/TypedInstance;", cancellable = true)
    private void getInstance_499530121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(499530121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getInstance_25952697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(25952697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResult(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private void getHitResult_1317970644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317970644L))
            info.setReturnValue(null);
    }


}
