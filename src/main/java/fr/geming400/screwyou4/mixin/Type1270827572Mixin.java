package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.HitResult.Type.class)
public class Type1270827572Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/phys/HitResult$Type;", cancellable = true)
    private static void values_1218539199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218539199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/phys/HitResult$Type;", cancellable = true)
    private static void valueOf__1848277224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848277224L))
            info.setReturnValue(net.minecraft.world.phys.HitResult.Type.ENTITY);
    }


}
