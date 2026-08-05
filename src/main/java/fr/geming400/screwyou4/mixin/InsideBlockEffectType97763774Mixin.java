package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.InsideBlockEffectType.class)
public class InsideBlockEffectType97763774Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/InsideBlockEffectType;", cancellable = true)
    private static void values_1447059514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447059514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/InsideBlockEffectType;", cancellable = true)
    private static void valueOf__139486207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-139486207L))
            info.setReturnValue(net.minecraft.world.entity.InsideBlockEffectType.LAVA_IGNITE);
    }

    @Inject(at = @At("HEAD"), method = "effect()Ljava/util/function/Consumer;", cancellable = true)
    private void effect_305250596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305250596L))
            info.setReturnValue(null);
    }


}
