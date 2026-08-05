package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.CommandBlockEntity.Mode.class)
public class Mode1170582636Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/CommandBlockEntity$Mode;", cancellable = true)
    private static void values__145297673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-145297673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/CommandBlockEntity$Mode;", cancellable = true)
    private static void valueOf__717265548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-717265548L))
            info.setReturnValue(net.minecraft.world.level.block.entity.CommandBlockEntity.Mode.REDSTONE);
    }


}
