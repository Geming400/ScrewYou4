package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.PeriodicEntityTickPredicate.class)
public class PeriodicEntityTickPredicate_1307007170Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_398380901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398380901L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2077430694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077430694L))
            info.setReturnValue("tZ:6>Otc.ds\u7FF3\uFBE3|'2\u507A8:cAn@$O\u6B29d\uB448k3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1864359260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1864359260L))
            info.setReturnValue(1232731138);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1637651193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637651193L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "periodicTick()I", cancellable = true)
    private void periodicTick__1533960497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1533960497L))
            info.setReturnValue(617428029);
    }


}
