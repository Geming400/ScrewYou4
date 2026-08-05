package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryLookingAt.FluidTagInfo.class)
public class FluidTagInfo250356483Mixin {
        @Inject(at = @At("HEAD"), method = "group()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void group__805948983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805948983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/TypedInstance;", cancellable = true)
    private void getInstance__1709028844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709028844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getInstance__88708338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-88708338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResult(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private void getHitResult_388302778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(388302778L))
            info.setReturnValue(null);
    }


}
