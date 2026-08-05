package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RenderShape.class)
public class RenderShape2048387501Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/RenderShape;", cancellable = true)
    private static void values__1701626299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701626299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/RenderShape;", cancellable = true)
    private static void valueOf__2132704738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132704738L))
            info.setReturnValue(net.minecraft.world.level.block.RenderShape.INVISIBLE);
    }


}
