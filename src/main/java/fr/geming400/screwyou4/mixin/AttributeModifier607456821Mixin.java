package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeModifier.class)
public class AttributeModifier607456821Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__301169447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301169447L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1377880346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377880346L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1164808912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164808912L))
            info.setReturnValue(600105624);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1985321065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985321065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void is_628034186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628034186L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "amount()D", cancellable = true)
    private void amount__656476162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-656476162L))
            info.setReturnValue(8.288239000948837E8D);
    }

    @Inject(at = @At("HEAD"), method = "operation()Lnet/minecraft/world/entity/ai/attributes/AttributeModifier$Operation;", cancellable = true)
    private void operation_2104014304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104014304L))
            info.setReturnValue(net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation.ADD_VALUE);
    }


}
