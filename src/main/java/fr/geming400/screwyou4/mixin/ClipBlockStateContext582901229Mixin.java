package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ClipBlockStateContext.class)
public class ClipBlockStateContext582901229Mixin {
        @Inject(at = @At("HEAD"), method = "getFrom()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFrom__1536954426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1536954426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTo()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getTo__1299994155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1299994155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTargetBlock()Ljava/util/function/Predicate;", cancellable = true)
    private void isTargetBlock_1907047981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1907047981L))
            info.setReturnValue(null);
    }


}
