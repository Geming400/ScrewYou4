package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.VarLong.class)
public class VarLong_1387154987Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/buffer/ByteBuf;J)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private static void write__994923479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-994923479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lio/netty/buffer/ByteBuf;)J", cancellable = true)
    private static void read__1970889138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1970889138L))
            info.setReturnValue(7237763472953225474L);
    }

    @Inject(at = @At("HEAD"), method = "getByteSize(J)I", cancellable = true)
    private static void getByteSize__1692984062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692984062L))
            info.setReturnValue(-257516013);
    }

    @Inject(at = @At("HEAD"), method = "hasContinuationBit(B)Z", cancellable = true)
    private static void hasContinuationBit__1700355893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1700355893L))
            info.setReturnValue(true);
    }


}
