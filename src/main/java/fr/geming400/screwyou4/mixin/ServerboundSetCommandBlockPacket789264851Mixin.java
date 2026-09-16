package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetCommandBlockPacket.class)
public class ServerboundSetCommandBlockPacket789264851Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_945132441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945132441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAutomatic()Z", cancellable = true)
    private void isAutomatic_422332425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422332425L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_493552988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(493552988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1426625025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1426625025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMode()Lnet/minecraft/world/level/block/entity/CommandBlockEntity$Mode;", cancellable = true)
    private void getMode_737053894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(737053894L))
            info.setReturnValue(net.minecraft.world.level.block.entity.CommandBlockEntity.Mode.REDSTONE);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_1278830582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278830582L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCommand()Ljava/lang/String;", cancellable = true)
    private void getCommand_181135025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181135025L))
            info.setReturnValue("E2B|7:\uC419c+i( =N_+mV\uB2A6'uE.9U<U+O\u1DA65uPl\uB767l$\uD0B0QF*e\u2EC7g4tzX\u44A7DG'c=9V%K$T,(\u5DA1dr;l,]L0Pfa2n6\u3220b`PJ5s");
    }

    @Inject(at = @At("HEAD"), method = "isConditional()Z", cancellable = true)
    private void isConditional__959081970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-959081970L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isTrackOutput()Z", cancellable = true)
    private void isTrackOutput_1255405096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255405096L))
            info.setReturnValue(true);
    }


}
