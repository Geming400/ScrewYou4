package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundResetScorePacket.class)
public class ClientboundResetScorePacket1926027072Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2081894662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081894662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1017400804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1017400804L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1598516699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1598516699L))
            info.setReturnValue("M^i@[.t8N1\u5657'Ey4`,{\"Y/t=-JKl'[R;^\u7F36mq-*wfru?7&7+<JD\u1D9E/j[Lgc`E_-\"5b\u4CE5oH6$h\u7A28RK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1811588133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811588133L))
            info.setReturnValue(1490906499);
    }

    @Inject(at = @At("HEAD"), method = "owner()Ljava/lang/String;", cancellable = true)
    private void owner_683651388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(683651388L))
            info.setReturnValue("S[zTk\u73310 X)u@?\u2FC2h>\u4D602\u6D6Dfv[6Tux;0uhQ{t2Tl6^\u39E75P6ff\u2E49,z5zVoN5]#PD$oQZ\u9D30+Y");
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1630315209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1630315209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_334549478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(334549478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "objectiveName()Ljava/lang/String;", cancellable = true)
    private void objectiveName_800921389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(800921389L))
            info.setReturnValue("9\u5313Rogt\u3C7Ew#e]<%LC$`+wruMX%7f7:'");
    }


}
