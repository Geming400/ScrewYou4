package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.InsideBlockEffectType.class)
public class InsideBlockEffectType97763774Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/InsideBlockEffectType;", cancellable = true)
    private static void values_1220254620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220254620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/InsideBlockEffectType;", cancellable = true)
    private static void valueOf__900693799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900693799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effect()Ljava/util/function/Consumer;", cancellable = true)
    private void effect__740342635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740342635L))
            info.setReturnValue(null);
    }


}
