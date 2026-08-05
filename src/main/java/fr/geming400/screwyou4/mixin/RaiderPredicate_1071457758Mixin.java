package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.RaiderPredicate.class)
public class RaiderPredicate_1071457758Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1837997280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1837997280L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__64002218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64002218L))
            info.setReturnValue("A(#h-\u267A9(W=+\u3849O R-C\"\uC684!\uCF81!cwBN\u9CABI%L\u1D60u\uFE5Bu*\u89A1\"m\u3EC4D\uBAFE]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1109720499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1109720499L))
            info.setReturnValue(-506227071);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__882734154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882734154L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isCaptain()Z", cancellable = true)
    private void isCaptain_1109736340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1109736340L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasRaid()Z", cancellable = true)
    private void hasRaid_1109736340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1109736340L))
            info.setReturnValue(true);
    }


}
