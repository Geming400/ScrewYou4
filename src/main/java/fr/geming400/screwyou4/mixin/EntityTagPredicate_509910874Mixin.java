package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.EntityTagPredicate.class)
public class EntityTagPredicate_509910874Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1895423132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895423132L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__625549102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625549102L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_548173615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548173615L))
            info.setReturnValue(-1140349977);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1444281038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1444281038L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/util/Set;)Z", cancellable = true)
    private void matches__34166011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34166011L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "noneOf()Ljava/util/Optional;", cancellable = true)
    private void noneOf_755372295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755372295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allOf()Ljava/util/Optional;", cancellable = true)
    private void allOf_755372295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755372295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anyOf()Ljava/util/Optional;", cancellable = true)
    private void anyOf_755372295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755372295L))
            info.setReturnValue(null);
    }


}
