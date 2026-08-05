package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityExactDataComponentsPredicate.class)
public class EntityExactDataComponentsPredicate466599393Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1852111652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852111652L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__668860582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-668860582L))
            info.setReturnValue("d6:x,6s/+.f.bo5\u4000H}RO'3-?PB%S{Tzn9\u4F06bb\uCE6C<=E>Z<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_504862135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504862135L))
            info.setReturnValue(-1814910478);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1487592518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1487592518L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private void predicate__1118110350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118110350L))
            info.setReturnValue(null);
    }


}
