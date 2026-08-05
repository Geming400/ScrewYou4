package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ByIdMap.class)
public class ByIdMap1069770492Mixin {
        @Inject(at = @At("HEAD"), method = "sparse(Ljava/util/function/ToIntFunction;[Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/function/IntFunction;", cancellable = true)
    private static void sparse__1888727479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1888727479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "continuous(Ljava/util/function/ToIntFunction;[Ljava/lang/Object;Lnet/minecraft/util/ByIdMap$OutOfBoundsStrategy;)Ljava/util/function/IntFunction;", cancellable = true)
    private static void continuous_1553519681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1553519681L))
            info.setReturnValue(null);
    }


}
