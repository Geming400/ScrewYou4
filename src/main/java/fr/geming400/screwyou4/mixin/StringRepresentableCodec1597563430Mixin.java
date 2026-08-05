package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.StringRepresentable.StringRepresentableCodec.class)
public class StringRepresentableCodec1597563430Mixin {
        @Inject(at = @At("HEAD"), method = "decode(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void decode_90584277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(90584277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/lang/Object;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_941226017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941226017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Lnet/minecraft/util/StringRepresentable;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode__1156234042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156234042L))
            info.setReturnValue(null);
    }


}
