package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket.class)
public class ClientboundCustomChatCompletionsPacket895240469Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__783784619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783784619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2014214568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2014214568L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__240219506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-240219506L))
            info.setReturnValue("r!$]T'漫egS'4尲%kRb&gc^GY扩N0{izp瑊ഢ_蘅㰗J<6B[%k脜٫gx{FY_}Xz8M儙먹");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_933503211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(933503211L))
            info.setReturnValue(1640991212);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__1773390011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773390011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/protocol/game/ClientboundCustomChatCompletionsPacket$Action;", cancellable = true)
    private void action_895288893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(895288893L))
            info.setReturnValue(net.minecraft.network.protocol.game.ClientboundCustomChatCompletionsPacket.Action.ADD);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1573309382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1573309382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1092748003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1092748003L))
            info.cancel();
    }


}
