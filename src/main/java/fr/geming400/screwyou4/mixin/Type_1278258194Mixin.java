package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BonemealableBlock.Type.class)
public class Type_1278258194Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/BonemealableBlock$Type;", cancellable = true)
    private static void values__1087254304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1087254304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/BonemealableBlock$Type;", cancellable = true)
    private static void valueOf_1336087645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336087645L))
            info.setReturnValue(net.minecraft.world.level.block.BonemealableBlock.Type.NEIGHBOR_SPREADER);
    }


}
