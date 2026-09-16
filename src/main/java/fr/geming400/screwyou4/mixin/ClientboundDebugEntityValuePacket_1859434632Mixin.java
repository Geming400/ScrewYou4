package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDebugEntityValuePacket.class)
public class ClientboundDebugEntityValuePacket_1859434632Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2015302221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015302221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_950808363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950808363L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1665109140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1665109140L))
            info.setReturnValue("3]qm[a:\"{\uF9FE)3<e5$-.AmC-9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1878180574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878180574L))
            info.setReturnValue(-748366549);
    }

    @Inject(at = @At("HEAD"), method = "update()Lnet/minecraft/util/debug/DebugSubscription$Update;", cancellable = true)
    private void update__1872152176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1872152176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1563722768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1563722768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_267957037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(267957037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId__1952474929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952474929L))
            info.setReturnValue(1674708078);
    }


}
