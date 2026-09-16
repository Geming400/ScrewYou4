package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTestInstanceBlockStatus.class)
public class ClientboundTestInstanceBlockStatus231917591Mixin {
        @Inject(at = @At("HEAD"), method = "size()Ljava/util/Optional;", cancellable = true)
    private void size__717592890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-717592890L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_387785181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(387785181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__676708677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-676708677L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1002341116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1002341116L))
            info.setReturnValue("|bPmDHK\u9B67\uD233\u8C194nTGc}il?fb%if}%;i#v[v<MPX\uA531XdC'#+1x!Q#\uD24Bf\u5529c4tI|..{_{jzb%JvQ^\u46F8\u7EE5ahJ\u31C3k\u275B\u981DBJH%J0\u54DBy@(C3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_789269682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789269682L))
            info.setReturnValue(-1694995704);
    }

    @Inject(at = @At("HEAD"), method = "status()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void status_654805532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(654805532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__63794272(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-63794272L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1359560003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1359560003L))
            info.cancel();
    }


}
