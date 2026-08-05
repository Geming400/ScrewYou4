package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.LegacyProtocolUtils.class)
public class LegacyProtocolUtils920555874Mixin {
        @Inject(at = @At("HEAD"), method = "readLegacyString(Lio/netty/buffer/ByteBuf;)Ljava/lang/String;", cancellable = true)
    private static void readLegacyString_1539536638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539536638L))
            info.setReturnValue("EA館9MHSo.fyxz_[b뿐ZJꑪ|[9&U/[KDA8;");
    }

    @Inject(at = @At("HEAD"), method = "writeLegacyString(Lio/netty/buffer/ByteBuf;Ljava/lang/String;)V", cancellable = true)
    private static void writeLegacyString_626013020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(626013020L))
            info.cancel();
    }


}
