package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChangeDifficultyPacket.class)
public class ServerboundChangeDifficultyPacket_1173407856Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__505617233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505617233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1736047182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736047182L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_37947880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(37947880L))
            info.setReturnValue("-u5R;iv\u19BFvf\u8115\u4439\u7E3A\uBADE__^\uB484;b\u4B5EELp5(X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1211670597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211670597L))
            info.setReturnValue(-2024561671);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1851476768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1851476768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__695214139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-695214139L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "difficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void difficulty_101655185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(101655185L))
            info.setReturnValue(net.minecraft.world.Difficulty.NORMAL);
    }


}
