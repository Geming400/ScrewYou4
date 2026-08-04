package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.eventlog.EventLogDirectory.FileList.class)
public class FileList987709065Mixin {
        @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1163906967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163906967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stream()Ljava/util/stream/Stream;", cancellable = true)
    private void stream_777002750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777002750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ids()Ljava/util/Set;", cancellable = true)
    private void ids__841326421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-841326421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prune(Ljava/time/LocalDate;I)Lnet/minecraft/util/eventlog/EventLogDirectory$FileList;", cancellable = true)
    private void prune__730170742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-730170742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compressAll()Lnet/minecraft/util/eventlog/EventLogDirectory$FileList;", cancellable = true)
    private void compressAll__104329648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104329648L))
            info.setReturnValue(null);
    }


}
