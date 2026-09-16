package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDamageEventPacket.class)
public class ClientboundDamageEventPacket_1706278702Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1862146291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862146291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_797652433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797652433L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1818265070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818265070L))
            info.setReturnValue("Wu\u7DAF{WuQl\"hM?\u9D63!:A=\u8352V`FN,4IkYu^j\uA76C\uD23EV[g.KvQLgyI\u9169tuLKCeY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2031336504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2031336504L))
            info.setReturnValue(-319966216);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1410566838(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1410566838L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_114801107(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(114801107L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sourceType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void sourceType__879406444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-879406444L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSource(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void getSource_1300385395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1300385395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourcePosition()Ljava/util/Optional;", cancellable = true)
    private void sourcePosition_55729983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(55729983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId__2105630859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2105630859L))
            info.setReturnValue(-1105833459);
    }

    @Inject(at = @At("HEAD"), method = "sourceDirectId()I", cancellable = true)
    private void sourceDirectId__1912668076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912668076L))
            info.setReturnValue(1394788256);
    }

    @Inject(at = @At("HEAD"), method = "sourceCauseId()I", cancellable = true)
    private void sourceCauseId__1483180054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1483180054L))
            info.setReturnValue(64981145);
    }


}
