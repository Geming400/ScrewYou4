package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.modifier.BooleanModifier.class)
public class BooleanModifier1344907361Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/attribute/modifier/BooleanModifier;", cancellable = true)
    private static void values_268591189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268591189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/attribute/modifier/BooleanModifier;", cancellable = true)
    private static void valueOf__1603034158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1603034158L))
            info.setReturnValue(net.minecraft.world.attribute.modifier.BooleanModifier.NOR);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void apply__282918780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-282918780L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/Boolean;", cancellable = true)
    private void apply_381623601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(381623601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "argumentCodec(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private void argumentCodec_1188989637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188989637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "argumentKeyframeLerp(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lnet/minecraft/world/attribute/LerpFunction;", cancellable = true)
    private void argumentKeyframeLerp__1114862342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1114862342L))
            info.setReturnValue(null);
    }


}
