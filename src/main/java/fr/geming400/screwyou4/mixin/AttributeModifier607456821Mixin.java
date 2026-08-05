package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeModifier.class)
public class AttributeModifier607456821Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1992969080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1992969080L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__528003154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528003154L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_645719563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645719563L))
            info.setReturnValue(-2010474745);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1835609732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1835609732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void is__886980492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886980492L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "amount()D", cancellable = true)
    private void amount_645714262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645714262L))
            info.setReturnValue(5.572893006595991E8D);
    }

    @Inject(at = @At("HEAD"), method = "operation()Lnet/minecraft/world/entity/ai/attributes/AttributeModifier$Operation;", cancellable = true)
    private void operation__836178631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-836178631L))
            info.setReturnValue(net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_VALUE);
    }


}
