package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.modifier.AttributeModifier.OverrideModifier.class)
public class OverrideModifier1716170284Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1193284753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1193284753L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_580710309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(580710309L))
            info.setReturnValue("3丁Q4S삃R1s%;elN65Q䤺h3墪d8^U;rnw}a#㼲");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1754433026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754433026L))
            info.setReturnValue(-167195262);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void apply_88215183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88215183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "argumentCodec(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private void argumentCodec_1560252560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1560252560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "argumentKeyframeLerp(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lnet/minecraft/world/attribute/LerpFunction;", cancellable = true)
    private void argumentKeyframeLerp__743599419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743599419L))
            info.setReturnValue(null);
    }


}
