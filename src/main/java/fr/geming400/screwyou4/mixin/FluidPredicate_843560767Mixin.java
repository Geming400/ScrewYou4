package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.FluidPredicate.class)
public class FluidPredicate_843560767Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__65065502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-65065502L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1613984291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613984291L))
            info.setReturnValue(" !\u9A8Bu=x+\u4FC0}u\u1003c=}\"/,z|M!lUFGK\uA164+\u3515\u6AF8V=\u3749P'^BGVl+J\u4E45\u7516=HP>yi3\uD5716S/m");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1400912857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1400912857L))
            info.setReturnValue(861325786);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void matches_348773387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348773387L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "properties()Ljava/util/Optional;", cancellable = true)
    private void properties__1564537569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1564537569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluids()Ljava/util/Optional;", cancellable = true)
    private void fluids__1614201387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1614201387L))
            info.setReturnValue(null);
    }


}
