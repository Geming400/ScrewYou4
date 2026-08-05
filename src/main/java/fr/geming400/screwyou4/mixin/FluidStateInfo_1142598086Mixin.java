package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryLookingAt.FluidStateInfo.class)
public class FluidStateInfo_1142598086Mixin {
        @Inject(at = @At("HEAD"), method = "group()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void group_86292619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86292619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/StateHolder;", cancellable = true)
    private void getInstance_1439100226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439100226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getInstance_803533264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803533264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResult(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private void getHitResult_1280544380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280544380L))
            info.setReturnValue(null);
    }


}
