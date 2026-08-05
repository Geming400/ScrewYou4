package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ByIdMap.OutOfBoundsStrategy.class)
public class OutOfBoundsStrategy1228389501Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/ByIdMap$OutOfBoundsStrategy;", cancellable = true)
    private static void values__2013698688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2013698688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/ByIdMap$OutOfBoundsStrategy;", cancellable = true)
    private static void valueOf_1975707399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1975707399L))
            info.setReturnValue(net.minecraft.util.ByIdMap.OutOfBoundsStrategy.ZERO);
    }


}
