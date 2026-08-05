package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMapItemDataPacket.class)
public class ClientboundMapItemDataPacket1519860032Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__159165056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159165056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1389595005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389595005L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_384400057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384400057L))
            info.setReturnValue(" g䛖=ၫDd쟼u젟,k'],O]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1558122774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558122774L))
            info.setReturnValue(-319717328);
    }

    @Inject(at = @At("HEAD"), method = "scale()B", cancellable = true)
    private void scale_1558115551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558115551L))
            info.setReturnValue(43);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2097038351(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2097038351L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1717367566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1717367566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyToMap(Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)V", cancellable = true)
    private void applyToMap_1463753610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1463753610L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "colorPatch()Ljava/util/Optional;", cancellable = true)
    private void colorPatch_1765321454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765321454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapId()Lnet/minecraft/world/level/saveddata/maps/MapId;", cancellable = true)
    private void mapId__926060971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-926060971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorations()Ljava/util/Optional;", cancellable = true)
    private void decorations_1765321454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765321454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "locked()Z", cancellable = true)
    private void locked_1558138615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558138615L))
            info.setReturnValue(false);
    }


}
