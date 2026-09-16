package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChangeDifficultyPacket.class)
public class ServerboundChangeDifficultyPacket_1173407856Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1329275445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329275445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_264781587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264781587L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1943831380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943831380L))
            info.setReturnValue("'h\u9ABFkR]|,t^WHibN_d0eXt\u2790T}Y\"3U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1730759946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730759946L))
            info.setReturnValue(994334400);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_877695992(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(877695992L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1810768029(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1810768029L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "difficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void difficulty_1380128972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1380128972L))
            info.setReturnValue(net.minecraft.world.Difficulty.EASY);
    }


}
