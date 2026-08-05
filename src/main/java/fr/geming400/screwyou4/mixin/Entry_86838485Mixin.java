package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.EnvironmentAttributeMap.Entry.class)
public class Entry_86838485Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1472350743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472350743L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1048621491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048621491L))
            info.setReturnValue("D{Bl$XtR\uAA27\u2D58-z-e`7|n[%6mq\u1A18WA!tFZ\u7158zd\u9503\u0ED4+\uA4ADMwH\u806D(? [ag?Q\uBC6F\uB969@4N\"Un_8@Np|\uAE7EJ$*x u\u8CEB\u2686w6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_125101226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(125101226L))
            info.setReturnValue(-355007517);
    }

    @Inject(at = @At("HEAD"), method = "argument()Ljava/lang/Object;", cancellable = true)
    private void argument_1946030703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946030703L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "modifier()Lnet/minecraft/world/attribute/modifier/AttributeModifier;", cancellable = true)
    private void modifier_1758275939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758275939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyModifier(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void applyModifier_98916435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98916435L))
            info.setReturnValue(new java.lang.Object());
    }


}
