package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.Utf8String.class)
public class Utf8String1601273176Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lio/netty/buffer/ByteBuf;Ljava/lang/CharSequence;I)V", cancellable = true)
    private static void write_158863540(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(158863540L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lio/netty/buffer/ByteBuf;I)Ljava/lang/String;", cancellable = true)
    private static void read_669143643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669143643L))
            info.setReturnValue("\u3893ppZ4x]7$#r*EU\uD288uVpI<ll6At\uA56B#*<@+k%U\u2105Q!\uC6D7x)xo\u061BHi'WL}J(vx$4\uAB94}7R.-5P>\u73EDz");
    }


}
