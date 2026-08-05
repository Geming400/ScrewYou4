package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundBundleDelimiterPacket.class)
public class ClientboundBundleDelimiterPacket_1613750404Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1769617993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769617993L))
            info.setReturnValue(null);
    }


}
