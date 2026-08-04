package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.metrics.storage.MetricsPersister.class)
public class MetricsPersister1658627664Mixin {
        @Inject(at = @At("HEAD"), method = "saveReports(Ljava/util/Set;Ljava/util/Map;Lnet/minecraft/util/profiling/ProfileResults;)Ljava/nio/file/Path;", cancellable = true)
    private void saveReports_1512100876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512100876L))
            info.setReturnValue(null);
    }


}
