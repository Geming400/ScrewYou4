package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.TargetedEntityPredicate.class)
public class TargetedEntityPredicate_375520666Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__533105603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533105603L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1145944190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145944190L))
            info.setReturnValue("O\u969E4Tr?\uB21C#\uB59A4$p\u0D03\"O\u42E5<8b{;Z1$1dl>e+>z?+Kb &#hTMx[/_1\u5822\"j\u5719Hd\u6EEAA\uFC64\uD615KaIi8HJ{)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_932872756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932872756L))
            info.setReturnValue(1525372560);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_1725829599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1725829599L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "targetedEntity()Lnet/minecraft/advancements/predicates/entity/EntityPredicate;", cancellable = true)
    private void targetedEntity_693617959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693617959L))
            info.setReturnValue(null);
    }


}
