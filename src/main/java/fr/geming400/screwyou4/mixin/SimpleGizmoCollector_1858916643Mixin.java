package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.SimpleGizmoCollector.class)
public class SimpleGizmoCollector_1858916643Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/gizmos/Gizmo;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private void add_596991118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(596991118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "drainGizmos()Ljava/util/List;", cancellable = true)
    private void drainGizmos__809713838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809713838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTemporaryGizmos(Ljava/util/Collection;)V", cancellable = true)
    private void addTemporaryGizmos__984729722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-984729722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGizmos()Ljava/util/List;", cancellable = true)
    private void getGizmos__809713838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-809713838L))
            info.setReturnValue(null);
    }


}
