package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ClientboundRegistryDataPacket.class)
public class ClientboundRegistryDataPacket_516273404Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_672140993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672140993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__392352865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-392352865L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1286696928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286696928L))
            info.setReturnValue("/D[Zf/dA\u3F1CQ\uB9CC5G1>O]Xfb_ZeKBj$%%\u6DF5C\u6B04Y\u9828x\u8929K\uFA4F\u92F11XI)?y^(G9b+04RF4=\uD14AQ`[7h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1073625494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073625494L))
            info.setReturnValue(-1150120096);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_813187003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813187003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_220561540(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(220561540L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ClientConfigurationPacketListener;)V", cancellable = true)
    private void handle_1014193065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1014193065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registry()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void registry__1666333041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1666333041L))
            info.setReturnValue(null);
    }


}
