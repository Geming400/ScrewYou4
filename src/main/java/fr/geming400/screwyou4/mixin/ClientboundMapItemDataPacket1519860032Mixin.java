package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMapItemDataPacket.class)
public class ClientboundMapItemDataPacket1519860032Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1675727622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675727622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_611233764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611233764L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2004683739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2004683739L))
            info.setReturnValue("*q\u7F1F?r\u9818Q6f(Urk\uB2BE:'iCYqQP(e8F^l<\u2BFC\u3F45G+\u7866<sO%njeGt+\u8458\u4EA8-kR\u124A<UY/+'{\u65A0vz\u1324t6z{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2077212123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077212123L))
            info.setReturnValue(-14025849);
    }

    @Inject(at = @At("HEAD"), method = "scale()B", cancellable = true)
    private void scale__903861803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-903861803L))
            info.setReturnValue(76);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1224148169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1224148169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__71617562(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-71617562L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "colorPatch()Ljava/util/Optional;", cancellable = true)
    private void colorPatch__87330157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-87330157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapId()Lnet/minecraft/world/level/saveddata/maps/MapId;", cancellable = true)
    private void mapId__267098004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-267098004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "locked()Z", cancellable = true)
    private void locked_1682010669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682010669L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "decorations()Ljava/util/Optional;", cancellable = true)
    private void decorations__2130333775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2130333775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyToMap(Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)V", cancellable = true)
    private void applyToMap__2049192547(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2049192547L))
            info.cancel();
    }


}
