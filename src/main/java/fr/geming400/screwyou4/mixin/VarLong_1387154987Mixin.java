package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.VarLong.class)
public class VarLong_1387154987Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/buffer/ByteBuf;J)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private static void write_1345103210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345103210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lio/netty/buffer/ByteBuf;)J", cancellable = true)
    private static void read_771722596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771722596L))
            info.setReturnValue(6832360556675420671L);
    }

    @Inject(at = @At("HEAD"), method = "hasContinuationBit(B)Z", cancellable = true)
    private static void hasContinuationBit__358852313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358852313L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getByteSize(J)I", cancellable = true)
    private static void getByteSize_1531156577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1531156577L))
            info.setReturnValue(-252378285);
    }


}
