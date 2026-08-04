package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.PeriodicEntityTickPredicate.class)
public class PeriodicEntityTickPredicate_1307007170Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1602447868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1602447868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_171547194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(171547194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1345269911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345269911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__647184742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-647184742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "periodicTick()I", cancellable = true)
    private void periodicTick_1345269415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345269415L))
            info.setReturnValue(null);
    }


}
