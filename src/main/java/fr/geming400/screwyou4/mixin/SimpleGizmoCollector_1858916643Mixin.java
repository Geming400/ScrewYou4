package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gizmos.SimpleGizmoCollector.class)
public class SimpleGizmoCollector_1858916643Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/gizmos/Gizmo;)Lnet/minecraft/gizmos/GizmoProperties;", cancellable = true)
    private void add_827887727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(827887727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTemporaryGizmos(Ljava/util/Collection;)V", cancellable = true)
    private void addTemporaryGizmos__916701475(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-916701475L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "drainGizmos()Ljava/util/List;", cancellable = true)
    private void drainGizmos__1123393245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123393245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGizmos()Ljava/util/List;", cancellable = true)
    private void getGizmos__776381183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-776381183L))
            info.setReturnValue(null);
    }


}
