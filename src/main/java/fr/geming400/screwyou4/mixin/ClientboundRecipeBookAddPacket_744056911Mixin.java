package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRecipeBookAddPacket.class)
public class ClientboundRecipeBookAddPacket_744056911Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__934968178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934968178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2129569169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129569169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__391403065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391403065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_782319652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782319652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replace()Z", cancellable = true)
    private void replace_782335493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782335493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__1924573570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924573570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1422125823(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1422125823L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_941564444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(941564444L))
            info.cancel();
    }


}
