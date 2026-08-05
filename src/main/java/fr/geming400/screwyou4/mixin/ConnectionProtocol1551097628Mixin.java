package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.ConnectionProtocol.class)
public class ConnectionProtocol1551097628Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/ConnectionProtocol;", cancellable = true)
    private static void values__1010930322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1010930322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/ConnectionProtocol;", cancellable = true)
    private static void valueOf__1592958923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592958923L))
            info.setReturnValue(net.minecraft.network.ConnectionProtocol.LOGIN);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_1892259200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1892259200L))
            info.setReturnValue(":fc!\u2DE6TSRg!a`NSG+01");
    }


}
