package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.eventlog.EventLogDirectory.FileList.class)
public class FileList987709065Mixin {
        @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1673179433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1673179433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stream()Ljava/util/stream/Stream;", cancellable = true)
    private void stream_250019710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250019710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ids()Ljava/util/Set;", cancellable = true)
    private void ids__198762765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-198762765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prune(Ljava/time/LocalDate;I)Lnet/minecraft/util/eventlog/EventLogDirectory$FileList;", cancellable = true)
    private void prune_1141322676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141322676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compressAll()Lnet/minecraft/util/eventlog/EventLogDirectory$FileList;", cancellable = true)
    private void compressAll_733585583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(733585583L))
            info.setReturnValue(null);
    }


}
