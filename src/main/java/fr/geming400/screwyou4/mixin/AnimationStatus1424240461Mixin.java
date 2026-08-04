package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity.AnimationStatus.class)
public class AnimationStatus1424240461Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/ShulkerBoxBlockEntity$AnimationStatus;", cancellable = true)
    private static void values_331567511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331567511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/ShulkerBoxBlockEntity$AnimationStatus;", cancellable = true)
    private static void valueOf_2127046996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127046996L))
            info.setReturnValue(null);
    }


}
