package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChunkBatchReceivedPacket.class)
public class ServerboundChunkBatchReceivedPacket_639308269Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_795175858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795175858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__269318000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-269318000L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1409731793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1409731793L))
            info.setReturnValue("I_9m#grZM?U9L>t}h}t;m,E5dQqIuJj+1.{&Jj G?\u2E8F;*\uBC67\u55D3S4C\u087CZ\u1EAE\u033A\uBD25g\u428CT/\u08C9m8:Y{>\u26F5T%J6w+F8#W<.|,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1196660359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1196660359L))
            info.setReturnValue(340900333);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1276668442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1276668442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_343596405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(343596405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "desiredChunksPerTick()F", cancellable = true)
    private void desiredChunksPerTick__501726347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501726347L))
            info.setReturnValue(3.494544E8F);
    }


}
