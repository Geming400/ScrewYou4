package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundAttackPacket.class)
public class ServerboundAttackPacket_631403251Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1047621838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047621838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2016915509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2016915509L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__504056725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504056725L))
            info.setReturnValue("\")o礫΅o\"Oෛ0fjgL(5uui.w8SJt5)GU#&^JशN@뿈09_Uad>ID^!JxxY[[^q5|soy%狼qr?'s倘@h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_669665992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669665992L))
            info.setReturnValue(782219595);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1309472163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1309472163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1237218744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1237218744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_669665496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669665496L))
            info.setReturnValue(985367015);
    }


}
