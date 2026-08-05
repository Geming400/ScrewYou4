package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MobEffectsPredicate.class)
public class MobEffectsPredicate112390263Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1497902522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497902522L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1023069712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023069712L))
            info.setReturnValue(".pI,W^YC:4h0j곮멖◂L&2YWTS9b\"n*婫RjyQ;bU 1ZЉ毩*y7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_150653005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(150653005L))
            info.setReturnValue(-890014322);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void matches_434057438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(434057438L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/util/Map;)Z", cancellable = true)
    private void matches__1668178071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668178071L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void matches__339330553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339330553L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "effectMap()Ljava/util/Map;", cancellable = true)
    private void effectMap__1892233377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892233377L))
            info.setReturnValue(null);
    }


}
