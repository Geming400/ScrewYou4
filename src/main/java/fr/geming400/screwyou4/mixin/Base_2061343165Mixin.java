package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.TropicalFish.Base.class)
public class Base_2061343165Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/fish/TropicalFish$Base;", cancellable = true)
    private static void values__1985260449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985260449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/fish/TropicalFish$Base;", cancellable = true)
    private static void valueOf_1390532902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390532902L))
            info.setReturnValue(net.minecraft.world.entity.animal.fish.TropicalFish.Base.LARGE);
    }


}
