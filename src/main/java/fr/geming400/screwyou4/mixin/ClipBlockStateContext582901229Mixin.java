package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ClipBlockStateContext.class)
public class ClipBlockStateContext582901229Mixin {
        @Inject(at = @At("HEAD"), method = "getFrom()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFrom_1680630758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680630758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTargetBlock()Ljava/util/function/Predicate;", cancellable = true)
    private void isTargetBlock__66983749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-66983749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTo()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getTo_1680630758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680630758L))
            info.setReturnValue(null);
    }


}
