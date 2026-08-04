package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentInitializers.class)
public class DataComponentInitializers1107454006Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/component/DataComponentInitializers$Initializer;)V", cancellable = true)
    private void add__325510360(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-325510360L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "build(Lnet/minecraft/core/HolderLookup$Provider;)Ljava/util/List;", cancellable = true)
    private void build_1675010570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675010570L))
            info.setReturnValue(null);
    }


}
