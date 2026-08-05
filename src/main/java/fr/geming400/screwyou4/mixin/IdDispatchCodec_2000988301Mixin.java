package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.codec.IdDispatchCodec.class)
public class IdDispatchCodec_2000988301Mixin {
        @Inject(at = @At("HEAD"), method = "decode(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void decode_329545657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(329545657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decode(Lio/netty/buffer/ByteBuf;)Ljava/lang/Object;", cancellable = true)
    private void decode_370679700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370679700L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/lang/Object;Ljava/lang/Object;)V", cancellable = true)
    private void encode_1217877473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1217877473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "encode(Lio/netty/buffer/ByteBuf;Ljava/lang/Object;)V", cancellable = true)
    private void encode__1420735178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1420735178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "builder(Ljava/util/function/Function;)Lnet/minecraft/network/codec/IdDispatchCodec$Builder;", cancellable = true)
    private static void builder__1825312991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1825312991L))
            info.setReturnValue(null);
    }


}
