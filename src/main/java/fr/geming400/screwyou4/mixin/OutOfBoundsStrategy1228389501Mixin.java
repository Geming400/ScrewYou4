package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ByIdMap.OutOfBoundsStrategy.class)
public class OutOfBoundsStrategy1228389501Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/ByIdMap$OutOfBoundsStrategy;", cancellable = true)
    private static void values__42987166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42987166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/ByIdMap$OutOfBoundsStrategy;", cancellable = true)
    private static void valueOf__393797153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-393797153L))
            info.setReturnValue(net.minecraft.util.ByIdMap.OutOfBoundsStrategy.CLAMP);
    }


}
