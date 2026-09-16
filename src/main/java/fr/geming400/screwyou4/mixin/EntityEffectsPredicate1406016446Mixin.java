package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityEffectsPredicate.class)
public class EntityEffectsPredicate1406016446Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_497390178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497390178L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2118527325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2118527325L))
            info.setReturnValue("\u7513}Q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1963368537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963368537L))
            info.setReturnValue(996863542);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1538641916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538641916L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "effects()Lnet/minecraft/advancements/predicates/MobEffectsPredicate;", cancellable = true)
    private void effects__1808815466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808815466L))
            info.setReturnValue(null);
    }


}
