package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RenderShape.class)
public class RenderShape2048387501Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/RenderShape;", cancellable = true)
    private static void values_1697967523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697967523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/RenderShape;", cancellable = true)
    private static void valueOf__565512634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-565512634L))
            info.setReturnValue(net.minecraft.world.level.block.RenderShape.MODEL);
    }


}
