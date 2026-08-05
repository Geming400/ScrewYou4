package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.DownloadQueue.BatchResult.class)
public class BatchResult_1288752602Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1620702436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620702436L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_153292626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153292626L))
            info.setReturnValue(",R>k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1327015343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327015343L))
            info.setReturnValue(-957491319);
    }

    @Inject(at = @At("HEAD"), method = "failed()Ljava/util/Set;", cancellable = true)
    private void failed__540282885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-540282885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "downloaded()Ljava/util/Map;", cancellable = true)
    private void downloaded__715871039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-715871039L))
            info.setReturnValue(null);
    }


}
