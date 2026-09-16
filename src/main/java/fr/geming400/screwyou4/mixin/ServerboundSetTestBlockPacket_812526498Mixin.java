package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetTestBlockPacket.class)
public class ServerboundSetTestBlockPacket_812526498Mixin {
        @Inject(at = @At("HEAD"), method = "mode()Lnet/minecraft/world/level/block/state/properties/TestBlockMode;", cancellable = true)
    private void mode__1873485836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1873485836L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.TestBlockMode.LOG);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_968394087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968394087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__96099771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96099771L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1582950022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582950022L))
            info.setReturnValue("l*sz");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1369878588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1369878588L))
            info.setReturnValue(1116905495);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void position__1282518759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282518759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "message()Ljava/lang/String;", cancellable = true)
    private void message__624518159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624518159L))
            info.setReturnValue("\uBC6BLvcZ\uA37AQGf\uD298\uA26C[KFb0z.x|&Ep");
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1449886671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1449886671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_516814634(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(516814634L))
            info.cancel();
    }


}
