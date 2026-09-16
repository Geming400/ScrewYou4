package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.modifier.AttributeModifier.OverrideModifier.class)
public class OverrideModifier1716170284Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_807544016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807544016L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1808373487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808373487L))
            info.setReturnValue("t-LXZ\u8D2Fjrp7UNX6)|0[\u75EE\"Ph ZY\u99AED1q<\uD5B8\u9946fF_A-R\"ttx/ciQP)?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2021444921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021444921L))
            info.setReturnValue(-1471300942);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void apply_754044029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(754044029L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "argumentCodec(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private void argumentCodec_1513192681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1513192681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "argumentKeyframeLerp(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lnet/minecraft/world/attribute/LerpFunction;", cancellable = true)
    private void argumentKeyframeLerp__382249433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-382249433L))
            info.setReturnValue(null);
    }


}
