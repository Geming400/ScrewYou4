package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.VarInt.class)
public class VarInt1956009278Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/buffer/ByteBuf;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private static void write__1119170884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1119170884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lio/netty/buffer/ByteBuf;)I", cancellable = true)
    private static void read__1402035807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1402035807L))
            info.setReturnValue(173761269);
    }

    @Inject(at = @At("HEAD"), method = "hasContinuationBit(B)Z", cancellable = true)
    private static void hasContinuationBit__1131501601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1131501601L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getByteSize(I)I", cancellable = true)
    private static void getByteSize__1125053291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1125053291L))
            info.setReturnValue(108056931);
    }


}
