package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.BundlePredicate.class)
public class BundlePredicate675089079Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2060601338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060601338L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__460370896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-460370896L))
            info.setReturnValue("⎫磔1a⓾v/\"Sx1!C?ᇪi.*O秱]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_713351821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(713351821L))
            info.setReturnValue(762024719);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType_1943407942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943407942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches_2060729802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060729802L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/BundleContents;)Z", cancellable = true)
    private void matches_2014555692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2014555692L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/Optional;", cancellable = true)
    private void items_920550501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920550501L))
            info.setReturnValue(null);
    }


}
