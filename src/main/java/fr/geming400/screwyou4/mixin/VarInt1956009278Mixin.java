package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.VarInt.class)
public class VarInt1956009278Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/buffer/ByteBuf;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private static void write_1220855805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220855805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lio/netty/buffer/ByteBuf;)I", cancellable = true)
    private static void read_1340575927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340575927L))
            info.setReturnValue(601058865);
    }

    @Inject(at = @At("HEAD"), method = "getByteSize(I)I", cancellable = true)
    private static void getByteSize_2099087348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2099087348L))
            info.setReturnValue(-1743317742);
    }

    @Inject(at = @At("HEAD"), method = "hasContinuationBit(B)Z", cancellable = true)
    private static void hasContinuationBit_210001979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(210001979L))
            info.setReturnValue(false);
    }


}
