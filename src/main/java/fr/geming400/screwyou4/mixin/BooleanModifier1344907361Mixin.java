package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.modifier.BooleanModifier.class)
public class BooleanModifier1344907361Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/attribute/modifier/BooleanModifier;", cancellable = true)
    private static void values__704858509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-704858509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/attribute/modifier/BooleanModifier;", cancellable = true)
    private static void valueOf__1765031686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1765031686L))
            info.setReturnValue(net.minecraft.world.attribute.modifier.BooleanModifier.NAND);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void apply_382910066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382910066L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/Boolean;", cancellable = true)
    private void apply_1929801859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1929801859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "argumentCodec(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private void argumentCodec_1141929758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141929758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "argumentKeyframeLerp(Lnet/minecraft/world/attribute/EnvironmentAttribute;)Lnet/minecraft/world/attribute/LerpFunction;", cancellable = true)
    private void argumentKeyframeLerp__753512356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-753512356L))
            info.setReturnValue(null);
    }


}
