package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.SteppingOnPredicate.class)
public class SteppingOnPredicate_246700964Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__661925305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-661925305L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1017124488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017124488L))
            info.setReturnValue("b\u028DF2UUO@.NCMO/o*YAFa4nW\u976A\"F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_804053054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(804053054L))
            info.setReturnValue(-1099671039);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches_1597009897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597009897L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/advancements/predicates/LocationPredicate;", cancellable = true)
    private void predicate_284542009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(284542009L))
            info.setReturnValue(null);
    }


}
