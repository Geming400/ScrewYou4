package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerInfoRemovePacket.class)
public class ClientboundPlayerInfoRemovePacket1497771280Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__181253808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-181253808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1411683757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1411683757L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_362311305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(362311305L))
            info.setReturnValue("*jt{hR^Cx&iX\u55CEz%]p'p\u3942\u27CA8|w+zk9]=Og\u5BE1\u74ADm)e9<]F6P\uD3FEf&;\u5516ySS0BCYxT'@o;,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1536034022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536034022L))
            info.setReturnValue(995126759);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1695278814(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1695278814L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2119127103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2119127103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "profileIds()Ljava/util/List;", cancellable = true)
    private void profileIds__1170859200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1170859200L))
            info.setReturnValue(null);
    }


}
