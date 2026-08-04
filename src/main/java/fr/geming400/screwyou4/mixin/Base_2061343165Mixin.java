package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.TropicalFish.Base.class)
public class Base_2061343165Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/fish/TropicalFish$Base;", cancellable = true)
    private static void values_1491996097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1491996097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/fish/TropicalFish$Base;", cancellable = true)
    private static void valueOf__1843632642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843632642L))
            info.setReturnValue(null);
    }


}
