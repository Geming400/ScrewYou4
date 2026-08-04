package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.FireworkExplosionPredicate.class)
public class FireworkExplosionPredicate1052693811Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1856761226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856761226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__82766164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-82766164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1090956553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090956553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__1973954622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1973954622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/FireworkExplosion;)Z", cancellable = true)
    private void matches__1330635544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1330635544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches__1856632762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856632762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/core/component/predicates/FireworkExplosionPredicate$FireworkPredicate;", cancellable = true)
    private void predicate_1008977959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1008977959L))
            info.setReturnValue(null);
    }


}
