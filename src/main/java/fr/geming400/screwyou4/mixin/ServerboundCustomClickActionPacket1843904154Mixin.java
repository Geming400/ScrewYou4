package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundCustomClickActionPacket.class)
public class ServerboundCustomClickActionPacket1843904154Mixin {
        @Inject(at = @At("HEAD"), method = "payload()Ljava/util/Optional;", cancellable = true)
    private void payload_857524182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857524182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1999771744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999771744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_935277886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(935277886L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1680639617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1680639617L))
            info.setReturnValue("G^nHU\u5694\u5137x\u8D99<+?3eR$\u3BA6j2bdr,_/}|=NYdSc2.lF%8du5;1R51&yP_0j}1/V\u3879\u1340\uF98A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1893711051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1893711051L))
            info.setReturnValue(878995631);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__748873732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748873732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle_318262056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(318262056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1548192291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1548192291L))
            info.cancel();
    }


}
