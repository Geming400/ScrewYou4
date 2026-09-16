package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityExactDataComponentsPredicate.class)
public class EntityExactDataComponentsPredicate466599393Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__442026875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442026875L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1237022918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237022918L))
            info.setReturnValue("9pIO+0|;,HCS4`LqlFCeJ,JpgX\u468E(VR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1023951484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1023951484L))
            info.setReturnValue(-136021803);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_1816908327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816908327L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/core/component/DataComponentExactPredicate;", cancellable = true)
    private void predicate__932744983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932744983L))
            info.setReturnValue(null);
    }


}
