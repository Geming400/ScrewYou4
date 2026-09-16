package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.LegacyProtocolUtils.class)
public class LegacyProtocolUtils920555874Mixin {
        @Inject(at = @At("HEAD"), method = "writeLegacyString(Lio/netty/buffer/ByteBuf;Ljava/lang/String;)V", cancellable = true)
    private static void writeLegacyString__1064183787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1064183787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readLegacyString(Lio/netty/buffer/ByteBuf;)Ljava/lang/String;", cancellable = true)
    private static void readLegacyString__1795385586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1795385586L))
            info.setReturnValue("D\u0515\u942B\u165B{t!Je/\u0A41\u40DFN`z3{-*NR^ovFb1e,2L$_&V\u507D!7C-I!,d`F\"0<P\u96B1a8lV->@}XVp.sf\u667ESUN(?");
    }


}
