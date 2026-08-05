package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.TargetedEntityPredicate.class)
public class TargetedEntityPredicate_375520666Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1761032924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1761032924L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__759939310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759939310L))
            info.setReturnValue("ey@\u1726");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_413783407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413783407L))
            info.setReturnValue(816188186);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1578671246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1578671246L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "targetedEntity()Lnet/minecraft/advancements/predicates/entity/EntityPredicate;", cancellable = true)
    private void targetedEntity__2109172748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109172748L))
            info.setReturnValue(null);
    }


}
