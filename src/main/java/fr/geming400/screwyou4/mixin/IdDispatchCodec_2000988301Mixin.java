package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.codec.IdDispatchCodec.class)
public class IdDispatchCodec_2000988301Mixin {
        @Inject(at = @At("HEAD"), method = "decode(Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void decode_2013195211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013195211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decode(Lio/netty/buffer/ByteBuf;)Ljava/lang/Object;", cancellable = true)
    private void decode_1319654210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1319654210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encode(Ljava/lang/Object;Ljava/lang/Object;)V", cancellable = true)
    private void encode_1960657719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1960657719L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "encode(Lio/netty/buffer/ByteBuf;Ljava/lang/Object;)V", cancellable = true)
    private void encode_1939591968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1939591968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "builder(Ljava/util/function/Function;)Lnet/minecraft/network/codec/IdDispatchCodec$Builder;", cancellable = true)
    private static void builder_483249606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(483249606L))
            info.setReturnValue(null);
    }


}
