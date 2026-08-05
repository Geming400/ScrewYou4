package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity.AnimationStatus.class)
public class AnimationStatus1424240461Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/ShulkerBoxBlockEntity$AnimationStatus;", cancellable = true)
    private static void values_495525173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(495525173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/ShulkerBoxBlockEntity$AnimationStatus;", cancellable = true)
    private static void valueOf__650348420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-650348420L))
            info.setReturnValue(net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity.AnimationStatus.CLOSING);
    }


}
