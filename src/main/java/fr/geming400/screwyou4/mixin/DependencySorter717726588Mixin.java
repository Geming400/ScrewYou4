package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.DependencySorter.class)
public class DependencySorter717726588Mixin {
        @Inject(at = @At("HEAD"), method = "addEntry(Ljava/lang/Object;Lnet/minecraft/util/DependencySorter$Entry;)Lnet/minecraft/util/DependencySorter;", cancellable = true)
    private void addEntry__998628049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998628049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orderByDependencies(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void orderByDependencies__1020424302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1020424302L))
            info.cancel();
    }


}
