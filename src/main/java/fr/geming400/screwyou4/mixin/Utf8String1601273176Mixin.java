package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.Utf8String.class)
public class Utf8String1601273176Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/buffer/ByteBuf;Ljava/lang/CharSequence;I)V", cancellable = true)
    private static void write_2113804147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2113804147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lio/netty/buffer/ByteBuf;I)Ljava/lang/String;", cancellable = true)
    private static void read__1266500411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1266500411L))
            info.setReturnValue(",}\u46E1h@Q\uB573;{^%P%==Ktn|");
    }


}
