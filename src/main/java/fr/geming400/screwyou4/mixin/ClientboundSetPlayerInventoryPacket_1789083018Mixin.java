package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetPlayerInventoryPacket.class)
public class ClientboundSetPlayerInventoryPacket_1789083018Mixin {
        @Inject(at = @At("HEAD"), method = "slot()I", cancellable = true)
    private void slot__1871857615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1871857615L))
            info.setReturnValue(1780779483);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1944950607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944950607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_880456749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880456749L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1735460754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1735460754L))
            info.setReturnValue("8\u1962L*RJk@\u5D92rC{GA2&mo;9N5DGQn&%2ZT\u1076`a4\"%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1948532188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1948532188L))
            info.setReturnValue(520466832);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1493371154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1493371154L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_197605423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(197605423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void contents__2070760761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070760761L))
            info.setReturnValue(null);
    }


}
