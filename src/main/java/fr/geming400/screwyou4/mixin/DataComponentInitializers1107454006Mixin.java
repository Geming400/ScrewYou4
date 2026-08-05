package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentInitializers.class)
public class DataComponentInitializers1107454006Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/component/DataComponentInitializers$Initializer;)V", cancellable = true)
    private void add_1018370569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1018370569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/core/HolderLookup$Provider;)Ljava/util/List;", cancellable = true)
    private void build_1680260088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680260088L))
            info.setReturnValue(null);
    }


}
