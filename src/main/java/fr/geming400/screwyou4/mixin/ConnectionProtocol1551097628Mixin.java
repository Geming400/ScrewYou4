package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.ConnectionProtocol.class)
public class ConnectionProtocol1551097628Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/ConnectionProtocol;", cancellable = true)
    private static void values__1827394864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827394864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/ConnectionProtocol;", cancellable = true)
    private static void valueOf__1628660467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1628660467L))
            info.setReturnValue(net.minecraft.network.ConnectionProtocol.HANDSHAKING);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_415637157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415637157L))
            info.setReturnValue("\u8968*/-. Mys,s");
    }


}
