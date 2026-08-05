package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSeenAdvancementsPacket.class)
public class ServerboundSeenAdvancementsPacket1658948259Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__20076829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-20076829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__209673735(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-209673735L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1957950124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1957950124L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTab()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTab__784118294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-784118294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openedTab(Lnet/minecraft/advancements/AdvancementHolder;)Lnet/minecraft/network/protocol/game/ServerboundSeenAdvancementsPacket;", cancellable = true)
    private static void openedTab_2062113940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2062113940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAction()Lnet/minecraft/network/protocol/game/ServerboundSeenAdvancementsPacket$Action;", cancellable = true)
    private void getAction_1710091917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710091917L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundSeenAdvancementsPacket.Action.CLOSED_SCREEN);
    }

    @Inject(at = @At("HEAD"), method = "closedScreen()Lnet/minecraft/network/protocol/game/ServerboundSeenAdvancementsPacket;", cancellable = true)
    private static void closedScreen_1119951945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119951945L))
            info.setReturnValue(null);
    }


}
