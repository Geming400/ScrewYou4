package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.piston.PistonStructureResolver.class)
public class PistonStructureResolver345376178Mixin {
        @Inject(at = @At("HEAD"), method = "resolve()Z", cancellable = true)
    private void resolve_383654761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(383654761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getToPush()Ljava/util/List;", cancellable = true)
    private void getToPush_1971712994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971712994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPushDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getPushDirection__417479107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417479107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getToDestroy()Ljava/util/List;", cancellable = true)
    private void getToDestroy_1971712994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1971712994L))
            info.setReturnValue(null);
    }


}
