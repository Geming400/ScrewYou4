package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.sheep.SheepColorSpawnRules.class)
public class SheepColorSpawnRules1622038150Mixin {
        @Inject(at = @At("HEAD"), method = "getSheepColor(Lnet/minecraft/core/Holder;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void getSheepColor_3812407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3812407L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.RED);
    }


}
