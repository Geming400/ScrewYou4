package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.AttributeModifiersPredicate.class)
public class AttributeModifiersPredicate_1703280327Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()Ljava/util/Optional;", cancellable = true)
    private void modifiers__1800071952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1800071952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_794654058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794654058L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1821263445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1821263445L))
            info.setReturnValue("W#quo.p2o'Fvx^  s[zK$*rEUh");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2034334879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2034334879L))
            info.setReturnValue(-731860763);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__875172436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875172436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/component/ItemAttributeModifiers;)Z", cancellable = true)
    private void matches_2098968279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098968279L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "matches(Ljava/lang/Object;)Z", cancellable = true)
    private void matches_235142982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235142982L))
            info.setReturnValue(true);
    }


}
