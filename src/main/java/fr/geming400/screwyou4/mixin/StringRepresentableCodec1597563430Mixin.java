package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.StringRepresentable.StringRepresentableCodec.class)
public class StringRepresentableCodec1597563430Mixin {
        @Inject(at = @At("HEAD"), method = "decode(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void decode_1279085287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1279085287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/lang/Object;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_705321867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705321867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Lnet/minecraft/util/StringRepresentable;Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void encode_2144525488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144525488L))
            info.setReturnValue(null);
    }


}
