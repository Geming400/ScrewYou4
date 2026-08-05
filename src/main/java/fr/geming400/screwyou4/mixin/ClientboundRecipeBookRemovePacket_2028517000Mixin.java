package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRecipeBookRemovePacket.class)
public class ClientboundRecipeBookRemovePacket_2028517000Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_349491911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(349491911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__880938038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-880938038L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_893057024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(893057024L))
            info.setReturnValue("Qj_U?br3\"*x콏N)#讣h\"喙dT2*csm뾶g<ਜ2_독{햨6Xy뮬>lid06 :F}nu#.^Z(UJLe5䶽J鼟nb}4PuN滛.&`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2066779741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2066779741L))
            info.setReturnValue(917807027);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1588381384(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1588381384L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__2068942763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2068942763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recipes()Ljava/util/List;", cancellable = true)
    private void recipes__640113481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-640113481L))
            info.setReturnValue(null);
    }


}
