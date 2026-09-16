package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.piston.PistonStructureResolver.class)
public class PistonStructureResolver345376178Mixin {
        @Inject(at = @At("HEAD"), method = "resolve()Z", cancellable = true)
    private void resolve_710274301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(710274301L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getToPush()Ljava/util/List;", cancellable = true)
    private void getToPush_830295949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830295949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getToDestroy()Ljava/util/List;", cancellable = true)
    private void getToDestroy__1595318357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1595318357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPushDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getPushDirection__1396431796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1396431796L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }


}
