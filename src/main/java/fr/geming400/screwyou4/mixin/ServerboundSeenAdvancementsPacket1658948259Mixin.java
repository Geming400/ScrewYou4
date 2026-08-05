package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSeenAdvancementsPacket.class)
public class ServerboundSeenAdvancementsPacket1658948259Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1814815849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814815849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1998658863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1998658863L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1363236396(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1363236396L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "closedScreen()Lnet/minecraft/network/protocol/game/ServerboundSeenAdvancementsPacket;", cancellable = true)
    private static void closedScreen_721994833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(721994833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTab()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTab__1593068727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593068727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openedTab(Lnet/minecraft/advancements/AdvancementHolder;)Lnet/minecraft/network/protocol/game/ServerboundSeenAdvancementsPacket;", cancellable = true)
    private static void openedTab_972129192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(972129192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAction()Lnet/minecraft/network/protocol/game/ServerboundSeenAdvancementsPacket$Action;", cancellable = true)
    private void getAction__1376797511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1376797511L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundSeenAdvancementsPacket.Action.CLOSED_SCREEN);
    }


}
