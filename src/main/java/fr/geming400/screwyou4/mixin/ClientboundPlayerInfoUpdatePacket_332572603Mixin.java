package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket.class)
public class ClientboundPlayerInfoUpdatePacket_332572603Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_488440192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488440192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1102995631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102995631L))
            info.setReturnValue(",!R`\uB73Dy?\u954E(*:!xK8|\u49057\u3330H\u7CB6");
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_629486202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629486202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_36860739(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(36860739L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1258904992(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1258904992L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "actions()Ljava/util/EnumSet;", cancellable = true)
    private void actions__28126432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28126432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newEntries()Ljava/util/List;", cancellable = true)
    private void newEntries__2092667718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2092667718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPlayerInitializing(Ljava/util/Collection;)Lnet/minecraft/network/protocol/game/ClientboundPlayerInfoUpdatePacket;", cancellable = true)
    private static void createPlayerInitializing__711449531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711449531L))
            info.setReturnValue(null);
    }


}
